package com.cx.study;

import java.util.Arrays;

public class Collection {
    private String[] args;

    public void setArgs(String[] args) {
        this.args = args;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "args=" + Arrays.toString(args) +
                '}';
    }
}
