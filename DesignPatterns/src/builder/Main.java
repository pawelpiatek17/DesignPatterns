package builder;

import builder.Meal.Builder;

public class Main {

	public static void main(String[] args) {
		Meal.Builder builder = new Builder(); 
		builder.addItem(new ChickenBurger()).addItem(new Pepsi());
		Meal meal = builder.build();
		Meal meal2 = builder.build();
		System.out.println(meal);
		System.out.println(meal2);
	}

}
