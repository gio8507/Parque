package com.company;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private ArrayList<Ticket>ticket;


    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ticket =new ArrayList<>();
    }

    public void listaDeTicket(Ticket t){
        this.ticket.add(t);
    }
    public void MiTicket(){
        if (ticket.isEmpty()) {
            System.out.println("lista de ticket vacia");
        } else {
            for (int i = 0; i < ticket.size(); i++) {
                System.out.println(ticket.get(i));
            }
        }
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



}

