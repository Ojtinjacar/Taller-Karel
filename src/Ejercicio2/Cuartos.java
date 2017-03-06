/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author oscar
 */
public class Cuartos {

    private City Unal;
    private Wall Pared;
    private Robot joe;
    private int contador = 0;

    public Cuartos(City C, Robot R) {
        this.Unal = C;
        this.joe = R;
        paredes();
        //Añadir 0 a primer cuarto
        for (int i = 0; i < 3; i = i + 2) {
            for (int j = 0; j < 5; j++) {
                Thing punto = new Thing(Unal, 2 + j, i + 1);
            }

            for (int k = 0; k < 5; k = k + 4) {
                Thing punto1 = new Thing(Unal, 2 + k, 2);
            }
        }
        //añadir 5 al segundo cuarto
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j = j + 2) {
                Thing punto = new Thing(Unal, 2 + j, 4 + i);
            }

            Thing punto = new Thing(Unal, 3, 4);
            Thing punto1 = new Thing(Unal, 5, 6);
        }
        //añadir 0 al tercer cuarto
        for (int i = 0; i < 3; i = i + 2) {
            for (int j = 0; j < 5; j++) {
                Thing punto = new Thing(Unal, 2 + j, i + 7);
            }

            for (int k = 0; k < 5; k = k + 4) {
                Thing punto1 = new Thing(Unal, 2 + k, 8);
            }
        }
    }

    public void avanzar_derecha() {
        for (int i = 0; i < 3; i++) {
            joe.turnLeft();
        }
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

    public void leer_cuarto() {
        
        joe.move();
        joe.turnLeft();
        joe.move();
        if (joe.canPickThing() == true) {
            contador = contador + 1;
        }
        avanzar_derecha();
        joe.move();
        if (joe.canPickThing() == true) {
            contador = contador + 2;
        }
        joe.move();
        if (joe.canPickThing() == true) {
            contador = contador + 3;
        }
        joe.move();
        if (joe.canPickThing() == true) {
            contador = contador + 4;
        }
        joe.move();
        if (joe.canPickThing() == true) {
            contador = contador + 5;
        }
        avanzar_derecha();
        joe.move();
        if (joe.canPickThing() == true) {
            contador = contador + 6;
        }
        joe.move();
        if (joe.canPickThing() == true) {
            contador = contador + 7;
        }
        avanzar_derecha();
        joe.move();
        if (joe.canPickThing() == true) {
            contador = contador + 8;
        }
        joe.move();
        if (joe.canPickThing() == true) {
            contador = contador + 9;
        }
        joe.move();
        if (joe.canPickThing() == true) {
            contador = contador + 10;
        }
        joe.move();
        if (joe.canPickThing() == true) {
            contador = contador + 11;
        }
        avanzar_derecha();
        joe.move();
        if (joe.canPickThing() == true) {
            contador = contador + 12;
        }
        avanzar_derecha();
        joe.move();
        joe.move();
        if (joe.canPickThing() == true) {
            contador = contador + 13;
        }
        joe.turnLeft();
        joe.turnLeft();
        joe.move();
        joe.move();
        joe.move();
        
    }

    public void volveraentrar() {
        joe.turnLeft();
        joe.move();
        joe.move();
        joe.move();
        joe.turnLeft();
        contador=0;

    }

    public void numero() {
        switch (contador) {
            case 45:
                System.out.print("1");
                break;
            case 77:
                System.out.print("2");
                break;
            case 85:
                System.out.print("3");
                break;
            case 70:
                System.out.print("4");
                break;
            case 81:
                System.out.print("5");
                break;
            case 83:
                System.out.print("6");
                break;
            case 56:
                System.out.print("7");
                break;
            case 91:
                System.out.print("8");
                break;
            case 89:
                System.out.print("9");
                break;
            case 78:
                System.out.print("0");
                break;
            

        }
    }
}
