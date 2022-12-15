import java.util.Scanner;

public class ejercicio2 {
  public static void main(String[] args) {
    // 2) Algoritmo que lea dos números, calculando y escribiendo el valor de su suma, resta, producto y división.
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Enter NUMBER user A: ");
    int userNumberA = myObj.nextInt();  // Read user input

    System.out.print("Enter NUMBER user B: ");
    int userNumberB = myObj.nextInt();  // Read user input

    System.out.println("Sum: " + (userNumberA + userNumberB) + "\n"
                        + "Substration: " + (userNumberA - userNumberB)+ "\n"
                        + "Multiplication: " + (userNumberA * userNumberB) + "\n"
                        + "Division: " + (userNumberA / userNumberB) + "\n");   // Output user input
  }
}