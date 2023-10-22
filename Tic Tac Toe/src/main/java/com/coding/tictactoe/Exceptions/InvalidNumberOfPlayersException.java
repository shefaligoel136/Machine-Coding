package com.coding.tictactoe.Exceptions;

public class InvalidNumberOfPlayersException extends Exception{
    public InvalidNumberOfPlayersException(String message){
        super(message);
    }
}
