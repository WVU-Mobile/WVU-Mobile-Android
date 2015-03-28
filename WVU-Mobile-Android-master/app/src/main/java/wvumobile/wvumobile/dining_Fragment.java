package wvumobile.wvumobile;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;
import android.widget.TableRow;
import android.app.Activity;
import android.content.Intent;

import java.net.URI;
import java.util.Calendar;


/**
 * Created by jeremydole on 2/4/15.
 */


public class dining_Fragment extends Fragment implements  View.OnClickListener
{
    public final static String EXTRA_MESSAGE = "wvumobile.wvumobile.MESSAGE";

    View rootview;
    private TableRow row_CE;
    private TableRow row_SC;
    private TableRow row_AD;
    private TableRow row_BB;
    private TableRow row_TR;
    private TableRow row_HF;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        rootview = inflater.inflate(R.layout.dining_layout, container, false);

        row_CE = (TableRow) rootview.findViewById(R.id.d_CafeEvansdale);
        row_CE.setOnClickListener(this);
        row_SC = (TableRow) rootview.findViewById(R.id.d_SummitCafe);
        row_SC.setOnClickListener(this);
        row_AD = (TableRow) rootview.findViewById(R.id.d_ArnoldsDiner);
        row_AD.setOnClickListener(this);
        row_BB = (TableRow) rootview.findViewById(R.id.d_BoremanBistro);
        row_BB.setOnClickListener(this);
        row_TR = (TableRow) rootview.findViewById(R.id.d_TerraceRoom);
        row_TR.setOnClickListener(this);
        row_HF = (TableRow) rootview.findViewById(R.id.d_Hatfields);
        row_HF.setOnClickListener(this);

        return rootview;



    }

    public void onClick(View v)
    {
       Intent intent = new Intent(getActivity(), DiningActivity.class);

        int locationID = 0;
        String urlMessage = "";
        Calendar date = Calendar.getInstance();
        Long timestamp = System.currentTimeMillis()/1000L;
        int day = date.get(Calendar.DAY_OF_MONTH);
        int month = date.get(Calendar.MONTH);
        int year = date.get(Calendar.YEAR);
        //Month is returned as an integer placeholder. January is returned as 0, February as 1, etc.
        // To get a correct date for the JSON object, we increment the month by one.
        month = month+1;
        switch(v.getId())
        {
            case R.id.d_CafeEvansdale:
                locationID = 1;
                urlMessage = "http://diningmenuservice.wvu.edu/"+locationID+"/"+month+"/"+day+"/"+year+"/"+timestamp+"/?callback=";
                break;
            case R.id.d_SummitCafe:
                locationID = 2;
                urlMessage = "http://diningmenuservice.wvu.edu/"+locationID+"/"+month+"/"+day+"/"+year+"/"+timestamp+"/?callback=";
                break;
            case R.id.d_ArnoldsDiner:
                locationID = 3;
                urlMessage = "http://diningmenuservice.wvu.edu/"+locationID+"/"+month+"/"+day+"/"+year+"/"+timestamp+"/?callback=";
                break;
            case R.id.d_BoremanBistro:
                locationID = 4;
                urlMessage = "http://diningmenuservice.wvu.edu/"+locationID+"/"+month+"/"+day+"/"+year+"/"+timestamp+"/?callback=";
                break;
            case R.id.d_TerraceRoom:
                locationID = 5;
                urlMessage = "http://diningmenuservice.wvu.edu/"+locationID+"/"+month+"/"+day+"/"+year+"/"+timestamp+"/?callback=";
                break;
            case R.id.d_Hatfields:
                locationID = 6;
                urlMessage = "http://diningmenuservice.wvu.edu/"+locationID+"/"+month+"/"+day+"/"+year+"/"+timestamp+"/?callback=";
                break;

        }
        intent.putExtra(EXTRA_MESSAGE, urlMessage);
        startActivity(intent);
    }




}
