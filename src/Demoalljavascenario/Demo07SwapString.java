package Demoalljavascenario;

public class Demo07SwapString {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "World";
		
		//Using Third datatype
		String c ="";
		c=a;
		a=b;
		b=c;
		System.out.println("Using Third datatype a: "+a);
		System.out.println("Using Third datatype b: "+b);
						
		System.out.println("***********************************************************");
		//without third String variable
		
		a = "Selenium ";
		b = "Oops ";
		String d = a+b;
		
		int e = a.length();
		
		int g = d.length();
		
		a = d.substring(e, g);
		b= d.substring(0, e);
				
		System.out.println("without third String variable a: "+a);
		System.out.println("without third String variable b: "+b);
		
		System.out.println("***********************************************************");
		
		//without third variable
		a = "Selenium ";
		b = "Oops";
		
		a=a+b;
		
		b =a.substring(0 , (a.length()-b.length()));
		
		a =a.substring(b.length());
		
		
		System.out.println("without third variable a: "+a);
		System.out.println("without third variable b: "+b);
		
		
		
	}

}
