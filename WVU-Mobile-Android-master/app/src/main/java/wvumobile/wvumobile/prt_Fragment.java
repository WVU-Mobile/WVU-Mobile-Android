package wvumobile.wvumobile;

import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.*;
import android.os.StrictMode;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;

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

import android.graphics.drawable.*;

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
        ActionBar actionBar = ((ActionBarActivity)getActivity()).getSupportActionBar();
        actionBar.setTitle("PRT");
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Long timestamp = System.currentTimeMillis()/1000L;
        String url = "https://prtstatus.wvu.edu/api/"+(timestamp)+"?format=json";
        JSONParser jParse = new JSONParser();
        JSONObject prtJSON = jParse.getJSONFromUrl(url);
        rootview = inflater.inflate(R.layout.prt_layout, container, false);

        try
        {
            TextView status = (TextView) rootview.findViewById(R.id.prt_status_text);
            TextView message = (TextView) rootview.findViewById(R.id.prt_schedule_text);
            message.setText(prtJSON.getString("message"));
            ImageView img = (ImageView) rootview.findViewById(R.id.prt_status_image);
            TableRow row = (TableRow) rootview.findViewById(R.id.prt_Img_background);

            switch(prtJSON.getInt("status"))
            {
                case 1:
                    status.setText("O N L I N E");
                    status.setTextColor(getResources().getColor(R.color.ColorGreen));
                    Drawable check = getResources().getDrawable(R.drawable.check);
                    img.setImageDrawable(check);
                    img.setBackgroundColor(getResources().getColor(R.color.ColorGreen));
                    row.setBackgroundColor(getResources().getColor(R.color.ColorGreen));
                    break;
                case 2: case 5: case 6: case 10:
                    status.setText("W A R N I N G");
                    status.setTextColor(getResources().getColor(R.color.ColorOrange));
                    Drawable yield = getResources().getDrawable(R.drawable.yield);
                    img.setImageDrawable(yield);
                    img.setBackgroundColor(getResources().getColor(R.color.ColorOrange));
                    row.setBackgroundColor(getResources().getColor(R.color.ColorOrange));

                break;
                case 4: case 8: case 9:
                    status.setText("O F F L I N E");
                    status.setTextColor(getResources().getColor(R.color.ColorPink));
                    Drawable stop = getResources().getDrawable(R.drawable.stop);
                    img.setImageDrawable(stop);
                    img.setBackgroundColor(getResources().getColor(R.color.ColorPink));
                    row.setBackgroundColor(getResources().getColor(R.color.ColorPink));
                break;
                default:
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