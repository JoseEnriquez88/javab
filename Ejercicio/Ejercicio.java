package Ejercicio;
// Realizar un programa que permita el intercambio de valores entre dos variables.
// Por ejemplo: Si una variable numero vale 35, y una variable numero2 vale 20,
// realizar las acciones necesarias para que numero pase a valer 20 y numero2 pase
// a valer 35. Una vez realizado el cambio mostrar el resultado en pantalla.

public class Ejercicio {
  public static void main(String[] args) {
    int n = 35;
    int n2 = 20;

    int nAux = n;
    n = n2;
    n2 = nAux;
    System.out.println("El resultado de n deberia ser 20: " + n + "  Y el resultado de n2 deberia ser 35: " + n2);
  }
}
