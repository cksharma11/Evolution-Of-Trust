package com.step.gameoftrust;

abstract class Player {
    Integer score;

    abstract MoveType makeMove();

    void setScore(Integer score) {
        this.score = score;
    }
}
