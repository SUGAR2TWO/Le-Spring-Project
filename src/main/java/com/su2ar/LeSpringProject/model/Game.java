package com.su2ar.LeSpringProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Game {

    private String gameId;

    private User user1;
    private User user2;

    private GameStatus status;
    private int[][] board;

    private TicToe winner;
}
