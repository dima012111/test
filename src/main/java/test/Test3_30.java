package test;
class Eng{
    public class Pis{
         int count=0;
         void go(){
             System.out.println("pump"+count);
         }
    }
    public Pis get(){
        return new Pis();
    }
}
public class Test3_30 {
    public static void main(String []s){
        Eng e=new Eng();
       Eng.Pis p=e.get();

        p.go();
    }

}
