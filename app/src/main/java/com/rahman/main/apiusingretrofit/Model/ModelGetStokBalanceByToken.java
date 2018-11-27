package com.rahman.main.apiusingretrofit.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sijariemas on 11/20/2018.
 */

public class ModelGetStokBalanceByToken {
    @SerializedName("WorkplaceId")
    private String WorkplaceId;
    @SerializedName("WorkplaceName")
    private String WorkplaceName;
    @SerializedName("ProductId")
    private String ProductId;
    @SerializedName("Stock")
    private String Stock;

    public ModelGetStokBalanceByToken() {
    }

    public ModelGetStokBalanceByToken(String workplaceId, String workplaceName, String productId, String stock) {
        WorkplaceId = workplaceId;
        WorkplaceName = workplaceName;
        ProductId = productId;
        Stock = stock;
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

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getStock() {
        return Stock;
    }

    public void setStock(String stock) {
        Stock = stock;
    }
}
