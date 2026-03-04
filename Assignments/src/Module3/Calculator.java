package Module3;

public class Calculator {
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(6,12));
        System.out.println(c.sub(100,25));
    }
}
