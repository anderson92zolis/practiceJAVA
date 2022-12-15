import java.util.Scanner; // import object Scanner

public class ejercicio6 {
  public static void main(String[] args) {
    // Realizar un algoritmo que lea un número por teclado. En caso de que ese número sea 0 o menor que 0, se saldrá del programa imprimiendo antes un mensaje de error. Si es mayor que 0, se deberá calcular su cuadrado y la raiz cuadrada del mismo, visualizando el numero que ha tecleado el usuario y su resultado («Del numero X, su potencia es X y su raiz X» ). Para calcular la raiz cuadrada se puede usar la función interna RAIZ(X)  o con una potencia de 0,5.

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Enter NUMBER: ");
    int userNumber = myObj.nextInt();  // Read user input

   

    if (userNumber > 0){
        System.out.println("Introduced number: "+userNumber 
                    + "\n"+ "power 2: " + Math.pow(userNumber, 2)
                    + "\n"+ "square 2: " + Math.sqrt(userNumber));  // Output user input;
      } else {
        System.out.println("negative number,  Introduce a number >0 ");  // Output user input;
        }
  }
}