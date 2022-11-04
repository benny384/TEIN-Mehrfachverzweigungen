package MehrfachVerzweigungen;

import java.util.Scanner;


public class Wochen {
	
   public static void main(String[] args) {
	            	
  	Scanner datenleser = new Scanner (System.in);	
  	int tag;
		int monat;
	  int jahr;
		                    
	  System.out.println("Bitte geben sie den Tag ein!");
	  tag = datenleser.nextInt();
	  System.out.println("Bitte geben sie den Monat ein!");
	  monat = datenleser.nextInt();
	  System.out.println("Bitte geben sie das Jahr ein!");
	  jahr = datenleser.nextInt();
		                		
		                    
	  int wochentag = (jahr - 1900) * 365 + (jahr - 1900) / 4;
	  if (jahr % 4 == 0 && monat <= 2) {
	  	wochentag--;
	  }
	  switch (monat) {
	  case 12: wochentag += 30;
	  case 11: wochentag += 31;
	  case 10: wochentag += 30;
	  case 9: wochentag += 31;
	  case 8: wochentag += 31;
	  case 7: wochentag += 30;
	  case 6: wochentag += 31;
	  case 5: wochentag += 30;
	  case 4: wochentag += 31;
	  case 3: wochentag += 28;                        
	  case 2: wochentag += 31;
	  }
	  
	  wochentag = (tag + wochentag) % 7;
	  
	  switch (wochentag) {
	  case 0: System.out.println("Sonntag");
	  break;
	  case 1: System.out.println("Montag");
	  break;
	  case 2: System.out.println("Dienstag");
	  break;
	  case 3: System.out.println("Mittwoch");
	  break;
	  case 4: System.out.println("Donnerstag");
	  break;  
	  case 5: System.out.println("Freitag");
	  break;
	  case 6: System.out.println("Samstag");
	  break;
	  
	  }
  }
}
