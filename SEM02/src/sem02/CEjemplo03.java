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
public class CEjemplo03 {
     public static double bonificacion(double montoSueldo,double horas){
        double sueldoWhitHoras=montoSueldo * horas;
         return sueldoWhitHoras * 0.20;
    }
    public static double descuento(double montoSueldo,double horas){
        double sueldoWhitHoras= montoSueldo * horas;
        return sueldoWhitHoras * 0.10;
    }
    public static double sueldoBruto(double montoSueldo ,double horas){
        double sueldoWhitHoras =montoSueldo * horas;
        double bonificacion=  sueldoWhitHoras * 0.20;
        return sueldoWhitHoras + bonificacion;
    }
    public static double sueldoNeto(double montoSueldo, double horas){
    double sueldoWhitHoras= montoSueldo * horas;
    double bonificacion=sueldoWhitHoras * 0.20;
    double descuento =sueldoWhitHoras * 0.10;
    double sueldoBruto= sueldoWhitHoras + bonificacion;
    return sueldoBruto - descuento;
    }
    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("dijite el sueldo : ");
        double montoSueldo=teclado.nextDouble();
        System.out.println("las horas laboradas : ");
        double horas=teclado.nextDouble();
        System.out.println("las horas trabajadas son : " + montoSueldo * horas );
        System.out.println("bonificacion es : " + bonificacion(montoSueldo, horas));
        System.out.println("descuento es : " + descuento(montoSueldo, horas));
        System.out.println("sueldo bruto es : " + sueldoBruto(montoSueldo, horas));
        System.out.println("sueldo neto es : " + sueldoNeto(montoSueldo, horas));
    }
}
