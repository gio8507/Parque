package com.company;

import java.util.ArrayList;

public class Espectaculo {
    private String nombre;
    private tipo TipoEspectaculo;
    private int minutos;
    private ArrayList<Pase> Pase ;

    public Espectaculo(){

    }
    public Espectaculo(String nombre, tipo tipoEspectaculo, int minutos) {
        this.nombre = nombre;
        TipoEspectaculo = tipoEspectaculo;
        this.minutos = minutos;
        this.Pase = new ArrayList<>();

    }

    @Override
    public String toString() {
        return "Espectaculo{" +
                "nombre='" + nombre + '\'' +
                ", TipoEspectaculo=" + TipoEspectaculo +
                ", minutos=" + minutos +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tipo getTipoEspectaculo() {
        return TipoEspectaculo;
    }

    public void setTipoEspectaculo(tipo tipoEspectaculo) {
        TipoEspectaculo = tipoEspectaculo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }





}
