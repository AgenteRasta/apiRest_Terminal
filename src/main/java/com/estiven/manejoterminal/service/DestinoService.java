package com.estiven.manejoterminal.service;

import com.estiven.manejoterminal.repository.TerminalTransporte;
import com.estiven.manejoterminal.repository.models.Destino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoService implements IDestinoService{
    @Autowired
    private TerminalTransporte terminal;
    private int id=5;
    @Override
    public List<Destino> obtenerDestino() {
        return terminal.getDestinos();
    }

    @Override
    public Destino agregarDestino(Destino destino) {
        Destino destinoAux=new Destino(String.valueOf(id),
                destino.getLugar(),
                destino.getTiempo());
        terminal.agregarDestino(destinoAux);
        id=id+1;
        return destinoAux;
    }
}
