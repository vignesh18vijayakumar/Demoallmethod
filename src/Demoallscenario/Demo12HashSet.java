package Demoallscenario;

import java.util.Set;
import java.util.HashSet;

public class Demo12HashSet {

	public static void main(String[] args) {
		
		Set<String> al = new HashSet<String>();
		
		al.add("a");
		al.add("g");
		al.add("r");
		al.add("f");
		al.add("d");
		al.add("g");
		al.add("2");
		al.add("r");
		al.add("8");
		
		int size = al.size();
		
		System.out.println("Count of set: "+size);
		
		for (String value : al) {
			
			System.out.println("Hash Set Value: "+value);
		}
			
		
		
		
		
	}

}
