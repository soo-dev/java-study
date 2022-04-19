package ch6;

class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];

        for(int i=0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;
        }

        for(int i=0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }
    }
}

class Tv {
    String color;
    boolean power;
    int channel;

    void Power() {
        power = !power;
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

//class TvTest {
//    public static void main(String[] args) {
//        Tv t;
//        t = new Tv();
//        t.channel = 7;
//        t.channelDown();
//        System.out.println("현재 채널은 " + t.channel + " 입니다.");
//    }
//}


