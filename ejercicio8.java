import java.util.Scanner; // import object Scanner

public class ejercicio8 {
  public static void main(String[] args) {
    // Una tienda ofrece un descuento del 15% sobre el total de la compra durante el mes de octubre. Dado un mes y un importe, calcular cuál es la cantidad que se debe cobrar al cliente.

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Enter the month: ");
    String month = myObj.nextLine();  // Read user input

    String discountMonth = "october";

    System.out.print("Enter the amount: ");
    int amount = myObj.nextInt();  // Read user input

    if ( month.compareToIgnoreCase(discountMonth) == 0 ){
        System.out.println("amount of money to pay €: " + amount*(1-0.15));  // Output user input;
      } else {
        System.out.println("amount of money to pay €: " + amount);  // Output user input;
        }
  }
}