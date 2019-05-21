package com.example.k43sj.uts_akb_if3_10116110;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.k43sj.uts_akb_if3_10116110.adapter.MahasiswaAdapter;
import com.example.k43sj.uts_akb_if3_10116110.model.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    List<Mahasiswa> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        EditText nim = findViewById(R.id.nim);
        EditText nama = findViewById(R.id.nama);
        EditText kelas = findViewById(R.id.kelas);
        EditText telephone = findViewById(R.id.telephone);
        EditText email = findViewById(R.id.email);
        EditText instagram = findViewById(R.id.instagram);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        nim.setText(extras.getString("nim"));
        nama.setText(extras.getString("nama"));
        kelas.setText(extras.getString("kelas"));
        telephone.setText(extras.getString("telephone"));
        email.setText(extras.getString("email"));
        instagram.setText(extras.getString("instagram"));
    }

    public void sendMessage(View view) {
        EditText nim = findViewById(R.id.nim);
        EditText nama = findViewById(R.id.nama);
        EditText kelas = findViewById(R.id.kelas);
        EditText telephone = findViewById(R.id.telephone);
        EditText email = findViewById(R.id.email);
        EditText instagram = findViewById(R.id.instagram);

        Intent intent = new Intent(DetailActivity.this, DataTemanActivity.class);
        Bundle bundle = new Bundle();

        bundle.putString("nimEdit",nim.getText().toString());
        bundle.putString("namaEdit",nama.getText().toString());
        bundle.putString("telephoneEdit",telephone.getText().toString());
        bundle.putString("kelasEdit",kelas.getText().toString());
        bundle.putString("emailEdit",email.getText().toString());
        bundle.putString("instagramEdit",instagram.getText().toString());
        intent.putExtras(bundle);

        startActivity(intent);
    }
}
