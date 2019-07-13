import java.util.ArrayList;

public class Menu {
	private String password;
	private ArrayList<String> mainDishes = new ArrayList<String>();
	private ArrayList<String> desserts = new ArrayList<String>();
	private ArrayList<String> drinks = new ArrayList<String>();

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<String> getMainDishes() {
		return mainDishes;
	}

	public void setMainDishes(ArrayList<String> mainDishes) {
		this.mainDishes = mainDishes;
	}

	public ArrayList<String> getDesserts() {
		return desserts;
	}

	public void setDessert(ArrayList<String> desserts) {
		this.desserts = desserts;
	}

	public ArrayList<String> getDrinks() {
		return drinks;
	}

	public void setDrinks(ArrayList<String> drinks) {
		this.drinks = drinks;
	}

}
