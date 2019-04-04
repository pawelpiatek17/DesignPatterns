package command;

public class SwitchOffCommand implements Command {
	Lamp lamp;
	
	public SwitchOffCommand(Lamp lamp) {
		// TODO Auto-generated constructor stub
		this.lamp = lamp;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		lamp.turnOff();
	}

}
