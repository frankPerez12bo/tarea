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
public class COperaciones {
    private double numOne,numTwo;

    public double getNumOne() {
        return numOne;
    }

    public void setNumOne(double numOne) {
        this.numOne = numOne;
    }

    public double getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(double numTwo) {
        this.numTwo = numTwo;
    }
    public double suma(){
        return numOne + numTwo;
    }
    public double resta(){
        return numOne - numTwo;
    }
    public double multiplicacion(){
        return numOne * numTwo;
    }
    public double division(){
        if (numTwo == 0 || numOne == 0) {
            System.out.println("no es divisible con cero");
        }
        return numOne / numTwo;
    }
}
