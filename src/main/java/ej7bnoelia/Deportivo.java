/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7bnoelia;

import java.util.Random;

/**
 *
 * @author carlos
 */
//
public class Deportivo extends Vehiculo {

    private int cilindrada; // Atributo específico para Deportivo

    /* constructores no se heredan
    la primera línea de código de un constructor en la subclase (hija)
    debe llamar al constructor de la superclase (madre) */
    public Deportivo(int cilindrada, Long bastidor, String matricula, String marca,
            String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        //inicialización de atributos en la subclase
        this.cilindrada = cilindrada;
    }

    public Deportivo(Long bastidor) {
        super(bastidor);
        Random random = new Random();
        this.cilindrada = random.nextInt(100, 300);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + ":" + cilindrada;
    }

    public void metodoDeportivo() {
        System.out.println("Este método es de la clase Deportivo");
    }
}
