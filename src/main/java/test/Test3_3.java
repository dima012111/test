package test;
class Radio{
    String getF(){
        return "91";
    }
    static String getFF(){
        return "91";
    }
}
class RadioButton extends Radio{
    String getF(){
        return "81";
    }
    static String getFF(){
        return "81";
    }}
public class Test3_3  {
    public static void main(String []s){
        RadioButton rb=new RadioButton();
        System.out.print(rb.getFF());
        Radio r=rb;
        System.out.print(r.getFF());
    }

}
