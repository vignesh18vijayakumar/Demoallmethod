package Demoalljavascenario;

public class Demo02RemoveJunkChar {

	public static void main(String[] args) {

		//use regular expression to remove junk char
		
		String value = "Welcome #$^&&to java 123466789**********";
		
		String rep = value.replaceAll("[^0-9a-zA-Z ]", "");
		
		System.out.println("Remove junk char: "+rep);
		
		
		
	}

}
