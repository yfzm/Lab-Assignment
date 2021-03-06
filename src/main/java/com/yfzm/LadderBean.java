package com.yfzm;

import java.util.List;

public class LadderBean {

    private String begin;
    private String end;
    private int length;
    private List<String> ladder;

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<String> getLadder() {
        return ladder;
    }

    public void setLadder(List<String> ladder) {
        this.ladder = ladder;
    }
}
