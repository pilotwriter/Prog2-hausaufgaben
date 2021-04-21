package ueb14;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
			boolean isExit = false;
		/*
		 * Mitarbeiter m1 = new Mitarbeiter("Max", "Mustermann", "max@htwsaar.de");
		 * Mitarbeiter m2 = new Mitarbeiter("John", "Doe", "john@htwsaar.de");
		 * 
		 * Raum r1 = new Raum(18,0,1); Raum r2 = new Raum(2,1,9); Raum r3 = new
		 * Raum(2,1,10);
		 * 
		 * m1.reserviere(r1, new Uhrzeit(12, 30), new Uhrzeit(14, 30), "VOOP");
		 * m1.reserviere(r2, new Uhrzeit(14, 30), new Uhrzeit(16, 30), "WebTech");
		 * m2.reserviere(r2, new Uhrzeit(12, 30), new Uhrzeit(13, 30), "Prog II");
		 * m2.reserviere(r3, new Uhrzeit(9, 30), new Uhrzeit(11,30), "ITM");
		 * Reservierung res = new Reservierung("Java Coruse", new Uhrzeit(12, 30), new
		 * Uhrzeit(14, 30)); System.out.println(r1); System.out.println(r2);
		 * System.out.println(r3);
		 */
		while(!isExit) {
			try {
				System.out.println("Please choose an action");
				System.out.println("1)Creat User");
				System.out.println("2)Create a room");
				System.out.println("3)Create a reservation");
				System.out.println("4)See the reservations of a room");
				System.out.println("5)See the reservations of the Mitarbeiter");
				System.out.println("6)Exit");

		        Scanner in = new Scanner(System.in);
		        int choice = in.nextInt();
		        System.out.println(choice);
		        if(choice == 6) {
		        	isExit= true;
		        }
		        	
			}
			catch(Exception e) {
				
				
			}
			
		}
		


	}	

}
