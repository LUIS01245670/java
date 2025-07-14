package EntradaySalidadatos;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner entrada=new Scanner(System.in);//con syste.in estoy especificando cual va ser el flujo de 
  //datos de entrada como voy a introduccir los datos y los voy a introducir utilizando sistem.in
  //systems.in es una instancia o objeto de tipo input stream y normalmente representa la entrada por
  //por teclado de lo que vamos a teclear en consola
  System.out.println("introduce tu nombre porfavor");
  //nos devuelve un objeto de tipo string devuelve una linea entera de texto
  //hasta encontrar el salto de linea
    String nombre=entrada.nextLine();
    
    System.out.println("cuantos años tienes");
    int edad=entrada.nextInt();
    System.out.println("hola  "+nombre+"  tienes "+edad);
    //entrada consume  recursos ya que mediante el scanner se estadando un via de comuinicacion con 
    //el sistme  una ves abierta esa via de cominicacion con la consola ,con un archivo externo con lo que sea esta se debe cerrar
	 entrada.close();
	}

}
