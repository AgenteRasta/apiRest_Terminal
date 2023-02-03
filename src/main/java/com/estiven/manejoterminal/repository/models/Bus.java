package com.estiven.manejoterminal.repository.models;

import java.util.List;

public class Bus extends Transporte{

    private String id;
    private String marca;
    private Destino destino;
    private List<Pasajero> pasajeros;
    private String hora;

    public Bus(String id, String marca, Destino destino,String hora, List<Pasajero> pasajeros) {
        this.id = id;
        this.marca = marca;
        this.destino = destino;
        this.hora = hora;
        this.pasajeros = pasajeros;
    }

    public String getHora() {
        return hora;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }



    @Override
    public String toString() {
        return "Bus{" +
                "id='" + id + '\'' +
                ", marca='" + marca + '\'' +
                ", destino=" + destino +
                ", pasajeros=" + pasajeros +
                ", hora='" + hora + '\'' +
                '}';
    }

    @Override
    public void recibirPersonas() {

    }
}
