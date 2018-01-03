package me.wherkamp.motivation;

import me.wherkamp.motivation.exception.Youself;
import me.wherkamp.motivation.opportunitys.Opportunity;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private boolean time;
    private List<String> worries;
    public Person(String name){
        worries = new ArrayList<>();
        time = true;
    }
    public void doYourBest() throws Youself{

    }

    public void whatYouNeedToDo() {
    }

    public boolean hasTime() {
        return time;
    }

    public void grabOpportunity(Opportunity opportunity) {
    }

    public boolean Fails() {
        return true;
    }

    public List<String> getWorries() {
        return worries;
    }
}
