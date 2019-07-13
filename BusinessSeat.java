
public class BusinessSeat extends Seat {
	private Menu businessSeatMenu = new Menu();

	public BusinessSeat(Menu businessSeatMenu, String password, int rows, int columns, int tickets) {
		super(password, rows, columns, tickets);
		setBusinessSeatMenu(businessSeatMenu);

	}

	public Menu getBusinessSeatMenu() {
		return businessSeatMenu;
	}

	public void setBusinessSeatMenu(Menu businessSeatMenu) {
		this.businessSeatMenu = businessSeatMenu;
	}
}
