import java.util.Scanner; // import object Scanner

public class ejercicio7 {
  public static void main(String[] args) {
    // 7) Un colegio desea saber qué porcentaje de niños y qué porcentaje de niñas hay en el curso actual. Diseñar un algoritmo para este propósito (recuerda que para calcular el porcentaje puedes hacer una regla de 3).

    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Enter number of the males: ");
    int numbesofMales = myObj.nextInt();  // Read user input

    System.out.print("Enter number of the females: ");
    int numberofFemales = myObj.nextInt();  // Read user input

   float totalStudents = (float) numberofFemales+numbesofMales;

   System.out.println("Porcents of Males Studens: " + numbesofMales*100/totalStudents + "%");
   System.out.println("Porcents of Females Studens: " + numberofFemales*100/totalStudents +"%");
  }
}