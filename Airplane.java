public class Airplane {
	private String password;
	private int rows;
	private int columns;
	private int businessRows;

	public Airplane() {

	}

	public Airplane(String password) {
		setPassword(password);
	}

	public Airplane(String password, int rows, int columns, int businessRows) {
		super();
		this.password = password;
		this.rows = rows;
		this.columns = columns;
		this.businessRows = businessRows;
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

	public int getBusinessRows() {
		return businessRows;
	}

	public void setBusinessRows(int businessRows) {
		this.businessRows = businessRows;
	}

}
