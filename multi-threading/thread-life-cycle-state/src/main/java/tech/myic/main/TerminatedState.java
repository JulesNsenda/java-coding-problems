package tech.myic.main;

public class TerminatedState {
    //TERMINATED
    public static void main(String[] args) throws InterruptedException {
        TerminatedThread terminatedState = new TerminatedThread();
        terminatedState.start();
        terminatedState.interrupted();
        System.out.println("Terminated: "+ terminatedState.getState());
    }
}

class TerminatedThread extends  Thread{
    @Override
    public void run() {
    }
}
