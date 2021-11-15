package org.generation.italy.security;

public class PasswordGenerator { 
	public static void main(String[] args) {
		String nome = "Pino"; 
		String cognome = "Daniele";
		String color = "Rosso";
		int day = 12;
		int month = 4;
		int year = 1956;
		int somma = day + month + year;
		String password = nome + "-" + cognome + "-" + color + "-" + somma;
		System.out.println(password);
		
	}

}


