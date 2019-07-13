public abstract class Seat {
	private String password;
	private int rows;
	private int columns;
	private int tickets;

	public Seat(String password, int rows, int columns, int tickets) {
		setPassword(password);
		setRows(rows);
		setColumns(columns);
		setTickets(tickets);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

}
