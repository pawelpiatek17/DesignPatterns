import java.util.Arrays;

import command.Command;
import command.Lamp;
import command.Switch;
import command.SwitchOffCommand;
import command.SwitchOnCommand;
import dao.Student;
import dao.StudentDao;
import dao.StudentDaoBD;
import dao.StudentDaoXML;
import facade.CarFacade;
import singleton.ESingleton;
import visitor.Car;
import visitor.CarElementVisitor;

public class Main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ESingleton eSingleton = ESingleton.INSTANCE;
//		eSingleton.setConnection("kk");
//		System.out.println(ESingleton.getInstance().getConnection());
//		System.out.println(eSingleton.getConnection());
//		eSingleton.getInstance();
//		eSingleton = ESingleton.INSTANCE;
//		System.out.println(inxOf("abcbc", ""));
//		System.out.println(delCh("gafgdafgadf", 'a'));
//		System.out.println(delDup("abcdef"));
//		CarFacade carFacade = new CarFacade();
//		carFacade.prepareParts();
//		carFacade.CreateCompleteCar();
//		Lamp lamp = new Lamp();
//		Command onCommand = new SwitchOnCommand(lamp);
//		Command offCommand = new SwitchOffCommand(lamp);
//		Command onCommand = lamp::turnOn;
//		Command offCommand = lamp::turnOff;
//		Switch sw = new Switch();
//		sw.register("on", onCommand);
//		sw.register("off", offCommand);
//		sw.execute("on");
//		sw.execute("off");
//		Car car = new Car();
//		car.accept(new CarElementVisitor());
		Student student1 = new Student(1, "Stefan");
		Student student2 = new Student(2,"Gary");
		Student student3 = new Student(3,"Kevin");
		StudentDao studentDaoDB = new StudentDaoBD();
		studentDaoDB.addStudent(student1);
		studentDaoDB.addStudent(student2);
		StudentDao studentDaoXML = new StudentDaoXML();
		studentDaoXML.addStudent(student1);
		studentDaoXML.addStudent(student2);
		studentDaoXML.addStudent(student3);
		System.out.println(studentDaoDB.getStudent(3));
		System.out.println(studentDaoXML.getStudent(3));
	}
	
	public static int inxOf(String source, String target) {
		char[] chars = source.toCharArray();
		for (int i = 0; i < chars.length-target.length()+1; i++) {
			if (chars[i] == target.charAt(0)) {
				source.substring(i, i+target.length()).equals(target);
				if (source.substring(i, i+target.length()).equals(target)) {
					return i;
				}
			}
		}
		
		
		
		return -1;
		
	}
	
	public  String delCh(String source, char ch) {
		String[] strings = source.split(String.valueOf(ch));
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < strings.length; i++) {
			builder.append(strings[i]);
		}
		return builder.toString();
		//return String.join("", strings);
	}
	
	public static String delDup(String source) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < source.length(); i++) {
			if (builder.indexOf(String.valueOf(source.charAt(i))) == -1) {
				builder.append(source.charAt(i));
			}
		}
		return builder.toString();
	}
}
