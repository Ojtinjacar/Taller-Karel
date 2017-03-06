/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuartos;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.util.Random;

/**
 *
 * @author Estudiante
 */
public class Cuarto {

    private City Unal;
    private Wall Pared;
    private Puntos conector;
    private Robot joe;

    public Cuarto(City c) {
        this.Unal= c;
        this.joe = new Robot(Unal, 7, 2, Direction.NORTH);
        this.conector = new Puntos();
        paredes();
        

    }

    public void paredes() {
        for (int i = 1; i < 6; i++) {
            this.Pared = new Wall(this.Unal, i + 1, 9, Direction.EAST);
           for (int j = 1; j < 8; j = j + 3) {
                this.Pared = new Wall(this.Unal, i + 1, j, Direction.WEST);
            }
        }
        for (int i = 0; i < 9; i++) {
            this.Pared = new Wall(this.Unal, 2, i + 1, Direction.NORTH);
        }
        for (int i = 1; i < 10; i++) {
            switch (i) {
                case 2:
                    break;
                case 5:
                    break;
                case 8:
                    break;
                default:
                    this.Pared = new Wall(this.Unal, 6, i, Direction.SOUTH);

            }

        }
    } 

    
public void añadir_numero_caja() {
        Random numeroaleatorio = new Random(System.currentTimeMillis());
        int J = numeroaleatorio.nextInt(10) + 0;

        switch (J) {
            case 1:

                //Numero 1
                for (int i = 0; i < 5; i++) {
                    Thing punto = new Thing(Unal, 2 + i, 3);
                }
                break;
            case 2:
                //Numero 2
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j = j + 2) {
                        Thing punto = new Thing(Unal, 2 + j, 1 + i);
                    }

                    Thing punto = new Thing(Unal, 3, 3);
                    Thing punto1 = new Thing(Unal, 5, 1);
                }
                break;
            case 3:
                //Numero 3 
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j = j + 2) {
                        Thing punto = new Thing(Unal, 2 + j, 1 + i);
                    }
                    Thing punto = new Thing(Unal, 3, 3);
                    Thing punto1 = new Thing(Unal, 5, 3);
                }
                break;
            case 4:
                //Numero 4
                for (int i = 0; i < 5; i++) {
                    Thing punto = new Thing(Unal, 2 + i, 3);
                    for (int j = 0; j < 2; j++) {
                        Thing punto1 = new Thing(Unal, 4, j + 1);
                        for (int k = 0; k < 2; k++) {
                            Thing punto2 = new Thing(Unal, 2 + k, 1);

                        }
                    }

                }
                break;
            case 5:
                //Numero 5
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j = j + 2) {
                        Thing punto = new Thing(Unal, 2 + j, 1 + i);
                    }

                    Thing punto = new Thing(Unal, 3, 1);
                    Thing punto1 = new Thing(Unal, 5, 3);
                }
                break;
            case 6:
                //Numero 6
                for (int i = 0; i < 5; i++) {
                    Thing punto = new Thing(Unal, 2 + i, 1);
                    for (int j = 0; j < 2; j++) {
                        for (int k = 0; k < 5; k = k + 2) {
                            Thing punto1 = new Thing(Unal, 2 + k, j + 2);
                        }
                    }
                    Thing punto2 = new Thing(Unal, 5, 3);
                }
                break;
            case 7:
                //Numero 7
                for (int i = 0; i < 5; i++) {
                    Thing punto = new Thing(Unal, 2 + i, 3);
                    for (int j = 0; j < 2; j++) {
                        Thing punto1 = new Thing(Unal, 2, j + 1);
                    }
                }
                break;
            case 8:
                // Numero 8 
                for (int i = 0; i < 3; i = i + 2) {
                    for (int j = 0; j < 5; j++) {
                        Thing punto = new Thing(Unal, 2 + j, i + 1);
                    }

                    for (int k = 0; k < 5; k = k + 2) {
                        Thing punto1 = new Thing(Unal, 2 + k, 2);
                    }
                }
                break;
            case 9:
                //Numero 9 
                for (int i = 0; i < 5; i++) {
                    Thing punto = new Thing(Unal, 2 + i, 3);
                    for (int j = 0; j < 2; j++) {
                        for (int k = 0; k < 5; k = k + 2) {
                            Thing punto1 = new Thing(Unal, 2 + k, 1 + j);
                        }
                        Thing punto1 = new Thing(Unal, 3, 1);
                    }
                }
                break;
            case 0:
                // Numero 0 
                for (int i = 0; i < 3; i = i + 2) {
                    for (int j = 0; j < 5; j++) {
                        Thing punto = new Thing(Unal, 2 + j, i + 1);
                    }

                    for (int k = 0; k < 5; k = k + 4) {
                        Thing punto1 = new Thing(Unal, 2 + k, 2);
                    }
                }
                break;

        }

    }
}
