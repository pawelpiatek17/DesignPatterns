package command;

public class SwitchOnCommand implements Command {
	Lamp lamp;
	
	public SwitchOnCommand(Lamp lamp) {
		// TODO Auto-generated constructor stub
		this.lamp = lamp;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		lamp.turnOn();
	}

}
