/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import becker.robots.*;

/**
 *
 * @author oscar
 */
public class Cuarto {

    private City Unal;
    private Robot Joe;
    private Wall[] Pared;
    private Thing[] Nugget;

    public Cuarto() {
        this.Unal = new City(25, 25);
        this.Joe = new Robot(Unal, 12, 2, Direction.NORTH);
        this.Pared = new Wall[8];
        this.Nugget = new Thing[8];
        for (int i = 0; i < 5; i++) {
            Pared[0] = new Wall(Unal, 7 + i, 2, Direction.WEST);
            Pared[1] = new Wall(Unal, 7, i + 2, Direction.NORTH);
            Pared[3] = new Wall(Unal, 7 + i, 6, Direction.EAST);
            Pared[4] = new Wall(Unal, 2 + i, 14, Direction.WEST);
            Pared[5] = new Wall(Unal, 2, i + 14, Direction.NORTH);
            Pared[6] = new Wall(Unal, 2 + i, 18, Direction.EAST);

        }
        for (int i = 0; i < 4; i++) {
            Pared[2] = new Wall(Unal, 11, i + 3, Direction.SOUTH);
            Pared[7] = new Wall(Unal, 6, i + 15, Direction.SOUTH);
        }
        Nugget[0] = new Thing(Unal, 8, 2);
        Nugget[1] = new Thing(Unal, 7, 3);
        Nugget[2] = new Thing(Unal, 8, 6);
        Nugget[3] = new Thing(Unal, 7, 5);
        Nugget[4] = new Thing(Unal, 10, 2);
        Nugget[5] = new Thing(Unal, 11, 3);
        Nugget[6] = new Thing(Unal, 11, 5);
        Nugget[7] = new Thing(Unal, 10, 6);

    }

    public void Avanzarderecha() {
        for (int i = 0; i < 3; i++) {
            Joe.turnLeft();

        }
    }

    public void LlevarNugget() {
        Joe.move();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                Joe.move();
                if (Joe.canPickThing() == true) {
                    Joe.pickThing();
                }
            }
            Avanzarderecha();

        }
    }

    public void Mover() {
        Joe.turnLeft();
        Joe.turnLeft();
        Joe.move();
        Joe.turnLeft();
        for (int i = 0; i < 12; i++) {
            Joe.move();

        }
        Joe.turnLeft();
        for (int i = 0; i < 6; i++) {
            Joe.move();

        }

    }

    public void PonerNugget() {
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 2; j++) {
                Joe.move();
                Joe.putThing();
                Joe.move();

            }
            Avanzarderecha();
        }

    }
    public void Salir(){
        Joe.turnLeft();
        Joe.turnLeft();
        Joe.move();
        Joe.turnLeft();
        Joe.move();
        Joe.turnLeft();
        
    }

}
