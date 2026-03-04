package Module3;

import java.util.Scanner;

public class SquareOfNo {
    int Sq(int a){
        int Sq=a*a;
        return Sq;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        SquareOfNo ob=new SquareOfNo();
        System.out.println(ob.Sq(n));
    }

}
