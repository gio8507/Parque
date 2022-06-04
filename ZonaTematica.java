package com.company;

import java.util.ArrayList;

public class ZonaTematica {
    private String nombre;
    private String descripcion;
    private String color;
    private ArrayList<Espectaculo> espectaculo;
    private ArrayList<Restaurante> restaurante;
    private ArrayList<Atraccion> atraccion;


    public ZonaTematica() {

    }

    public ZonaTematica(String nombre, String descripcion, String color) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.color = color;
        this.atraccion = new ArrayList<>();
        this.espectaculo = new ArrayList<>();
        this.restaurante = new ArrayList<>();

    }

   public void agregarListaRestaurante(Restaurante r){
        this.restaurante.add(r);
   }
  public void restauracion(){
      if (restaurante.isEmpty()) {
          System.out.println("lista vacia");
      } else {
          for (int i = 0; i < restaurante.size(); i++) {
              System.out.println(restaurante.get(i));
          }
      }
  }


    public void agregarListaDeAtracciones(Atraccion a){
        this.atraccion.add(a);
    }

    public void tipoDeAtraccion() {
        if (atraccion.isEmpty()) {
            System.out.println("lista vacia de atraccion");
        } else {
            for (int i = 0; i < atraccion.size(); i++) {
                System.out.println(atraccion.get(i));
            }
        }
    }

    public void listadeEspetaculo(Espectaculo e){
       this.espectaculo.add(e);
    }

    public void mostrarEspetaculo() {
        if (espectaculo.isEmpty()) {
            System.out.println("lista vacia de Espetaculo");
        } else {
            for (int i = 0; i < espectaculo.size(); i++) {
                System.out.println(espectaculo.get(i));
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}


