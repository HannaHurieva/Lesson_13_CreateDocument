package com.alevel.lesson13.body;

import java.util.Arrays;

public class BodyData {
    private String[] data;
    private int counter;

    public BodyData(String[] data) {
        this.data = data;
        this.counter = data.length;
    }

    public BodyData() {
        data = new String[10];
        counter = 0;
    }

    public void add(String data) {
        if (counter == this.data.length) {
            //  Like ArrayList
            String[] newData = new String[this.data.length+ this.data.length/ 2 + 1];
            System.arraycopy(this.data,
                    0,
                    newData,
                    0,
                    this.data.length);
            this.data = newData;
        }
        this.data[counter++] = data;
    }

    public void print() {
        for (int i = 0; i < this.data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
