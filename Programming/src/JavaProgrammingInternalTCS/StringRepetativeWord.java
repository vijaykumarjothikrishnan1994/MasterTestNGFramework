package JavaProgrammingInternalTCS;

import org.testng.annotations.Test;

public class StringRepetativeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	@Test
	public void RepeativeValue() {
String Str= "This is the Office and there is the firstFloor";
		
		Str=Str.toLowerCase();
		String StrSplit[]=Str.split(" ");
		int count=0;
		for(int i=0;i<StrSplit.length;i++)
		{
			 count =1;
			for(int j=i+1;j<StrSplit.length;j++)
			{
				if(StrSplit[i].equals(StrSplit[j]))
				{
					System.out.println("Repeted Value " + StrSplit[i]);
					
					StrSplit[j]="0";
					break;
				}
			}
			if(count>=1&&StrSplit[i]!="0")
			{
				System.out.println("total count"+count);
			}
			
		}
		
		
	}

}
