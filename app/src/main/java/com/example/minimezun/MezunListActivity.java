package com.example.minimezun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MezunListActivity extends AppCompatActivity {

    private ArrayList<Mezun> mMezunList;

    private RecyclerView mRecyclerView;
    private MezunRecyclerViewAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mezun_list);

        // Verileri burada doldurun
        mMezunList = new ArrayList<>();
        mMezunList.add(new Mezun("Ali", "İstanbul", "2020"));
        mMezunList.add(new Mezun("Ayşe", "Ankara", "2021"));
        mMezunList.add(new Mezun("Ahmet", "İzmir", "2019"));

        mRecyclerView = findViewById(R.id.recycler_view_mezun_list);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new MezunRecyclerViewAdapter(mMezunList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MezunRecyclerViewAdapter adapter = new MezunRecyclerViewAdapter(mMezunlar);
        recyclerView.setAdapter(adapter);
    }
}