package wvumobile.wvumobile;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableRow;

/**
 * Created by jeremydole on 2/4/15.
 */
public class settings_Fragment extends Fragment  implements  View.OnClickListener
{
    View rootview;
    private TableRow email_row;
    private ImageButton kait_button;
    private ImageButton ricky_button;
    private ImageButton jeremy_button;
    private ImageButton facebook_button;
    private ImageButton twitter_button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        rootview = inflater.inflate(R.layout.settings_layout, container, false);

        ActionBar actionBar = ((ActionBarActivity)getActivity()).getSupportActionBar();
        actionBar.setTitle("Settings");

        email_row = (TableRow) rootview.findViewById(R.id.email_row);
        email_row.setOnClickListener(this);
        kait_button = (ImageButton) rootview.findViewById(R.id.k_button);
        kait_button.setOnClickListener(this);
        ricky_button = (ImageButton) rootview.findViewById(R.id.r_button);
        ricky_button.setOnClickListener(this);
        jeremy_button = (ImageButton) rootview.findViewById(R.id.j_button);
        jeremy_button.setOnClickListener(this);
        facebook_button = (ImageButton) rootview.findViewById(R.id.f_button);
        facebook_button.setOnClickListener(this);
        twitter_button = (ImageButton) rootview.findViewById(R.id.t_button);
        twitter_button.setOnClickListener(this);
        return rootview;
    }
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.email_row:
                break;
            case R.id.k_button:
                break;
            case R.id.r_button:
                break;
            case R.id.j_button:
                break;
            case R.id.f_button:
                break;
            case R.id.t_button:
                break;
        }
    }
}
