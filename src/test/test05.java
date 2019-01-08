package test;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        System.out.print("Import a grade number: ");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        char grade;

        grade = x >= 90 ? 'A' :
                x >= 60 && x < 90 ? 'B' : 'C';

        System.out.print(grade);
    }
}





