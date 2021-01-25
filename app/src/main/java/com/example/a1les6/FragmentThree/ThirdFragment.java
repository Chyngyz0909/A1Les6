package com.example.a1les6.FragmentThree;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a1les6.R;


public class ThirdFragment extends Fragment {

TextView textView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = view.findViewById(R.id.text2);
        textView.setText("fjfkyl;iu;ug;ug;uydweyw8dugxbzhxvsyg\nciouhosjzxhzvhxiudouhoc" +
                "\nsgcsyfcisyfcisgcsgsgcscgosucosgcslgcvdjhoeldjbljvhldv!@#" +
                "\n$%^&*()_ldvld");
    }
}