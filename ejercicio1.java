import java.util.Scanner;

public class ejercicio1 {
  public static void main(String[] args) {
    // 1) Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al final las dos variables (recuerda la asignación).
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter NUMBER user A");
    int userNumberA = myObj.nextInt();  // Read user input

    System.out.println("Enter NUMBER user B");
    int userNumberB = myObj.nextInt();  // Read user input

    System.out.println("Number user A is: " + userNumberB + " Number user B is: "+userNumberA);  // Output user input
  }
}