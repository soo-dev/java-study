package ch6;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("-------- Start main(String[] args)");
        firstMethod();
        System.out.println("-------- Done main(String[] args)");
    }

    static void firstMethod() {
        System.out.println("-------- Start firstMethod()");
        secondMethod();
        System.out.println("-------- Done firstMethod()");
    }

    static void secondMethod() {
        System.out.println("-------- Start  secondMethod()");
        System.out.println("-------- Done secondMethod()");
    }
}
