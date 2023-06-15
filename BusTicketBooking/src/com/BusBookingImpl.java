package com;

public class BusBookingImpl implements BusBooking{
	int avaliabletickets; // assume 50 tickets
	BusBookingImpl(int avaliabletickets){
		this.avaliabletickets = avaliabletickets;
	}
	@Override
	public void buyTicket(int tickets){
		if(tickets <= avaliabletickets) {
			System.out.println("buying "+tickets+" tickets!");
			avaliabletickets = avaliabletickets-tickets;
			System.out.println("BOOKING DONE");
		}else {
			try {
				String message = "OOPS! INVALID TICKET SIZE,AVALIABLE TICKETS ARE :"+avaliabletickets;
				throw new InvalidTicketSizeException(message);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
	@Override
	public void cancelTicket(int tickets) {
		System.out.println("cancelTicket "+tickets+" tickets!");
		avaliabletickets += tickets; 
		System.out.println("Cancel Done");

	}
	@Override
	public void getTicket() {
		System.out.println("AvaliableTickets:"+avaliabletickets);

	}

}
