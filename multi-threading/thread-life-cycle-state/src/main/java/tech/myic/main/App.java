package tech.myic.main;

public class App {
    public static void main(String[] args) throws InterruptedException {
        //NEW
        Thread newThread = new Thread();
        System.out.println("New Thread: " + newThread.getState());

        //RUNNABLE
        Thread runnableThread = new Thread(() -> System.out.println("This is a runnable thread"));

        runnableThread.start();
        System.out.println("Runnable thread: " + runnableThread.getState());

        //BLOCKED
        Thread t1 = new Thread(new SyncCode());
        Thread t2 = new Thread(new SyncCode());

        t1.start();
        Thread.sleep(200);
        t2.start();
        Thread.sleep(200);

        System.out.println("T1: " + t1.getState());
        System.out.println("T2: " + t2.getState());

        System.exit(0);

    }
}
