/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;
import paquete2.Calificaciones;
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
        boolean bandera = true;
        while (bandera) {
            System.out.println("1. Crear libreta (2 calificaciones)");
            System.out.println("2. Crear libreta (3 calificaciones)");
            System.out.println("3. Salir");
            System.out.println("---------------------------------------------");
            System.out.print("Ingrese una opcion: ");
            int opcion = teclado.nextInt();

            if (opcion == 1) {
                System.out.print("  Ingrese nombre del estudiante: ");
                String nombre = teclado.next();
                System.out.print("  Ingrese calificacion 1: ");
                double calificacion1 = teclado.nextDouble();
                System.out.print("  Ingrese calificacion 2: ");
                double calificacion2 = teclado.nextDouble();

                Calificaciones estudiante = new Calificaciones(nombre, calificacion1, 
                        calificacion2);
                estudiante.calcularPromedio();

                System.out.printf("%s",estudiante);
            } else if (opcion == 2) {
                System.out.println("\n");
                System.out.print("Ingrese nombre del estudiante: ");
                String nombre = teclado.next();
                System.out.print("  Ingrese calificacion 1: ");
                double calificacion1 = teclado.nextDouble();
                System.out.print("  Ingrese calificacion 2: ");
                double calificacion2 = teclado.nextDouble();
                System.out.print("  Ingrese calificacion 3: ");
                double calificacion3 = teclado.nextDouble();

        
                Calificaciones estudiante = new Calificaciones(nombre, calificacion1,
                        calificacion2, calificacion3);
                estudiante.calcularPromedio();

                System.out.printf("%s",estudiante);
            } else if (opcion == 3) {
                System.out.println("FIN CALIFICACIONES");
                bandera = false;
            } else {
                System.out.println("ESTA OPCION NO EXISTE");
                System.out.println("INGRESE UNA OPCION CORECTA\n");
            }
        }
    }

}
