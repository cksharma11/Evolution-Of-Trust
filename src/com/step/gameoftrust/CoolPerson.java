package com.step.gameoftrust;

public class CoolPerson implements Player {
    private Integer score;

    public CoolPerson() {
        this.score = 0;
    }


    @Override
    public MoveType cooperateOrCheat() {
        return MoveType.COOPERATE;
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
