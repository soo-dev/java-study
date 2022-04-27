package ch2;

class PrintfEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int) c);
        System.out.printf("finger=[%5d]%n", finger);  // finger=[   10]
        System.out.printf("finger=[%-5d]%n", finger); // finger=[10   ]
        System.out.printf("finger=[%05d]%n", finger); // finger=[00010]
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex); // # -> 0x
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);

        // 10진수를 2진수로 출력해주는 지시자는 없음,
        // Integer.toBinaryString() -> 정수를 2진 문자열로 변환해줌, %s 사용
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
    }
}
