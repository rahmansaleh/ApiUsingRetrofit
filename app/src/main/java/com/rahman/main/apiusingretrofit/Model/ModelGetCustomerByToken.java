package com.rahman.main.apiusingretrofit.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sijariemas on 11/20/2018.
 */

public class ModelGetCustomerByToken {
    @SerializedName("WorkplaceId")
    private String WorkplaceId;
    @SerializedName("CustomerName")
    private String CustomerName;
    @SerializedName("CustomerId")
    private String CustomerId;
    @SerializedName("BarcodeId")
    private String BarcodeId;
    @SerializedName("CustomerCity")
    private String CustomerCity;
    @SerializedName("CustomerZipCode")
    private String CustomerZipCode;
    @SerializedName("CustomerState")
    private String CustomerState;
    @SerializedName("CustomerCountry")
    private String CustomerCountry;
    @SerializedName("CustomerPhone1")
    private String CustomerPhone1;
    @SerializedName("CustomerPhone2")
    private String CustomerPhone2;
    @SerializedName("CustomerHandphone")
    private String CustomerHandphone;

    public ModelGetCustomerByToken() {
    }

    public ModelGetCustomerByToken(String workplaceId, String customerName, String customerId, String barcodeId, String customerCity, String customerZipCode, String customerState, String customerCountry, String customerPhone1, String customerPhone2, String customerHandphone) {
        WorkplaceId = workplaceId;
        CustomerName = customerName;
        CustomerId = customerId;
        BarcodeId = barcodeId;
        CustomerCity = customerCity;
        CustomerZipCode = customerZipCode;
        CustomerState = customerState;
        CustomerCountry = customerCountry;
        CustomerPhone1 = customerPhone1;
        CustomerPhone2 = customerPhone2;
        CustomerHandphone = customerHandphone;
    }

    public String getWorkplaceId() {
        return WorkplaceId;
    }

    public void setWorkplaceId(String workplaceId) {
        WorkplaceId = workplaceId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public String getBarcodeId() {
        return BarcodeId;
    }

    public void setBarcodeId(String barcodeId) {
        BarcodeId = barcodeId;
    }

    public String getCustomerCity() {
        return CustomerCity;
    }

    public void setCustomerCity(String customerCity) {
        CustomerCity = customerCity;
    }

    public String getCustomerZipCode() {
        return CustomerZipCode;
    }

    public void setCustomerZipCode(String customerZipCode) {
        CustomerZipCode = customerZipCode;
    }

    public String getCustomerState() {
        return CustomerState;
    }

    public void setCustomerState(String customerState) {
        CustomerState = customerState;
    }

    public String getCustomerCountry() {
        return CustomerCountry;
    }

    public void setCustomerCountry(String customerCountry) {
        CustomerCountry = customerCountry;
    }

    public String getCustomerPhone1() {
        return CustomerPhone1;
    }

    public void setCustomerPhone1(String customerPhone1) {
        CustomerPhone1 = customerPhone1;
    }

    public String getCustomerPhone2() {
        return CustomerPhone2;
    }

    public void setCustomerPhone2(String customerPhone2) {
        CustomerPhone2 = customerPhone2;
    }

    public String getCustomerHandphone() {
        return CustomerHandphone;
    }

    public void setCustomerHandphone(String customerHandphone) {
        CustomerHandphone = customerHandphone;
    }
}
