/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Yeison
 */
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Cantidad de bolas que tendrá el robot: ");
        int a = read.nextInt();
        Ejer6 ejer = new Ejer6(a);
        ejer.Dibujar(a);
    }
}
