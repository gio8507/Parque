package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Pase {
    private Date fecha;
    private double horarioInicio;
    private double horaFin;
    private ArrayList<Entrada> Entrada;

    public Pase(Date fecha, double horarioInicio, double horaFin) {
        this.fecha = fecha;
        this.horarioInicio = horarioInicio;
        this.horaFin = horaFin;
    }

    public Pase(int fecha, double horarioInicio, double horaFin) {

        this.Entrada = new ArrayList<>();

    }

   public void listaDeEntrada(Entrada e){
        this.Entrada.add(e);
    }

    public void entradaEvento(){
        if(Entrada.isEmpty()){
            System.out.println(" no tenemos Atraccion");
    } else{
        for (int i = 0; i < Entrada.size(); i++) {
                System.out.println(Entrada.get(i));
            }
        }

    }





    @Override
    public String toString() {
        return "Pase{" +
                "fecha=" + fecha +
                ", horarioInicio=" + horarioInicio +
                ", horaFin=" + horaFin +
                ", Entrada=" + Entrada +
                '}';
    }

    public void Entrada (Entrada ent){
        this.Entrada.add(ent);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(double horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public double getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(double horaFin) {
        this.horaFin = horaFin;
    }
}

