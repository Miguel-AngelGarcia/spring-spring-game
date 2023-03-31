package com.miguel.springspring.game;

public class SuperContraGame {

    public void up() {
        System.out.println("SuperContraGame jump");
    }

    public void down() {
        System.out.println("SuperContraGame duck");
    }

    public void down(Boolean abovePipe) {
        System.out.println("SuperContraGame going down into the pipe");
    }

    public void left() {
        System.out.println("SuperContraGame stop");
    }

    public void right() {
        System.out.println("SuperContraGame run");
    }
}
