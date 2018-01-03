package me.wherkamp.motivation;


public class Main {
    public static void main(String args[]){
        MotivationThread motivationThread = new MotivationThread(true);
        motivationThread.start();
    }
}
