package com.company;

public class Atraccion{
    private String nombre;
    private int estatura;
    private int Capacidad;
    private int duracion;

    public Atraccion(String nombre, int estatura, int capacidad, int ducaracion) {
        this.nombre = nombre;
        this.estatura = estatura;
        Capacidad = capacidad;
        this.duracion = ducaracion;
    }


    @Override
    public String toString() {
        return "Atraccion{" +
                "nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                ", Capacidad=" + Capacidad +
                ", duracion=" + duracion +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public int getDucaracion() {
        return duracion;
    }

    public void setDucaracion(int ducaracion) {
        this.duracion = ducaracion;
    }



}
