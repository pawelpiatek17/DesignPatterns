package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Car implements ICarElement{
	private List<ICarElement> carElements;
	public Car() {
		carElements = new ArrayList<>();
		carElements.add(new Wheel("front left"));
		carElements.add(new Wheel("front right"));
		carElements.add(new Wheel("back left"));
		carElements.add(new Wheel("back right"));
		carElements.add(new Body());
		carElements.add(new Engine());
	}
	
	@Override
	public void accept(ICarElementVisitor carElementVisitor) {
		// TODO Auto-generated method stub
		for (ICarElement carElement : carElements) {
			carElement.accept(carElementVisitor);
		}
		carElementVisitor.visit(this);
	}
}
