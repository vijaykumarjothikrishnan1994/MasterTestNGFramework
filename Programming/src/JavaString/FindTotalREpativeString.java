package JavaString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.testng.annotations.Test;

public class FindTotalREpativeString {
	//int count;
	
	ArrayList<String> strlist=new ArrayList<String>();
	
	String arrVal[];
	@Test
	public void name() {
		
		
		String str="This is vijay and vijay is and from chennai chennai from";
		
	String strsp=	str.toLowerCase();
		String strspit[]=strsp.split(" ");
		System.out.println(strspit.length);
		
		int count =0;
		int i=0;
		for( i=0;i<strspit.length;i++)
		{ 
			for(int j=i+1;j<strspit.length;j++)
			{
				if(strspit[i].equals(strspit[j]))
				{
					//strspit[i];
					System.out.println(strspit[i]);
					count++;
					
					/*
					 * ArrayList<String> alvl=new ArrayList<>(); alvl.add(strspit[i]);
					 * 
					 * 
					 * Collections.sort(alvl);
					 * 
					 * 
					 * System.out.println(alvl);
					 */
					  
						/*
						 * if(strspit[i].contains("vijay")) { System.out.println("Pass"); break; }
						 */
					
					 
				}
				
			}
			
			//System.out.println(count);
		}
		
		System.out.println(count);
		
		
		
	}

}
