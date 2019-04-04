package singleton;

public class Singleton {
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	public static Singleton getInstance() {
		return SingletonHolder.instance;
	}
	private static class SingletonHolder {
		private static final Singleton instance = new Singleton();
	}
}
