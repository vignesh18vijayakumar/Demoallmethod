package Demoalljavascenario;

public class Demo01ReverseString {

	public static void main(String[] args) {
		
		//normal method
		
		String value = "Welcome to java";
		
		String rev = "";
		
		int size = value.length();
		
		System.out.println("Size of the String character: "+size);
		
		for (int i=size-1;i>=0;i--) {
						
			rev = rev + value.charAt(i);
					
		}
		System.out.println(rev);
		
		System.out.println("****************************************");
		
		//StringBuffer method
		
		StringBuffer sb = new StringBuffer(value);
		
		System.out.println(sb.reverse());
		
	}

}
