package com.home.org.generics.challenge;

import java.util.ArrayList;

public class FootballTeam <T extends FootballPlayer> extends Teams{

    public FootballTeam(String teameName) {
        super(teameName);
    }



}

