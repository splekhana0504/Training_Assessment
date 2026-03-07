package Module5;

class Counter {
    int count = 6;
    synchronized void increment() {
        count++;
    }
}

public class SyncEx {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.increment();
        c.increment();
        System.out.println("Count: " + c.count);
    }
}
