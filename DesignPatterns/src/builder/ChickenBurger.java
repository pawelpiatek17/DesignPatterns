package builder;

import java.util.ArrayList;

public class ChickenBurger extends Burger {
	
	private String name = "Chicken Burger";
	private double price = 3.2d;
	private ArrayList<String> ingredients;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
}
