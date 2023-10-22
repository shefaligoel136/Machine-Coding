package com.coding.tictactoe.Controllers;

import com.coding.tictactoe.Models.Game;
import com.coding.tictactoe.Models.GameStatus;
import com.coding.tictactoe.Models.Player;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> playerList) {
        Game game = Game.getBuilder().setDimension(dimension).setPlayers(playerList).build();
        return game;
    }

    public void undo(Game game){

    }

    public void nextMove(Game game){

    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public void displayBoard(Game game){
        game.displayBoard();
    }
}
