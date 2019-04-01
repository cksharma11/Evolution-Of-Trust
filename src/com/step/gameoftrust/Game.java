package com.step.gameoftrust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Game {
    private List<Player> players;
    private Machine machine;
    private List<Integer> score;

    Game(List<Player> players) {
        this.players = players;
        this.machine = new Machine();
        this.score = new ArrayList<>(Arrays.asList(0, 0));
    }

    List<Integer> makeMove() {
        List<Integer> score;
        List<MoveType> moves = new ArrayList<>();

        for (Player player : players) {
            moves.add(player.makeMove());
        }

        score = machine.getResult(moves);

        this.players.get(0).setScore(score.get(0));
        this.players.get(1).setScore(score.get(1));

        this.score.set(0, this.score.get(0) + score.get(0));
        this.score.set(1, this.score.get(1) + score.get(1));

        return this.score;
    }
}
