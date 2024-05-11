/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author InnoVausuario
 */
public class Calificaciones {
    private String nombreEstudiante;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;
    
    public Calificaciones(String n, double c1, double c2, double c3) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = c3;
    }

    public Calificaciones(String n, double c1, double c2) {
        nombreEstudiante = n;
        calificacion1 = c1;
        calificacion2 = c2;
        calificacion3 = (c1 + c2) / 2;
    }
    
    public void establecerNombreEstudiante(String x) {
        nombreEstudiante = x;
    }

    public void establecerCalificacion01(double x) {
        calificacion1 = x;
    }

    public void establecerCalificacion02(double x) {
        calificacion2 = x;
    }

    public void establecerCalificacion03(double x) {
        calificacion3 = x;
    }

    public void calcularPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacion01() {
        return calificacion1;
    }

    public double obtenerCalificacion02() {
        return calificacion2;
    }

    public double obtenerCalificacion03() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }
    @Override
    public String toString(){
        String cadena = String.format("\n\nCALIFICACIONES \n"
                + " Nombre del Estudiante: %s\n"
                + " Calificacion 1: %.2f\n"
                + " Calificacion 2: %.2f\n"
                + " Calificacion 3: %.2f\n"
                + " Promedio Final: %.3f\n"
                + "---------------------------------------------\n",
                obtenerNombreEstudiante(),
                obtenerCalificacion01(),
                obtenerCalificacion02(),
                obtenerCalificacion03(),
                obtenerPromedio());
        return cadena;
    }
}

