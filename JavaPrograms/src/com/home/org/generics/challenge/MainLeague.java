package com.home.org.generics.challenge;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainLeague {

    public static void main(String[] args) {

        League<FootballTeam<FootballPlayer>> footballTeamLeague = new League<>("Football Premier League");

        // League<FootballTeam<BaseballPlayer>> footballTeamLeague2 = new League<>("Football Premier League"); -- error

        League<BaseballTeam<BaseballPlayer>> baseballTeamLeague = new League<>("Baseball Premier League");

        //  League<BaseballTeam<FootballTeam>> baseballTeamLeague= new League<>("Football Premier League"); -- error

        FootballTeam f1 = new FootballTeam("Manchester United");
        f1.addPlayer(new FootballPlayer("Joe"));
        f1.addPlayer(new FootballPlayer("Mick"));
        f1.addPlayer(new FootballPlayer("Bill"));
        footballTeamLeague.addTeam(f1);

        FootballTeam f2 = new FootballTeam("Liverpool");
        f2.addPlayer(new FootballPlayer("Tom"));
        f2.addPlayer(new FootballPlayer("Jack"));
        footballTeamLeague.addTeam(f2);

        FootballTeam f3 = new FootballTeam("Chelsea");
        f3.addPlayer(new FootballPlayer("Adam"));
        f3.addPlayer(new FootballPlayer("Tim"));
        footballTeamLeague.addTeam(f3);

        FootballTeam f4 = new FootballTeam("Arsenal");
        f4.addPlayer(new FootballPlayer("John"));
        f4.addPlayer(new FootballPlayer("Sam"));
        footballTeamLeague.addTeam(f4);

        Iterator itr = footballTeamLeague.getTeamsList().iterator();
        while(itr.hasNext())
        {
            FootballTeam fballTeam = (FootballTeam) itr.next();
            System.out.println("Football Team Name :" + fballTeam.getTeameName());
            Iterator iterator = fballTeam.getPlayers().iterator();
            while(iterator.hasNext()){
                System.out.println("Player Name :"+iterator.next());
            }
        }

        BaseballTeam<BaseballPlayer> b1 = new BaseballTeam("Chicago cubs");
        b1.addPlayer(new BaseballPlayer("Mikel"));
        baseballTeamLeague.addTeam(b1);

        BaseballTeam<BaseballPlayer> b2 = new BaseballTeam("Losangeles Angels");
        b2.addPlayer(new BaseballPlayer("David"));
        b2.addPlayer(new BaseballPlayer("Samuel"));
        baseballTeamLeague.addTeam(b2);

        BaseballTeam<BaseballPlayer> b3 = new BaseballTeam("NewYork Yankees");
        b3.addPlayer(new BaseballPlayer("James"));
        baseballTeamLeague.addTeam(b3);

        Iterator itr1 = baseballTeamLeague.getTeamsList().iterator();
        while(itr1.hasNext())
        {
            BaseballTeam bsballTeam = (BaseballTeam) itr1.next();
            System.out.println("Baseball Team Name :" + bsballTeam.getTeameName());
            Iterator iterator = bsballTeam.getPlayers().iterator();
            while(iterator.hasNext()){
                System.out.println("Player Name :"+iterator.next());
            }
        }
    }
}