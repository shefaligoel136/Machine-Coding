package com.coding.tictactoe.Strategies.gameWinningStrategy;

import com.coding.tictactoe.Models.Board;
import com.coding.tictactoe.Models.Move;

public class OrderOneGameWinningStrategy implements GameWinningStrategy{

//    public OrderOneGameWinningStrategy(int dimension) {
//        for (int i = 0; i < dimension; i++) {
//            rowSymbolCounts.add(new HashMap<>());
//            colSymbolCounts.add(new HashMap<>());
//        }
//    }


    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
