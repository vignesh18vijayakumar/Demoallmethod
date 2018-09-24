package Demoalljavascenario;

public class Demo05SmallestAndLargest {

	public static void main(String[] args) {
		
		int a[]= {45,12,2,45,78,36,12,45,78};
		
		int lar = a[0];
		
		int small = a[0];
		
		int size = a.length;
		
		for(int i=0;i<size;i++) {
			
			if(a[i]>lar) {
				
				lar = a[i];
			}
				
				else if(a[i]<small) {
					
					small = a[i];
			}
			
		}
		
		System.out.println("Largest number is: "+lar);
		System.out.println("Smallest number is: "+small);
		
	}

}
