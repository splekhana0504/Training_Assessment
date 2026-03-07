package Module5;

import java.util.Scanner;

public class AgeExpectation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        if(age < 18){
            throw new ArithmeticException("Not eligible for voting");
        }else{
            System.out.println("Eligible");
        }
    }
}
