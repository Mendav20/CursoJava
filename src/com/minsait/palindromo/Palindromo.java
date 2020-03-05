package com.minsait.palindromo;

public class Palindromo {

	public void palabraPalidrome(String palabraIngresada) {

		/*
		 * Se solicita ingresar la palabra, se convierte en minusculas y se eliminan los
		 * espacios
		 */

		palabraIngresada = palabraIngresada.toLowerCase().replace(" ", "");
		System.out.print(palabraIngresada);// Se muestra la palabra ingresada

		/*
		 * Se leé la cadena y se le resta 1 ya que los caracteres de la cadena están
		 * numerados del 0 al tamaño de la cadena
		 */
		int palabraInversa = palabraIngresada.length() - 1;
		int inicioPalabra = 0;
		boolean esPalindromo = true;

		while (inicioPalabra < palabraInversa) {
			if (palabraIngresada.charAt(inicioPalabra) != palabraIngresada.charAt(palabraInversa)) {
				esPalindromo = false;
			}
			inicioPalabra++;
			palabraInversa--;
		}
		if (esPalindromo)
			System.out.print(" es palindromo.");
		else
			System.out.print(" no es palindromo.");
	}
}
