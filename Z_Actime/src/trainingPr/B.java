package trainingPr;

public class B extends A {
	public static void main(String[] args) {

		System.out.println("Rama");
		B obj = new B();

		A obj1 = obj;

		B obj2 = (B) obj1;
	}
}
