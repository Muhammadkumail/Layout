package com.secureme.layout1;

import java.util.ArrayList;

/**
 * Created by Kumail on 4/6/2016.
 */
public class QouteDataSource {
    public ArrayList<QouteModel> getlist()
    {
        JsonParser jsonParser=new JsonParser();

        return jsonParser.getdataofqout();

    }


}
