package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Ticket {
    private Date fecha;
    private float precio;
    private ArrayList<Entrada>entrada;

public Ticket(){

}
Ticket ticket;



    public Ticket(Date fecha, float precio) {
        this.fecha = fecha;
        this.precio = precio;
        this.entrada=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "fecha=" + fecha +
                ", precio=" + precio +
                ", entrada=" + entrada +
                ", ticket=" + ticket +
                '}';
    }

    public Ticket(int i, int precio) {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
