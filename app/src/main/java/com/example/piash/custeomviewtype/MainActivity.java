package com.example.piash.custeomviewtype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    private RAdapter adapter;
    private List<String > names = new ArrayList<>();
    private Button btm;
    int layoutchange = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.RVTesting);
        btm =(Button)findViewById(R.id.btnlayout);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        for (int i = 0; i <20 ; i++) {

            names.add("Hello world"+i);
        }
        adapter = new RAdapter(getApplicationContext(), names);
        adapter.setLayout(2);
        recyclerView.setAdapter(adapter);

        btm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (layoutchange == 0){

                            adapter.setLayout(1);
                            recyclerView.setAdapter(adapter);
                            layoutchange = 1;
                        }
                        else {

                            adapter.setLayout(2);
                            recyclerView.setAdapter(adapter);
                            layoutchange = 0;
                        }

                    }
                }
        );

    }
}
