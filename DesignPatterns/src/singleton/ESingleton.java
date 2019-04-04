package singleton;


public enum ESingleton {
	INSTANCE;
	private String connection = "av";
//	private ESingleton() {
//		connection = "abc";
//		System.out.println("konstruktor");
//	}
	public static ESingleton getInstance() {
		return INSTANCE;
	}
	public String getConnection() {
		return connection;
	}
	public void setConnection(String s) {
		connection = s;
	}
}
