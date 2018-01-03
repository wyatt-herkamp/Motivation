package me.wherkamp.motivation;

import me.wherkamp.motivation.exception.Yourself;
import me.wherkamp.motivation.opportunitys.Opportunity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Person {
    private boolean time;
    private List<String> worries;
    public Person(String name){
        worries = new ArrayList<>();
        time = true;
    }
    public void doYourBest() throws Yourself {

    }

    public void whatYouNeedToDo() {
    }

    public boolean hasTime() {
        return false;
    }

    public void grabOpportunity(Opportunity opportunity) {
    }

    public boolean fails() {
        if(Math.random() <= .5){
            return true;
        }else{
            return false;
        }
    }

    public List<String> getWorries() {
        return worries;
    }

    public void addWorry(String worry) {
        worries.add(worry);
    }
}
