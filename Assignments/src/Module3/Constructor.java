package Module3;

public class Constructor {
    String name;

    Constructor(String n) {
        name = n;
    }

    public static void main(String[] args) {
        Constructor c = new Constructor("Lekhana");
        System.out.println("Name: " + c);
    }
}
