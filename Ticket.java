import java.time.LocalDate;

public class Ticket {
	private String password;
	private String flightPassword;
	private LocalDate localDate;
	private String ticketType;
	private String ticketSeat;
	private int price;
	private String passengerName;
	private String mainDish;
	private String dessert;
	private String drink;

	public Ticket(String password, String flightPassword, LocalDate localDate, String ticketType, String ticketSeat,
			int price, String passengerName, String mainDish, String dessert, String drink) {
		this.password = password;
		this.flightPassword = flightPassword;
		this.localDate = localDate;
		this.ticketType = ticketType;
		this.ticketSeat = ticketSeat;
		this.price = price;
		this.passengerName = passengerName;
		this.mainDish = mainDish;
		this.dessert = dessert;
		this.drink = drink;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFlightPassword() {
		return flightPassword;
	}

	public void setFlightPassword(String flightPassword) {
		this.flightPassword = flightPassword;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getTicketSeat() {
		return ticketSeat;
	}

	public void setTicketSeat(String ticketSeat) {
		this.ticketSeat = ticketSeat;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getMainDish() {
		return mainDish;
	}

	public void setMainDish(String mainDish) {
		this.mainDish = mainDish;
	}

	public String getDessert() {
		return dessert;
	}

	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

}
