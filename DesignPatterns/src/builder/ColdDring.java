package builder;

public abstract class ColdDring implements Item{

	@Override
	public Packing getPacking() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

}
