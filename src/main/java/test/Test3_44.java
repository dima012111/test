package test;

public class Test3_44 {
    public  static void main(String []s) throws Exception {

        Integer i1 = 2001; // set 1
         Integer i2 = 2001;

         System.out.println((i1 == i2) + " " + i1.equals(i2)); // output 1

         Integer i3 = 21;
         int a=21;
         // set 2
         Integer i4 = new Integer(21);
         System.out.println((a == i3) + " "); // output 2
         Integer i5 = 21; // set 3
         Integer i6 = 21;
         System.out.println((i5 == i6) + " " + i5.equals(i6)); // output 3


    }
}
