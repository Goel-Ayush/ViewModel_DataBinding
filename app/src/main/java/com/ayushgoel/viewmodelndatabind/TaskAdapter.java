package com.ayushgoel.viewmodelndatabind;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class TaskAdapter extends ArrayAdapter {

    private ArrayList<TaskEntry> taskEntries;
    public TaskAdapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public TaskAdapter(Context context, ArrayList<TaskEntry> taskEntries) {
        super(context,0, taskEntries);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitemView = convertView;

        if(listitemView == null)

            listitemView = (View) LayoutInflater.from(getContext())
                    .inflate(R.layout.task_adapter,parent,false);




        return  listitemView;




    }
}
