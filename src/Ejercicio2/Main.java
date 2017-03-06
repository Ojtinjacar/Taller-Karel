/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author oscar
 */
public class Main {

    public static void main(String[] args) {

        City Unal = new City(12, 12);
        Robot joe = new Robot(Unal, 7, 2, Direction.NORTH);
        Cuartos cuartos = new Cuartos(Unal, joe);
        cuartos.leer_cuarto();
        cuartos.numero();
        cuartos.volveraentrar();
        cuartos.leer_cuarto();
        cuartos.numero();
        cuartos.volveraentrar();
        cuartos.leer_cuarto();
        cuartos.numero();

    }

}
