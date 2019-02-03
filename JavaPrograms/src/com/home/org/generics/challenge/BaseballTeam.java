package com.home.org.generics.challenge;

import java.util.ArrayList;

public class BaseballTeam <T extends BaseballPlayer> extends Teams {

    public BaseballTeam(String teameName) {
        super(teameName);

    }
}
