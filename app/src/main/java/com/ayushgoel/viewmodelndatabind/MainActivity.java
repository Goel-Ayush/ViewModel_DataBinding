package com.ayushgoel.viewmodelndatabind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TaskAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.list);
        mAdapter = new TaskAdapter(this, new ArrayList<TaskEntry>() );
        listView.setAdapter(mAdapter);
        //bind mAdapter;
        TaskEntry taskEntry = new TaskEntry("desc1",1);
//        TaskDAO.insert(taskEntry);
    }
}
