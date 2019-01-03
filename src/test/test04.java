package test;
import java.util.Scanner;

public class test04 {
	public static void main(String[] args) {
		/*
		 * 算法50题 No.4
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print( "请键入一个正整数:     ");
		int n = scan.nextInt();
		System.out.print(n + " = ");
//		for(int k=2; k<=n; k++) {
//			if(k==n) {
//				System.out.println(n);
//				break;
//			}
//			if(n%k==0) {
//				System.out.println(k + "*");
//				n = n/k;
//				break;
//			}
//		}
		int k = 2;
		while(k<=n) {
			if(k==n) {
				System.out.print(n);
				break;
			}
			if(n%k==0) {
				System.out.print(k + " * ");
				n = n/k;
			}else {
				k++;
			}			
		}
	}

}
