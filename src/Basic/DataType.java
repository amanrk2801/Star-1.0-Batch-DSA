package Basic;

public class DataType {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        DataType obj = new DataType();
//        int res = obj.sum(10,20);
        int res = obj.sum(a, b);
        System.out.println(res);
        System.out.println("Hello, World!");

//        Data types - Size
        char ch = 'A'; // 2 bytes because java support ASCII & unicode both
        byte age = 1; // 1 byte
        short s = 2; // 2 bytes
        int myNum = 4; // 4 bytes
        long l = 8; // 8 bytes
        float f = 10.5f; // 4 bytes
        double d = 10.5; // 8 bytes
        boolean myBool = true; // 1 bit
        String myText = "Hello"; // 2 bytes

        System.out.println(ch);
        System.out.println(age);
        System.out.println(s);
        System.out.println(myNum);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(myBool);
        System.out.println(myText);

        obj.print();

    }

    // Method or Function
    int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    void print() {
        int a = 30;
        int b = 40;
        int result = sum(a, b);
        System.out.println(result);
    }
}
