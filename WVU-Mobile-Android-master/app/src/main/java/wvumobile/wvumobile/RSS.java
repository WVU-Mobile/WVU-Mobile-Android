package wvumobile.wvumobile;

/**
 * Created by t on 3/11/2015.
 */
import android.annotation.TargetApi;
import android.os.Build;
import android.text.Html;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class RSS {

    private String url;
    private String full;
    private ArrayList items = new ArrayList<Item>();

    public RSS(String url) {
        this.url = url;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public ArrayList<Item> readFeed() {
        Item item = null;
        InputStream is = null;
        try {
            boolean isFeedHeader = true;
            // Set header values intial to the empty string
            String title = "", link = "", description = "", pubdate = "", category = "";

            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            XmlPullParser parser = factory.newPullParser();

            is = getReader();

            parser.setInput(is, null);

            int event = parser.getEventType();
            while (event != XmlPullParser.END_DOCUMENT)
            {
                String name = parser.getName();
                switch (event){
                    case XmlPullParser.START_TAG:
                        break;
                    case XmlPullParser.END_TAG:
                        switch (name) {
                            case "item":
                                items.add(new Item(title, link, description, pubdate, category));//myParser.getAttributeValue(null,"value");
                            case "title":
                                title = parser.getText();
                                break;
                            case "link":
                                link = parser.getText();
                                break;
                            case "description":
                                description = Html.escapeHtml(parser.getText());
                                break;
                            case "pubdate":
                                pubdate = parser.getText();
                                break;
                            case "category":
                                category = parser.getText();
                                break;
                        }
                        break;
                }
                event = parser.next();
                is.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }

    public String read(){
        InputStream is = null;
        try {

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
                    System.out.println(line);
                }
            }
            is.close();
            full = sb.toString();
            return full;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private InputStream getReader() {
        InputStream is = null;
        try {

            DefaultHttpClient httpClient = new DefaultHttpClient();
            StringBuilder sb = new StringBuilder();
            HttpGet httpGet = new HttpGet(url);
            HttpResponse response = httpClient.execute(httpGet);
            StatusLine statusLine = response.getStatusLine();
            int statusCode = statusLine.getStatusCode();

            if(statusCode == 200) {
                HttpEntity ent = response.getEntity();
                is = ent.getContent();
                return is;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public class Item {
        String title = "", link = "", description = "", pubdate = "", category = "";

        public Item(String title, String link, String description, String pubdate, String category) {
            this.title = title;
            this.link = link;
            this.description = description;
            this.pubdate = pubdate;
            this.category = category;
        }
    }
}