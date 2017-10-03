package com.example.android.myorganizer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by dotre on 02.10.2017.
 */

public class TodayTaskAdapter extends BaseAdapter {
    LinkedList<TodayTask> list;
    LayoutInflater inflater;

    TodayTaskAdapter(Context context, LinkedList<TodayTask> list) {
        super();
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public TodayTask getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = inflater.inflate(R.layout.list_view, parent, false);
        TextView taskName = (TextView) rowView.findViewById(R.id.taskName);
        TextView taskDescription = (TextView) rowView.findViewById(R.id.taskDescription);
        TodayTask task = getItem(position);
        taskName.setText(task.getTaskName());
        taskDescription.setText(task.getTaskDescription());
        return rowView;
    }
}
