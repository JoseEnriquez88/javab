package Clase16;

import java.util.Scanner;

//! Realizar un programa que permita cargar 15 numeros en un vector.
//! Una vez cargados, se necesita que el programa cuente e informe 
//! por pantalla cuantas veces se cargo el numero 3

public class Clase16 {
  public static void main(String[] args) {
    int vector[] = new int[15];
    Scanner teclado = new Scanner(System.in);

    // Carga de numeros para el vector
    for (int i = 0; i < 15; i++) {
      System.out.println("Ingrese el valor para el indice " + i);
      vector[i] = teclado.nextInt();
    }

    // Recorrido del vector
    int contador = 0;
    for (int i = 0; i < 15; i++) {
      if (vector[i] == 3) {
        contador++;
      }
    }
    System.out.println("El numero 3 se cargo " + contador + " veces en el vector.");
    teclado.close();
    ;
  }
};
