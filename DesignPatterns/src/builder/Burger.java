package builder;

import java.util.ArrayList;

public abstract class Burger implements Item {

	@Override
	public Packing getPacking() {
		return new Wrapper();
	}
	
}
