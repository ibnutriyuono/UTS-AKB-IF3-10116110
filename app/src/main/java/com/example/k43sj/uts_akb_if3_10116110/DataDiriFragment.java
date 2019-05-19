package com.example.k43sj.uts_akb_if3_10116110;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.example.k43sj.uts_akb_if3_10116110.R.layout.data_diri_layout;

public class DataDiriFragment extends Fragment {
    public DataDiriFragment(){
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.data_diri_layout, container, false);
    }

}
