package com.secureme.layout1;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.ArrayList;

public class QouteActivity extends AppCompatActivity {

    QouteDataSource qouteDataSource;
    ArrayList<QouteModel> arrayList;
    Context context;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        context=this;
        new get_data().execute();
        YoYo.with(Techniques.BounceIn)
                .duration(1000)
                .playOn(findViewById(R.id.detail_layut));

    }

    private class get_data extends AsyncTask<Void,Void,Void>
    {

        @Override
        protected void onPreExecute() {
            arrayList =new ArrayList<>();
            qouteDataSource=new QouteDataSource();
            super.onPreExecute();
        }
        @Override
        protected Void doInBackground(Void... params) {
            arrayList=   qouteDataSource.getlist();
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            listView=(ListView) findViewById(R.id.detail_listview);
            QouteAdapter qouteAdapter=new QouteAdapter(context,R.layout.activity_row,arrayList);
            listView.setAdapter(qouteAdapter);


            super.onPostExecute(aVoid);
        }
    }
}
