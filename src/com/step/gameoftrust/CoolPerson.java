package com.step.gameoftrust;

class CoolPerson extends Player {

    @Override
    MoveType makeMove() {
        return MoveType.COOPERATE;
    }

}
