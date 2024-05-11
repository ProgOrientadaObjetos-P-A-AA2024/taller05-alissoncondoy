/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.MatriculaVehiculo;
import java.util.Scanner;
/**
 *
 * @author InnoVausuario
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int anio, i = 0, numeroVehiculos;
        double valor;
        String cadenaFinal = "", cedula, marca;

        System.out.print("Numero de iteraciones: ");
        numeroVehiculos = teclado.nextInt();

        while (i < numeroVehiculos) {

            teclado.nextLine();
            System.out.println("------------------------------");
            System.out.print("  Numero De Cedula: ");
            cedula = teclado.nextLine();
            System.out.print("  Marca Del Vehiculo: ");
            marca = teclado.nextLine();
            System.out.print("  Anio Del Fabricante: ");
            anio = teclado.nextInt();
            System.out.print("  Valor Del Vehiculo: $ ");
            valor = teclado.nextDouble();

            MatriculaVehiculo carro = new MatriculaVehiculo(cedula, marca, anio, valor);

            carro.calcularValorMatricula();

            cadenaFinal += carro.toString();

            i++;
        }
        System.out.printf("%s\n", cadenaFinal);
    }
}
  
