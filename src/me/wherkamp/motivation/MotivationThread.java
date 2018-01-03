package me.wherkamp.motivation;

import me.wherkamp.motivation.exception.Youself;
import me.wherkamp.motivation.opportunitys.Opportunity;

import java.util.ArrayList;
import java.util.List;

public class MotivationThread extends Thread {
    private List<Opportunity> opportunities;

    private boolean alive;
    public MotivationThread(boolean alive){
        this.alive = alive;
        opportunities = new ArrayList<>();
        //add you opportunities
    }

    @Override
    public void run() {
        //You
        Person person = new Person("Name");
        while(alive){
            try{
                person.doYourBest();
                do{
                    person.whatYouNeedToDo();
                }while(person.hasTime());
                for(Opportunity opportunity : opportunities){
                    person.grabOpportunity(opportunity);
                }
                if(person.Fails()){
                    throw new Youself(person.getWorries().toString());
                }
            }catch(Youself youself){
                if(person.Fails()) {
                    continue;
                }
            }
        }
    }
}
