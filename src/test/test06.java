package test;

import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        
    	int a,b,m;
    	Scanner s = new Scanner(System.in);
    	System.out.print("imput a number: ");
    	a = s.nextInt();
    	System.out.print("imput another number: ");
    	b = s.nextInt();

    	deff cd = new deff();
    	m = cd.deff(a,b);
    	int n = a*b/m;

    	System.out.println("maxgongbeishu " + m);
    	System.out.println("mingongyueshu "+ n);

    }
}

class deff{
    public int deff(int x, int y){

        int t;
        if(x < y){
            t=x;
            x=y;
            y=t;
        }
        while (y!=0){
            if(x == y){
                return y;
            }else {
            	int k = x%y;
            	x=y;
            	y=k;
            }
        }
        return x;
    }
}