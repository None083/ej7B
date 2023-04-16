/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7bnoelia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 34616
 */
public class ServiciosFicheros {

    public static void escrituraVehiculo(String id, List<Vehiculo> lista) {
        try ( BufferedWriter flujo = new BufferedWriter(new FileWriter(id))) {
            for (Vehiculo v : lista) {
                if (v instanceof Turismo) {
                    flujo.write("0 - " + v.toString());
                }
                if (v instanceof Deportivo) {
                    flujo.write("1 - " + v.toString());
                }
                if (v instanceof Electrico) {
                    flujo.write("2 - " + v.toString());
                }
                flujo.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<Vehiculo> lecturaFicheros(String id) {
        String linea;
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        String[] tokens;

        try ( Scanner datosFichero = new Scanner(new File(id), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(" - |:");
                listaVehiculos.add(new Vehiculo(Long.valueOf(tokens[1]), tokens[2],
                        tokens[3], tokens[4], tokens[5], Double.parseDouble(tokens[6]),
                        Boolean.parseBoolean(tokens[7])));
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return listaVehiculos;
    }

    public static List<Vehiculo> lecturaTurismo(String id) {
        String linea;
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        String[] tokens;

        try ( Scanner datosFichero = new Scanner(new File(id), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(" - |:");
                if (tokens[0].equals("0")) {
                    listaVehiculos.add(new Turismo(Integer.parseInt(tokens[8]),
                            TipoCombustible.valueOf(tokens[9]), Long.valueOf(tokens[1]),
                            tokens[2], tokens[3], tokens[4], tokens[5], Double.parseDouble(tokens[6]),
                            Boolean.parseBoolean(tokens[7])));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return listaVehiculos;
    }

    public static List<Vehiculo> lecturaDeportivo(String id) {
        String linea;
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        String[] tokens;

        try ( Scanner datosFichero = new Scanner(new File(id), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(" - |:");

                if (tokens[0].equals("1")) {
                    listaVehiculos.add(new Deportivo(Integer.parseInt(tokens[8]), Long.valueOf(tokens[1]),
                            tokens[2], tokens[3], tokens[4], tokens[5], Double.parseDouble(tokens[6]),
                            Boolean.parseBoolean(tokens[7])));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return listaVehiculos;
    }

    public static List<Vehiculo> lecturaElectrico(String id) {
        String linea;
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        String[] tokens;

        try ( Scanner datosFichero = new Scanner(new File(id), "UTF-8")) {
            while (datosFichero.hasNextLine()) {
                linea = datosFichero.nextLine();
                tokens = linea.split(" - |:");

                if (tokens[0].equals("2")) {
                    listaVehiculos.add(new Electrico(Integer.parseInt(tokens[8]),
                            Integer.parseInt(tokens[9]), Long.valueOf(tokens[1]),
                            tokens[2], tokens[3], tokens[4], tokens[5], Double.parseDouble(tokens[6]),
                            Boolean.parseBoolean(tokens[7])));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return listaVehiculos;
    }

}
