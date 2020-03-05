package com.minsait.figurasasteriscos;

public class Triangulo {

	public static void main(String[] args) {
		String SALTO_LINEA = " ";
		char CHAR_ASTERISCO = '*';
		final int numFilas = 7;

		for (int altura = 1; altura <= numFilas; altura++) {
			// Imprimir espacios en blanco
			for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
				System.out.print(SALTO_LINEA);
			}

			// Imprimir Asteriscos
			for (int asteriscos = 1; asteriscos <= altura; asteriscos++) {
				System.out.print(CHAR_ASTERISCO);
			}
			System.out.println();
		}
	}

}
