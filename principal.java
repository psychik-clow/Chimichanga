/*
Realizar un menú en la clase principal (contiene el void main) que despliegue 3 opciones:
Problema 1, Problema 2, Problema 3.
Al momento de escoger una de las opciones se debe instanciar un objeto que llame a cada problema, cada problema debe estar en una clase aparte.
*/

package hojadetrabajo4;
import java.util.Scanner;
public class principal{
  public static void main (String []args){

    if1 ejercicio1 = new if1();
    if2 ejercicio2 = new if2();
    if3 ejercicio3 = new if3();
    Scanner reader = new Scanner (System.in);
      String CHOICE;

    System.out.println ("Por favor escoger el Problema a realizar:");
    System.out.println ("Problema 1.");
    System.out.println ("Problema 2.");
    System.out.println ("Problema 3.");
      int PROBLEMA = reader.nextInt ();


      if (CHOICE == 1) {
        ejercicio1.if1();
      } else if (CHOICE == 2) {
        ejercicio2.if2();
      } else if (CHOICE == 3) {
        ejercicio3.if3();
      }


    System.out.println ("Su eleccion fue: " + CHOICE);

      }
    }
