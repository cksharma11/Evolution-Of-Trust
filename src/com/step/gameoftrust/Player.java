package com.step.gameoftrust;

interface Player {
    MoveType cooperateOrCheat();
    void updateScore(Integer points);
    Integer getScore();
}
