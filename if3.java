/*
Dado el precio de un producto y la cantidad de unidades del mismo.
Calcule el total a pagar tomando en cuenta que, si el total a pagar es mayor de Q100.00 se hace un descuento el 10%.

---

Ingrese la cantidad de productos.
Ingrese el precio del productos.
El Sub-Total es "".
El descuento es de ""
Total a pagar.

*/

package hojadetrabajo4;
import java.util.Scanner;
public class if3{


if3 (){
}


  void method3 (){
Scanner reader = new Scanner (System.in);
//Declaracion de variables
  double CANTIDAD_PRODUCTOS;
  double PRECIO_PRODUCTOS;
  double SUBTOTAL;
  double DESCUENTO;
  double TOTAL;


System.out.println ("Por favor ingrese la cantidad de productos");
  CANTIDAD_PRODUCTOS = reader.nextDouble ();
System.out.println ("Por favor ingrese el precio de los productos");
  PRECIO_PRODUCTOS = reader.nextDouble ();
}


//Calculacion de operaciones
  SUBTOTAL = (CANTIDAD_PRODUCTOS * PRECIO_PRODUCTOS);
  DESCUENTO = (SUBTOTAL * 0.1);
  TOTAL = (SUBTOTAL - DESCUENTO);


if (SUBTOTAL >= 100){
  System.out.println ("El total a pagar es: " + TOTAL + " y el descuento fue de: " + DESCUENTO + ".");
} else {
  System.out.println ("El total a pagar es: " + SUBTOTAL + " y no hubo descuento ya que fue menos de Q100.");
}
    }
  }
}
