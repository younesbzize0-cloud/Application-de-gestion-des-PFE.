package Saisie;

import java.util.Date;

import java.util.Scanner;

import Exceptions.InvalidExceptionSaisie;

public class OutilsSaisie {
	
	
	// ==============Demander la date================
	public static Date demanderDate() throws InvalidExceptionSaisie{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le jour (sous forme de nombre).");
		int jour = scanner.nextInt();
		if (jour > 31 || jour < 1)
			throw new InvalidExceptionSaisie("Le jour saisie est invalide !");
	
		System.out.println("Veuillez saisir le mois (sous forme de nombre).");
		int mois = scanner.nextInt();
		if (mois > 12 || mois < 1)
			throw new InvalidExceptionSaisie("Le mois saisie est invalide !");
		
		System.out.println("Veuillez saisir l'annee.");
		int annee = scanner.nextInt();
		
		return new Date((annee - 1900), (mois - 1), jour);
	}
}
