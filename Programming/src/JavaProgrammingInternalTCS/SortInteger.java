package JavaProgrammingInternalTCS;

public class SortInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intVal[]= {12,234,78,1,344,1};
		//int count=-1;
		for(int i=0;i<intVal.length;i++)
		{
			for(int j=i+1;j<intVal.length;j++)
			{
				if(intVal[i]<intVal[j])
				{
				int temp=intVal[i];
				intVal[i]=intVal[j];
				intVal[j]=temp;
				//count++;
				//System.out.println(intVal[i]);
				}
			}
		}
		
		for(int i=0;i<intVal.length;i++)
		{
			System.out.println(intVal[i]-1);
			
		}
		//System.out.println("Total Values : "+count);

	}

}
