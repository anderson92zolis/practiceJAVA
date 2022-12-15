import java.util.Scanner; // import object Scanner

public class ejercicio5 {
  public static void main(String[] args) {
    // 5) Diseñar un algoritmo que pida por teclado tres números; si el primero es negativo, debe imprimir el producto de los tres y si no lo es, imprimirá la suma.

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Enter NUMBER user A: ");
    int userNumberA = myObj.nextInt();  // Read user input

    System.out.print("Enter NUMBER user B: ");
    int userNumberB = myObj.nextInt();  // Read user input

    System.out.print("Enter NUMBER user C: ");
    int userNumberC = myObj.nextInt();  // Read user input

    if (userNumberA < 0){
        System.out.println("The multiplication is: " + (userNumberA*userNumberB*userNumberC));  // Output user input;
      } else {
          System.out.println("The Sum is: "+(userNumberA+userNumberB+userNumberC));
        }
  }
}