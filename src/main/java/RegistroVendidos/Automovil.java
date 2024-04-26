
package RegistroVendidos;

import java.util.Scanner;

public class Automovil {
    //Atributos
    protected String placa;
    protected int modelo;
    protected double precio;
    //Constructor

    public Automovil(String placa, int modelo, double precio) {
        this.placa = placa;
        this.modelo = modelo;
        this.precio = precio;
    }
    //Metodos Getters

    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
    
}
