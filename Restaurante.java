package com.company;

public class Restaurante {

    private String nombre;
    private String horario;
    private double precioMedio;

    public Restaurante(String nombre, String horario, double precioMedio) {
        this.nombre = nombre;
        this.horario = horario;
        this.precioMedio = precioMedio;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "nombre='" + nombre + '\'' +
                ", horario='" + horario + '\'' +
                ", precioMedio=" + precioMedio +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getPrecioMedio() {
        return precioMedio;
    }

    public void setPrecioMedio(double precioMedio) {
        this.precioMedio = precioMedio;
    }


}

