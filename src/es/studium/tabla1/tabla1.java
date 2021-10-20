package es.studium.tabla1;

import java.util.Scanner;

public class tabla1
{

	public static void main(String[] args)
	{
		final int TAM = 5;
		int tabla[]=new int[TAM];
		int i;
		Scanner teclado = new Scanner (System.in);
		for (i=0;i<TAM;i++)
		{
			System.out.println("Ingrese el valor de la posicion " +i+":");
			tabla[i]=teclado.nextInt();
		}
		for (i=0;i<TAM;i++)
		{
			System.out.println("Tabla["+i+"]="+tabla[i]);
			
		}
		teclado.close();
	}

}
