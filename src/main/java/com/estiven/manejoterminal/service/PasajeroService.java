package com.estiven.manejoterminal.service;

import com.estiven.manejoterminal.repository.TerminalTransporte;
import com.estiven.manejoterminal.repository.models.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PasajeroService implements IPasajeroService{
    @Autowired
    private TerminalTransporte terminal;
    @Override
    public List<Pasajero> obtenerPasajero() {
        return terminal.getPasajeros();
    }
}
