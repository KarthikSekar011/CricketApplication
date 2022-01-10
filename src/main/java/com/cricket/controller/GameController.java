package com.cricket.controller;

import com.cricket.client.GameClient;
import com.cricket.model.*;
import com.cricket.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController implements GameClient {

    @Autowired
    private GameService gameService;


    @Override
    public Game startGame(PreGameDetails preGameDetails) {
        return null;
    }

    @Override
    public Game addScore(Runs run) {
        return null;
    }

    @Override
    public Game addScoreForExtras(ExtraType extra, Runs run) {
        return null;
    }

    @Override
    public Game batsmanDismissed(Dismissal dismissalType, Runs run, String catcherName) {
        return null;
    }

    @Override
    public Game undoSelected() {
        return null;
    }

    @Override
    public Game nextBatsman(Player player) {
        return null;
    }

    @Override
    public Game nextBowler(Player player) {
        return null;
    }

    @Override
    public Game startSecondInnings(int target) {
        return null;
    }

    @Override
    public void finishGame() {

    }
}
