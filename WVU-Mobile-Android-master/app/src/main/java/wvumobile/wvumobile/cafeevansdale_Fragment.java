package wvumobile.wvumobile;

import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.net.URL;
import java.util.ArrayList;

/**
 * Created by jeremydole on 2/4/15.
 */
public class cafeevansdale_Fragment extends Fragment
{
    View rootview;
    String jsonURL = null;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        JSONParser jParse = new JSONParser();
        rootview = inflater.inflate(R.layout.cafeevansdale_layout, container, false);

        //Getting each row within the menu as a TextView
        TextView breakfast_Text = (TextView) rootview.findViewById(R.id.d_breakfast);
        TextView h_breakfast_Text = (TextView) rootview.findViewById(R.id.d_hbreakfast);
        TextView breakfastAS_Text = (TextView) rootview.findViewById(R.id.d_breakfast_as);
        TextView lunch_Text = (TextView) rootview.findViewById(R.id.d_lunch);
        TextView h_lunch_Text = (TextView) rootview.findViewById(R.id.d_hlunch);
        TextView lunchAS_Text = (TextView) rootview.findViewById(R.id.d_lunch_as);
        TextView dinner_Text = (TextView) rootview.findViewById(R.id.d_dinner);
        TextView h_dinner_Text = (TextView) rootview.findViewById(R.id.d_hdinner);
        TextView dinnerAS_Text = (TextView) rootview.findViewById(R.id.d_dinner_as);

        //Getting each row title as a TableRow
        TableRow breakfastTitle = (TableRow) rootview.findViewById(R.id.r_breakfasttitle);
        TableRow hbreakfastTitle = (TableRow) rootview.findViewById(R.id.r_hbreakfasttitle);
        TableRow breakfastASTitle = (TableRow) rootview.findViewById(R.id.r_breakfast_astitle);
        TableRow lunchTitle = (TableRow) rootview.findViewById(R.id.r_lunchtitle);
        TableRow hlunchTitle = (TableRow) rootview.findViewById(R.id.r_hlunchtitle);
        TableRow lunchASTitle = (TableRow) rootview.findViewById(R.id.r_lunch_astitle);
        TableRow dinnerTitle = (TableRow) rootview.findViewById(R.id.r_dinnertitle);
        TableRow hdinnerTitle = (TableRow) rootview.findViewById(R.id.r_hdinnertitle);
        TableRow dinnerASTitle = (TableRow) rootview.findViewById(R.id.r_dinner_astitle);

        //Getting each meal section as a TableRow
        TableRow breakfastRow = (TableRow) rootview.findViewById(R.id.r_breakfast);
        TableRow hbreakfastRow = (TableRow) rootview.findViewById(R.id.r_hbreakfast);
        TableRow breakfastASRow = (TableRow) rootview.findViewById(R.id.r_breakfast_as);
        TableRow lunchRow = (TableRow) rootview.findViewById(R.id.r_lunch);
        TableRow hlunchRow = (TableRow) rootview.findViewById(R.id.r_hlunch);
        TableRow lunchASRow = (TableRow) rootview.findViewById(R.id.r_lunch_as);
        TableRow dinnerRow = (TableRow) rootview.findViewById(R.id.r_dinner);
        TableRow hdinnerRow = (TableRow) rootview.findViewById(R.id.r_hdinner);
        TableRow dinnerASRow = (TableRow) rootview.findViewById(R.id.r_dinner_as);

        try
        {

            JSONObject[] diningJSON = jParse.getJSONArrayFromUrl(jsonURL);
            setupMenu(diningJSON);

        }
        catch(JSONException e)
        {
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


        return rootview;
    }

    public void setURL(String url)
    {
        jsonURL = url;
    }

    public void setupMenu(JSONObject[] dJson) throws JSONException
    {
        String placeholder;
        for(int i=0; i<dJson.length-1; i++)
        {
            placeholder = "";
            placeholder = dJson[i].getString("meal");
            System.out.println("PLACEHOLDER: "+placeholder);
            switch(placeholder)
            {
                case "BREAKFAST":
                    breakfastItems = breakfastItems + dJson[i].getString("item")+"\n";
                    break;
                case "HEALTHY \"U\" BREAKFAST":
                    h_breakfastItems = h_breakfastItems + dJson[i].getString("item")+"\n";
                    break;
                case "\r\nBREAKFAST ACTION STATION":
                    breakfastASItems = breakfastASItems + dJson[i].getString("item")+"\n";
                    break;
                case "LUNCH":
                    lunchItems = lunchItems + dJson[i].getString("item")+"\n";
                    break;
                case "HEALTHY \"U\" LUNCH":
                    h_lunchItems = h_lunchItems + dJson[i].getString("item")+"\n";
                    break;
                case "\r\nLUNCH ACTION STATION":
                    lunchASItems = lunchASItems + dJson[i].getString("item")+"\n";
                    break;
                case "DINNER":
                    dinnerItems= dinnerItems + dJson[i].getString("item")+"\n";
                    break;
                case "HEALTH \"U\" DINNER":
                    h_dinnerItems = h_dinnerItems + dJson[i].getString("item")+"\n";
                    break;
                case "\r\nDINNER ACTION STATION":
                    dinnerASItems = dinnerASItems + dJson[i].getString("item")+"\n";
                    break;
                default:
                    System.out.println("I am making it to here.");
                    break;
            }

        }
        System.out.println("I should only print once");
    }
}