package com.estiven.manejoterminal.service;

import com.estiven.manejoterminal.repository.models.Destino;

import java.util.List;

public interface IDestinoService {

    List<Destino> obtenerDestino();
    Destino agregarDestino(Destino destino);
}
