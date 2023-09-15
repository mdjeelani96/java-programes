package assignment;

public class OtherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Static Method: Class Itself
		OtherClass.sayhello();
		
		// Non-Static Method: Instance of Class
		OtherClass o = new OtherClass();
	o.saychalo();
	
	}
	static void sayhello() {
		System.out.println("hello");
	}
	void saychalo() {
		System.out.println("chalo");
	}

}
