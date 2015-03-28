package wvumobile.wvumobile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableRow;
import java.util.ArrayList;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;



public class map_Fragment extends android.support.v4.app.Fragment implements  View.OnClickListener
{
    private MapView mMapView;
    private GoogleMap mMap;
    private Bundle mBundle;
    private static ArrayList<Marker> markers = new ArrayList<Marker>() ;


    //Building Rows
    private Button MapSelect;
    private Button BuildingSelect;
    private TableRow MapRow;
    private TableRow TitleRow;
    private TableRow AELRow;
    private TableRow AGSRow;
    private TableRow ALHRow;
    private TableRow ARHRow;
    private TableRow ARMRow;
    private TableRow ARNRow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.map_layout, container, false);
        /*try
        {*/
            MapsInitializer.initialize(getActivity());
        /*}
        catch(GooglePlayServicesNotAvailableException e)
        {
            //do something
        }*/
        mMapView = (MapView) rootView.findViewById(R.id.WVUmap);
        mMapView.onCreate(mBundle);
        setUpMapIfNeeded(rootView);

        MapSelect = (Button) rootView.findViewById(R.id.map_mapButton);
        MapSelect.setOnClickListener(this);
        BuildingSelect = (Button) rootView.findViewById(R.id.map_buildingButton);
        BuildingSelect.setOnClickListener(this);
        MapRow = (TableRow) rootView.findViewById(R.id.mapRow);
        TitleRow = (TableRow) rootView.findViewById(R.id.locationTitles);
        TitleRow.setVisibility(View.GONE);
        AELRow = (TableRow) rootView.findViewById(R.id.AEL);
        AELRow.setOnClickListener(this);
        AELRow.setVisibility(View.GONE);
        AGSRow = (TableRow) rootView.findViewById(R.id.AGS);
        AGSRow.setOnClickListener(this);
        AGSRow.setVisibility(View.GONE);
        ALHRow = (TableRow) rootView.findViewById(R.id.ALH);
        ALHRow.setOnClickListener(this);
        ALHRow.setVisibility(View.GONE);
        ARHRow = (TableRow) rootView.findViewById(R.id.ARH);
        ARHRow.setOnClickListener(this);
        ARHRow.setVisibility(View.GONE);
        ARMRow = (TableRow) rootView.findViewById(R.id.ARM);
        ARMRow.setOnClickListener(this);
        ARMRow.setVisibility(View.GONE);
        ARNRow = (TableRow) rootView.findViewById(R.id.ARN);
        ARNRow.setOnClickListener(this);
        ARNRow.setVisibility(View.GONE);



        return rootView;
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mBundle = savedInstanceState;
    }

    private void setUpMapIfNeeded(View rootView)
    {
        if(mMap == null)
        {
            mMap = ((MapView) rootView.findViewById(R.id.WVUmap)).getMap();
            if(mMap!= null)
            {
                setUpMap();
            }
        }
    }

    private void setUpMap()
    {
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(39.6359503, -79.9459544), 13));
        mMap.addMarker(new MarkerOptions().position(new LatLng(39.634769,-79.953585)).title("Mountainlair"));
    }
    @Override
    public void onResume() {
        super.onResume();
        mMapView.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        mMapView.onPause();
    }

    @Override
    public void onDestroy() {
        mMapView.onDestroy();
        super.onDestroy();
    }

    public void onClick(View v)
    {
        Marker marker;
        switch(v.getId())
        {
            case R.id.map_mapButton:
                MapSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray2));
                BuildingSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray1));
                viewMap();
                break;
            case R.id.map_buildingButton:
                MapSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray1));
                BuildingSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray2));
                viewBuildings();
                break;
            case R.id.AEL:
                marker = mMap.addMarker(new MarkerOptions().position(new LatLng(39.645670, -79.974281)).title("Aerodynamics Laboratory"));
                if(checkMarker(marker))
                {
                    AELRow.setBackgroundColor(getResources().getColor(R.color.DarkestBlueColor));
                    marker.remove();
                }
                else
                {
                    AELRow.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray3));
                    markers.add(marker);
                }
                viewMap();
                break;
            case R.id.AGS:
                marker = mMap.addMarker(new MarkerOptions().position(new LatLng(39.645768,-79.969936)).title("Agricultural Sciences Building"));
                if(checkMarker(marker))
                {
                    AGSRow.setBackgroundColor(getResources().getColor(R.color.DarkestBlueColor));
                    marker.remove();
                }
                else
                {
                    AGSRow.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray3));
                    markers.add(marker);
                }
                viewMap();
                break;
            case R.id.ALH:
                marker = mMap.addMarker(new MarkerOptions().position(new LatLng(39.646186,-79.967245)).title("Allen Hall"));
                if(checkMarker(marker))
                {
                    ALHRow.setBackgroundColor(getResources().getColor(R.color.DarkestBlueColor));
                    marker.remove();
                }
                else
                {
                    ALHRow.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray3));
                    markers.add(marker);
                }
                viewMap();
                break;
            case R.id.ARH:
                marker = mMap.addMarker(new MarkerOptions().position(new LatLng(39.632486,-79.950469)).title("Arnold Hall"));
                if(checkMarker(marker))
                {
                    ARHRow.setBackgroundColor(getResources().getColor(R.color.DarkestBlueColor));
                    marker.remove();
                }
                else
                {
                    ARHRow.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray3));
                    markers.add(marker);
                }
                viewMap();
                break;
            case R.id.ARM:
                marker = mMap.addMarker(new MarkerOptions().position(new LatLng(39.635020,-79.955750)).title("Armstrong Hall"));
                if(checkMarker(marker))
                {
                    ARMRow.setBackgroundColor(getResources().getColor(R.color.DarkestBlueColor));
                    marker.remove();
                }
                else
                {
                    ARMRow.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray3));
                    markers.add(marker);
                }
                viewMap();
                break;
            case R.id.ARN:
                marker = mMap.addMarker(new MarkerOptions().position(new LatLng(39.632126,-79.950727)).title("Arnold Apartments"));
                if(checkMarker(marker))
                {
                    ARNRow.setBackgroundColor(getResources().getColor(R.color.DarkestBlueColor));
                    marker.remove();
                }
                else
                {
                    ARNRow.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray3));
                    markers.add(marker);
                }
                viewMap();
                break;
        }

    }

    public void viewMap()
    {
        //Making the Map Visible
        MapRow.setVisibility(View.VISIBLE);
        // Hiding Building Rows
        TitleRow.setVisibility(View.GONE);
        AELRow.setVisibility(View.GONE);
        AGSRow.setVisibility(View.GONE);
        ALHRow.setVisibility(View.GONE);
        ARHRow.setVisibility(View.GONE);
        ARMRow.setVisibility(View.GONE);
        ARNRow.setVisibility(View.GONE);
    }
    public void viewBuildings()
    {
        //Hiding the Map
        MapRow.setVisibility(View.GONE);
        //Making Building Rows Visible
        TitleRow.setVisibility(View.VISIBLE);
        AELRow.setVisibility(View.VISIBLE);
        AGSRow.setVisibility(View.VISIBLE);
        ALHRow.setVisibility(View.VISIBLE);
        ARHRow.setVisibility(View.VISIBLE);
        ARMRow.setVisibility(View.VISIBLE);
        ARNRow.setVisibility(View.VISIBLE);
    }
    public boolean checkMarker(Marker marker)
    {
        boolean found = false;
        for(int i = 0; i<markers.size();i++)
        {
            if(markers.get(i).getTitle().equals(marker.getTitle()))
            {
                markers.get(i).remove();
                markers.remove(i);
                found = true;
            }
        }
        return found;
    }
}
