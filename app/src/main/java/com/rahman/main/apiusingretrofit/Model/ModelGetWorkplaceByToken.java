package com.rahman.main.apiusingretrofit.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sijariemas on 11/20/2018.
 */

public class ModelGetWorkplaceByToken {
    @SerializedName("WorkplaceId")
    private String WorkplaceId;
    @SerializedName("WorkplaceName")
    private String WorkplaceName;
    @SerializedName("WorkplaceAddress1")
    private String WorkplaceAddress1;
    @SerializedName("WorkplaceAddress2")
    private String WorkplaceAddress2;
    @SerializedName("WorkplaceDistrict")
    private String WorkplaceDistrict;

    @SerializedName("WorkplaceCity")
    private String WorkplaceCity;
    @SerializedName("WorkplaceZipCode")
    private String WorkplaceZipCode;
    @SerializedName("WorkplaceState")
    private String WorkplaceState;
    @SerializedName("WorkplaceCountry")
    private String WorkplaceCountry;
    @SerializedName("WorkplacePhone1")
    private String WorkplacePhone1;

    @SerializedName("WorkplacePhone2")
    private String WorkplacePhone2;

    public ModelGetWorkplaceByToken() {
    }

    public ModelGetWorkplaceByToken(String workplaceId, String workplaceName, String workplaceAddress1, String workplaceAddress2, String workplaceDistrict, String workplaceCity, String workplaceZipCode, String workplaceState, String workplaceCountry, String workplacePhone1, String workplacePhone2) {
        WorkplaceId = workplaceId;
        WorkplaceName = workplaceName;
        WorkplaceAddress1 = workplaceAddress1;
        WorkplaceAddress2 = workplaceAddress2;
        WorkplaceDistrict = workplaceDistrict;
        WorkplaceCity = workplaceCity;
        WorkplaceZipCode = workplaceZipCode;
        WorkplaceState = workplaceState;
        WorkplaceCountry = workplaceCountry;
        WorkplacePhone1 = workplacePhone1;
        WorkplacePhone2 = workplacePhone2;
    }

    public String getWorkplaceId() {
        return WorkplaceId;
    }

    public void setWorkplaceId(String workplaceId) {
        WorkplaceId = workplaceId;
    }

    public String getWorkplaceName() {
        return WorkplaceName;
    }

    public void setWorkplaceName(String workplaceName) {
        WorkplaceName = workplaceName;
    }

    public String getWorkplaceAddress1() {
        return WorkplaceAddress1;
    }

    public void setWorkplaceAddress1(String workplaceAddress1) {
        WorkplaceAddress1 = workplaceAddress1;
    }

    public String getWorkplaceAddress2() {
        return WorkplaceAddress2;
    }

    public void setWorkplaceAddress2(String workplaceAddress2) {
        WorkplaceAddress2 = workplaceAddress2;
    }

    public String getWorkplaceDistrict() {
        return WorkplaceDistrict;
    }

    public void setWorkplaceDistrict(String workplaceDistrict) {
        WorkplaceDistrict = workplaceDistrict;
    }

    public String getWorkplaceCity() {
        return WorkplaceCity;
    }

    public void setWorkplaceCity(String workplaceCity) {
        WorkplaceCity = workplaceCity;
    }

    public String getWorkplaceZipCode() {
        return WorkplaceZipCode;
    }

    public void setWorkplaceZipCode(String workplaceZipCode) {
        WorkplaceZipCode = workplaceZipCode;
    }

    public String getWorkplaceState() {
        return WorkplaceState;
    }

    public void setWorkplaceState(String workplaceState) {
        WorkplaceState = workplaceState;
    }

    public String getWorkplaceCountry() {
        return WorkplaceCountry;
    }

    public void setWorkplaceCountry(String workplaceCountry) {
        WorkplaceCountry = workplaceCountry;
    }

    public String getWorkplacePhone1() {
        return WorkplacePhone1;
    }

    public void setWorkplacePhone1(String workplacePhone1) {
        WorkplacePhone1 = workplacePhone1;
    }

    public String getWorkplacePhone2() {
        return WorkplacePhone2;
    }

    public void setWorkplacePhone2(String workplacePhone2) {
        WorkplacePhone2 = workplacePhone2;
    }
}
