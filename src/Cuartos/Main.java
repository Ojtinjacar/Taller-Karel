/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuartos;

import becker.robots.*;

/**
 *
 * @author Estudiante
 */
public class Main {

  

    public static void main(String[] args) {
       City Unal = new City(11, 11);
       Cuarto cuarto = new Cuarto(Unal);
       cuarto.añadir_numero_caja();
      
        //Robot joe = new Cuarto().getJoe();
        //puntos.añadir_numero_caja();

      /*  for (int j = 0; j < 3; j++) {
            joe.move();
            joe.countThingsInBackpack();
            for (int i = 0; i < 3; i++) {
                joe.turnLeft();
            }
            joe.move();
            joe.countThingsInBackpack();
            joe.turnLeft();
            for (int i = 0; i < 4; i++) {
                joe.move();
            }
            joe.turnLeft();
            joe.move();
            joe.countThingsInBackpack();
            joe.turnLeft();
            for (int i = 0; i < 4; i++) {
                joe.move();
            }
            joe.turnLeft();
            joe.move();
            joe.countThingsInBackpack();
            joe.move();
            joe.countThingsInBackpack();
            joe.turnLeft();
            joe.move();
            joe.countThingsInBackpack();
            joe.move();
            joe.countThingsInBackpack();

            for (int i = 0; i < 2; i++) {
                joe.turnLeft();
            }
            for (int i = 0; i < 3; i++) {
                joe.move();
                joe.countThingsInBackpack();
            }
            if (j < 2) {
                joe.turnLeft();
                joe.move();
                joe.move();
                joe.move();
                joe.turnLeft();
            }

        }*/

    }

   

}
