package wvumobile.wvumobile;

/**
 * Created by jeremydole on 2/26/15.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

public class JSONParser
{

    InputStream is = null;
    JSONObject jObj = null;
    ArrayList<JSONObject> jArray = new ArrayList<JSONObject>();
    String json = "";

    // constructor
    public JSONParser()
    {

    }

    public JSONObject getJSONFromUrl(String url)
    {
        json = "";
        // Making HTTP request
        try
        {
            // defaultHttpClient
            DefaultHttpClient httpClient = new DefaultHttpClient();
            StringBuilder sb = new StringBuilder();
            HttpGet httpGet = new HttpGet(url);
            HttpResponse response = httpClient.execute(httpGet);
            StatusLine statusLine = response.getStatusLine();
            int statusCode = statusLine.getStatusCode();

            if(statusCode == 200)
            {
                HttpEntity ent = response.getEntity();
                is = ent.getContent();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                String line = null;
                while((line = reader.readLine()) != null)
                {
                    sb.append(line);
                }
            }
            is.close();
            json = sb.toString();
        }
        catch (Exception e)
        {
            Log.e("Buffer Error", "Error converting result " + e.toString());
        }

        // try parse the string to a JSON object
        try
        {
            jObj = new JSONObject(json);
        }
        catch (JSONException e)
        {
            Log.e("JSON Parser", "Error parsing data " + e.toString());
            System.out.println("error on parse data in jsonparser.java");
        }

        // return JSON String
        jArray.clear();
        return jObj;

    }

    public JSONObject[] getJSONArrayFromUrl(String url)
    {
        // Making HTTP request
        try
        {
            // defaultHttpClient
            DefaultHttpClient httpClient = new DefaultHttpClient();
            StringBuilder sb = new StringBuilder();
            HttpGet httpGet = new HttpGet(url);
            HttpResponse response = httpClient.execute(httpGet);
            StatusLine statusLine = response.getStatusLine();
            int statusCode = statusLine.getStatusCode();

            if(statusCode == 200)
            {
                HttpEntity ent = response.getEntity();
                is = ent.getContent();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                String line = null;
                while((line = reader.readLine()) != null)
                {
                    sb.append(line);
                }
            }
            is.close();
            json = sb.toString();
        }
        catch (Exception e)
        {
            Log.e("Buffer Error", "Error converting result " + e.toString());
        }

        // try parse the string to a JSON object
        try
        {
            String placeholder = "";
            char x = '.';
            for(int i=0; i<json.length()-1; i++)
            {
                if(json.charAt(i) != '[')
                {
                    placeholder = placeholder + json.charAt(i);
                }
                if(json.charAt(i) == '}')
                {
                    if(placeholder.charAt(0) == ',')
                    {
                        placeholder = placeholder.substring(1,placeholder.length());
                    }
                    placeholder.trim();
                    jObj = new JSONObject(placeholder);
                    jArray.add(jObj);
                    placeholder = "";
                }

            }

        }
        catch (JSONException e)
        {
            Log.e("JSON Parser", "Error parsing data " + e.toString());
            System.out.println("error on parse data in jsonparser.java");
        }
        // return JSON String
        JSONObject[] jsonArray = new JSONObject[jArray.size()];
        for(int i=0; i<jArray.size()-1;i++)
        {
            try
            {
                JSONObject jplace = new JSONObject(jArray.get(i).toString());
                jsonArray[i] = jplace;
            }
            catch (JSONException e)
            {
                Log.e("JSON Parser", "Error parsing data " + e.toString());
                System.out.println("error on parse data in jsonparser.java");
            }
        }
        jArray.clear();
        return jsonArray;
    }
}

