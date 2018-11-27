package com.rahman.main.apiusingretrofit.List;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Sijariemas on 11/20/2018.
 */

public class ListDefault_1 {
    @SerializedName("READ")
    private String READ;
    @SerializedName("STATUS")
    private int STATUS;
    @SerializedName("MESSAGE")
    private String MESSAGE;

    public ListDefault_1() {
    }

    public ListDefault_1(String READ, int STATUS, String MESSAGE) {
        this.READ = READ;
        this.STATUS = STATUS;
        this.MESSAGE = MESSAGE;
    }

    public String getREAD() {
        return READ;
    }

    public void setREAD(String READ) {
        this.READ = READ;
    }

    public int getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(int STATUS) {
        this.STATUS = STATUS;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void setMESSAGE(String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }
}
