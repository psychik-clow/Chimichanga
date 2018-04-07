//Escriba un programa que pida dos numeros diferentes e indique cual de los dos es mayor.

package hojadetrabajo4;
import java.util.Scanner;
public class if2{


if2 (){
  }


  void method2(){

    Scanner reader = new Scanner(System.in);
    System.out.println("Por favor ingrese el primer numero");
      double NUMERO1 = reader.nextDouble();
    System.out.println("Por favor ingrese el segundo numero");
      double NUMERO2 = reader.nextDouble();


    if (NUMERO1 > NUMERO2) {
      System.out.println("El primer numero es mayor que el segundo y su valor es: " + NUMERO1);
    } else {
      System.out.println("El segundo numero es mayor que el primero y su valor es: " + NUMERO2);
    }
        }
  }
}
