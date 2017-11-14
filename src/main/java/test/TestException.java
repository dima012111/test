package test;

public class TestException {
    void metoda()  {
try {
    throw new Error();
}catch (Throwable e){

}



    }
    public static void main(String s[])  {

            new TestException().metoda();


    }
}
