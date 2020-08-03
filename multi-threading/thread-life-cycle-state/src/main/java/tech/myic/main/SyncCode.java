package tech.myic.main;

public class SyncCode implements Runnable {

    private static synchronized void syncMethod() {
        while (true) {
        }
    }

    public void run() {
        syncMethod();
    }
}