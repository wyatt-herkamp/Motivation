package me.wherkamp.motivation;

import me.wherkamp.motivation.exception.Yourself;
import me.wherkamp.motivation.opportunitys.Opportunity;

import java.util.ArrayList;
import java.util.List;

public class MotivationThread extends Thread {
    private List<Opportunity> opportunities;

    private boolean iamAlive;
    public MotivationThread(boolean alive){
        this.iamAlive = alive;
        opportunities = new ArrayList<>();
        opportunities.add(new Opportunity("Take a chance with a job"));
        //add you opportunities
    }

    @Override
    public void run() {
        //You
        Person person = new Person("Name");
        person.addWorry("I might fail");
        while(iamAlive){
            try{
                person.doYourBest();
                do{
                    person.whatYouNeedToDo();
                }while(person.hasTime());
                for(Opportunity opportunity : opportunities){
                    person.grabOpportunity(opportunity);
                }
                if(person.fails()){
                    throw new Yourself(person.getWorries().toString());
                }else{
                    System.out.println("You did it!");
                }
            }catch(Yourself youself){
                System.out.println(youself.getMessage());
                continue;
                //Get back up!
            }
        }
    }
}
