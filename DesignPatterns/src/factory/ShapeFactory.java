package factory;

public class ShapeFactory {
	public Shape getShape(String shape) {
		if (shape == null) {
			return null;
		} else if (shape.equalsIgnoreCase("c")) {
			return new Circle();
		} else if (shape.equalsIgnoreCase("s")) {
			return new Square();
		} else if (shape.equalsIgnoreCase("r")) {
			return new Rectangle();
		}
		return null;
	}
}
