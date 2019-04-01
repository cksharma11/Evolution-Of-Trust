package com.step.gameoftrust;

class Grudger extends Player {
    @Override
    MoveType makeMove() {
        if (this.score != null && this.score < 0) {
            return MoveType.CHEAT;
        }
        return MoveType.COOPERATE;
    }
}
