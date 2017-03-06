/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Yeison
 */
public class Main {
    public static void main(String[] args) {
        Ejer4 ejer = new Ejer4();
        Scanner read = new Scanner(System.in);
        System.out.println("Cantidad de lotes: ");
        int a = read.nextInt();
        int c = 1;
        for (int i = 1; i < a+1; i++) {
            System.out.println("Cantidad de puntos que tendra el primer lote "+i+": ");
            int b = read.nextInt();
            ejer.Puntos(b, c);
            c+=1;
        }
        for (int i = 0; i < a; i++) {
            ejer.Recoger();
            ejer.Dibujar();
        }
    }
}
