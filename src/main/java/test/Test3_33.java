package test;

import java.util.ArrayList;
import java.util.List;

interface Canine{

}
class Dog implements Canine{

}
class Collie extends Dog{

}
public class Test3_33 {
    public static void main(String []s){
        List<Dog> d=new ArrayList<Dog>();
        List<Collie> c=new ArrayList<Collie>();
        d.add(new Collie());
        c.add(new Collie());
        do1(d);
        do1(c);
        do2(d);
        do2(c);

    }
    static void do1(List<? extends Dog> d2){

        System.out.println(d2.size());
    }
    static void do2(List<? extends Canine> c2){
        //c2.add(1,new Collie());
        System.out.println(c2.size());
    }

}
