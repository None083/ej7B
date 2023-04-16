/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7bnoelia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noelia
 */
public class PruebaVehiculos {

    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo(Long.MAX_VALUE, "00111PPP", "Holi", "UwU", "caca", 23.45, true);
        
        Electrico ve1 = new Electrico(10, 240, Long.MAX_VALUE, "1111MM", "Tesla", "nididea", "rosa", 0, true);
        
        v1.arrancar();
        ve1.arrancar();
        
        Turismo vc1 = new Turismo(60, TipoCombustible.DIESEL, 
                Long.MAX_VALUE, "uwu", "uwu", "uwu", "uwurillo", 100, true);
        
        System.out.println(ve1);
        System.out.println(vc1);
        
        v1.arrancar();
        ve1.arrancar();
        vc1.arrancar();
        
        List<Vehiculo> lista = new ArrayList<>();
        
        lista.add(v1);
        lista.add(ve1);
        //las siguientes dos lineas son conversiones implicitas
        lista.add(vc1);
        
        for (Vehiculo v : lista) {
            System.out.println(v);
            v.arrancar();
            if (v instanceof Electrico){
                ((Electrico) v).cambiarBaterias();
            }
        }
        
    }
    
}
