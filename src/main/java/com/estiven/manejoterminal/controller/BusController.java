package com.estiven.manejoterminal.controller;

import com.estiven.manejoterminal.repository.models.Bus;
import com.estiven.manejoterminal.service.IBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/bus")
public class BusController {
    @Autowired
    private IBusService iBusService;

    @GetMapping("/verBuses")
    public ResponseEntity verbuses(){
        return new ResponseEntity(iBusService.obtenerBuses(), HttpStatus.FOUND);
    }

    @PostMapping("/crearBus")
    public ResponseEntity crearBus(@RequestBody Bus bus){
        return new ResponseEntity(iBusService.agregarBus(bus),HttpStatus.CREATED);
    }
}
