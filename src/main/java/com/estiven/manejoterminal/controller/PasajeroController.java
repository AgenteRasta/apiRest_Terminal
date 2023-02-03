package com.estiven.manejoterminal.controller;

import com.estiven.manejoterminal.service.IPasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pasajeros")
public class PasajeroController {

    @Autowired
    private IPasajeroService iPasajeroService;

    @GetMapping("/verPasajeros")
    public ResponseEntity verPasajeros(){
        return new ResponseEntity(iPasajeroService.obtenerPasajero(), HttpStatus.FOUND);
    }
}
