package com.step.gameoftrust;

public class CoolPerson implements Player {
    private Integer score;

    public CoolPerson() {
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
