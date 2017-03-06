/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio7;

import becker.robots.*;

/**
 *
 * @author oscar
 */
public class Cuartos {

    private City Unal;
    private Robot Joe;
    private Thing[] puntos;
    private Wall[] pared;
    private int J = 16;

    public Cuartos() {
        this.Unal = new City(12, 12);
        this.Joe = new Robot(Unal, 9, 5, Direction.NORTH);
        this.puntos = new Thing[4];
        this.pared = new Wall[8];
        for (int i = 0; i < 4; i++) {
            pared[0] = new Wall(Unal, i + 1, 4, Direction.EAST);
            pared[1] = new Wall(Unal, i + 1, 6, Direction.WEST);
            pared[2] = new Wall(Unal, i + 6, 4, Direction.EAST);
            pared[3] = new Wall(Unal, i + 6, 6, Direction.WEST);
            pared[4] = new Wall(Unal, 6, 1 + i, Direction.NORTH);
            pared[5] = new Wall(Unal, 4, 1 + i, Direction.SOUTH);
            pared[6] = new Wall(Unal, 6, 6 + i, Direction.NORTH);
            pared[7] = new Wall(Unal, 4, 6 + i, Direction.SOUTH);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                puntos[0] = new Thing(Unal, 1 + i, 1 + j);
                puntos[1] = new Thing(Unal, 6 + i, 1 + j);
                puntos[2] = new Thing(Unal, 6 + i, 6 + j);
                puntos[3] = new Thing(Unal, 1 + i, 6 + j);
            }

        }

    }

    public void MovPasillo() {
        for (int i = 0; i < 9; i++) {
            Joe.move();
        }
    }

    public void GirarIzq() {
        Joe.turnLeft();
        Joe.move();
        Joe.turnLeft();
        Joe.move();

    }

    public void VaciarCuarto() {

        while (Joe.countThingsInBackpack() < J) {
            if (Joe.canPickThing() == true) {
                Joe.pickThing();
                Joe.move();
                if (Joe.frontIsClear() == false) {
                    if (Joe.canPickThing() == true) {
                        Joe.pickThing();
                        AdvanceRight();
                        Joe.move();
                        AdvanceRight();
                    }
                }

            } else {
                Joe.turnLeft();
                Joe.move();
                Joe.turnLeft();
                Joe.move();

            }
        }
        J = 16 + J;
    }
    
    
    
        

    public void AdvanceRight() {
        for (int i = 0; i < 3; i++) {
            Joe.turnLeft();

        }
    }

    public void MoverMitad_Pasillo() {
        Joe.turnLeft();
        for (int i = 0; i < 2; i++) {
            Joe.move();
        }
        Joe.turnLeft();
        Joe.move();
    }

    

}