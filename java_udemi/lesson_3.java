package java_udemi;
public class Lesson_3 {
    public static void main(String [] args) {

        // ex1
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        
        System.out.println(result);

        // ex2
        int a = 5;
        int b = 8;

        System.out.println(a-- - --a + ++a + a++ + a);
        //                 5   -   3 +   4 + 4   + 5 = 15
        System.out.println(a);
        //          a = 5

        System.out.println(++b - b++ + ++b - --b);
        //                   9 - 9   + 11  -   10 = 1
        System.out.println(b);
        //          b = 10

    }
    
}
