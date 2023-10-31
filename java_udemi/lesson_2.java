package java_udemi;

public class Lesson_2 {
    public static void main(String[] args) {

        // type byte
        byte b1 = 12;
        byte b2 = 0b1100;
        byte b3 = 014;
        byte b4 = 0xC;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        
        // type short
        short s1 = 1300;
        short s2 = 0b010_0001_0100;
        short s3 = 02_424;
        short s4 = 0x514;
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
       
        // type int
        int i1 = 0;
        int i2 = 0000;
        int i3 = 00;
        int i4 = 0x0;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        // type long
        long l1 = 123456789L;
        long l2 = 0b0111_0101_1011_1100_1101_0001_0101;
        long l3 = 0726_746_425;
        long l4 = 0x75B_CD15;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        
        // type float
        float f1 = 2.45F;
        float f2 = 65.4F;

        System.out.println(f1);
        System.out.println(f2);

        // type double
        double d1 = 13.67;
        double d2 = 2.02;
        
        System.out.println(d1);
        System.out.println(d2);
        
        // type boolean
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1);
        System.out.println(bool2);

        // type char
        char c1 = 21;            // DEC
        char c2 = '\u0015';      // HEX
        
        System.out.println(c1);
        System.out.println(c2);
    
    }   


}
