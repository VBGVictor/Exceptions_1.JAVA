package Aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.ErroPersonalizadoException;

public class Program {

	public static void main(String[] args) {
		
		
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Scanner sc = new Scanner(System.in);
		
		try {	
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/mm/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-Out date (dd/mm/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/mm/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-Out date (dd/mm/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		}
		catch(ParseException e) {
			System.out.println("Invaled date format!");
		}
		catch(ErroPersonalizadoException e) {
			System.out.println("Error in reservation: "+ e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error!");
		}
		
		sc.close();
	}

}
