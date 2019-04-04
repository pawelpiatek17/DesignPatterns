package builder;

import java.util.ArrayList;

public class VegBurger extends Burger {
	
	private String name = "Vege Burger";
	private double price = 4.2d;
	private ArrayList<String> ingredients;
	public VegBurger() {
		// maybe some default list of ingr and allow changes
		ingredients = new ArrayList<>();// getListOfIngr();
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
