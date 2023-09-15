package assignment;

public class Class3 {
 int b=20;//static
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=100;//local
task2 ref=new task2(); // reference 
System.out.println(a);
System.out.println(task2.b);
System.out.println(ref.c);
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



