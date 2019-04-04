package visitor;

public class Wheel implements ICarElement {
	private String name;
	public Wheel(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	@Override
	public void accept(ICarElementVisitor carElementVisitor) {
		// TODO Auto-generated method stub
		carElementVisitor.visit(this);
	}

}
