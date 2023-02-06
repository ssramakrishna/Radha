package trainingPr1;

public class _1 {

	public static void main(String[] args) 
	{
		String s="Developer";
		String s1="";
		for(int i=0; i<s.length(); i++)
		{
			String s2="";
			s2=s2+s.charAt(i);
			if(!s1.contains(s2))
			{
				s1=s1+s2;
			}
		}
		System.out.println(s1);
	}

}
