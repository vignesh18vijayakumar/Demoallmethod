package Demoalljavascenario;

import java.util.HashSet;
import java.util.Set;

public class Demo04FindDuplicate {

	public static void main(String[] args) {

		String value[] = {"java","c","c++","ruby","python","java","c++","c#"};
		
		int size = value.length;
		
		System.out.println("Size of the String value"+size);
		
		for(int i=0;i<size;i++) {
			
			for(int j=i+1;j<size;j++) {
				
				if(value[i].equals(value[j]))
				{
					System.out.println("Duplicate values for condition: "+value[j]);					
				}
				
			}
		}
				
		System.out.println("*******************************************************");
		
		Set<String> sv = new HashSet<String>();
		
		for(String sn : value)
		{
			if(sv.add(sn) == false)
			{
				System.out.println("Duplicate values set condition: "+sn);
			}
		}
		
	}
	
	

}
