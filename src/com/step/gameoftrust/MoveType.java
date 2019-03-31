package com.step.gameoftrust;

enum MoveType {
    COOPERATE(1),
    CHEAT(2);

    private Integer weight;

    MoveType(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }
}
