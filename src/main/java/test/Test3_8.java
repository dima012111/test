package test;

public class Test3_8 extends Thread {
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.print(Thread.currentThread().getName());
        }
    }

    public static void main(String[]s) throws Exception {
        Thread t=new Thread(new Test3_8());
        t.start();
        t.join();
       // throw  new Exception();
        for(int i=0;i<10;i++){
            System.out.print(Thread.currentThread().getName());
        }



    }
}
