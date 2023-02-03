package com.estiven.manejoterminal.service;

import com.estiven.manejoterminal.repository.models.Bus;
import com.estiven.manejoterminal.repository.models.Viaje;

import java.util.List;

public interface IViajeService {

    void registrarViaje(Bus bus);

    List<Viaje> obtenerViajes();
}
