package tech.myic.main;

public class NewState {
    public static void main(String[] args) {
        //NEW
        Thread newThread = new Thread();
        System.out.println("New Thread: " + newThread.getState());
    }
}
