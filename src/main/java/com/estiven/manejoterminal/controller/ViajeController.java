package com.estiven.manejoterminal.controller;

import com.estiven.manejoterminal.repository.models.Bus;
import com.estiven.manejoterminal.repository.models.Viaje;
import com.estiven.manejoterminal.service.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/viajes")
public class ViajeController {
    @Autowired
    private IViajeService iViajeService;

    @GetMapping("/verViajes")
    public ResponseEntity verViajes(){
        return new ResponseEntity(iViajeService.obtenerViajes(), HttpStatus.FOUND);
    }
    @PostMapping("/crearViaje")
    public ResponseEntity crearViaje(@RequestBody Bus bus){
        iViajeService.registrarViaje(bus);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
