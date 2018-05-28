package com.example.a16022809.taskmanager;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    int reqCode = 12345;
    Button btnAddTask;
    ListView lv;
    ArrayAdapter aa;
    ArrayList<Task> al;
    ArrayList<String> alString;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAddTask = (Button) findViewById(R.id.btnAddTask);
        lv = (ListView)findViewById(R.id.lv);
        db = new DBHelper(this);
        db.getWritableDatabase();

        al = db.getAllTasks();
        db.close();

        aa = new TaskAdapter(this, R.layout.task_row, al);
        lv.setAdapter(aa);

        btnAddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,
                        AddActivity.class);
                startActivityForResult(intent, 9);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent Data) {
        super.onActivityResult(requestCode, resultCode, Data);
        if(resultCode == RESULT_OK && requestCode == 9) {
            lv.performClick();
        }
    }
}
