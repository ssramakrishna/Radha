package trainingPr;

import java.util.ArrayList;

public class Arraa {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>(5);
		ArrayList<Integer> b = new ArrayList<>();
		al.add(101);
		al.add(20);
		al.add(30);
		al.add(40);

		for (Integer a : al) {
			if (a % 2 == 0) {
				b.add(a);
			}
		}

		for (int i = 0; i < b.size(); i++) {
			System.out.println(b.get(i));
		}
	}
}
