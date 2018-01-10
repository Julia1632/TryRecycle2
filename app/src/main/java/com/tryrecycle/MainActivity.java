package com.tryrecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Info> info10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        RecyclerView rv=(RecyclerView) findViewById(R.id.recycle_view);
       // rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        rv.setAdapter(new InfoRecycleAdapter(info10));



    }



    private void init() {
        info10=new ArrayList<>();
        info10.add(new Info("1name","1s"));
        info10.add(new Info("2name","2s"));
        info10.add(new Info("3name","3s"));
        info10.add(new Info("4name","4s"));
        info10.add(new Info("5name","5s"));
        info10.add(new Info("6name","6s"));
        info10.add(new Info("7name","7s"));
        info10.add(new Info("8name","8s"));
        info10.add(new Info("9name","9s"));
        info10.add(new Info("1name","1s"));
        info10.add(new Info("2name","2s"));
        info10.add(new Info("3name","3s"));
        info10.add(new Info("4name","4s"));
        info10.add(new Info("5name","5s"));
        info10.add(new Info("6name","6s"));
        info10.add(new Info("7name","7s"));
        info10.add(new Info("8name","8s"));
        info10.add(new Info("9name","9s"));

    }

    
}

