package com.estiven.manejoterminal.controller;

import com.estiven.manejoterminal.repository.models.Destino;
import com.estiven.manejoterminal.service.IDestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/terminal")
public class DestinoController {
    @Autowired
    private IDestinoService iDestinoService;

    @GetMapping("/verDestinos")
    public ResponseEntity verDestinos(){
        return new ResponseEntity(iDestinoService.obtenerDestino(), HttpStatus.FOUND);
    }

    @PostMapping("/crearDestino")
    public ResponseEntity crearDestino(@RequestBody Destino destino){
        return new ResponseEntity(iDestinoService.agregarDestino(destino), HttpStatus.ACCEPTED);
    }
}
