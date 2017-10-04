package com.example.android.myorganizer;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    LinkedList<TodayTask> list;
    TodayTaskAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new LinkedList<TodayTask>();
        listView = (ListView) findViewById(R.id.main_list);
        list.add(new TodayTask("Take care of your teeth", "Brushing", new GregorianCalendar(2017, 10, 10, 7, 0)));
        list.add(new TodayTask("Breakfast", "Eat breakfast", new GregorianCalendar(2017, 10, 10, 7, 15)));
        list.add(new TodayTask("Morning jogging", "Go to morning jogging", new GregorianCalendar(2017, 10, 10, 7, 30)));
        list.add(new TodayTask("Shower after jogging", "You have to be clean", new GregorianCalendar(2017, 10, 10, 8, 30)));
        list.add(new TodayTask("Work work work work work work", "Go to work!", new GregorianCalendar(2017, 10, 10, 9, 0)));
        adapter = new TodayTaskAdapter(this, list);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu_app,menu);
        return true;
    }
}

