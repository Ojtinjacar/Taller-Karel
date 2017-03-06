/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import becker.robots.*;

/**
 *
 * @author Yeison
 */
public class Ejer4 {
    private City ciudad;
    private Robot jei;
    private Thing ball;
    
    public Ejer4(){
        ciudad = new City(10, 10);
        jei = new Robot(this.ciudad, 0, 1, Direction.SOUTH);
    }
    
    public void Puntos(int cant, int d){
        for (int j = 0; j < cant; j++) {
            ball = new Thing(this.ciudad, d, 1);
        }
    }
    
    public void Recoger(){
        jei.move();
        int band = 1;
        while(band==1){
            if(jei.canPickThing() == true){
                jei.pickThing();
            }
            else{
                band=0;
            }
        }
        System.out.println(jei.countThingsInBackpack());
    }
    
    public void Dibujar(){
        jei.turnLeft();
        int cantidad = jei.countThingsInBackpack();
        for (int i = 0; i < cantidad; i++) {
            jei.putThing();
            jei.move();
        }
        jei.turnLeft();
        jei.turnLeft();
        for (int i = 0; i < cantidad; i++) {
            jei.move();
        }
        jei.turnLeft();
    }
    
}
