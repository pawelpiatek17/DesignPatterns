package visitor;

public class Engine implements ICarElement {
	@Override
	public void accept(ICarElementVisitor carElementVisitor) {
		// TODO Auto-generated method stub
		carElementVisitor.visit(this);
	}
}
