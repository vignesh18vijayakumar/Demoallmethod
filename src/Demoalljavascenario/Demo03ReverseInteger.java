package Demoalljavascenario;

public class Demo03ReverseInteger {

	public static void main(String[] args) {
		
		//ReverseInteger
		
		//String Buffer
		int value = 98654721;
		
		String val = String.valueOf(value);
		
		StringBuffer sb = new StringBuffer(val);
		
		System.out.println("Reverse inter value String Buffer: "+sb.reverse());
		
		System.out.println("****************************************");
		
		//Mathamatical 
		
		int rev = 0;
		
		int i=0;
		
		while(value != 0) {
			
			i = i + i++;
			
			rev = rev*10 + value%10;
			
			System.out.println("i: "+rev);
			
			value = value/10;
			
			System.out.println("i: "+value);
		}
		
		System.out.println("Reverse inter value Mathamatical: "+rev);
		
		
		

	}

}
