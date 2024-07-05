/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem02;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CEjemplo02 {
    public static double joseCantidad(double montoTotal){
        return montoTotal * 0.27;
    }
    public static double danielCantidad(double montoTotal){
        return montoTotal * 0.25;
    } 
    public static double jacintoCantidad(double montoTotal){
         double jose = montoTotal * 0.27;
         return 0.85 * jose;
    }
    public static double antonioCantidad(double montoTotal){
         double jose= montoTotal * 0.27;
         double daniel= montoTotal * 0.25;
         return 0.23 *(daniel + jose);
    }
    public static double davidCantidad(double montoTotal){
        double jose=montoTotal * 0.27;
        double daniel=montoTotal * 0.25;
        double jacinto= 0.85 * jose;
        double antonio= 0.23 * (daniel + jose);
        return montoTotal -(antonio + daniel + jacinto + jose);
    }
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("dijite el monto de la herencia");
        double montoTotal=teclado.nextDouble();
        System.out.println("la herencia total es : " + montoTotal );
        System.out.println("la parte de jpse es : " + joseCantidad(montoTotal));   
        System.out.println("la parte de daniel es : " + danielCantidad(montoTotal));
        System.out.println("la parte de jacinto es : " + jacintoCantidad(montoTotal));
        System.out.println("la parte de antonio es : " + antonioCantidad(montoTotal));
        System.out.println("la parte de davis es ; " + danielCantidad(montoTotal));
    }
}
