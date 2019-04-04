package builder;

import java.util.ArrayList;

public class Meal {
	private ArrayList<Item> items ;
	
	private Meal() {
		items = new ArrayList<>();
	}
	
	public static class Builder {
		private Meal mealToBuild;
		
		public Builder() {
			mealToBuild = new Meal();
		}
		public Meal.Builder addItem(Item item) {
			mealToBuild.items.add(item);
			return this;
		}
		public Meal build() {
			Meal mealBuilded = mealToBuild;
			mealToBuild = new Meal();
			return mealBuilded;
		}
	}

	@Override
	public String toString() {
		return "Meal [items=" + items + "]";
	}
	
	
}
