package com.home.org.generics.challenge;

import java.util.ArrayList;
import java.util.List;

public class League<T extends Teams> {

    private String leagueName;

    private List<T> teamsList = new ArrayList<>();

    public League(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public List<T> getTeamsList() {
        return teamsList;
    }

   /* public void addTeam(List<T> tList) {
        this.teamsList = tList;
    }*/


    public void addTeam(T team) {
        this.teamsList.add(team);
    }
}
