package Thread_pratice;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Runnable running: " + Thread.currentThread().getName());
    }
}
