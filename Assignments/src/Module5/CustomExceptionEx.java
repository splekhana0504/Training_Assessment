package Module5;
class MyException extends Exception{
    MyException(String txt){
        super(txt);
    }
}
public class CustomExceptionEx {
    public static void main(String[] args) {
        try{
            throw new MyException("Custom Exception Occurred");
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
