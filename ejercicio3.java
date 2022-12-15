import java.util.Scanner;

public class ejercicio3 {
  public static void main(String[] args) {
    // Algoritmo que lea dos números y nos diga cual de ellos es mayor o bien si son iguales (recuerda usar la estructura condicional SI)
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Enter NUMBER user A: ");
    int userNumberA = myObj.nextInt();  // Read user input

    System.out.print("Enter NUMBER user B: ");
    int userNumberB = myObj.nextInt();  // Read user input

    if (userNumberA>userNumberB){
      System.out.println("User number A is greater. ");  // Output user input;
    } 
    else if(userNumberA<userNumberB){
      System.out.println("User number B is greater. ");
    }  else {
        System.out.println("Both numbers are equals. ");
      }   
  }
}