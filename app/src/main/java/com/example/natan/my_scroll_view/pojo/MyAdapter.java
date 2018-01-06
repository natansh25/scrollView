package com.example.natan.my_scroll_view.pojo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.natan.my_scroll_view.MainActivity;
import com.example.natan.my_scroll_view.R;

import java.util.List;

/**
 * Created by natan on 1/5/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<Numbers> mNumbers;

    public MyAdapter(List<Numbers> numbers) {
        mNumbers = numbers;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Numbers numbers = mNumbers.get(position);
        holder.txt_view.setText(String.valueOf(numbers.getNum()));

    }

    @Override
    public int getItemCount() {
        return mNumbers.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txt_view;


        public MyViewHolder(View itemView) {
            super(itemView);

            txt_view = itemView.findViewById(R.id.textView);


        }
    }
}
