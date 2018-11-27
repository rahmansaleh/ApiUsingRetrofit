package com.rahman.main.apiusingretrofit.List;

import com.google.gson.annotations.SerializedName;
import com.rahman.main.apiusingretrofit.Model.ModelGetToken;
import com.rahman.main.apiusingretrofit.Model.ModelGetWorkplaceByToken;

import java.util.List;

/**
 * Created by Sijariemas on 11/20/2018.
 */

public class ListGetWorkplaceByToken {
    @SerializedName("READ")
    private List<ModelGetWorkplaceByToken> READ;
    @SerializedName("STATUS")
    private int STATUS;
    @SerializedName("MESSAGE")
    private String MESSAGE;

    public ListGetWorkplaceByToken() {
    }

    public ListGetWorkplaceByToken(List<ModelGetWorkplaceByToken> READ, int STATUS, String MESSAGE) {
        this.READ = READ;
        this.STATUS = STATUS;
        this.MESSAGE = MESSAGE;
    }

    public List<ModelGetWorkplaceByToken> getREAD() {
        return READ;
    }

    public void setREAD(List<ModelGetWorkplaceByToken> READ) {
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
