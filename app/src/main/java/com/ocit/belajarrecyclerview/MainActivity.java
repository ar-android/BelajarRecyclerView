package com.ocit.belajarrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<ModelData> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new ArrayList<>();

        data.add(new ModelData("Ahmad rosid", "ganteng dan pinter", "gambar"));
        data.add(new ModelData("Ahmad rosid", "ganteng dan pinter", "gambar"));
        data.add(new ModelData("Ahmad rosid", "ganteng dan pinter", "gambar"));
        data.add(new ModelData("Ahmad rosid", "ganteng dan pinter", "gambar"));
        data.add(new ModelData("Ahmad rosid", "ganteng dan pinter", "gambar"));
        data.add(new ModelData("Ahmad rosid", "ganteng dan pinter", "gambar"));
        data.add(new ModelData("Ahmad rosid", "ganteng dan pinter", "gambar"));
        data.add(new ModelData("Ahmad rosid", "ganteng dan pinter", "gambar"));
        data.add(new ModelData("Ahmad rosid", "ganteng dan pinter", "gambar"));
        data.add(new ModelData("Ahmad rosid", "ganteng dan pinter", "gambar"));

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        AdapterRV adapterRV = new AdapterRV(data);
        rv.setAdapter(adapterRV);
    }
}
