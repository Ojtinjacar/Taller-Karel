/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import becker.robots.*;

/**
 *
 * @author Yeison
 */
public class Ejer6 {
    private City ciudad;
    private Robot oscar;
    private Thing bola;
    
    public Ejer6(int cantidad){
        ciudad = new City(10, 10);
        oscar = new Robot(this.ciudad, 11, 1, Direction.NORTH, cantidad);
    }
    
    public void Girar(){
        for (int i = 0; i < 3; i++) {
            oscar.turnLeft();
        }
    }
    
    public void Dibujar(int cantidad){
        for (int i = 1; i < cantidad+1; i++) {
            if(oscar.countThingsInBackpack()>0){
                oscar.move();
                for (int j = 0; j < i; j++) {
                    if(oscar.countThingsInBackpack()>0){
                        oscar.putThing();
                    }
                    oscar.move();
                }
                oscar.turnLeft();
                oscar.turnLeft();
                for (int j = 0; j < i+1; j++) {
                    oscar.move();
                }
                oscar.turnLeft();
                oscar.move();
                oscar.turnLeft();
            }
        }
    }
}
