package com.coding.tictactoe.Models;

import com.coding.tictactoe.Exceptions.InvalidGameDimensionException;
import com.coding.tictactoe.Exceptions.InvalidNumberOfPlayersException;
import com.coding.tictactoe.Strategies.gameWinningStrategy.GameWinningStrategy;
import com.coding.tictactoe.Strategies.gameWinningStrategy.OrderOneGameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameStatus gameStatus;
    private int nextPlayerIndex;
    private Player winner;
    private GameWinningStrategy gameWinningStrategy;

    private Game() {}

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public void displayBoard() {
        this.board.displayBoard();
    }

    public static class Builder {
        private int dimension;
        private List<Player> players;
        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        private boolean isValid() throws InvalidNumberOfPlayersException, InvalidGameDimensionException {
            //Validations.
            if (players.size() != dimension - 1) {
                throw new InvalidNumberOfPlayersException("Number of players should be 1 less than dimension");
            }

            if (dimension < 3) {
                throw new InvalidGameDimensionException("Dimension can't be less than 3");
            }

            //If 2 players have same symbol then invalidate the game.
            return true;
        }

        public Game build() {
            //Before building the game, we should validate the game.
            try {
                isValid();
            } catch (InvalidGameDimensionException e) {
                System.out.println(e.getMessage());
                return null;
            } catch (InvalidNumberOfPlayersException e) {
                System.out.println(e.getMessage());
                return null;
            }

            //Game is valid.
            Game game = new Game();
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setPlayers(players);
            game.setBoard(new Board(dimension));
            game.setMoves(new ArrayList<>());
            game.setNextPlayerIndex(0);
//            game.setGameWinningStrategy(new OrderOneGameWinningStrategy(dimension));

            return game;
        }

    }

}
