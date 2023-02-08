package com.su2ar.LeSpringProject.storage;

import com.su2ar.LeSpringProject.model.Game;
import java.util.Map;
import java.util.HashMap;

public class GameStorage {

    private static Map<String, Game> games;
    private static GameStorage instance;

    private GameStorage() {
        games = new HashMap<>();
    }

    public static synchronized GameStorage getInstance() {
        if (instance == null) {
            instance = new GameStorage();
        }

        return instance;
    }

    public Map<String, Game> getGames() {
        return games;
    }

    public void setGame(Game game){
        games.put(game.getGameId(), game);
    }

}