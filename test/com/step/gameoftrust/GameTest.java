package com.step.gameoftrust;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    Game game;
    CoolPerson coolPerson;
    AlwaysCheat alwaysCheat;
    @BeforeEach
    void setUp() {
        coolPerson = new CoolPerson();
        alwaysCheat = new AlwaysCheat();
        game = new Game(coolPerson, alwaysCheat);
    }

    @org.junit.jupiter.api.Test
    void shouldUpdateScoreOfPlayersAfterPlayingMoves() {
        game.conductRound(coolPerson.cooperateOrCheat(), alwaysCheat.cooperateOrCheat());
        /* First round */
        assertEquals(coolPerson.getScore(), -1);
        assertEquals(alwaysCheat.getScore(), 3);

        game.conductRound(coolPerson.cooperateOrCheat(), alwaysCheat.cooperateOrCheat());
        /* Second round */
        assertEquals(coolPerson.getScore(), -2);
        assertEquals(alwaysCheat.getScore(), 6);

        game.conductRound(coolPerson.cooperateOrCheat(), alwaysCheat.cooperateOrCheat());
        /* Third round */
        assertEquals(coolPerson.getScore(), -3);
        assertEquals(alwaysCheat.getScore(), 9);

        game.conductRound(coolPerson.cooperateOrCheat(), alwaysCheat.cooperateOrCheat());
        /* Forth round */
        assertEquals(coolPerson.getScore(), -4);
        assertEquals(alwaysCheat.getScore(), 12);

        game.conductRound(coolPerson.cooperateOrCheat(), alwaysCheat.cooperateOrCheat());
        /* Fifth round */
        assertEquals(coolPerson.getScore(), -5);
        assertEquals(alwaysCheat.getScore(), 15);
    }

}