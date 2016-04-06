package com.secureme.layout1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Kumail on 4/6/2016.
 */
public class JsonParser {

    public ArrayList<QouteModel> getdataofqout() {

        httpClass myHttpClient = new httpClass();
        ArrayList<QouteModel> arrayList = new ArrayList<>();

        String strJson = "http://friendsfashion.net/android/Crawler/quotesJson.php?category=love";
        strJson = myHttpClient.httpGet(strJson);

        try {
            JSONObject jsonObject=new JSONObject(strJson);
            JSONArray jsonArray=jsonObject.getJSONArray("quotations");

            for (int i=0;i<jsonArray.length();i++)

            {
                QouteModel qouteModel=new QouteModel();

                JSONObject myData=jsonArray.getJSONObject(i);
                qouteModel.setQoute(myData.getString("quote"));
                qouteModel.setQoute_author(myData.getString("author_name"));

                arrayList.add(qouteModel);
            }



        } catch (JSONException e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}
