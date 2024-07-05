/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem02;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CEjemplo01 {

    /**
     * @param args the command line arguments
     */
     // Método para calcular el monto a gastar en alquiler de espacio en la feria
    public static double calcularAlquilerEspacio(double montoTotal) {
        return montoTotal * 0.23;
    }

    // Método para calcular el monto a gastar en publicidad
    public static double calcularPublicidad(double montoTotal) {
        return montoTotal * 0.07;
    }

    // Método para calcular el monto a gastar en transporte
    public static double calcularTransporte(double montoTotal) {
        return montoTotal * 0.26;
    }

    // Método para calcular el monto a gastar en servicios feriales
    public static double calcularServiciosFeriales(double montoTotal) {
        return montoTotal * 0.12;
    }

    // Método para calcular el monto a gastar en decoración
    public static double calcularDecoracion(double montoTotal) {
        return montoTotal * 0.21;
    }

    // Método para calcular el monto a gastar en gastos varios
    public static double calcularGastosVarios(double montoTotal) {
        return montoTotal * 0.11;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el monto total de dinero a invertir
        System.out.print("Ingrese el monto total de dinero a invertir: ");
        double montoTotal = scanner.nextDouble();

        // Calcular los montos a gastar en cada rubro utilizando los métodos correspondientes
        double alquilerEspacio = calcularAlquilerEspacio(montoTotal);
        double publicidad = calcularPublicidad(montoTotal);
        double transporte = calcularTransporte(montoTotal);
        double serviciosFeriales = calcularServiciosFeriales(montoTotal);
        double decoracion = calcularDecoracion(montoTotal);
        double gastosVarios = calcularGastosVarios(montoTotal);

        // Mostrar los montos calculados para cada rubro
        System.out.println("Monto a gastar en alquiler de espacio en la feria: " + alquilerEspacio);
        System.out.println("Monto a gastar en publicidad: " + publicidad);
        System.out.println("Monto a gastar en transporte: " + transporte);
        System.out.println("Monto a gastar en servicios feriales: " + serviciosFeriales);
        System.out.println("Monto a gastar en decoracion: " + decoracion);
        System.out.println("Monto a gastar en gastos varios: " + gastosVarios);

        scanner.close();
    }
    
}
