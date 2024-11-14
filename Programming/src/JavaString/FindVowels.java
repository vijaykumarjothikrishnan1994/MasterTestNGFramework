package JavaString;

public class FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str =" This1244 is vijay from india";
		int vcount=0,count=0;
		String StrLower=str.toLowerCase();
		for(int i=0;i<StrLower.length();i++)
		{
			if(StrLower.charAt(i)=='a'||
					StrLower.charAt(i)=='e'||
					StrLower.charAt(i)=='i'||
					StrLower.charAt(i)=='o'||
					StrLower.charAt(i)=='u')
			{
				System.out.println(StrLower.charAt(i));
				vcount++;
			}
			else if(StrLower.charAt(i)<'a'||StrLower.charAt(i)>'z')
			{
				System.out.println(StrLower.charAt(i));
				count++;
				
			}
			
			
		}
		System.out.println("This is the V count"+vcount+""+ "This is the count"+count);
	}

}
