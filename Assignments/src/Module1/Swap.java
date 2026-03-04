package Module1;

public class Swap {
    public static void main(String[] args) {

        //with
        int a=10,b=20;
        System.out.println("Before swapping " +a+" "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping " +a+" "+b);



        //without third variable
        int c=30,d=40;
        System.out.println("Before swapping " +c+" "+d);
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("After swapping " +c+" "+d);
    }
}
