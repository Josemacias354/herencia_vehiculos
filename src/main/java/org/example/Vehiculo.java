package org.example;

    public class Vehiculo {
        // Atributos de clase
        static int vehiculosCreados = 0;
        static int kilometrosTotales = 0;

        // Atributo de instancia
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
