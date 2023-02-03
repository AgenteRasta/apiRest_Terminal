package com.estiven.manejoterminal.service;

import com.estiven.manejoterminal.repository.models.Bus;

import java.util.List;

public interface IBusService {

    List<Bus> obtenerBuses();
    Bus agregarBus(Bus bus);

}
