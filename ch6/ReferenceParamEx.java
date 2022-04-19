package ch6;

class Data_ref {
    int x;
}
public class ReferenceParamEx {
    public static void main(String[] args) {
        Data_ref data_ref = new Data_ref();
        data_ref.x = 10;
        System.out.println("main() : x = " + data_ref.x);

        change(data_ref);
        System.out.println("After change(data_ref.x)");
        System.out.println("main() : x = " + data_ref.x);
    }
    static void change(Data_ref data_ref) {
        data_ref.x = 1000;
        System.out.println("change() : x = " + data_ref.x);
    }
}
