package com;
import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		System.out.println("**********************");
		System.out.println("welcome to MY TRAVELLS Booking");
		Scanner scan = new Scanner(System.in);
		BusBookingImpl bus1 = new BusBookingImpl(55);
		while(true) {
			System.out.println("choose an option to get service");
			System.out.println("1: bookin a ticket \n2: cancel a ticket");
			System.out.println("3: to check avaliable number of tickets\n4:exit");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter a number of tickets to BOOK");
				int numberOfTickets=scan.nextInt();
				bus1.buyTicket(numberOfTickets);
				break;
			case 2:
				System.out.println("enter number of tickets to be cancel");
				int numberOfTicketsTobecancel=scan.nextInt();
				bus1.buyTicket(numberOfTicketsTobecancel);
				break;
			case 3:
				bus1.getTicket();
				break;
			case 4:
				System.out.println("thankyou! book again!!");
				System.exit(0);
			default :
				try {
					throw new InvalidChoiseException("OPPS! invalid choice, enter a valid choise ");
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}

			}

		}
	}

}
