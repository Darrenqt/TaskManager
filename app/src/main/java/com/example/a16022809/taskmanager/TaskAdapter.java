package com.example.a16022809.taskmanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TaskAdapter extends ArrayAdapter<Task>{
    ArrayList<Task> aa;
    Context context;
    ArrayList<Task> tasks;
    int resource;
    TextView tvName, tvDescription;


    public TaskAdapter(Context context, int resource, ArrayList<Task> tasks) {
        super(context, resource, tasks);
        this.context = context;
        this.tasks = tasks;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.task_row, parent, false);

        tvName = (TextView)rowView.findViewById(R.id.tvName);
        tvDescription = (TextView)rowView.findViewById(R.id.tvDescription);


        return rowView;
    }
}