package wvumobile.wvumobile;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.*;

import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.*;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by jeremydole on 2/4/15.
 */
public class prt_Fragment extends Fragment
{
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        Timestamp timestamp = new Timestamp(Calendar.getInstance().getTime().getTime());
        String url = "https://prtstatus.wvu.edu/api/"+(timestamp.getTime())+"?format=json";
        JSONParser jParse = new JSONParser();
        JSONObject prtJSON = jParse.getJSONFromUrl(url);
        rootview = inflater.inflate(R.layout.prt_layout, container, false);



        return rootview;
    }
}
