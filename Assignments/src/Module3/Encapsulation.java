package Module3;

class Encapsulation {
    private int value;

    public void setValue(int v) {
        value = v;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setValue(10);
        System.out.println(e.getValue());
    }
}
