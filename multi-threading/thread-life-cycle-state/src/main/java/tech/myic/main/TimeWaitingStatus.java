package tech.myic.main;

public class TimeWaitingStatus {
    public static void main(String[] args) throws InterruptedException {
        //TIMED_WAITING
        Thread t1 = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignore) {
                }
            }
        };

        t1.start();

        Thread.sleep(500);
        System.out.println("T1: " + t1.getState());

    }
}
