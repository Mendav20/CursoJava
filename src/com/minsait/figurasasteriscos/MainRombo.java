package com.minsait.figurasasteriscos;

import java.util.Scanner;

public class MainRombo {
	public static void main(String[] args) {
		String SALTO_LINEA = "\n";

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese numero:\n");
		int numFilas = entrada.nextInt();
		entrada.close();

		if (numFilas < 3 || numFilas > 15) {
			System.out.println("El numero ingresado no es valido, favor de verificarlo...");
		} else {

			Rombo figuraRombo = new Rombo();

			figuraRombo.trianguloIzquierdo(numFilas);
			System.out.print(SALTO_LINEA);

			figuraRombo.trianguloDerecho(numFilas);
			System.out.print(SALTO_LINEA);

			figuraRombo.trianguloInferiorIzquierdo(numFilas);
			System.out.print(SALTO_LINEA);

			figuraRombo.trianguloInferiorDerecho(numFilas);
			System.out.print(SALTO_LINEA);

			figuraRombo.trianguloCompleto(numFilas);
		}
	}
}
