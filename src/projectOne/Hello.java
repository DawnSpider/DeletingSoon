package projectOne;

public class Hello {
	private String name;
	private int age;

	public Hello(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void sayHello() {
		System.out.println("Hello " + name);
	}
	
	public static void main(String args[]) {
		Hello hello = new Hello("Poon", 21);
		hello.sayHello();
	}
}
