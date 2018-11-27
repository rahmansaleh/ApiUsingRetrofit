package com.rahman.main.apiusingretrofit;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.rahman.main.apiusingretrofit.List.ListGetCustomerByToken;
import com.rahman.main.apiusingretrofit.Model.ModelGetCustomerByToken;
import com.rahman.main.apiusingretrofit.Retrofit.ApiClientInformasi;
import com.rahman.main.apiusingretrofit.Retrofit.ApiService;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Sijariemas on 11/20/2018.
 */

public class Activity_getCustomerDetailByToken extends AppCompatActivity{
    private ApiService api = ApiClientInformasi.getClient().create(ApiService.class);
    private Boolean tokenStatus, idStatus, allDataStatus;
    private String tag = Activity_getCustomerDetailByToken.class.getName();
    private ProgressDialog progressDialog;
    private Bundle bundle;

    @BindView(R.id.et_token) EditText et_token;
    @BindView(R.id.et_id) EditText et_id;
    @BindView(R.id.et_WorkplaceId) EditText et_workplaceId;
    @BindView(R.id.et_CustomerName) EditText et_customerName;
    @BindView(R.id.et_CustomerId) EditText et_CustomerId;
    @BindView(R.id.et_BarcodeId) EditText et_BarcodeId;
    @BindView(R.id.et_CustomerCity) EditText et_customerCity;
    @BindView(R.id.et_CustomerZipCode) EditText et_customerZipCode;
    @BindView(R.id.et_CustomerState) EditText et_customerState;
    @BindView(R.id.et_CustomerCountry) EditText et_customerCountry;
    @BindView(R.id.et_CustomerPhone1) EditText et_customerPhone1;
    @BindView(R.id.et_CustomerPhone2) EditText et_customerPhone2;
    @BindView(R.id.et_CustomerHandphone) EditText et_customerHandphone;

    @BindView(R.id.rl_updateCustomer) RelativeLayout rl_update;
    @BindView(R.id.rl_searchbytoken) RelativeLayout rl_searchByToken;
    @BindView(R.id.rl_searchbyid) RelativeLayout rl_searchById;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerdetail);
        ButterKnife.bind(this);

        tokenStatus = false;
        idStatus = false;
        allDataStatus = false;

        progressDialog = new ProgressDialog(this);
        progressDialog.setIndeterminate(false);
        progressDialog.setCancelable(false);

        bundle = getIntent().getExtras();
        assert bundle != null;

        setClickableSearchByToken();
        setClickableSearchById();
        setClickableUpdateData();
        setTextWatcherFromToken();
        setTextWatcherFromId();
        setTextWatcherFromAllData();
        initActionBar(
                bundle.getString("title"),
                bundle.getString("subtitle")
        );


        rl_searchByToken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData("", et_token.getText().toString().trim());
            }
        });

        rl_searchById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData(et_id.getText().toString().trim(), "");
            }
        });

        rl_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void initActionBar (String title, String subTitle){
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_arrow_left);
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(title);
        actionBar.setSubtitle(subTitle);
        actionBar.setElevation(0);
    }

    private void setTextWatcherFromToken (){
        et_token.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tokenStatus = (!TextUtils.isEmpty(et_token.getText().toString().trim())) && (et_token.getText().toString().trim().length() > 0);
                setClickableSearchByToken();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void setTextWatcherFromId (){
        et_id.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                idStatus = (!TextUtils.isEmpty(et_id.getText().toString().trim())) && (et_id.getText().toString().trim().length() > 0);
                setClickableSearchById();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void setTextWatcherFromAllData (){

    }

    private void setClickableSearchByToken (){
        if (tokenStatus){
            rl_searchByToken.setClickable(true);
            rl_searchByToken.setBackground(getResources().getDrawable(R.drawable.button_round_corner_blue));
        } else {
            rl_searchByToken.setClickable(false);
            rl_searchByToken.setBackground(getResources().getDrawable(R.drawable.button_round_corner_grey));
        }
    }

    private void setClickableSearchById (){
        if (idStatus){
            rl_searchById.setClickable(true);
            rl_searchById.setBackground(getResources().getDrawable(R.drawable.button_round_corner_blue));
        } else {
            rl_searchById.setClickable(false);
            rl_searchById.setBackground(getResources().getDrawable(R.drawable.button_round_corner_grey));
        }
    }

    private void setClickableUpdateData (){
        if (allDataStatus){
            rl_update.setClickable(true);
            rl_update.setBackground(getResources().getDrawable(R.drawable.button_round_corner_blue));
        } else {
            rl_update.setClickable(false);
            rl_update.setBackground(getResources().getDrawable(R.drawable.button_round_corner_grey));
        }
    }

    private void getData (String id, String token){
        progressDialog.setMessage("Menghubungi");
        progressDialog.setTitle("Loading");
        progressDialog.show();

        Call<ListGetCustomerByToken> call = api.getCustomerByToken("CustomerDetail", id, token);
        call.enqueue(new Callback<ListGetCustomerByToken>() {
            @Override
            public void onResponse(Call<ListGetCustomerByToken> call, Response<ListGetCustomerByToken> response) {

                if (response.code() == 200){

                    if (response.body().getSTATUS() == 1){
                        setData(response.body().getREAD().get(0));
                    } else {
                        makeToast("Failed Something Error");
                    }

                } else {
                    makeToast("Failed Please Try Again Later");
                }

                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<ListGetCustomerByToken> call, Throwable t) {
                progressDialog.dismiss();
                makeToast("Failed Error : "+t.getMessage());
            }
        });
    }

    private void setData (ModelGetCustomerByToken model){
        et_workplaceId.setText(model.getWorkplaceId());
        et_customerName.setText(model.getCustomerName());
        et_CustomerId.setText(model.getCustomerCity());
        et_BarcodeId.setText(model.getBarcodeId());
        et_customerCity.setText(model.getCustomerCity());
        et_customerZipCode.setText(model.getCustomerZipCode());
        et_customerState.setText(model.getCustomerState());
        et_customerCountry.setText(model.getCustomerCountry());
        et_customerPhone1.setText(model.getCustomerPhone1());
        et_customerPhone2.setText(model.getCustomerPhone2());
        et_customerHandphone.setText(model.getCustomerHandphone());
    }

    private void makeToast (String message){
        Toast.makeText(getApplicationContext(),message, Toast.LENGTH_SHORT).show();
    }
}
