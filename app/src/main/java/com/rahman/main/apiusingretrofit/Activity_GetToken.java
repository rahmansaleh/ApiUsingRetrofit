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
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.rahman.main.apiusingretrofit.List.ListGetToken;
import com.rahman.main.apiusingretrofit.Retrofit.ApiClientInformasi;
import com.rahman.main.apiusingretrofit.Retrofit.ApiService;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Sijariemas on 11/19/2018.
 */

public class Activity_GetToken extends AppCompatActivity {
    private ApiService api = ApiClientInformasi.getClient().create(ApiService.class);
    private Boolean usernameStatus, passwordStatus;
    private String tag = Activity_GetToken.class.getName();
    private Bundle bundle;
    private ProgressDialog progressDialog;

    @BindView(R.id.txt_error_nama) TextView txt_errorNama;
    @BindView(R.id.txt_error_hp) TextView txt_errorHP;
    @BindView(R.id.txt_login) TextView txt_simpan;
    @BindView(R.id.txt_token) TextView txt_token;
    @BindView(R.id.rl_simpan) RelativeLayout rL_simpan;
    @BindView(R.id.et_username) EditText et_username;
    @BindView(R.id.et_password) EditText et_password;
    @BindView(R.id.pb_loading) ProgressBar pb_loading;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gettoken);
        ButterKnife.bind(this);

        progressDialog = new ProgressDialog(this);
        progressDialog.setIndeterminate(false);
        progressDialog.setCancelable(false);

        usernameStatus = false;
        passwordStatus = false;

        bundle = getIntent().getExtras();
        assert bundle != null;

        initActionBar(
                bundle.getString("title"),
                bundle.getString("subtitle")
        );



        et_username.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                usernameStatus = (!TextUtils.isEmpty(et_username.getText().toString().trim())) && (et_username.getText().toString().trim().length() > 0);
                cekInput();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        et_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                passwordStatus = (!TextUtils.isEmpty(et_password.getText().toString().trim())) && (et_password.getText().toString().trim().length() > 0);
                cekInput();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        rL_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getTokenByUsernamePassword(et_username.getText().toString().trim(), et_password.getText().toString().trim());
            }
        });

    }

    private void cekInput (){
        if (usernameStatus && passwordStatus){

            rL_simpan.setClickable(true);
            rL_simpan.setBackground(getResources().getDrawable(R.drawable.button_round_corner_blue));

        } else {

            rL_simpan.setClickable(false);
            rL_simpan.setBackground(getResources().getDrawable(R.drawable.button_round_corner_grey));
            Log.i(tag, "status all false");
            Log.i(tag, "username :"+usernameStatus);
            Log.i(tag, "passwordStatus :"+passwordStatus);

        }
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

    private void initActionBar (String title, String subTitle) {
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


    private void getTokenByUsernamePassword (String username, String password){
        progressDialog.setMessage("Menghubungi");
        progressDialog.setTitle("Loading");
        progressDialog.show();

        Call<ListGetToken> call = api.getToken("", "", "");
        call.enqueue(new Callback<ListGetToken>() {
            @Override
            public void onResponse(Call<ListGetToken> call, Response<ListGetToken> response) {

                if (response.code() == 200){

                    if (response.body().getSTATUS() == 1){
                        txt_token.setText(response.body().getREAD().get(0).getPin_token());
                    } else {

                        makeToast("Failed Something Error");

                    }

                } else {
                    makeToast("Failed Please Try Again Later");
                }
                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<ListGetToken> call, Throwable t) {
                progressDialog.dismiss();
                makeToast("Failed Error : "+t.getMessage());
            }
        });
    }

    private void makeToast (String message){
        Toast.makeText(getApplicationContext(),message, Toast.LENGTH_SHORT).show();
    }
}
