package com.miguel.springspring.game;

public class MarioGame {

    public void up() {
        System.out.println("jump");
    }

    public void down() {
        System.out.println("duck");
    }

    public void down(Boolean abovePipe) {
        System.out.println("going down into the pipe");
    }

    public void left() {
        System.out.println("stop");
    }

    public void right() {
        System.out.println("run");
    }
}
