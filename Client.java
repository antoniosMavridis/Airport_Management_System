import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

final class Client {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Airplane> listAirplane = new ArrayList<Airplane>();
		ArrayList<Menu> listMenu = new ArrayList<Menu>();
		ArrayList<Flight> listFlight = new ArrayList<Flight>();
		ArrayList<Ticket> listTicket = new ArrayList<Ticket>();

		menu();
		int employeeOption;
		do {
			employeeOption = option();

			// option 1
			if (employeeOption == 1) {

				System.out.println("Enter the airplaine password: ");
				String airplanePassword = input.next();

				int simpleRows;
				do {
					System.out.println("Enter the rows: ");
					simpleRows = input.nextInt();
				} while (simpleRows < 0);

				int simpleColumns;
				do {
					System.out.println("Enter the columns: ");
					simpleColumns = input.nextInt();
				} while (simpleColumns < 0);

				int businessRows;
				do {
					System.out.println("Enter the business rows: ");
					businessRows = input.nextInt();
				} while (businessRows < 0 || businessRows > simpleRows);

				Airplane clientAirplane = new Airplane(airplanePassword, simpleRows, simpleColumns, businessRows);

				// serial searching
				boolean done = false;
				int i = 0;

				while (done == false && i < listAirplane.size()) {
					if (listAirplane.get(i).getPassword().equals(airplanePassword)) {
						done = true;
					} else {
						i++;
					}
				}
				// end serial searching

				if (done == true) {
					System.out.println("The airplane already exist!");
				} else {
					listAirplane.add(clientAirplane);
					menu();
				}

			}

			// option 2
			if (employeeOption == 2) {

				Menu clientMenu = new Menu();

				ArrayList<String> listClientMainDishes = new ArrayList<String>();
				ArrayList<String> listClientDesserts = new ArrayList<String>();
				ArrayList<String> listClientDrinks = new ArrayList<String>();

				System.out.println("Enter the menu password: ");
				String menuPassword = input.next();
				clientMenu.setPassword(menuPassword);

				System.out.println("Enter a main dish: ");
				String clientMainDish = input.next();
				listClientMainDishes.add(clientMainDish);
				clientMenu.setMainDishes(listClientMainDishes);

				System.out.println("Enter a dessert: ");
				String clientDessert = input.next();
				listClientDesserts.add(clientDessert);
				clientMenu.setDessert(listClientDesserts);

				System.out.println("Enter a drink: ");
				String clientDrink = input.next();
				listClientDrinks.add(clientDrink);
				clientMenu.setDrinks(listClientDrinks);

				// serial searching
				boolean done = false;
				int i = 0;

				while (done == false && i < listMenu.size()) {
					if (listMenu.get(i).getPassword().equals(menuPassword)) {
						done = true;
					} else {
						i++;
					}
				}
				// end serial searching

				if (done == true) {
					System.out.println("The menu already exist!");
				} else {
					listMenu.add(clientMenu);
					menu();
				}

			}

			// option 3
			if (employeeOption == 3) {
				Flight clientFlight = new Flight();

				System.out.println("Enter the flight password: ");
				String flightPassword = input.next();
				clientFlight.setPassword(flightPassword);

				System.out.println("Enter the flight local date (Year-Month-Day): ");
				String flightLocalDate = input.next();
				LocalDate tempDate = LocalDate.parse(flightLocalDate);
				clientFlight.setLocalDate(tempDate);

				System.out.println("Enter the flight local time (Hours:Minutes): ");
				String flightLocalTime = input.next();
				LocalTime tempTime = LocalTime.parse(flightLocalTime);
				clientFlight.setLocalTime(tempTime);

				System.out.println("Enter the flight departure airport: ");
				String flightDepartureAirport = input.next();
				clientFlight.setDepartureAirport(flightDepartureAirport);

				System.out.println("Enter the flight arrival airport: ");
				String flightArrivalAirport = input.next();
				clientFlight.setArrivalAirport(flightArrivalAirport);

				System.out.println("Enter a password for the flight airplane: ");
				String airplanePassword = input.next();
				Airplane clientFlightAirplane = new Airplane(airplanePassword);
				clientFlight.setFlightAirplane(clientFlightAirplane);

				System.out.println("Enter a password for the menu flight: ");
				String passwordFlightMenu = input.next();
				clientFlight.setPasswordMenu(passwordFlightMenu);

				System.out.println("Enter total positions: ");
				int flightTotalPositions = input.nextInt();
				clientFlight.setTotalPositions(flightTotalPositions);

				System.out.println("Enter total tickets: ");
				int flightTotalTickets = input.nextInt();
				clientFlight.setTotalTickets(flightTotalTickets);

				System.out.println("Enter the  seat rows for the flight: ");
				int flightRows = input.nextInt();
				System.out.println("Enter the  seat columns for the flight: ");
				int flightColumns = input.nextInt();
				Seat[][] flightSeat = new Seat[flightRows][flightColumns];
				clientFlight.setFlightSeat(flightSeat);

				boolean done = false;
				int i = 0;
				LocalDate tempLocalDate = LocalDate.parse(flightLocalDate);
				while (done == false && i < listFlight.size()) {
					if (listFlight.get(i).getFlightAirplane().getPassword().equals(airplanePassword)
							&& listFlight.get(i).getLocalDate().equals(tempLocalDate)) {
						done = true;
					} else {
						i++;
					}
				}
				if (done == true) {
					System.out.println("The flight already exist!");
					System.out.println();
					menu();
				} else {
					listFlight.add(clientFlight);
					menu();
				}

			}

			// option 4
			if (employeeOption == 4) {

				System.out.println("Enter the flight password that you want to cancel: ");
				String cancelFlightPassword = input.next();

				boolean done = false;
				int i = 0;
				int cancelFlightTickets = 0;
				int flightTicketStart = 0;
				while (done == false && i < listFlight.size()) {
					if (listFlight.get(i).getPassword().equals(cancelFlightPassword)) {

						done = true;

						cancelFlightTickets = listFlight.get(i).getTotalTickets();
						if (cancelFlightTickets == 0) {
							for (int j = flightTicketStart; j <= cancelFlightTickets; j++) {
								System.out.println("Passenger " + j + "name: " + listTicket.get(j).getPassengerName());
								System.out.println("Money for passenger " + j + ":" + listTicket.get(j).getPrice());
							}
						} else {
							System.out.println("Sorry you forget to create a ticket please try again.");
						}

						listFlight.remove(i);
						menu();

					} else {
						i++;
						flightTicketStart += listFlight.get(i).getTotalTickets();
					}
				}
				if (done == false) {
					System.out.println("The flight password doesn't exist!");
					System.out.println();
					menu();
				}

			}

			// option 5
			if (employeeOption == 5) {
				System.out.println("Enter the ticket password: ");
				String ticketPassword = input.next();

				System.out.println("Enter the flight password: ");
				String flightPassword = input.next();

				System.out.println("Enter Local Date (Year-Month-Day): ");
				String ticketLocalDate = input.next();
				LocalDate tempDate = LocalDate.parse(ticketLocalDate);

				System.out.println("Enter Ticket type: ");
				String ticketType = input.next();

				System.out.println("Enter Ticket seat: ");
				String ticketSeat = input.next();

				System.out.println("Enter Ticket price: ");
				int ticketPrice;
				do {
					ticketPrice = input.nextInt();
				} while (ticketPrice < 0);

				System.out.println("Enter passenger name: ");
				String passengerName = input.next();

				String ticketMainDish = null;
				String ticketDessert = null;
				String ticketDrink = null;
				if (ticketSeat.equals("business")) {
					System.out.println("Enter main dish: ");
					ticketMainDish = input.next();

					System.out.println("Enter desserts: ");
					ticketDessert = input.next();

					System.out.println("Enter drink: ");
					ticketDrink = input.next();

				}

				Ticket clientTicket = new Ticket(ticketPassword, flightPassword, tempDate, ticketType, ticketSeat,
						ticketPrice, passengerName, ticketMainDish, ticketDessert, ticketDrink);

				// searching inside listFlight for the specific airplane that
				// client gave ,because i want to use airplane's fields.
				int totalBusinessTickets = 0;
				int totalEconomyTickets = 0;
				Airplane tempAirplane = new Airplane();
				for (int j = 0; j < listFlight.size(); j++) {
					if (listFlight.get(j).getPassword().equals(flightPassword)) {
						tempAirplane = listFlight.get(j).getFlightAirplane();
						break;

					}
				}

				// searching inside airplane list because i want to take
				// specific airplane's fields that are important for later
				for (int j = 0; j < listAirplane.size(); j++) {
					if (listAirplane.get(j).getPassword().equals(tempAirplane.getPassword())) {
						totalBusinessTickets = tempAirplane.getBusinessRows();
						totalEconomyTickets = tempAirplane.getRows() - tempAirplane.getBusinessRows();
					}
				}

				// Control -examinate if exists an available position for this
				// specific airplane,
				// which it depends from type seat and from flightPassword
				boolean done = false;
				int i = 0;
				while (done == false && i < listFlight.size()) {
					if (listFlight.get(i).getPassword().equals(flightPassword) && ticketSeat.equals("business")
							&& totalBusinessTickets > 0) {

						done = true;

						int tempPositions = listFlight.get(i).getTotalPositions();
						int tempTickets = listFlight.get(i).getTotalTickets();
						listFlight.get(i).setTotalPositions(tempPositions - 1);
						listFlight.get(i).setTotalTickets(tempTickets + 1);
						totalBusinessTickets--;

						listTicket.add(clientTicket);

						menu();

					} else if (listFlight.get(i).getPassword().equals(flightPassword) && ticketSeat.equals("economy")
							&& totalEconomyTickets > 0) {

						done = true;

						int tempPositions = listFlight.get(i).getTotalPositions();
						int tempTickets = listFlight.get(i).getTotalTickets();
						listFlight.get(i).setTotalPositions(tempPositions - 1);
						listFlight.get(i).setTotalTickets(tempTickets + 1);
						totalEconomyTickets--;

						listTicket.add(clientTicket);

						menu();
					} else {
						i++;
					}
				}

				if (done == false) {
					System.out.println("The flight password doesn't exist,");
					System.out.println("or there is no more available tickets");
				}

			}

			if (employeeOption == 6) {
				System.out.println("Enter the ticket password that you want to cancel: ");
				String cancelTicketPassword = input.next();

				boolean done = false;
				int i = 0;
				String tempFlightPassword;
				while (done == false && i < listTicket.size()) {
					if (listTicket.get(i).getPassword().equals(cancelTicketPassword)) {
						done = true;

						tempFlightPassword = listTicket.get(i).getFlightPassword();

						for (int j = 0; j < listFlight.size(); j++) {
							if (listFlight.get(j).getPassword().equals(tempFlightPassword)) {
								int tempPositions = listFlight.get(i).getTotalPositions();
								int tempTickets = listFlight.get(i).getTotalTickets();

								listFlight.get(i).setTotalPositions(tempPositions + 1);
								listFlight.get(i).setTotalTickets(tempTickets - 1);

								break;
							}
						}
						listTicket.remove(i);
						menu();

					} else {
						i++;
					}
				}
				if (done == false) {
					System.out.println("The ticket doesn't exist!");
					System.out.println();
					menu();
				}

			}

			if (employeeOption == 7) {
				System.out.println("Enter your ticket password: ");
				String clientTicketPassword = input.next();

				boolean done = false;
				int i = 0;
				String tempFlightPassword;
				String tempFlightMenu = null;
				while (done == false && i < listTicket.size()) {
					if ((listTicket.get(i).getPassword().equals(clientTicketPassword))
							&& listTicket.get(i).getTicketSeat().equals("business")) {
						done = true;

						tempFlightPassword = listTicket.get(i).getFlightPassword();
						for (int j = 0; j < listFlight.size(); j++) {
							if (listFlight.get(j).equals(tempFlightPassword)) {
								tempFlightMenu = listFlight.get(j).getPasswordMenu();
								break;
							}
						}

						for (int j = 0; j < listMenu.size(); j++) {
							if (listMenu.get(j).getPassword().equals(tempFlightMenu)) {

								for (int k = 0; k < listMenu.get(j).getMainDishes().size(); k++) {
									System.out.println(
											"Main dish from flight menu: " + listMenu.get(j).getMainDishes().get(k));
								}

								for (int k = 0; k < listMenu.get(j).getDesserts().size(); k++) {
									System.out.println(
											"Desserts from flight menu: " + listMenu.get(j).getDesserts().get(k));
								}

								for (int k = 0; k < listMenu.get(j).getDrinks().size(); k++) {
									System.out.println("Drink from flight menu: " + listMenu.get(j).getDrinks().get(k));
								}
							}
						}

						System.out.println("Enter main dish: ");
						String ticketMainDish = input.next();

						System.out.println("Enter desserts: ");
						String ticketDessert = input.next();

						System.out.println("Enter drink: ");
						String ticketDrink = input.next();

						listTicket.get(i).setMainDish(ticketMainDish);
						listTicket.get(i).setDessert(ticketDessert);
						listTicket.get(i).setDrink(ticketDrink);

					} else {
						i++;
					}
				}

				if (done == false) {
					System.out.println("The ticket doesn't exist!");
					System.out.println();
					menu();
				}

			}

		} while (employeeOption != 0);

	}

	public static void menu() {
		System.out.println("\t\tMenu");
		System.out.println("\t---------------------");
		System.out.println("\t[1] Insert Airplane\n" + "\t[2] Insert Menu\n" + "\t[3] Insert Flight\n"
				+ "\t[4] Cancel Flight\n" + "\t[5] Book Ticket\n" + "\t[6] Cancel Ticket\n"
				+ "\t[7] Order Menu Items (Available only in Business Seats)\n"
				+ "\t[8] Seats Capacity for a certain Flight\n" + "\t[0] Exit");
		System.out.println();
	}

	public static int option() {
		Scanner input = new Scanner(System.in);
		int employeeOption;
		do {
			System.out.println("Enter your preference: ");
			employeeOption = input.nextInt();
		} while (employeeOption < 0 || employeeOption > 7);
		return employeeOption;

	}

}
