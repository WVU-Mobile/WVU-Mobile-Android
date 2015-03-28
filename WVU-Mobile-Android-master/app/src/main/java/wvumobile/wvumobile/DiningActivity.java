package wvumobile.wvumobile;

import android.os.StrictMode;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class DiningActivity extends ActionBarActivity {

    public final static String BACK_MESSAGE = "wvumobile.wvumobile.BACKMESSAGE";

    private String jsonURL = null;
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
            System.out.println("I am here.");
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

            Intent intent = getIntent();
            jsonURL = intent.getStringExtra(dining_Fragment.EXTRA_MESSAGE);
            setContentView(R.layout.activity_dining);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            JSONParser jParse = new JSONParser();

            //Getting each row within the menu as a TextView
            TextView breakfast_Text = (TextView) findViewById(R.id.d_breakfast);
            TextView h_breakfast_Text = (TextView) findViewById(R.id.d_hbreakfast);
            TextView breakfastAS_Text = (TextView) findViewById(R.id.d_breakfast_as);
            TextView lunch_Text = (TextView) findViewById(R.id.d_lunch);
            TextView h_lunch_Text = (TextView) findViewById(R.id.d_hlunch);
            TextView lunchAS_Text = (TextView) findViewById(R.id.d_lunch_as);
            TextView dinner_Text = (TextView) findViewById(R.id.d_dinner);
            TextView h_dinner_Text = (TextView) findViewById(R.id.d_hdinner);
            TextView dinnerAS_Text = (TextView) findViewById(R.id.d_dinner_as);

            //Getting each row title as a TableRow
            TableRow breakfastTitle = (TableRow) findViewById(R.id.r_breakfasttitle);
            TableRow h_breakfastTitle = (TableRow) findViewById(R.id.r_hbreakfasttitle);
            TableRow breakfastASTitle = (TableRow) findViewById(R.id.r_breakfast_astitle);
            TableRow lunchTitle = (TableRow) findViewById(R.id.r_lunchtitle);
            TableRow h_lunchTitle = (TableRow) findViewById(R.id.r_hlunchtitle);
            TableRow lunchASTitle = (TableRow) findViewById(R.id.r_lunch_astitle);
            TableRow dinnerTitle = (TableRow) findViewById(R.id.r_dinnertitle);
            TableRow h_dinnerTitle = (TableRow) findViewById(R.id.r_hdinnertitle);
            TableRow dinnerASTitle = (TableRow) findViewById(R.id.r_dinner_astitle);

            //Getting each meal section as a TableRow
            TableRow breakfastRow = (TableRow) findViewById(R.id.r_breakfast);
            TableRow h_breakfastRow = (TableRow) findViewById(R.id.r_hbreakfast);
            TableRow breakfastASRow = (TableRow) findViewById(R.id.r_breakfast_as);
            TableRow lunchRow = (TableRow) findViewById(R.id.r_lunch);
            TableRow h_lunchRow = (TableRow) findViewById(R.id.r_hlunch);
            TableRow lunchASRow = (TableRow) findViewById(R.id.r_lunch_as);
            TableRow dinnerRow = (TableRow) findViewById(R.id.r_dinner);
            TableRow h_dinnerRow = (TableRow) findViewById(R.id.r_hdinner);
            TableRow dinnerASRow = (TableRow) findViewById(R.id.r_dinner_as);

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
    @Override
    public void onBackPressed()
    {

        Intent intent = new Intent(DiningActivity.this,MainActivity.class);

        intent.putExtra(BACK_MESSAGE,"Check");
        startActivity(intent);
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Intent intent = new Intent(DiningActivity.this,MainActivity.class);

        intent.putExtra(BACK_MESSAGE,"Check");
        startActivity(intent);

    }
}
