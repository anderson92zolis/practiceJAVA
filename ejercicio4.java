import java.util.Scanner; // import object Scanner

public class ejercicio4 {
  public static void main(String[] args) {
    //  4) Algoritmo que lea tres números distintos y nos diga cual de ellos es el mayor (recuerda usar la estructura condicional Si y los operadores lógicos).
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Enter NUMBER user A: ");
    int userNumberA = myObj.nextInt();  // Read user input

    System.out.print("Enter NUMBER user B: ");
    int userNumberB = myObj.nextInt();  // Read user input

    System.out.print("Enter NUMBER user C: ");
    int userNumberC = myObj.nextInt();  // Read user input

    if (userNumberA>userNumberB && userNumberA>userNumberC){
        System.out.println("User number A is greater. " + userNumberA);  // Output user input;
      } 
      else if(userNumberB>userNumberA && userNumberB>userNumberC){
        System.out.println("User number B is greater. "+userNumberB);
      }  else {
          System.out.println("User number C is greater. "+userNumberC);
        }
  }
}