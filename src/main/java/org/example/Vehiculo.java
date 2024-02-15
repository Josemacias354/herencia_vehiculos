package org.example;

    public class Vehiculo {
        static int vehiculosCreados = 0;
        static int kilometrosTotales = 0;
        
        int kilometrosRecorridos;

        public Vehiculo() {
            vehiculosCreados++;
            kilometrosRecorridos = 0;
        }

        public void recorrer(int km) {
            kilometrosRecorridos += km;
            kilometrosTotales += km;
        }
    }
