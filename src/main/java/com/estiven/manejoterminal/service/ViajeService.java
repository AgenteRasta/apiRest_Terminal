package com.estiven.manejoterminal.service;

import com.estiven.manejoterminal.repository.TerminalTransporte;
import com.estiven.manejoterminal.repository.ViajeRepository;
import com.estiven.manejoterminal.repository.models.Bus;
import com.estiven.manejoterminal.repository.models.Pasajero;
import com.estiven.manejoterminal.repository.models.Viaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
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
        if(busViaje.getPasajeros().size()>busViaje.getCapacidad()) {
            //JOptionPane.showMessageDialog(null, "Excedio la capacidad del bus", "Sobrecapacidad", JOptionPane.WARNING_MESSAGE);
            System.out.println("Capacidad excedida");
        }else{
            Viaje newViaje = new Viaje(UUID.randomUUID().toString(), new Date().toString(), busViaje);
            /*List<Pasajero> pasajeroBusAux=new ArrayList<>();
            for(int i=0;i<busViaje.getCapacidad();i++){
                pasajeroBusAux.add(busViaje.getPasajeros().get(i));
            }*/
            terminal.setPasajerosBus(busViaje.getPasajeros());
            terminal.sacarPasajeros();
            terminal.setBusViaje(busViaje);
            terminal.sacarBus();
            viajeRepository.registrarViaje(newViaje);
        }

    }

    @Override
    public List<Viaje> obtenerViajes() {
        return viajeRepository.obtenerViajes();
    }
}
