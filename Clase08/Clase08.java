package Clase08;

import java.util.Scanner;

// Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos
// de los mismo pueden tener 3 categorias. 1- repositor, 2- cajero y 3-
// supervisor

// . los repositores cobran $15.890 + un bono del 10%
// . los cajeros cobran $25.630,89 fijos
// . los supervisoresa cobran $35.560,20 en bruto al cual se les descuenta un
// 11% de jubilacion

// Se necesita un programa, que dependiendo del tipo de empleado del que se
// trate, calcule y muestre por
// pantalla el correspondiente sueldo

public class Clase08 {
  public static void main(String[] args) {
    double sueldo = 0;
    int categoria;

    System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo: ");
    Scanner teclado = new Scanner(System.in);
    categoria = teclado.nextInt();
    if (categoria == 1) {
      sueldo = 15890 + (15890 * 0.10);
    } else {
      if (categoria == 2) {
        sueldo = 25630.89;
      } else {
        if (categoria == 3) {
          sueldo = 35560.20 - (35560.20 * 0.11);
        } else {
          System.out.println("Debe ingresar un numero de categoria valido.");
        }
      }
    }
    if (categoria == 1 || categoria == 2 || categoria == 3) {
      System.out.println("El total del sueldo para la categoria seleccionada " + categoria + " es igual a: " + sueldo);
    }
    teclado.close();
  }
}
