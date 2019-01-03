package test;

public class test01 {
	public static void main(String[] args) {
	
	/*
	 * 算法50题 No.1
	 */
		int f1=1;
		int f2=1;
		int f;
		System.out.println("第1个月有"+f2);
		System.out.println("第2个月有"+f2);
		
		for(int i=3; i<10; i++) {
			f = f2;
			f2 = f1+f2;
			f1 = f;
			System.out.println("第" + i + "个月共有" + f2);
		}	
	}

}
