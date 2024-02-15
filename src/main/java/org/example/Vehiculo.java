package org.example;
public class Vehiculo {
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;
    private int kilometrosRecorridos;

    public Vehiculo() {
        vehiculosCreados++;
        kilometrosRecorridos = 0;
    }

    public void recorrer(int km) {
        this.kilometrosRecorridos += km;
        Vehiculo.kilometrosTotales += km;
    }

    public static int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }
}