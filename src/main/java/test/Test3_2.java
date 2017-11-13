package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3_2 {
    public static void main(String []s){
        List<String> list=new ArrayList<String>();
        list.add("p");list.add("s");list.add("r");
        System.out.println(list.indexOf("r"));
        Collections.reverse(list);
        System.out.println(list.indexOf("r"));
        Collections.sort(list);

    }
}
