package test;

import java.util.ArrayList;
import java.util.List;

enum My {
    Hi,Aloha,Howdy
}
class Testt{
    enum T{
        Ho(45),El(77);
        int h;
        T(int hh){ h=hh;}
        int getH(){
            return h;
        }

    }
}

    enum Year{
        Jan,Feb,Mar;
       public int dayNr(){
            switch (this) {
                case Jan:return 31;
                case Feb: return 28;
                case Mar:return 31;
                default:
                    return 31;
            }
        }
        public  List<Integer>  getHol(){
           List<Integer> list=new ArrayList<>();
            switch (this){
                case Jan:
                   list.add(5);
                   list.add(7);
                    ;break;
                case Feb:
                    list.add(1);
                    list.add(2);
                    ;break;
                case Mar:list.add(8);
                default:break;
            }

return list;
        }
       public boolean isHol(int a){
            List<Integer> list;
            switch (this){
                case Jan:
                    list=getHol();
                    if (list.contains(a)){
                        return true;
                    }
                    ;break;
                case Feb:
                  list=getHol();
                    if (list.contains(a)){
                        return true;
                    }
                    ;break;
                case Mar:
                    list=getHol();
                    if (list.contains(a))
                        return true;
                default:break;

            }
            return false;
        }
    }




public class TestEnum {
    My mm=My.Aloha;
    void go(){
        for(My m:My.values()){
            if(m==mm){
                System.out.println(mm);
            }
        }
    }
    public static void main(String s[]){
    System.out.println(Year.Jan.dayNr());
    System.out.println(Year.Feb.dayNr());
    System.out.println(Year.Jan.getHol());
    System.out.println(Year.Feb.getHol());
    System.out.println(Year.Feb.isHol(3));
    System.out.println(Year.Mar.isHol(8));
    }

//
//
//        int h=Testt.T.Ho.getH();
//        TestEnum te=new TestEnum();
//        te.go();
//        List<String> stuf=new ArrayList<>();
//        stuf.add("bob");
//        stuf.add("ted");
//
//        My[] my=My.values();
//        for(My me:My.values()){
//            te.getEnum(me);
//        }
//        for(int x=0;x<My.values().length;x++){
//            te.getEnum(my[x]);
//        }
//        for(My me:my){
//            te.getEnum(me);
//        }
//    }
    public void getEnum (My e){
        System.out.println(e+" " +e.ordinal());

    }
}
