package com.estiven.manejoterminal.service;

import com.estiven.manejoterminal.repository.TerminalTransporte;
import com.estiven.manejoterminal.repository.ViajeRepository;
import com.estiven.manejoterminal.repository.models.Bus;
import com.estiven.manejoterminal.repository.models.Viaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class ViajeService implements IViajeService{
    @Autowired
    private ViajeRepository viajeRepository;
    @Autowired
    private TerminalTransporte terminal;
    @Override
    public void registrarViaje(Bus busViaje) {
        Viaje newViaje=new Viaje(UUID.randomUUID().toString(), new Date().toString(),busViaje);
        terminal.setPasajerosBus(busViaje.getPasajeros());
        terminal.sacarPasajeros();
        terminal.setBusViaje(busViaje);
        terminal.sacarBus();
        viajeRepository.registrarViaje(newViaje);
    }

    @Override
    public List<Viaje> obtenerViajes() {
        return viajeRepository.obtenerViajes();
    }
}
