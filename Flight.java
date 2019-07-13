import java.time.LocalDate;
import java.time.LocalTime;

public class Flight {
	private String password;
	private String departureAirport;
	private String arrivalAirport;
	private Airplane flightAirplane = new Airplane();
	private Seat[][] flightSeat = new Seat[flightAirplane.getRows()][flightAirplane.getColumns()];
	private String passwordMenu;
	private int totalPositions;
	private int totalTickets;
	private LocalDate localDate;
	private LocalTime localTime;

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public LocalTime getLocalTime() {
		return localTime;
	}

	public void setLocalTime(LocalTime localTime) {
		this.localTime = localTime;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public Airplane getFlightAirplane() {
		return flightAirplane;
	}

	public void setFlightAirplane(Airplane flightAirplane) {
		this.flightAirplane = flightAirplane;
	}

	public Seat[][] getFlightSeat() {
		return flightSeat;
	}

	public void setFlightSeat(Seat[][] flightSeat) {
		this.flightSeat = flightSeat;
	}

	public String getPasswordMenu() {
		return passwordMenu;
	}

	public void setPasswordMenu(String passwordMenu) {
		this.passwordMenu = passwordMenu;
	}

	public int getTotalPositions() {
		return totalPositions;
	}

	public void setTotalPositions(int totalPositions) {
		this.totalPositions = totalPositions;
	}

	public int getTotalTickets() {
		return totalTickets;
	}

	public void setTotalTickets(int totalTickets) {
		this.totalTickets = totalTickets;
	}
}
