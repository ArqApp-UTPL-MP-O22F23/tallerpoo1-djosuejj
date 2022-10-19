/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_complejos;

/**
 *
 * @author davidjimenez
 */
public class Operaciones {

    public static void main(String[] args) {
        
        Complejo num1 = new Complejo(4, 7);
        Complejo num2 = new Complejo(2, 8);

        Complejo sumaComplejos = num1.sumarComplejos(num2);
        Complejo restaComplejos = num1.restarComplejos(num2);

        System.out.println("------Suma--------- \n2" + num1 + " + " + num2 + " = " + sumaComplejos);
        System.out.println("------Resta---------\n3" + num1 + " - " + num2 + " = " + restaComplejos);
    }

}
