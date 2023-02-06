package trainingPr;

import java.util.ArrayList;

public class Arrrr {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(5);
		ArrayList b = new ArrayList();
		al.add(101);
		al.add(20);
		al.add(30);
		al.add(40);

		for (object a : al) {
			if (a % 2 == 1) {
				b.add(a);
			}
		}

		for (int i = 0; i < b.size(); i++) {
			System.out.println();
		}
	}

}
