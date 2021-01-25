package com.example.a1les6.FragmentOne;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1les6.R;

import java.util.ArrayList;

public class FirstAdapter extends RecyclerView.Adapter<FirstAdapter.MainViewHolder> {



    ArrayList<String> list;

    public FirstAdapter() {
        list = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            list.add("Иван Иванов" + i);
        }
    }

    public void addText(String person) {
        list.add(person);
        notifyDataSetChanged();
    }

   @NonNull
    @Override
    public FirstAdapter.MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       LayoutInflater inflater = LayoutInflater.from(parent.getContext());
       View view = inflater.inflate(R.layout.item_list1, parent, false);
       return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FirstAdapter.MainViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        TextView firstName;
        TextView secondName;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);

            firstName = itemView.findViewById(R.id.firstName);
            secondName = itemView.findViewById(R.id.secondName);
        }

        public void onBind(String s) {
            firstName.setText(s);
        }
    }
}
