package wvumobile.wvumobile;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
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
public class buses_Fragment extends Fragment implements  View.OnClickListener
{
    public final static String EXTRA_MESSAGE = "wvumobile.wvumobile.MESSAGE";

    View rootview;

    private TableRow b1;
    private TableRow b2;
    private TableRow b3;
    private TableRow b4;
    private TableRow b5;
    private TableRow b6;
    private TableRow b7;
    private TableRow b8;
    private TableRow b9;
    private TableRow b10;
    private TableRow b11;
    private TableRow b12;
    private TableRow b13;
    private TableRow b14;
    private TableRow b15;
    private TableRow b16;
    private TableRow b17;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.buses_layout, container, false);

        ActionBar actionBar = ((ActionBarActivity)getActivity()).getSupportActionBar();
        actionBar.setTitle("Buses");

        b1 = (TableRow) rootview.findViewById(R.id.b_1);
        b1.setOnClickListener(this);
        b2 = (TableRow) rootview.findViewById(R.id.b_2);
        b2.setOnClickListener(this);
        b3 = (TableRow) rootview.findViewById(R.id.b_3);
        b3.setOnClickListener(this);
        b4 = (TableRow) rootview.findViewById(R.id.b_4);
        b4.setOnClickListener(this);
        b5 = (TableRow) rootview.findViewById(R.id.b_5);
        b5.setOnClickListener(this);
        b6 = (TableRow) rootview.findViewById(R.id.b_6);
        b6.setOnClickListener(this);
        b7 = (TableRow) rootview.findViewById(R.id.b_7);
        b7.setOnClickListener(this);
        b8 = (TableRow) rootview.findViewById(R.id.b_8);
        b8.setOnClickListener(this);
        b9 = (TableRow) rootview.findViewById(R.id.b_9);
        b9.setOnClickListener(this);
        b10 = (TableRow) rootview.findViewById(R.id.b_10);
        b10.setOnClickListener(this);
        b11 = (TableRow) rootview.findViewById(R.id.b_11);
        b11.setOnClickListener(this);
        b12 = (TableRow) rootview.findViewById(R.id.b_12);
        b12.setOnClickListener(this);
        b13 = (TableRow) rootview.findViewById(R.id.b_13);
        b13.setOnClickListener(this);
        b14 = (TableRow) rootview.findViewById(R.id.b_14);
        b14.setOnClickListener(this);
        b15 = (TableRow) rootview.findViewById(R.id.b_15);
        b15.setOnClickListener(this);
        b16 = (TableRow) rootview.findViewById(R.id.b_16);
        b16.setOnClickListener(this);
        b17 = (TableRow) rootview.findViewById(R.id.b_17);
        b17.setOnClickListener(this);

        return rootview;
    }

    public void onClick(View v)
    {
        Intent intent = new Intent(getActivity(), BusActivity.class);
        int routeID = 0;

        switch(v.getId())
        {
            case R.id.b_1:
                routeID = 1;
                break;
            case R.id.b_2:
                routeID = 2;
                break;
            case R.id.b_3:
                routeID = 3;
                break;
            case R.id.b_4:
                routeID = 4;
                break;
            case R.id.b_5:
                routeID = 5;
                break;
            case R.id.b_6:
                routeID = 6;
                break;
            case R.id.b_7:
                routeID = 7;
                break;
            case R.id.b_8:
                routeID = 8;
                break;
            case R.id.b_9:
                routeID = 9;
                break;
            case R.id.b_10:
                routeID = 10;
                break;
            case R.id.b_11:
                routeID = 11;
                break;
            case R.id.b_12:
                routeID = 12;
                break;
            case R.id.b_13:
                routeID = 13;
                break;
            case R.id.b_14:
                routeID = 14;
                break;
            case R.id.b_15:
                routeID = 15;
                break;
            case R.id.b_16:
                routeID = 16;
                break;
            case R.id.b_17:
                routeID = 17;
                break;
            default:
                break;

        }
        intent.putExtra(EXTRA_MESSAGE, routeID);
        startActivity(intent);
    }
}
