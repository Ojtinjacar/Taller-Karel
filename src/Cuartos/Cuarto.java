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

/**
 *
 * @author Estudiante
 */
public class Cuarto {
 private City Unal;
 private Robot Joe;
 private Thing Objeto;
 private Wall Pared;
 
 public Cuarto(){
     this.Unal = new City(11, 11);
     this.Joe = new Robot(this.Unal, 7, 2, Direction.NORTH);
     this.Objeto = new Thing(this.Unal, 8, 8);
     for (int i = 1; i <6; i++) {
         this.Pared= new Wall(this.Unal, i+1, 9, Direction.EAST);
         this.Pared= new Wall(this.Unal, i+1, 7, Direction.WEST);
         this.Pared= new Wall(this.Unal, i+1, 4, Direction.WEST);
         this.Pared= new Wall(this.Unal, i+1, 1, Direction.WEST);
          }
     for (int i = 0; i < 9;i++) {
       this.Pared= new Wall(this.Unal, 2, i+1, Direction.NORTH);
      }
     for (int i =0 ; i < 9; i++) {
       
       this.Pared= new Wall(this.Unal, 6, i+1, Direction.SOUTH);  
     }
     
     
 }
 
}
