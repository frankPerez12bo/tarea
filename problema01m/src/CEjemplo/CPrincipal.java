/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CEjemplo;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CPrincipal {
    static Scanner tecla = new Scanner(System.in);
    static COperaciones objOper = new COperaciones();
    static Leer leer =new Leer();
    static double numOne_main,numTwo_main;
    
    public static void main(String[] args) {
        numOne_main = leer.leer();
        objOper.setNumOne(numOne_main);
        numTwo_main = leer.leer();
        objOper.setNumTwo(numTwo_main);
        mostrar();
    }
    static int opcion;
    public static void mostrar(){
        do {            
            System.out.println("Escoger opcion del menu");
            System.out.println("-------------------------------");
            System.out.println("Opcin uno suma : ");
            System.out.println("Opcion dos resta : ");
            System.out.println("Opcion tres multiplicacion : ");
            System.out.println("Opcion cuatro division : ");
            opcion = tecla.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("--------------------------------------");
                System.out.println(" resultado de la suma es : \n" + objOper.suma());
                break;
            case 2 :
                System.out.println("---------------------------------------");
                System.out.println("El resultado de la resta es : \n " + objOper.resta());
                break;
            case 3:
                System.out.println("-------------------------------------------");
                System.out.println("resultado de la multiplicacion es : \n " + objOper.multiplicacion());
                break;
            case 4:
                System.out.println("----------------------------------------------");
                System.out.println("resultado de la division es : \n "+ objOper.division());
            default:
                System.out.println("no exite esta opcion");;
        }
     
        } while (opcion != 5);
        
    }
}
