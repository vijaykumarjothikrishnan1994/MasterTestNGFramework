package JavaProgrammingInternalTCS;

import org.testng.annotations.Test;

public class Reverse {

	@Test
	public void Reverse() {
		
		
		String Str="Vijay";
		Str=Str.toLowerCase();
		char[] cvalue=Str.toCharArray();
		
		System.out.println("This is the total length of C value : "+cvalue.length);
		for(int i=0;i<cvalue.length;i++)
		{
			
			for(int j=i+1;j<cvalue.length;j++)
			{
			if(Str.charAt(i)==Str.charAt(j))
			{
				System.out.println("Same" + Str.charAt(i));
			}
			}
		}
		
	}
}
