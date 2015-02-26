package wvumobile.wvumobile;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.*;
import android.os.StrictMode;
import android.widget.ImageView;

import org.apache.http.*;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
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
    ImageView statusImageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Long timestamp = System.currentTimeMillis()/1000L;
        String url = "https://prtstatus.wvu.edu/api/"+(timestamp)+"?format=json";
        JSONParser jParse = new JSONParser();
        JSONObject prtJSON = jParse.getJSONFromUrl(url);
        rootview = inflater.inflate(R.layout.prt_layout, container, false);

        try
        {
            switch(prtJSON.getInt("status"))
            {
                case 1:
                    // PRT is online
                   // statusImageView = (ImageView) findViewById(R.id.prt_status_image);

                    break;
                case 2: case 5: case 6: case 10:
                    // PRT is closed
                    break;
                case 4: case 8: case 9:
                    //PRT is down
                    break;
                default:
                    //default: PRT is online
                    break;


            }
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }

        return rootview;
    }
}
