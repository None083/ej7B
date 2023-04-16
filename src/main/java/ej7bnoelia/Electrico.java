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
public class Electrico extends Vehiculo{
    
    private int numeroBaterias;
    private int duracionCarga; // minutos

    public Electrico(int numeroBaterias, int duracionCarga, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.numeroBaterias = numeroBaterias;
        this.duracionCarga = duracionCarga;
    }
    
    public Electrico(Long bastidor){
        super(bastidor);
        Random random = new Random();
        this.numeroBaterias = random.nextInt(1,4);
        this.duracionCarga = random.nextInt(30, 90);
    }
    
    @Override
    public void arrancar(){
        System.out.println("Soy un vehiculo electrico muy chulo " + this.getMarca() + " y estoy arrancando");
    }

    public int getNumeroBaterias() {
        return numeroBaterias;
    }

    public void setNumeroBaterias(int numeroBaterias) {
        this.numeroBaterias = numeroBaterias;
    }

    public int getDuracionCarga() {
        return duracionCarga;
    }

    public void setDuracionCarga(int duracionCarga) {
        this.duracionCarga = duracionCarga;
    }
    
    public void cargarBateria(){
        System.out.println("El vehiculo " + this.getMatricula() + " está cargado");
    }
    
    public void cambiarBaterias(){
        System.out.println("El vehiculo " + this.getMatricula() + " ha cambiado su batería");
    }

    @Override
    public String toString() {
        return super.toString() + ":" + super.getBastidor() + ":" + numeroBaterias + ":" + duracionCarga;
    }
    
    
    
}
