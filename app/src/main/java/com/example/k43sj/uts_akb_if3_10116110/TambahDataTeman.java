package com.example.k43sj.uts_akb_if3_10116110;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TambahDataTeman extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data_teman);
    }

    public void sendData(View view) {
        EditText nim = findViewById(R.id.nim);
        EditText nama = findViewById(R.id.nama);
        EditText kelas = findViewById(R.id.kelas);
        EditText telephone = findViewById(R.id.telephone);
        EditText email = findViewById(R.id.email);
        EditText instagram = findViewById(R.id.instagram);

        Intent intent = new Intent(TambahDataTeman.this, DataTemanActivity.class);
        Bundle bundle = new Bundle();

        bundle.putString("nimMasuk",nim.getText().toString());
        bundle.putString("namaMasuk",nama.getText().toString());
        bundle.putString("telephoneMasuk",telephone.getText().toString());
        bundle.putString("kelasMasuk",kelas.getText().toString());
        bundle.putString("emailMasuk",email.getText().toString());
        bundle.putString("instagramMasuk",instagram.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);

    }
}
