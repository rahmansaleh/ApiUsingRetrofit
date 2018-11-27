package com.rahman.main.apiusingretrofit;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Sijariemas on 11/21/2018.
 */

public class Activity_Home extends AppCompatActivity {

    @BindView(R.id.btn_gettoken) Button btn_getToken;
    @BindView(R.id.btn_detailcustomer) Button btn_detailCustomer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        Log.i("test", "to GitHub");

        btn_getToken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindahActivity("Get Token", getResources().getString(R.string.app_name), Activity_GetToken.class);
            }
        });

        btn_detailCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindahActivity("Detail Customer", getResources().getString(R.string.app_name), Activity_getCustomerDetailByToken.class);
            }
        });
    }

    private void pindahActivity (String title, String subtitle, Class activity){
        Intent i = new Intent(Activity_Home.this, activity);
        i.putExtra("title", title);
        i.putExtra("subtitle", subtitle);
        startActivity(i);
    }

}
