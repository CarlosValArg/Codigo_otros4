package com.generation;

import java.util.Scanner; //se hace el impot del Scanner

public class Codigo4 {
	public static void main(String[] args) {//se añade el public static void
	 Scanner s = new Scanner(System.in); //se añade el system.in
	 
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    Scanner s2 = new Scanner(System.in);
	    String j2 = s.nextLine();
	    
	    if (j1 == j2) {//se quita aprentesis extra o demas
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2 == "tijeras") {
	            g = 1;
	            break;//se añade el break
	          }

	        case "papel":
	          if (j2 == "piedra") {
	            g = 1;
	            break;//se añade el break
	          }//se ciera con esta nueva llave
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          
	          break;
	          }
	        default:{//se abre llave y se define el default
	        System.out.println("Empate");
	        }
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	    s.close();//se cierra el scanner

}
