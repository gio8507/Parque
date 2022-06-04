package com.company;

import java.util.ArrayList;

public class Entrada {
    private int asiento;
    private  float precio;
    private estado EstadoEntreda;
    private ArrayList<Ticket> ticket;
    public Entrada(int asiento, float precio, estado estadoEntreda) {
        this.asiento = asiento;
        this.precio = precio;
        EstadoEntreda = estadoEntreda;
        this.ticket = new ArrayList<>();
    }

    public Entrada() {

    }

    @Override
    public String toString() {
        return "Entrada{" +
                "asiento=" + asiento +
                ", precio=" + precio +
                ", EstadoEntreda=" + EstadoEntreda +
                ", ticket=" + ticket +
                '}';
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public estado getEstadoEntreda() {
        return EstadoEntreda;
    }

    public void setEstadoEntreda(estado estadoEntreda) {
        EstadoEntreda = estadoEntreda;
    }





}
