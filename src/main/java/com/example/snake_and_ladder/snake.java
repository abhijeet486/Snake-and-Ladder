package com.example.snake_and_ladder;

public class snake {
    private int start_pos;
    private int end_pos;

    public snake(int start_pos, int end_pos) {
        this.start_pos = start_pos;
        this.end_pos = end_pos;
    }

    public int getStart_pos() {
        return start_pos;
    }

    public void setStart_pos(int start_pos) {
        this.start_pos = start_pos;
    }

    public int getEnd_pos() {
        return end_pos;
    }

    public void setEnd_pos(int end_pos) {
        this.end_pos = end_pos;
    }
}
