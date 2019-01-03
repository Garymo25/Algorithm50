package test;

public class test03 {
	public static void main(String[] args) {
		/*
		 * À„∑®50Ã‚ No.3
		 */
		int a, b, c;
		int m=1000;
		for(int i=100; i<1000; i++) {
			a = i/100;
			b = i%100/10;
			c = i%10;
			if(i == (a*a*a)+(b*b*b)+(c*c*c)) {
				System.out.println(i);
			}		
		}
	}

}
