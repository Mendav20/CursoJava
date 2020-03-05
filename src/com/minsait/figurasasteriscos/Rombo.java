package com.minsait.figurasasteriscos;

public class Rombo {

	String SALTO_LINEA = " ";
	char CHAR_ASTERISCO = '*';

	public void trianguloIzquierdo(int numFilas) {
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

	public void trianguloDerecho(int numFilas) {
		for (int altura = 1; altura <= numFilas; altura++) {
			// Imprimir Asteriscos
			for (int asteriscos = 1; asteriscos <= altura; asteriscos++) {
				System.out.print(CHAR_ASTERISCO);
			}

			// Imprimir espacios en blanco
			for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
				System.out.print(SALTO_LINEA);
			}
			System.out.println();
		}
	}

	public void trianguloInferiorIzquierdo(int numFilas) {
		for (int altura = 1; altura <= numFilas; altura++) {
			// Imprimir espacios en blanco
			for (int blancos = numFilas - 2; blancos >= numFilas - altura; blancos--) {
				System.out.print(SALTO_LINEA);
			}
			// Imprimir Asteriscos
			for (int asteriscos = numFilas; asteriscos >= altura; asteriscos--) {
				System.out.print(CHAR_ASTERISCO);
			}

			System.out.println();
		}
	}

	public void trianguloInferiorDerecho(int numFilas) {
		for (int altura = 1; altura <= numFilas; altura++) {
			// Imprimir Asteriscos
			for (int asteriscos = numFilas; asteriscos >= altura; asteriscos--) {
				System.out.print(CHAR_ASTERISCO);
			}

			// Imprimir espacios en blanco
			for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
				System.out.print(SALTO_LINEA);
			}
			System.out.println();
		}
	}

	public void trianguloCompleto(int numFilas) {
		for (int altura = 1; altura <= numFilas; altura++) {
			// Imprimir espacios en blanco
			for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
				System.out.print(SALTO_LINEA);
			}

			// Imprimir Asteriscos
			for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
				System.out.print(CHAR_ASTERISCO);
			}
			System.out.println();
		}

		for (int altura = numFilas - 1; altura >= 1; altura--) {
			// Imprimir espacios en blanco
			for (int blancos = 1; blancos <= numFilas - altura; blancos++) {
				System.out.print(SALTO_LINEA);
			}

			// Imprimir Asteriscos
			for (int asteriscos = (altura * 2) - 1; asteriscos >= 1; asteriscos--) {
				System.out.print(CHAR_ASTERISCO);
			}
			System.out.println();
		}

	}

}
