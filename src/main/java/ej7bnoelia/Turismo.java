/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7bnoelia;

import java.util.Random;

/**
 *
 * @author noelia
 */
public class Turismo extends Vehiculo{
    
    private int capacidadLitros;
    private TipoCombustible tipo;

    public Turismo(int capacidadLitros, TipoCombustible tipo, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.capacidadLitros = capacidadLitros;
        this.tipo = tipo;
    }

    

    public Turismo(Long bastidor) {
        super(bastidor);
        Random random = new Random();       
        this.capacidadLitros = random.nextInt(40, 120);
        this.tipo = TipoCombustible.values()[random.nextInt(TipoCombustible.values().length)];
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public TipoCombustible getTipo() {
        return tipo;
    }

    public void setTipo(TipoCombustible tipo) {
        this.tipo = tipo;
    }
    
    public void repostar(){
        System.out.println("El vehiculo " + this.getMatricula() + " está repostando");
    }

    @Override
    public String toString() {
        return super.toString() + ":" + capacidadLitros + ":" + tipo;
    }
    
    
    
}
