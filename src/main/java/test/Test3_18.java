package test;

public class Test3_18 {
    public static void main(String []s){
        System.out.print(s[1]);
        main(s[2]);

    }
    public static void main(String s){
        assert (s==null);
        System.out.print(s);
    }
}
