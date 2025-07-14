package clasemath;

import java.math.BigInteger;

public class EjemplosMath {

	public static void main(String[] args) {
	
		/*byte numero1=15;
		byte numero2=14;
		//realizando un casting
		byte resultado=(byte)(numero1 + numero2);
		//nos devolvera de que tipo es numero 1
		System.out.print(((Object)numero1).getClass().getSimpleName());*/
		//un casting esconvertipo el tipo de un  valor a otro
		//el panquete mas importante de java es el paquete java lang
		/*int raiz=(int)Math.sqrt(9);
		
		//motodo pow retorna el valor del primer argumento elevado a  la potencia del segundo argumento
		
		int potencia=(int)Math.pow(5,3);
		
		//
		BigInteger big=BigInteger.valueOf(25);
		
		BigInteger potenci=big.pow(321);
	System.out.print(potenci);*/
	//metodo random nos permite generar numeros aleatorios nos devuelve un valor double con signo positivo
	// mas grande o igual a cero y menor a uno
		
		int masrandow=(int) (Math.random()*100);
		// medevuelve un mero aleatorio redondiado de tipo float
		int aleatorio=(int) Math.round((float)(Math.random()*100));
		System.out.println(aleatorio);
		//abs devulve el valor asoluto de un valor convierte un valor negativo en positivo
		//metodo max devuelve el valor masgrnde entre dos valores
				
	}

}
