package com.coding.tictactoe.Strategies.gameWinningStrategy;

import com.coding.tictactoe.Models.Board;
import com.coding.tictactoe.Models.Move;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Move move);
}
