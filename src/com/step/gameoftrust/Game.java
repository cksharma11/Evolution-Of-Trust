package com.step.gameoftrust;

class Game {
    private Player player1;
    private Player player2;

    Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void conductRound(MoveType player1Move, MoveType player2Move){
        if(player1Move.getWeight() > player2Move.getWeight()){
            this.player1.updateScore(3);
            this.player2.updateScore(-1);
        }else if(player1Move.getWeight() < player2Move.getWeight()){
            this.player1.updateScore(-1);
            this.player2.updateScore(3);
        }else if(player1Move.getWeight() == player2Move.getWeight() && player1Move == MoveType.CHEAT){
            this.player1.updateScore(0);
            this.player2.updateScore(0);
        }else {
            this.player1.updateScore(2);
            this.player2.updateScore(2);
        }
    }
}
