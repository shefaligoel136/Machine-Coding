package com.coding.tictactoe.Strategies.botPlayingStrategy;

import com.coding.tictactoe.Models.Board;
import com.coding.tictactoe.Models.Move;
import com.coding.tictactoe.Models.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
