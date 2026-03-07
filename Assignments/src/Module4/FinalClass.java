package Module4;

final class TestFinal {
    void show() {
        System.out.println("This is a final class");
    }
}

public class FinalClass {
    public static void main(String[] args) {
        TestFinal obj = new TestFinal();
        obj.show();
    }
}
