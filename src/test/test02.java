package test;

public class test02 {
	public static void main(String[] args) {
		/*
		 * 算法50题 No.2
		 */
		int count = 0;
		for (int i = 101; i < 200; i += 2) {
			boolean b = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					b = false;
					break;
				} else {
					b = true;
				}
			}
			if (b == true) {
				System.out.println(i);
			}
			count++;
		}
		System.out.println("个数" + count);
	
	}

}
