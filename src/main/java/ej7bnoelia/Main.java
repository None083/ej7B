/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7bnoelia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) {
        
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            listaVehiculos.add(new Turismo((long)i + 1000));
        }
        for (int i = 0; i < 10; i++) {
            listaVehiculos.add(new Electrico((long)i + 1010));
        }
        for (int i = 0; i < 10; i++) {
            listaVehiculos.add(new Deportivo((long)i + 1020));
        }
        for (Vehiculo v : listaVehiculos) {
            System.out.println(v);
        }
        
        ServiciosFicheros.escrituraVehiculo("vehículos.txt", listaVehiculos);
        
        List<Vehiculo> listaVehiculos2 = ServiciosFicheros.lecturaFicheros("vehículos.txt");
        Collections.sort(listaVehiculos2);
        
        System.out.println("----------------Ordenados por Marca-----------------");
        for (Vehiculo v : listaVehiculos2) {
            System.out.println(v);
        }
        System.out.println("-------------Listas por tipo------------");
        System.out.println("-----------------Turismo----------------------");
        List<Vehiculo> listaTurismo = ServiciosFicheros.lecturaTurismo("vehículos.txt");
        for (Vehiculo v : listaTurismo) {
            System.out.println(v);
        }
        ServiciosFicheros.escrituraVehiculo("Turismos.txt", listaTurismo);
        
        System.out.println("-----------------Deportivo----------------------"); 
        List<Vehiculo> listaDeportivo = ServiciosFicheros.lecturaDeportivo("vehículos.txt");
        for (Vehiculo v : listaDeportivo) {
            System.out.println(v);
        }
        ServiciosFicheros.escrituraVehiculo("Deportivos.txt", listaDeportivo);
        
        System.out.println("-----------------Electrico----------------------");  
        List<Vehiculo> listaElectrico = ServiciosFicheros.lecturaElectrico("vehículos.txt");
        for (Vehiculo v : listaElectrico) {
            System.out.println(v);
        }
        ServiciosFicheros.escrituraVehiculo("Electricos.txt", listaElectrico);
        
    }
    
}
