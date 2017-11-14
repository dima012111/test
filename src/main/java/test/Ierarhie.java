package test;
class Sup{

}
class Sub extends Sup{

}
public class Ierarhie {
    public static void main(String []s){

//        Sup sup=new Sup();
//        Sup sup1=new Sub();
//        Sup sup2=sup;
//        Sup sup3=sup1;
 //       Sub sub=new Sub();
//        Sub sub1= (Sub) sup1;
 //      Sup sup4=sub;
        int x = 3;
         for(int i = 0; i < 3; i++) {
             if(i == 1) x = x++;
             if(i % 2 == 0 && x % 2 == 0) System.out.print(".");
             if(i % 2 == 0 && x % 2 == 1) System.out.print("-");
             if(i == 2 ^ x == 4) System.out.print(",");
             }
         System.out.println("<" + " "+x);
        boolean[] ba = {true, false};
        short[][] gr = {{1,2}, {3,4}};
         int i = 0;
        for( ; i < 10; ) i++;

         for(int j = 0, k = 10; k > j; ++j, k--) ;
         for(int j = 0; j < 3; ) {
             System.out.println(j++);
         }

         Integer i1=Integer.parseInt("10");
         Integer i2=Integer.parseInt("10");
         System.out.println(i1==i2);




    }
}
