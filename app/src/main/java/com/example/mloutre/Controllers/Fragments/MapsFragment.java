package com.example.mloutre.Controllers.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mloutre.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapsFragment extends Fragment {


    public static MapsFragment newInstance() {
        return (new MapsFragment());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_maps, container, false);
    }

}

