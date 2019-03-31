package com.step.gameoftrust;

public class AlwaysCheat implements Player {
    private Integer score;

    public AlwaysCheat() {
        this.score = 0;
    }

    @Override
    public void cooperate() {

    }

    @Override
    public void cheat() {

    }

    @Override
    public void updateScore(Integer points) {
        this.score += points;
    }
}
