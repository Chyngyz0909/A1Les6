package com.example.a1les6.FragmentOne;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a1les6.R;


public class FirstFragment extends Fragment {
    RecyclerView rv;
    FirstAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view  = inflater.inflate(R.layout.fragment_first,container, false);
        rv = view.findViewById(R.id.rv);
        recycler();
        return view;
    }

    private void recycler() {
        adapter = new FirstAdapter();
        rv.setAdapter(adapter);
    }
}