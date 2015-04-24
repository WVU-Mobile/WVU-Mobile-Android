package wvumobile.wvumobile;

import android.os.StrictMode;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jeremydole on 2/4/15.
 */
public class news_Fragment extends Fragment
{
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        rootview = inflater.inflate(R.layout.news_layout, container, false);

       /* StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        RSS rss = new RSS("https://cal.wvu.edu/RSSSyndicator.aspx?category=&location=&type=N&binary=Y");
        ((TextView) rootview.findViewById(R.id.n_item1_title)).setText(rss.read());
        //ArrayList<RSS.Item> list = rss.readFeed();*/

        /*int loc = 0;
        ((TextView) rootview.findViewById(R.id.n_item1_title)).setText(list.get(loc).title);
        ((TextView) rootview.findViewById(R.id.n_item2_title)).setText(list.get(loc+1).title);
        ((TextView) rootview.findViewById(R.id.n_item3_title)).setText(list.get(loc+2).title);
        ((TextView) rootview.findViewById(R.id.n_item4_title)).setText(list.get(loc+3).title);
        ((TextView) rootview.findViewById(R.id.n_item5_title)).setText(list.get(loc + 4).title);*/

        return rootview;
    }
}
