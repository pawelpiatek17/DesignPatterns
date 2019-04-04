package facade;

public class CarFacade {
	private CarAccessories accessories;
    private CarBody body;
    private CarEngine engine;
    private CarModel model;

	public void CreateCompleteCar() {
		System.out.println("Creating a Car");
		model.create();
		body.create();
		engine.create();
		accessories.create();
		System.out.println("Car creation is completed.");
	}
	public void prepareParts() {
		accessories = new CarAccessories();
		body = new CarBody();
		engine = new CarEngine();
		model = new CarModel();
	}
}
