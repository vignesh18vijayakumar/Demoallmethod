package Demoalljavascenario;

public class Demo08Stringmanipulate {

	public static void main(String[] args) {

		String value = "Actural-Result-vs-Excepted-Result"; 
		
		String value1 = "Actural-result-vs-excepted-Result";
		
		//ChatAt
		
		System.out.println("Using charAt: "+value.charAt(8));
		
		//Indexof position of character
		
		System.out.println("Indexof position of character: "+value.indexOf("R"));
		
		//Indexof position of character 3 rd accurance of s
		
		System.out.println("Indexof position of character 3 rd accurance of s: "+value.indexOf("s", value.indexOf("s")+1));
		
		
		System.out.println(value.indexOf("vs"));
		
		System.out.println(value.equals(value1));
		
		System.out.println(value.equalsIgnoreCase(value1));
		
		System.out.println(value.substring(0, 15));
		
		System.out.println(value.substring(13));
		
		//Trim
		
		String value3 = "       Hello  World      ";
		
		System.out.println(value3.trim());
		
		System.out.println(value3.replace("  ", " "));
		
		System.out.println(value3.replaceAll("  ", " "));
		
		String value4[] = value.split("-");
		
		for(String value5:value4) {
		
			System.out.println(value5);
		}
		
		String value5 = " Hello World";
		
		System.out.println(value.concat(value5));
		
		
		
		
		
		
		
		
		
		
	}

}
