package com.minsait.palindromo;

import java.util.Scanner;

public class MainPalindromo {

	public static void main(String[] args) {
		System.out.println("Introduce una palabra: ");

		Scanner entrada = new Scanner(System.in);
		String palabraIngresada = entrada.nextLine();
		entrada.close();

		Palindromo palabraPalindrome = new Palindromo();
		palabraPalindrome.palabraPalidrome(palabraIngresada);
	}

}
