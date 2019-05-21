package com.example.k43sj.uts_akb_if3_10116110.presenter;

/*
 * 20 Mei 2019
 * 10116110
 * Muhamad Ibnu Tri Yuono
 * IF-3
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.k43sj.uts_akb_if3_10116110.DetailActivity;
import com.example.k43sj.uts_akb_if3_10116110.R;
import com.example.k43sj.uts_akb_if3_10116110.model.Mahasiswa;

import java.util.List;

public class MahasiswaAdapter extends PagerAdapter {
    private List<Mahasiswa> models;
    private LayoutInflater layoutInflater;
    private Context context;
    ViewPager viewPager;

    public MahasiswaAdapter(List<Mahasiswa> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item, container, false);
        ImageView imageView;
        TextView nim,nama,kelas,telephone,email,instagram;
        imageView = view.findViewById(R.id.image);
        nim = view.findViewById(R.id.nim);
        nama = view.findViewById(R.id.nama);
        kelas = view.findViewById(R.id.kelas);
        email = view.findViewById(R.id.email);
        telephone = view.findViewById(R.id.telephone);
        instagram = view.findViewById(R.id.instagram);

        nim.setText(models.get(position).getNim());
        nama.setText(models.get(position).getNama());
        kelas.setText(models.get(position).getKelas());
        email.setText(models.get(position).getEmail());
        telephone.setText(models.get(position).getTelephone());
        instagram.setText(models.get(position).getInstagram());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent(context, DetailActivity.class);
                Bundle extras = new Bundle();
//                String key = String.valueOf(viewPager.getCurrentItem());
//                extras.putString("key", key);
                extras.putString("nim",models.get(position).getNim());
                extras.putString("nama",models.get(position).getNama());
                extras.putString("telephone",models.get(position).getTelephone());
                extras.putString("kelas",models.get(position).getKelas());
                extras.putString("email",models.get(position).getEmail());
                extras.putString("instagram",models.get(position).getInstagram());
                intent.putExtras(extras);
                context.startActivity(intent);
            }
        });
        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
