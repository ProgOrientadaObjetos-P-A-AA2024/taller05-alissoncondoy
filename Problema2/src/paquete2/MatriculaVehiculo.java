/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author InnoVausuario
 */
public class MatriculaVehiculo {
     private String cedula;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    private int anioAntiguedad;

    public MatriculaVehiculo(String c, String m, int a, double v) {

        cedula = c;
        marcaVehiculo = m;
        anioFabricacion = a;
        valorVehiculo = v;

    }

    public MatriculaVehiculo(String c, String m, int a) {

        cedula = c;
        marcaVehiculo = m;
        anioFabricacion = a;
        valorVehiculo = 5800;

    }

    public void establecerCedula(String x) {
        cedula = x;
    }

    public void establecerMarcaVehiculo(String x) {
        marcaVehiculo = x;
    }

    public void establecerAnioFabricacion(int x) {
        anioFabricacion = x;
    }

    public void establecerValorVehiculo(double x) {
        valorVehiculo = x;
    }
    public void calcularValorMatricula() {
        valorMatricula = (0.00002 * valorVehiculo) * (2024 - anioFabricacion);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAnioFabricacion() {
        return anioFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {

        String cadena = String.format("\nMATRICULA DEL VEHICULO\n"
                + " Cedula: %s\n"
                + " Marca Del Vehiculo: %s\n"
                + " Anio De Fabricacion: %d\n"
                + " Valor Del Vehiculo: $ %.3f\n"
                + " Valor de Matricula: $ %.3f\n",
                obtenerCedula(), obtenerMarcaVehiculo(),
                obtenerAnioFabricacion(), obtenerValorVehiculo(),
                obtenerValorMatricula());

        return cadena;
    }
}

