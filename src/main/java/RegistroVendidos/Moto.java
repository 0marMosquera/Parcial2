
package RegistroVendidos;

import java.util.Scanner;

public class Moto {
    //Atributos
    protected String placa;
    protected int modelo;
    protected int cilindraje;
    //Constructor

    public Moto(String placa, int modelo, int cilindraje) {
        this.placa = placa;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }
    //Metodos Getters

    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }
    
}
