package multithreading;

public class TestMultithreading {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread = new MyThread();
        Thread thread1 = new Thread(new Runner());
        thread1.start();
        thread.start();
        thread1.join();
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for (byte i = 0; i < 127; i++) {
            System.out.println("Hello from Runner");
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello from Thread");
        }
    }
}