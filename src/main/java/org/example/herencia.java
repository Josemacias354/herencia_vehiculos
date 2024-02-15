package org.example;

import java.util.Scanner;

public class herencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int km;

        Bicicleta bici = new Bicicleta();
        Coche coche = new Coche();

        do {
            System.out.println("\nVEHICULOS");
            System.out.println("=========");
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Anda con el coche");
            System.out.println("3. Ver kilometraje de la bicicleta");
            System.out.println("4. Ver kilometraje del coche");
            System.out.println("5. Ver kilometraje total");
            System.out.println("6. Hacer caballito con la bicicleta");
            System.out.println("7. Quemar rueda con el coche");
            System.out.println("8. Salir");
            System.out.print("Elige una opción (1-8): ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos km quieres recorrer con la bicicleta? ");
                    km = sc.nextInt();
                    bici.recorrer(km);
                    break;
                case 2:
                    System.out.print("¿Cuántos km quieres recorrer con el coche? ");
                    km = sc.nextInt();
                    coche.recorrer(km);
                    break;
                case 3:
                    System.out.println("La bicicleta ha recorrido " + bici.kilometrosRecorridos + " km");
                    break;
                case 4:
                    System.out.println("El coche ha recorrido " + coche.kilometrosRecorridos + " km");
                    break;
                case 5:
                    System.out.println("Los vehículos han recorrido un total de " + Vehiculo.kilometrosTotales + " km");
                    break;
                case 6:
                    bici.hacerCaballito();
                    break;
                case 7:
                    coche.quemarRueda();
                    break;
                default:
                    break;
            }
        } while (opcion != 8);

        sc.close();
    }
}