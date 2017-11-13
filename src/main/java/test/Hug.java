package test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static test.Hug.ll;

public class Hug implements Runnable {
  static Thread t1,t2;
  static Hold h, h2;
  static Lock ll=new ReentrantLock();
  public void run() {
         if(Thread.currentThread().getId() == t1.getId()) h.adjust();
         else h2.view();
         }
  public static void main(String[] args) throws InterruptedException {
         h = new Hold();
         h2 = new Hold();
         t1 = new Thread(new Hug());
         t1.start();
       t2= new Thread(new Hug());
       t1.join();
       t2.start();
         } }
 class Hold {
 static int x = 5;
 Lock l=new ReentrantLock();
 synchronized void adjust() {
         System.out.print(Thread.currentThread().getName()+" " +x-- + " " );
l.tryLock();
         view();

         }
 synchronized void view() {

         if(x > 0){

             adjust();

         }
         } }
