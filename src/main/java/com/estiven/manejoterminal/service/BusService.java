package com.estiven.manejoterminal.service;

import com.estiven.manejoterminal.repository.TerminalTransporte;
import com.estiven.manejoterminal.repository.models.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusService implements IBusService{

    @Autowired
    private TerminalTransporte terminal;

    private int id=5;

    @Override
    public List<Bus> obtenerBuses() {
        return terminal.getBuses();
    }

    @Override
    public Bus agregarBus(Bus bus) {
        Bus newBus=new Bus(String.valueOf(id),
                bus.getMarca(),
                bus.getDestino(),
                bus.getHora(),
                bus.getCapacidad(),
                bus.getPasajeros()
                );
        terminal.agregarBus(newBus);
        id=id+1;
        return newBus;
    }
}
