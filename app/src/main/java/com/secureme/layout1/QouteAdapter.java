package com.secureme.layout1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class QouteAdapter extends ArrayAdapter<QouteModel> {

    Context context;


    public QouteAdapter(Context _context, int resource, ArrayList<QouteModel> objects) {
        super(_context, resource, objects);
        this.context=_context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        QouteModel items=getItem(position);
        LayoutInflater inflater = (LayoutInflater) context .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.activity_row, parent, false);

        TextView auther_qoute=(TextView)rowView.findViewById(R.id.row_qaute_author_textview);
        TextView qoute=(TextView)rowView.findViewById(R.id.row_qaute_textview);

        auther_qoute.setText(items.getQoute_author());
        qoute.setText(items.getQoute());

        return rowView;
    }
}
