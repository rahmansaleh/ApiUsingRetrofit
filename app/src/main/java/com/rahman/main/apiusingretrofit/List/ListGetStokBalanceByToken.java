package com.rahman.main.apiusingretrofit.List;

import com.google.gson.annotations.SerializedName;
import com.rahman.main.apiusingretrofit.Model.ModelGetStokBalanceByToken;
import com.rahman.main.apiusingretrofit.Model.ModelGetToken;

import java.util.List;

/**
 * Created by Sijariemas on 11/20/2018.
 */

public class ListGetStokBalanceByToken {
    @SerializedName("READ")
    private List<ModelGetStokBalanceByToken> READ;
    @SerializedName("STATUS")
    private int STATUS;
    @SerializedName("MESSAGE")
    private String MESSAGE;

    public ListGetStokBalanceByToken() {
    }

    public ListGetStokBalanceByToken(List<ModelGetStokBalanceByToken> READ, int STATUS, String MESSAGE) {
        this.READ = READ;
        this.STATUS = STATUS;
        this.MESSAGE = MESSAGE;
    }

    public List<ModelGetStokBalanceByToken> getREAD() {
        return READ;
    }

    public void setREAD(List<ModelGetStokBalanceByToken> READ) {
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
