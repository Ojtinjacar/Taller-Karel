/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Futbol;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author Estudiante
 */
public class Futbol {

    private Robot joe;
    private City unal;
    private Thing balon;

    public Futbol() {
        this.unal = new City(10, 10);
        this.balon = new Thing(this.unal, 9, 9);
        this.joe = new Robot(unal, 9, 9, Direction.WEST);
    }

    public void advance() {
        joe.move();

    }

    public void advanceleft() {
        joe.move();
        joe.move();
        joe.turnLeft();

    }

    public void advanceright() {
        if (joe.canPickThing() == true) {
            joe.pickThing();
        }
        joe.move();
        joe.move();
        joe.turnLeft();
        joe.turnLeft();
        joe.turnLeft();

    }

}
