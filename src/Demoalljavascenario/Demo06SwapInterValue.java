package Demoalljavascenario;

public class Demo06SwapInterValue {

	public static void main(String[] args) {

		int a = 456;
		int b = 789;
		
		//use third data variable
		
		int c = 0;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("**********************************************************");
		
		a = 456;
		b = 789;
		//without third data variable

		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("**********************************************************");

		a = 456;
		b = 789;
		//without third data variable
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println(a);
		System.out.println(b);

		System.out.println("**********************************************************");
		a = 456;
		b = 789;
		// using XOR:^
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
