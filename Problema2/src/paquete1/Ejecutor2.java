/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;
import paquete2.MatriculaVehiculo;
import java.util.Scanner;
/**
 *
 * @author InnoVausuario
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int anio;
        double valor;
        String cedula, marca, opcion, cadenaFinal = "";

        boolean bandera = true;

        while (bandera) {

            System.out.print("Numero De Cedula: ");
            cedula = teclado.nextLine();
            System.out.print("Marca Del Vehiculo: ");
            marca = teclado.nextLine();
            System.out.print("Anio Del Fabricante: ");
            anio = teclado.nextInt();
            System.out.print("Valor Del Vehiculo: $ ");
            valor = teclado.nextDouble();
            System.out.println("-----------------------------------------");

            MatriculaVehiculo carro = new MatriculaVehiculo(cedula, marca, anio, valor);

            carro.calcularValorMatricula();

            cadenaFinal += String.format("MATRICULA DEL VEHICULO\n"
                    + " Cedula: %s\n"
                    + " Marca Del Vehiculo: %s\n"
                    + " Anio De Fabricacion: %d\n"
                    + " Valor Del Vehiculo: $ %.3f\n\n",
                    carro.obtenerCedula(),
                    carro.obtenerMarcaVehiculo(),
                    carro.obtenerAnioFabricacion(),
                    carro.obtenerValorVehiculo(),
                    carro.obtenerValorMatricula());

            teclado.nextLine();

            System.out.println("Desea ingresar mas vendedores. Ingrese n para salir");
            opcion = teclado.nextLine();
            if (opcion.equals("n")) {
                System.out.println("\nFIN\n");
                bandera = false;
            }
        }
        System.out.printf("%s", cadenaFinal);
    }
}
    
    

