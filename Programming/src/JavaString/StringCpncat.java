package JavaString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class StringCpncat {
	
	//@Test
	public void concat()
	{
		String Str="Vijay";
		String Str1="Kumar";
		
		//System.out.println(Str.concat(Str1));
		
		System.out.println(Str.compareTo(Str1));
	}
	
	@Test
	public void SubString() {
		String Str="Vijay";
		
		//System.out.println(Str.charAt(2));
		
		String s="200";
		
		int ivalue=Integer.parseInt(s);
		System.out.println(ivalue);
		
		String c="vijay";
		
		for(int i=0;i<c.length();i++)
		{
			char cvalue=c.charAt(i);
			System.out.print(cvalue);
		}
		
		
		String sv="12.4f";
		
		float fv=Float.valueOf(sv);
		System.out.println(fv);
		
		
		String sd="124827489234.4d";
		
		double dv=Double.valueOf(sd);
		System.out.println(dv);
		
		String lonv="2831728931923289";
		
		long lval=Long.valueOf(lonv);
		System.out.println(lval);
		
		ArrayList<String> al = new ArrayList<String>(); 
        al.add("Geeks For Geeks"); 
        al.add("Friends"); 
        al.add("Dear"); 
        al.add("Is"); 
        al.add("Superb"); 

        /* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        Collections.sort(al); 

        // Let us print the sorted list 
        System.out.println("List after the use of" + 
                        " Collection.sort() :\n" + al); 
        
        
        al.forEach((n) ->{System.out.println(n);});
        
        
        
        Map<Integer, String> mapVal=new HashMap<Integer, String>();
        
        mapVal.put(1, "Vijay");
        mapVal.put(2, "Vijay1");
        mapVal.put(3, "Vijay2");
        mapVal.put(3, "Vijay3");
        
        
        
       Set sval= mapVal.entrySet();
       
       for (Object object : sval) {
    	   
    	   System.out.println(object);
		
	}
        
        
	}

}
