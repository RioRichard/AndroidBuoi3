package com.example.baibuoi3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rvMonHoc = (RecyclerView) findViewById(R.id.view1);
        MonHocAdapter adapter = new MonHocAdapter(MonHoc.LayDSMonHoc());
        rvMonHoc.setAdapter(adapter);
        rvMonHoc.setLayoutManager(new LinearLayoutManager(this));
//        for (MonHocAdapter.ViewHolder view:
//             adapter.) {
//            System.out.println(view.);
//        }
    }
}