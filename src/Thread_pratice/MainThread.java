package Thread_pratice;

public class MainThread {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            MyThread1 myThread1 = new MyThread1();
            myThread1.start();
        }

    }
}
