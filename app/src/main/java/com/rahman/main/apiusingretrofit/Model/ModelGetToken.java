package com.rahman.main.apiusingretrofit.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sijariemas on 11/20/2018.
 */

public class ModelGetToken {
    @SerializedName("pin_token")
    private String pin_token;

    public ModelGetToken() {
    }

    public ModelGetToken(String pin_token) {
        this.pin_token = pin_token;
    }

    public String getPin_token() {
        return pin_token;
    }

    public void setPin_token(String pin_token) {
        this.pin_token = pin_token;
    }
}
