package com.ramanujaniss.satya.recyclerviewtest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    String[] templateName = {"Template 1", "Template 2", "Template 3", "Template 4",
            "Template 5"};

    int[] templateImages = {R.drawable.itype, R.drawable.iastro, R.drawable.itype, R.drawable.iastro,
            R.drawable.itype};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RECYCLER VIEW

        RecyclerView.LayoutManager layoutManager;
        layoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.templates_recyclerview);
        recyclerView.setLayoutManager(layoutManager);

        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.spacing);
        recyclerView.addItemDecoration(new SpacesItemDecoration(spacingInPixels));
        recyclerView.setHasFixedSize(true);

        TemplatesAdapter templatesAdapter = new TemplatesAdapter(this, templateName, templateImages);

        recyclerView.setAdapter(templatesAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());



    }
}
