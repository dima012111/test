package test;
class Sup{

}
class Sub extends Sup{

}
public class Ierarhie {
    public static void main(String []s){

        Sup sup=new Sup();
        Sup sup1=new Sub();
        Sup sup2=sup;
        Sup sup3=sup1;
        Sub sub=new Sub();
        Sub sub1= (Sub) sup1;
       Sup sup4=sub;



    }
}
