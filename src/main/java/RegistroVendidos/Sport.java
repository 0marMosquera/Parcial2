
package RegistroVendidos;

import java.util.Scanner;

public class Sport extends Moto {
    //Atributos
    protected String motor;
    protected String potencia;
    protected String tanque;
    //Constructor

    public Sport(String motor, String potencia, String tanque, String placa, int modelo, int cilindraje) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }
    //Metodos Getters

    public String getMotor() {
        return motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public String getTanque() {
        return tanque;
    }

    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }
    //Metodo con retorno
    public void motorGarantia(){
        if (true) {
            System.out.print("La garantia de la moto es por 3 años");
        } else {
            System.out.print("La garantia de la moto es por 1 año");
        }
    }
}
