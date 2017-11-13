package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
class LockUnlockDemo implements Task {
    final ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void performTask() {
        reentrantLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + ": Lock.");
            System.out.println("Processing...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + ": UnLock.");
            reentrantLock.unlock();
        }
    }
}
class LockInterruptiblyDemo implements Task{
    final ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void performTask() {
        try {
            reentrantLock.lockInterruptibly();

            //if it is not able to acquire lock because of other threads interrupts,
            //it will throw InterruptedException and control will go to catch block.
            try {
                System.out.println(Thread.currentThread().getName() +": Lock.");
                System.out.println("Work on progress...");
                Thread.sleep(2000);

            } finally {
                System.out.println(Thread.currentThread().getName() +": UnLock.");
                reentrantLock.unlock();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class TryLockDemo implements Task {
    final ReentrantLock reentrantLock = new ReentrantLock();
    @Override
    public void performTask() {
        try {
            boolean flag = reentrantLock.tryLock();
            if (flag) {
                try {
                    System.out.println(Thread.currentThread().getName() +": Lock .");
                    System.out.println("Performing task...");
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println(Thread.currentThread().getName() +": UnLock .");
                    reentrantLock.unlock();
                }
            }
            else System.out.println(Thread.currentThread().getName()+ " este pe false");
        }  finally {

        }
    }
}
interface Task {
    public void performTask();
}

public class Worker implements Runnable {
    private Task task;
    public Worker(Task task) {
        this.task = task;
    }
    @Override
    public void run() {
        task.performTask();
    }

    public static void main(String []s){
        final int threadCount = 5;
        final ExecutorService service = Executors.newFixedThreadPool(threadCount);
       // final Task task = new LockUnlockDemo();
      // final Task task = new TryLockDemo();
       final Task task = new LockInterruptiblyDemo();
        for (int i=0; i< threadCount; i++) {
            service.execute(new Worker(task));
        }
        service.shutdown();

    }


}
