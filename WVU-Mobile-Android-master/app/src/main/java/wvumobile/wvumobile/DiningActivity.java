package wvumobile.wvumobile;

import android.content.Context;
import android.os.StrictMode;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONException;
import org.json.JSONObject;

public class DiningActivity extends ActionBarActivity implements  View.OnClickListener
{

    public final static String BACK_MESSAGE = "wvumobile.wvumobile.BACKMESSAGE";

    private MapView mMapView;
    private GoogleMap mMap;

    private String diningHallTitle = "";
    private Button menuSelect;
    private Button infoSelect;

    private TextView breakfast_Text;
    private TextView h_breakfast_Text;
    private TextView breakfastAS_Text;
    private TextView lunch_Text;
    private TextView h_lunch_Text;
    private TextView lunchAS_Text;
    private TextView dinner_Text;
    private TextView h_dinner_Text;
    private TextView dinnerAS_Text;

    private TextView dDescriptionText;
    private TextView dHoursText;

    private TableRow breakfastTitle;
    private TableRow h_breakfastTitle;
    private TableRow breakfastASTitle;
    private TableRow lunchTitle;
    private TableRow h_lunchTitle;
    private TableRow lunchASTitle;
    private TableRow dinnerTitle;
    private TableRow h_dinnerTitle;
    private TableRow dinnerASTitle;

    private TableRow breakfastRow;
    private TableRow h_breakfastRow;
    private TableRow breakfastASRow;
    private TableRow lunchRow;
    private TableRow h_lunchRow;
    private TableRow lunchASRow;
    private TableRow dinnerRow;
    private TableRow h_dinnerRow;
    private TableRow dinnerASRow;

    private TableRow dMapRow;
    private TableRow dDescriptionRow;
    private TableRow dHourTitleRow;
    private TableRow dHoursRow;

    private LatLng cafeEvansdalelatlon = new LatLng(39.648935, -79.966303);
    private LatLng summitCafelatlon = new LatLng(39.638829, -79.956533);
    private LatLng arnoldsDinerlatlon = new LatLng(39.632444, -79.950319);
    private LatLng boremanBistrolatlon = new LatLng(39.633060, -79.952642);
    private LatLng terraceRoomlatlon = new LatLng(39.635357, -79.952755);
    private LatLng hatfieldslatlon = new LatLng(39.634752, -79.953916);






    private String jsonURL = null;
    private int locationID = 0;

    String breakfastItems = "";
    String h_breakfastItems = "";
    String breakfastASItems= "";
    String lunchItems = "";
    String h_lunchItems = "";
    String lunchASItems = "";
    String dinnerItems = "";
    String h_dinnerItems = "";
    String  dinnerASItems = "";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null)
        {
            return;
        }
        else
        {
            breakfastItems = "";
            h_breakfastItems = "";
            breakfastASItems = "";
            lunchItems = "";
            h_lunchItems = "";
            lunchASItems = "";
            dinnerItems = "";
            h_dinnerItems = "";
            dinnerASItems = "";

            setContentView(R.layout.activity_dining);
            //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

            Intent intent = getIntent();

            MapsInitializer.initialize(getApplicationContext());
            mMapView = (MapView) findViewById(R.id.d_map);
            mMapView.onCreate(savedInstanceState);


            jsonURL = intent.getStringExtra(dining_Fragment.EXTRA_MESSAGE);
            locationID = intent.getIntExtra(dining_Fragment.EXTRA_MESSAGE2, 0);

            JSONParser jParse = new JSONParser();


            //Getting buttons
            menuSelect = (Button) findViewById(R.id.dining_menuButton);
            menuSelect.setOnClickListener(this);
            infoSelect = (Button) findViewById(R.id.dining_infoButton);
            infoSelect.setOnClickListener(this);

            //Getting each row within the menu as a TextView
            breakfast_Text = (TextView) findViewById(R.id.d_breakfast);
            h_breakfast_Text = (TextView) findViewById(R.id.d_hbreakfast);
            breakfastAS_Text = (TextView) findViewById(R.id.d_breakfast_as);
            lunch_Text = (TextView) findViewById(R.id.d_lunch);
            h_lunch_Text = (TextView) findViewById(R.id.d_hlunch);
            lunchAS_Text = (TextView) findViewById(R.id.d_lunch_as);
            dinner_Text = (TextView) findViewById(R.id.d_dinner);
            h_dinner_Text = (TextView) findViewById(R.id.d_hdinner);
            dinnerAS_Text = (TextView) findViewById(R.id.d_dinner_as);

            //Getting each row title as a TableRow
            breakfastTitle = (TableRow) findViewById(R.id.r_breakfasttitle);
            h_breakfastTitle = (TableRow) findViewById(R.id.r_hbreakfasttitle);
            breakfastASTitle = (TableRow) findViewById(R.id.r_breakfast_astitle);
            lunchTitle = (TableRow) findViewById(R.id.r_lunchtitle);
            h_lunchTitle = (TableRow) findViewById(R.id.r_hlunchtitle);
            lunchASTitle = (TableRow) findViewById(R.id.r_lunch_astitle);
            dinnerTitle = (TableRow) findViewById(R.id.r_dinnertitle);
            h_dinnerTitle = (TableRow) findViewById(R.id.r_hdinnertitle);
            dinnerASTitle = (TableRow) findViewById(R.id.r_dinner_astitle);

            //Getting each meal section as a TableRow
            breakfastRow = (TableRow) findViewById(R.id.r_breakfast);
            h_breakfastRow = (TableRow) findViewById(R.id.r_hbreakfast);
            breakfastASRow = (TableRow) findViewById(R.id.r_breakfast_as);
            lunchRow = (TableRow) findViewById(R.id.r_lunch);
            h_lunchRow = (TableRow) findViewById(R.id.r_hlunch);
            lunchASRow = (TableRow) findViewById(R.id.r_lunch_as);
            dinnerRow = (TableRow) findViewById(R.id.r_dinner);
            h_dinnerRow = (TableRow) findViewById(R.id.r_hdinner);
            dinnerASRow = (TableRow) findViewById(R.id.r_dinner_as);

            //Getting the info section

            dMapRow = (TableRow) findViewById(R.id.d_mapRow);
            dDescriptionRow = (TableRow) findViewById(R.id.d_diningdescriptionrow);
            dHourTitleRow = (TableRow) findViewById(R.id.dining_hours);
            dHoursRow = (TableRow) findViewById(R.id.d_hoursrow);
            dDescriptionText = (TextView) findViewById(R.id.d_diningdescription);
            dHoursText = (TextView) findViewById(R.id.d_HourText);

            dMapRow.setVisibility(View.GONE);
            dDescriptionRow.setVisibility(View.GONE);
            dHourTitleRow.setVisibility(View.GONE);
            dHoursRow.setVisibility(View.GONE);

            try {

                JSONObject[] diningJSON = jParse.getJSONArrayFromUrl(jsonURL);
                setupMenu(diningJSON);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            breakfast_Text.setText(breakfastItems);
            h_breakfast_Text.setText(h_breakfastItems);
            breakfastAS_Text.setText(breakfastASItems);
            lunch_Text.setText(lunchItems);
            h_lunch_Text.setText(h_lunchItems);
            lunchAS_Text.setText(lunchASItems);
            dinner_Text.setText(dinnerItems);
            h_dinner_Text.setText(h_dinnerItems);
            dinnerAS_Text.setText(dinnerASItems);

            int count = 9;

            if(breakfastItems.equals(""))
            {
                count--;
                breakfast_Text.setVisibility(View.GONE);
                breakfastTitle.setVisibility(View.GONE);
                breakfastRow.setVisibility(View.GONE);
            }
            if(h_breakfastItems.equals(""))
            {
                count--;
                h_breakfast_Text.setVisibility(View.GONE);
                h_breakfastTitle.setVisibility(View.GONE);
                h_breakfastRow.setVisibility(View.GONE);
            }
            if(breakfastASItems.equals(""))
            {
                count--;
                breakfastAS_Text.setVisibility(View.GONE);
                breakfastASTitle.setVisibility(View.GONE);
                breakfastASRow.setVisibility(View.GONE);
            }
            if(lunchItems.equals(""))
            {
                count--;
                lunch_Text.setVisibility(View.GONE);
                lunchTitle.setVisibility(View.GONE);
                lunchRow.setVisibility(View.GONE);
            }
            if(h_lunchItems.equals(""))
            {
                count--;

                h_lunch_Text.setVisibility(View.GONE);
                h_lunchTitle.setVisibility(View.GONE);
                h_lunchRow.setVisibility(View.GONE);
            }
            if(lunchASItems.equals(""))
            {
                count--;
                lunchAS_Text.setVisibility(View.GONE);
                lunchASTitle.setVisibility(View.GONE);
                lunchASRow.setVisibility(View.GONE);
            }
            if(dinnerItems.equals(""))
            {
                count--;
                System.out.println(count);
                dinner_Text.setVisibility(View.GONE);
                dinnerTitle.setVisibility(View.GONE);
                dinnerRow.setVisibility(View.GONE);
            }
            if(h_dinnerItems.equals(""))
            {
                count--;
                h_dinner_Text.setVisibility(View.GONE);
                h_dinnerTitle.setVisibility(View.GONE);
                h_dinnerRow.setVisibility(View.GONE);
            }
            if(dinnerASItems.equals(""))
            {
                count--;
                dinnerAS_Text.setVisibility(View.GONE);
                dinnerASTitle.setVisibility(View.GONE);
                dinnerASRow.setVisibility(View.GONE);
            }
            if(count == 0)
            {
                breakfastRow.setVisibility(View.VISIBLE);
                breakfast_Text.setVisibility(View.VISIBLE);
                breakfast_Text.setText("C L O S E D");
                breakfast_Text.setGravity(View.TEXT_ALIGNMENT_CENTER);
            }

            setUpMapIfNeeded();

            if(locationID == 1)
            {
                setTitle("Cafe Evansdale");
                diningHallTitle = "Cafe Evansdale";
                updateMap(cafeEvansdalelatlon, diningHallTitle);
                dDescriptionText.setText(getResources().getText(R.string.cafeevansdaleDescription));
                dHoursText.setText(getResources().getText(R.string.cafeevansdalehours));
            }
            else if(locationID == 2)
            {
                setTitle("Summit Cafe");
                diningHallTitle = "Summit Cafe";
                updateMap(summitCafelatlon, diningHallTitle);
                dDescriptionText.setText(getResources().getText(R.string.summitcafeDescription));
                dHoursText.setText(getResources().getText(R.string.summithours));
            }
            else if(locationID == 3)
            {
                setTitle("Arnold's Diner");
                diningHallTitle = "Arnold's Diner";
                updateMap(arnoldsDinerlatlon, diningHallTitle);
                dDescriptionText.setText(getResources().getText(R.string.arnoldsdinerDescription));
                dHoursText.setText(getResources().getText(R.string.arnoldhours));
            }
            else if(locationID == 4)
            {
                setTitle("Boreman Bistro");
                diningHallTitle = "Boreman Bistro";
                updateMap(boremanBistrolatlon, diningHallTitle);
                dDescriptionText.setText(getResources().getText(R.string.boremanbistroDescription));
                dHoursText.setText(getResources().getText(R.string.boremandhours));
            }
            else if(locationID == 5)
            {
                setTitle("Terrace Room");
                diningHallTitle = "Terrace Room";
                updateMap(terraceRoomlatlon, diningHallTitle);
                dDescriptionText.setText(getResources().getText(R.string.terraceroomDescription));
                dHoursText.setText(getResources().getText(R.string.terraceroomhours));
            }
            else if(locationID == 6)
            {
                setTitle("Hatfields");
                diningHallTitle = "Hatfields";
                updateMap(hatfieldslatlon, diningHallTitle);
                dDescriptionText.setText(getResources().getText(R.string.hatfieldsDescription));
                dHoursText.setText(getResources().getText(R.string.hatfieldsHours));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dining, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void setupMenu(JSONObject[] dJson) throws JSONException
    {
        String placeholder;
        for(int i=0; i<dJson.length-1; i++)
        {
            placeholder = "";
            placeholder = dJson[i].getString("meal");
            if(!dJson[i].getString("item").equals("")) {
                switch (placeholder) {
                    case "BREAKFAST":
                        breakfastItems = breakfastItems + dJson[i].getString("item") + "\n";
                        break;
                    case "HEALTHY \"U\" BREAKFAST":
                        h_breakfastItems = h_breakfastItems + dJson[i].getString("item") + "\n";
                        break;
                    case "\r\nBREAKFAST ACTION STATION":
                        breakfastASItems = breakfastASItems + dJson[i].getString("item") + "\n";
                        break;
                    case "LUNCH":
                        lunchItems = lunchItems + dJson[i].getString("item") + "\n";
                        break;
                    case "HEALTHY \"U\" LUNCH":
                        h_lunchItems = h_lunchItems + dJson[i].getString("item") + "\n";
                        break;
                    case "\r\nLUNCH ACTION STATION":
                        lunchASItems = lunchASItems + dJson[i].getString("item") + "\n";
                        break;
                    case "DINNER":
                        dinnerItems = dinnerItems + dJson[i].getString("item") + "\n";
                        break;
                    case "HEALTH \"U\" DINNER":
                        h_dinnerItems = h_dinnerItems + dJson[i].getString("item") + "\n";
                        break;
                    case "\r\nDINNER ACTION STATION":
                        dinnerASItems = dinnerASItems + dJson[i].getString("item") + "\n";
                        break;
                    default:
                        break;
                }
            }

        }
        if(breakfastItems.endsWith("\n"))
        {
            breakfastItems = breakfastItems.substring(0, breakfastItems.length()-1);
        }
        if(h_breakfastItems.endsWith("\n"))
        {
            h_breakfastItems = h_breakfastItems.substring(0, h_breakfastItems.length()-1);
        }
        if(breakfastASItems.endsWith("\n"))
        {
            breakfastASItems = breakfastASItems.substring(0, breakfastASItems.length()-1);
        }
        if(lunchItems.endsWith("\n"))
        {
            lunchItems = lunchItems.substring(0, lunchItems.length()-1);
        }
        if(h_lunchItems.endsWith("\n"))
        {
            h_lunchItems = h_lunchItems.substring(0, h_lunchItems.length()-1);
        }
        if(lunchASItems.endsWith("\n"))
        {
            lunchASItems = lunchASItems.substring(0, lunchASItems.length()-1);
        }
        if(dinnerItems.endsWith("\n"))
        {
            dinnerItems = dinnerItems.substring(0, dinnerItems.length()-1);
        }
        if(h_dinnerItems.endsWith("\n"))
        {
            h_dinnerItems = h_dinnerItems.substring(0, h_dinnerItems.length()-1);
        }
        if(dinnerASItems.endsWith("\n"))
        {
            dinnerASItems = dinnerASItems.substring(0, dinnerASItems.length()-1);
        }
    }

    public void setUpMenuView()
    {
        //hiding all info elements
        dMapRow.setVisibility(View.GONE);
        dDescriptionRow.setVisibility(View.GONE);
        dHourTitleRow.setVisibility(View.GONE);
        dHoursRow.setVisibility(View.GONE);

        //making all menu rows visible
        if(!breakfastItems.equals("")) {
            breakfastTitle.setVisibility(View.VISIBLE);
            breakfastRow.setVisibility(View.VISIBLE);
        }
        if(!h_breakfastItems.equals("")){
            h_breakfastTitle.setVisibility(View.VISIBLE);
            h_breakfastRow.setVisibility(View.VISIBLE);
        }
        if(!breakfastASItems.equals("")){
            breakfastASTitle.setVisibility(View.VISIBLE);
            breakfastASRow.setVisibility(View.VISIBLE);
        }
        if(!lunchItems.equals("")){
            lunchTitle.setVisibility(View.VISIBLE);
            lunchRow.setVisibility(View.VISIBLE);
        }
        if(!h_lunchItems.equals("")){
            h_lunchTitle.setVisibility(View.VISIBLE);
            h_lunchRow.setVisibility(View.VISIBLE);
        }
        if(!lunchASItems.equals("")){
            lunchASTitle.setVisibility(View.VISIBLE);
            lunchASRow.setVisibility(View.VISIBLE);
        }
        if(!dinnerItems.equals("")){
            dinnerTitle.setVisibility(View.VISIBLE);
            dinnerRow.setVisibility(View.VISIBLE);
        }
        if(!h_dinnerItems.equals("")){
            h_dinnerTitle.setVisibility(View.VISIBLE);
            h_dinnerRow.setVisibility(View.VISIBLE);
        }
        if(!dinnerASItems.equals("")){
            dinnerASTitle.setVisibility(View.VISIBLE);
            dinnerASRow.setVisibility(View.VISIBLE);
        }
    }

    public void setUpInfoView()
    {
        //making all info elements visible
        dMapRow.setVisibility(View.VISIBLE);
        dDescriptionRow.setVisibility(View.VISIBLE);
        dHourTitleRow.setVisibility(View.VISIBLE);
        dHoursRow.setVisibility(View.VISIBLE);

        //hiding all menu rows

        breakfastTitle.setVisibility(View.GONE);
        h_breakfastTitle.setVisibility(View.GONE);
        breakfastASTitle.setVisibility(View.GONE);
        lunchTitle.setVisibility(View.GONE);
        h_lunchTitle.setVisibility(View.GONE);
        lunchASTitle.setVisibility(View.GONE);
        dinnerTitle.setVisibility(View.GONE);
        h_dinnerTitle.setVisibility(View.GONE);
        dinnerASTitle.setVisibility(View.GONE);

        breakfastRow.setVisibility(View.GONE);
        h_breakfastRow.setVisibility(View.GONE);
        breakfastASRow.setVisibility(View.GONE);
        lunchRow.setVisibility(View.GONE);
        h_lunchRow.setVisibility(View.GONE);
        lunchASRow.setVisibility(View.GONE);
        dinnerRow.setVisibility(View.GONE);
        h_dinnerRow.setVisibility(View.GONE);
        dinnerASRow.setVisibility(View.GONE);
    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.dining_menuButton:
                menuSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray1));
                infoSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray2));
                setUpMenuView();
                break;
            case R.id.dining_infoButton:
                menuSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray2));
                infoSelect.setBackgroundColor(getResources().getColor(R.color.ColorPRTGray1));
                setUpInfoView();
                break;
            default:
            break;
        }
    }

    private void setUpMapIfNeeded()
    {
        if(mMap == null)
        {
            mMap = ((MapView) findViewById(R.id.d_map)).getMap();
            if(mMap!= null)
            {
                setUpMap();
            }
        }
    }
    //@Override
    /*public void onBackPressed()
    {

       Intent intent = new Intent(DiningActivity.this,MainActivity.class);

        intent.putExtra(BACK_MESSAGE,"Check");
        startActivity(intent);
    }*/


    private void setUpMap()
    {

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cafeEvansdalelatlon, 13));
    }
    private void updateMap(LatLng dlatlng, String dtitle)
    {

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(dlatlng, 13));
        Marker marker = mMap.addMarker(new MarkerOptions().position(dlatlng).title(dtitle));
    }

    @Override
    public void onResume()
    {
        super.onResume();
        mMapView.onResume();
    }
    @Override
    public void onPause()
    {
        super.onPause();
        mMapView.onPause();
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        mMapView.onDestroy();
        /*Intent intent = new Intent(DiningActivity.this,MainActivity.class);

        intent.putExtra(BACK_MESSAGE,"Check");
        startActivity(intent);*/

    }

}
