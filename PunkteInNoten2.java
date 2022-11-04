package MehrfachVerzweigungen;

import java.util.Scanner;

public class PunkteInNoten2 {

	static int note;

	public static void main(String[] args) {

		Scanner notenscanner = new Scanner(System.in);

		double punkte;

		System.out.println("Bitte geben sie die Klausurpunkte ein.");
		punkte = notenscanner.nextInt();

		if (punkte >= 105 && punkte <= 120) {
			note = 1;
		}
		else if (punkte >= 100 && punkte <= 104.5) {
			note = 2;
		}
		else if (punkte >= 95 && punkte <= 99.5) {
			note = 3;
		}
		else if (punkte >= 90 && punkte <= 94.5) {
			note = 4;
		}
		else if (punkte >= 85 && punkte <= 89.5) {
			note = 5;
		}
		else if (punkte >= 80 && punkte <= 84.5) {
			note = 6;
		}
		else if (punkte >= 75 && punkte <= 79.5) {
			note = 7;
		}
		else if (punkte >= 70 && punkte <= 74.5) {
			note = 8;
		}
		else if (punkte >= 65 && punkte <= 69.5) {
			note = 8;
		}
		else if (punkte >= 60 && punkte <= 64.5) {
			note = 9;
		}
		else if (punkte >= 50 && punkte <= 59.5) {
			note = 11;
		}
		else if (punkte >= 0 && punkte <= 49.5) {
			note = 12;
		}

		
		switch (note) {
		case 1:
			System.out.println("Ihre Note ist 1");
			break;
		case 2:
			System.out.println("Ihre Note ist 1,3");
			break;
		case 3:
			System.out.println("Ihre Note ist 1,7");
			break;
		case 4:
			System.out.println("Ihre Note ist 2");
			break;
		case 5:
			System.out.println("Ihre note ist 2,3");
			break;
		case 6:
			System.out.println("Ihre note ist 2,7");
			break;
		case 7:
			System.out.println("Ihre note ist 3");
			break;
		case 8:
			System.out.println("Ihre note ist 3,3");
			break;
		case 9:
			System.out.println("Ihre note ist 3,7");
			break;
		case 10:
			System.out.println("Ihre note ist 4");
			break;
		case 11:
			System.out.println("Ihre note ist 4,7");
			break;
		default:
			System.out.println("Ihre note ist 5");
			break;

		}

	}
}
