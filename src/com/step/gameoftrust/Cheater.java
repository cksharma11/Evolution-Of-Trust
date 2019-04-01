package com.step.gameoftrust;

class Cheater extends Player {
    @Override
    MoveType makeMove() {
        return MoveType.CHEAT;
    }
}
