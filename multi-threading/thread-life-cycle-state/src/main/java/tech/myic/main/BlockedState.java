package tech.myic.main;

public class BlockedState {
    public static void main(String[] args) throws InterruptedException {
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

class SyncCode implements Runnable {

    private static synchronized void syncMethod() {
        while (true) {
        }
    }

    public void run() {
        syncMethod();
    }
}
