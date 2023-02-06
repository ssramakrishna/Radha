package trainingPr1;

public class duplicate 
{
	public static void main(String[] args) 
	{
		String s="hi my my Developer hi hi";
		
		StringBuilder s1=new StringBuilder();
		
		s.chars().distinct().forEach(c-> s1.append((char)c));
		
		System.out.println(s1);
	}
}
