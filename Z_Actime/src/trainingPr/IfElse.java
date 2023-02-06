package trainingPr;

public class IfElse {
	public static void main(String[] args) {
		String s = "Rama123!hgf!$@#$%";
		String ch = " ";
		String num = " ";
		String sp = " ";

		for (int i = 0; i < s.length(); i++) {
			char var = s.charAt(i);
			int key = 0;

			if (Character.isAlphabetic(var)) {
				key = 1;

			} else if (Character.isDigit(var)) {
				key = 2;
			} else {
				key = 3;
			}

			switch (key) {
			case 1:
				ch += var;
				break;

			case 2:
				num += var;
				break;

			case 3:
				sp += var;
				break;
			}
		}
		System.out.println(ch);
		System.out.println(num);
		System.out.println(sp);

	}
}