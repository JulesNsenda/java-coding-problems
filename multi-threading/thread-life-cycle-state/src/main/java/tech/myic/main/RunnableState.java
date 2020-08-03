package tech.myic.main;

public class RunnableState {
    public static void main(String[] args) throws InterruptedException {
        //RUNNABLE
        Thread runnableThread = new Thread(() -> System.out.println("This is a runnable thread"));
        runnableThread.start();
        System.out.println("Runnable thread: " + runnableThread.getState());
    }
}
