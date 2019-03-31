package com.step.gameoftrust;

public class AlwaysCheat implements Player {
    private Integer score;

    AlwaysCheat() {
        this.score = 0;
    }

    @Override
    public MoveType cooperateOrCheat() {
        return MoveType.CHEAT;
    }

    @Override
    public void updateScore(Integer points) {
        this.score += points;
    }

    @Override
    public Integer getScore() {
        return this.score;
    }
}
