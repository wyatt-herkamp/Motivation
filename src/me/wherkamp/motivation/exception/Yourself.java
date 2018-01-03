package me.wherkamp.motivation.exception;

public class Yourself extends Exception{


    public Yourself(String s) {
        super("My Worries are:" + s);
    }
}
