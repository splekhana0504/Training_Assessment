package Module2;

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is larger");
        }
        else if(b>a && b>c){
            System.out.println("b is larger");
        }
        else{
            System.out.println("c is larger");
        }
    }
}
