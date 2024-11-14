package JavaProgrammingInternalTCS;

import org.testng.annotations.Test;

public class FindrepetativeNum {
	
	@Test
	public void FindRN() {
		
		String Str="Vijaykumar";
		
		//Str=Str.toLowerCase();
		
		
		for(int i=0;i<Str.length();i++);
		{
			int i=0;
		
		for(int j=i+1;j<Str.length();j++);
		{
			int j=i+1;
			if(Str.charAt(i)==Str.charAt(j))
			{
				System.out.println(Str.charAt(i));
			}
		}
		}
		
	}

}
