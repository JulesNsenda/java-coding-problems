package tech.myic.main;

public class WaitingState {
    //WAITING
    public void waitingThread() {
        new Thread(() -> {
            Thread t1 = Thread.currentThread();
            Thread t2 = new Thread(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignore) {
                }
                System.out.println("Waiting: " + t1.getState()); // WAITING
            });
            t2.start();
            try {
                t2.join();
            } catch (InterruptedException ignore) {
            }
        }).start();
    }

    public static void main(String[] args) {
        WaitingState waitingState = new WaitingState();
        waitingState.waitingThread();
    }
}
