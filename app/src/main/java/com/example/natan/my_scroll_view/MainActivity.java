package com.example.natan.my_scroll_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.natan.my_scroll_view.pojo.MyAdapter;
import com.example.natan.my_scroll_view.pojo.Numbers;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    MyAdapter mMyAdapter;
    ArrayList<Numbers> mNumbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mMyAdapter = new MyAdapter(mNumbers);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mMyAdapter);
        add();


    }

    private void add() {

        for(int i=0;i<200;i++)
        {
            Numbers numbers=new Numbers(i);
            mNumbers.add(numbers);
            mMyAdapter.notifyDataSetChanged();
        }

    }
}
