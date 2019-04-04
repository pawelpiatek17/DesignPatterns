package visitor;

public class Body implements ICarElement{

	@Override
	public void accept(ICarElementVisitor carElementVisitor) {
		carElementVisitor.visit(this);
		
	}

}
