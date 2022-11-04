package MehrfachVerzweigungen;

import java.util.Scanner;

public class Hausratsversicherung {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int personen;
		int flaeche;
		int praemie;

		System.out.println("Bitte geben sie die Anzahl der Personen an!");
		personen = scanner.nextInt();

		System.out.println("Bitte gebben sie die Groesse der Flaeche ein!");
		flaeche = scanner.nextInt();

		switch (personen) {
		case 1:
			System.out.println("Ihre Praemie betraegt: " + (10 + flaeche / 2));
			break;
		case 2:
			System.out.println("Ihre Praemie betraegt: " + (10 + flaeche / 2));
			break;
		case 3:
			System.out.println("Ihre Praemie betraegt: " + (15 + flaeche));
			break;
		case 4:
			System.out.println("Ihre Praemie betraegt: " + (15 + 1.5 * flaeche));
			break;
		default:
			System.out.println("Ihre Praemie betraegt: " + (25 + 2 * flaeche));
			break;

		}

	}
}
