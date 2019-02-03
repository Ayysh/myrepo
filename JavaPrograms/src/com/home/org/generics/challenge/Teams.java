package com.home.org.generics.challenge;

import java.util.*;

public class Teams<T extends Player> {

    private String teameName;
    private ArrayList<T> players = new ArrayList<>();

    public ArrayList<T> getPlayers() {
        return players;

    }

    public String getTeameName() {
        return teameName;
    }

    public Teams(String teameName) {
        this.teameName = teameName;
    }

    public void addPlayer(T player) {
        this.players.add(player);
    }

    @Override
    public String toString() {
        return "Teams{" +
                "teameName='" + teameName + '\'' +
                ", players=" + players +
                '}';
    }
}
