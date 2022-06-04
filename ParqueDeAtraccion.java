package com.company;

import java.util.ArrayList;

public class ParqueDeAtraccion{

 }
class main{


      public static void main(String[] args) {
          Pase p = new Pase(6/8/22,22.00,23.00);
          Ticket t= new Ticket(22/4/22,10);
          Cliente c = new Cliente("juan","Vazque");
          ZonaTematica z =new ZonaTematica("facer","","");
          z.agregarListaDeAtracciones(new Atraccion("jurasic",1,20,5));
          z.agregarListaDeAtracciones(new Atraccion("jurasic",2,20,5));
          z.agregarListaDeAtracciones(new Atraccion("jurasic",3,20,5));
          z.listadeEspetaculo(new Espectaculo("dino",null,4));
          z.listadeEspetaculo(new Espectaculo("dino",null,4));
          z.listadeEspetaculo(new Espectaculo("dino",null,4));
          z.agregarListaRestaurante(new Restaurante("ristorante",null,10));
          z.agregarListaRestaurante(new Restaurante("ristorante",null,10));
          z.agregarListaRestaurante(new Restaurante("ristorante",null,10));
          p.listaDeEntrada(new Entrada(1,5,null));
          p.listaDeEntrada(new Entrada(2,5,null));
          p.listaDeEntrada(new Entrada(3,5,null));
          c.listaDeTicket(new Ticket(22/3/22,10));
          z.tipoDeAtraccion();
          z.mostrarEspetaculo();
          z.restauracion();
          p.entradaEvento();
          c.MiTicket();

          }

      }

