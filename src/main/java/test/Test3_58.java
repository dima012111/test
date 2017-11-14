package test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3_58 {
    public static void main(String[] args) {
        Set s1 = new HashSet();
         s1.add(0);
        s1.add("1");
         doStuff(s1);
         }

    private static void doStuff(Set<Number> s1) {
        Iterator i=s1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        Object []oa=s1.toArray();
        for (int ii=0;ii<oa.length;ii++){
            System.out.println(oa[ii]);
        }
        if (s1.contains(0)){
            System.out.println(true);
        }
    }
}
