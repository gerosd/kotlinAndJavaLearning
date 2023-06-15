package multithreading;

public class VolatileTest {
    public static void main(String[] args) {
        MyThreadVolatile thread = new MyThreadVolatile();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(thread.isInterrupted());

        thread.shutdown();
    }
}

class MyThreadVolatile extends Thread {
    volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutdown() {
        this.running = false;
        System.out.println("Bye");
    }
}
