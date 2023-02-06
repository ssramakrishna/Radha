package trainingPr;

public class FindingCharAndNumUsingSwitch {
	public static void main(String[] args) {
		String s = "Rama123!hgf!$@#$%";
		String ch = " ";
		String num = " ";
		String sp = " ";

		char[] c = s.toCharArray();

		for (char a : c) {
			int i = Character.isAlphabetic(a) ? 0 : 1;

			switch (i) {
			case 0:
				ch += a;
				break;

			case 1:
				num += a;
				break;

			default:
				sp += a;
				break;
			}
		}
		System.out.println(ch);
		System.out.println(num);
		System.out.println(sp);
	}
}
