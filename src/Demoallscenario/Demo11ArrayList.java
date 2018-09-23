package Demoallscenario;

import java.util.ArrayList;
import java.util.List;

public class Demo11ArrayList {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<String>();
		
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
		
		for (int i=0;i<size;i++) {
			
			String value = al.get(i);
			
			System.out.println("Array List Value: "+value);
		}
			
		
		
		
		
	}

}
