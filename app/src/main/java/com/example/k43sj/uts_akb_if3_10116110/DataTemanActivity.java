package com.example.k43sj.uts_akb_if3_10116110;

/*
 * 20 Mei 2019
 * 10116110
 * Muhamad Ibnu Tri Yuono
 * IF-3
*/

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.k43sj.uts_akb_if3_10116110.presenter.MahasiswaAdapter;
import com.example.k43sj.uts_akb_if3_10116110.model.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class DataTemanActivity extends AppCompatActivity{

    ViewPager viewPager;
    MahasiswaAdapter adapter;
    List<Mahasiswa> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_teman);

        models = new ArrayList<>();
        models.add(new Mahasiswa(R.drawable.person_dummy, "10116132", "Rafli Rachmawandi","IF-3","08112004240","rafli060392@gmail.com","rafli_rach"));
        models.add(new Mahasiswa(R.drawable.person_dummy, "10116102", "Mochamad Rizki Ramadhan","IF-3","08222004240","rafli060392@gmail.com","rafli_rach"));
        models.add(new Mahasiswa(R.drawable.person_dummy, "10116110", "Muhamad Ibnu Tri Yuono","IF-3","081312923780","rafli060392@gmail.com","rafli_rach"));
        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DataTemanActivity.this, TambahDataTeman.class);
                models.add(new Mahasiswa(R.drawable.person_dummy, "10116110", "Muhamad Ibnu Tri Yuono","IF-3","081312923780","rafli060392@gmail.com","ibnutriyuono"));
                adapter.notifyDataSetChanged();
                startActivity(intent);
            }
        });

        findViewById(R.id.fabdelete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                models.remove(viewPager.getCurrentItem());
                adapter.notifyDataSetChanged();
                viewPager = findViewById(R.id.viewPager);
                viewPager.setAdapter(adapter);
            }
        });
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if(extras != null){
//            Toast.makeText(this,extras.getString("key"),Toast.LENGTH_SHORT).show();
            String getNim = extras.getString("nimMasuk");
            String getNama = extras.getString("namaMasuk");
            String getKelas = extras.getString("kelasMasuk");
            String getTelepon = extras.getString("telephoneMasuk");
            String getEmail = extras.getString("emailMasuk");
            String getInstagram = extras.getString("instagramMasuk");
            models.add(new Mahasiswa(R.drawable.person_dummy, getNim,getNama,getKelas,
                    getTelepon,getEmail,getInstagram));

        }

        adapter = new MahasiswaAdapter(models, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 0, 130, 0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.colorPrimary),
                getResources().getColor(R.color.colorPrimary),
                getResources().getColor(R.color.colorAccent),
                getResources().getColor(R.color.design_default_color_primary)
        };

        colors = colors_temp;
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapter.getCount() -1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                }

                else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }
}
