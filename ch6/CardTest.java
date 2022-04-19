package ch6;

public class CardTest {
    public static void main(String[] args) {
        // static 변수 (클래스변수) 객체 생성 없이 '클래스이름.클래스변수'로 직접 사용 가능
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1 - " + c1.kind + ", " + c1.number + " / c1's width, height - " + c1.width + ", " + c1.height);
        System.out.println("c2 - " + c2.kind + ", " + c2.number + " / c1's width, height - " + c2.width + ", " + c2.height);

        c1.width = 50;
        c1.height = 80;

        System.out.println("c1 - " + c1.kind + ", " + c1.number + " / c1's width, height - " + c1.width + ", " + c1.height);
        System.out.println("c2 - " + c2.kind + ", " + c2.number + " / c1's width, height - " + c2.width + ", " + c2.height);

    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}


