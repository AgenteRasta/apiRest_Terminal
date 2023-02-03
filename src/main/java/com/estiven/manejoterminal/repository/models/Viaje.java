package com.estiven.manejoterminal.repository.models;

import java.util.List;

public class Viaje {
    private String id;
    private String date;
    private Bus bus;

    public Viaje(String id, String date,Bus bus){
        this.id=id;
        this.date=date;
        this.bus=bus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
