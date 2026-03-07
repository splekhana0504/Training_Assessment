package Module5;

public class ArithmeticEx {
    public static void main(String[] args) {

        try {
            int a = 10,b=0;
            int c = a / b;
        }catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }finally {
            System.out.println("Error");
        }
    }
}
