package com.estiven.manejoterminal.repository.models;

public class Destino {
    private String id;
    private String lugar;
    private double tiempo;

    public Destino(String id, String lugar, double tiempo) {
        this.id = id;
        this.lugar = lugar;
        this.tiempo = tiempo;
    }

    public String getId() {
        return id;
    }

    public String getLugar() {
        return lugar;
    }

    public double getTiempo() {
        return tiempo;
    }

    @Override
    public String toString() {
        return "Destino{" +
                "id='" + id + '\'' +
                ", lugar='" + lugar + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }
}
