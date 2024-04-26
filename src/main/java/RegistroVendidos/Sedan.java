
package RegistroVendidos;

import java.util.Scanner;

public class Sedan extends Automovil {
    //Atributos
    protected double motor;
    protected boolean frenos;
    
    //Constructor

    public Sedan(double motor, boolean frenos, String placa, int modelo, double precio) {
        super(placa, modelo, precio);
        this.motor = motor;
        this.frenos = frenos;
    }
    //Metodos Getters

    public double getMotor() {
        return motor;
    }

    public boolean isFrenos() {
        return frenos;
    }

    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
    //Metodo con retorno
    public void frenosABS(){
        if (frenos) {
            System.out.print("El automovil tiene frenos ABS");
        } else {
            System.out.print("El automovil no tiene frenos ABS");
        }
    }
}
