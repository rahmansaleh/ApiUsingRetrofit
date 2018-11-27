package com.rahman.main.apiusingretrofit.Retrofit;

import com.rahman.main.apiusingretrofit.List.ListGetCustomerByToken;
import com.rahman.main.apiusingretrofit.List.ListGetStokBalanceByToken;
import com.rahman.main.apiusingretrofit.List.ListGetToken;
import com.rahman.main.apiusingretrofit.List.ListGetWorkplaceByToken;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Sijariemas on 9/26/2018.
 */

public interface ApiService {

    @FormUrlEncoded
    @POST("api.php")
    Call<ListGetToken> getToken(@Field("action") String action,
                                @Field("user_name") String user_name,
                                @Field("password") String password
    );

    @FormUrlEncoded
    @POST("api.php")
    Call<ListGetCustomerByToken> getCustomerByToken(@Field("action") String action,
                                                    @Field("id") String id,
                                                    @Field("token") String token
    );

    @FormUrlEncoded
    @POST("api.php")
    Call<ListGetStokBalanceByToken> getStokBalanceByToken(@Field("action") String action,
                                                          @Field("id") String id,
                                                          @Field("token") String token
    );

    @FormUrlEncoded
    @POST("api.php")
    Call<ListGetWorkplaceByToken> getWorkplaceByTOken(@Field("action") String action,
                                                      @Field("id") String id,
                                                      @Field("token") String token
    );

}
