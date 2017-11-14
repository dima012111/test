package test;


public class Test3_60 implements Runnable {
static int i=5;
    public static void main(String []ss){
    Test3_60 tt=new Test3_60();
    Thread t1=new Thread(tt,"t1");
    Thread t2=new Thread(tt,"t2");
    t1.start();t2.start();


   try {
       throw new Exception();
   }catch (RuntimeException t){
       System.out.println("tratat");
   }catch (Throwable t){

   }
    }
public static synchronized void inc() throws InterruptedException {
        if(i>0){
            ++i;

            System.out.println(Thread.currentThread().getName()+" inc "+i);
            Thread.sleep(200);
            dec();
        }
}
public static synchronized void dec() throws InterruptedException {
    --i;
    Thread.sleep(500);
    System.out.println(Thread.currentThread().getName()+" dec "+i);
}
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("t1")){
            try {
                inc();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else try {
            dec();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
