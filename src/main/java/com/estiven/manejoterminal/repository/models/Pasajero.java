package com.estiven.manejoterminal.repository.models;

public class Pasajero extends Persona{

    private String id;
    private String nombre;
    private int identificacion;
    private int telefono;

    public Pasajero(String id, String nombre, int identificacion, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
    }


    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public int getIdentificacion() {
        return identificacion;
    }
    public int getTelefono() {
        return telefono;
    }
    @Override
    public void viajar() {
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", identificacion=" + identificacion +
                ", telefono=" + telefono +
                '}';
    }
}
