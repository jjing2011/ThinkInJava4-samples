package com.mycompany.ThinkInJava4;

class Game {
    Game(int i) {
        Print.print("Game Constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        Print.print("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        Print.print("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
