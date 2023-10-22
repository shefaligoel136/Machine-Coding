package com.coding.tictactoe;

import com.coding.tictactoe.Controllers.GameController;
import com.coding.tictactoe.Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter dimension of the game");

        int dimension = sc.nextInt();

        List<Player> players = new ArrayList<>();

        System.out.println("Will there be bot? y/n");
        String isBot = sc.next();

        int noOfHumans = dimension - 1;
        if(isBot.toLowerCase().equals('y')){
            noOfHumans = dimension - 2;
            System.out.println("Enter name of bot");
            String name = sc.next();

            System.out.println("Enter symbol chosen for bot");
            char symbol = sc.next().charAt(0);

            players.add(new Bot(symbol, name, BotDifficultyLevel.EASY));
        }

        for (int i=1;i<=noOfHumans;i++){
            System.out.println("Enter name of player: "+i);
            String name = sc.next();

            System.out.println("Enter symbol chosen for player: "+i);
            char symbol = sc.next().charAt(0);

            players.add(new Player(symbol, name, PlayerType.HUMAN));
        }



        System.out.println("GAME IS STARING");

        GameController gameController = new GameController();
        Game game = gameController.createGame(dimension, players);

        while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)){

        }

        if(gameController.getGameStatus(game).equals(GameStatus.DRAW)){
            System.out.println("GAME HAS BEEN A DRAW!");
        }else{
//            someone won the game.
            game.getWinner();
        }
    }
}
