package com.example.a10119245latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BiodataActivity extends AppCompatActivity {

    @BindView(R.id.input_nama)
    EditText nama;

    final Context context = this;

    public static final String ID_EXTRA_MSG = "com.example.a10119245latihan3.MESSAGE";

    private String namaBiodata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSelanjutnya)
    void selanjutnya(View view) {

        namaBiodata = nama.getText().toString();

        Intent intent = new Intent(this, SayHaiActivity.class);
        intent.putExtra(ID_EXTRA_MSG, namaBiodata);
        startActivity(intent);
    }
}

/*
Tanggal Pengerjaan 27 April 2022
NIM   : 1019145
Nama  : Apid Haryana
Kelas : IF - 6
 */