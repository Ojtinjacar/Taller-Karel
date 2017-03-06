/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import becker.robots.*;
/**
 *
 * @author Yeison
 */
public class Letras {
    private City escenario;
    private Robot robot1;
    private Robot robot2;
    private Robot robot3;
    private Robot robot4;
    private Robot robot5;
    
    public Letras(){
        escenario = new City(10, 21);
        robot1 = new Robot(this.escenario, 6, 1, Direction.NORTH, 11);
        robot2 = new Robot(this.escenario, 6, 5, Direction.NORTH, 11);
        robot3 = new Robot(this.escenario, 6, 9, Direction.NORTH, 7);
        robot4 = new Robot(this.escenario, 6, 13, Direction.NORTH, 7);
        robot5 = new Robot(this.escenario, 6, 19, Direction.NORTH, 12);
    }
    
    public void H(){
        for (int i = 0; i < 4; i++) {
            this.robot1.putThing();
            this.robot1.move();
        }
        this.robot1.putThing();
        this.robot1.turnLeft();
        this.robot1.turnLeft();
        this.robot1.move();
        this.robot1.move();
        this.robot1.turnLeft();
        this.robot1.move();
        this.robot1.putThing();
        this.robot1.move();
        this.robot1.turnLeft();
        this.robot1.move();
        this.robot1.move();
        this.robot1.turnLeft();
        this.robot1.turnLeft();
        for (int i = 0; i < 5; i++) {
            this.robot1.putThing();
            this.robot1.move();
        }
    }
    
    public void E(){
        for (int i = 0; i < 4; i++) {
            this.robot2.putThing();
            this.robot2.move();
        }
        this.robot2.putThing();
        for (int i = 0; i < 3; i++) {
            this.robot2.turnLeft();
        }
        for (int i = 0; i < 2; i++) {
            this.robot2.move();
            this.robot2.putThing();
        }
        for (int i = 0; i < 3; i++) {
            this.robot2.turnLeft();
        }
        for (int i = 0; i < 2; i++) {
            this.robot2.move();
        }
        for (int i = 0; i < 3; i++) {
            this.robot2.turnLeft();
        }
        for (int i = 0; i < 2; i++) {
            this.robot2.putThing();
            this.robot2.move();
        }
        this.robot2.turnLeft();
        this.robot2.move();
        this.robot2.move();
        this.robot2.turnLeft();
        for (int i = 0; i < 2; i++) {
            this.robot2.move();
            this.robot2.putThing();
        }
        for (int i = 0; i < 3; i++) {
            this.robot2.turnLeft();
        }
        this.robot2.move();
    }
    
    public void L1(){
        for (int i = 0; i < 4; i++) {
            this.robot3.putThing();
            this.robot3.move();
        }
        this.robot3.putThing();
        this.robot3.turnLeft();
        this.robot3.turnLeft();
        for (int i = 0; i < 4; i++) {
            this.robot3.move();
        }
        this.robot3.turnLeft();
        for (int i = 0; i < 2; i++) {
            this.robot3.move();
            this.robot3.putThing();
        }
        for (int i = 0; i < 3; i++) {
            this.robot3.turnLeft();
        }
        this.robot3.move();
    }
    
    public void L2(){
        for (int i = 0; i < 4; i++) {
            this.robot4.putThing();
            this.robot4.move();
        }
        this.robot4.putThing();
        this.robot4.turnLeft();
        this.robot4.turnLeft();
        for (int i = 0; i < 4; i++) {
            this.robot4.move();
        }
        this.robot4.turnLeft();
        for (int i = 0; i < 2; i++) {
            this.robot4.move();
            this.robot4.putThing();
        }
        for (int i = 0; i < 3; i++) {
            this.robot4.turnLeft();
        }
        this.robot4.move();
    }
    
    public void O(){
        for (int i = 0; i < 4; i++) {
            this.robot5.putThing();
            this.robot5.move();
        }
        this.robot5.turnLeft();
        this.robot5.putThing();
        this.robot5.move();
        this.robot5.putThing();
        this.robot5.move();
        this.robot5.turnLeft();
        for (int i = 0; i < 4; i++) {
            this.robot5.putThing();
            this.robot5.move();
        }
        this.robot5.turnLeft();
        this.robot5.putThing();
        this.robot5.move();
        this.robot5.putThing();
        this.robot5.move();
        for (int i = 0; i < 3; i++) {
            this.robot5.turnLeft();
        }
        this.robot5.move();
    }
}
