package wvumobile.wvumobile;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
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
import android.widget.Toast;

/**
 * Created by jeremydole on 2/4/15.
 */
public class settings_Fragment extends Fragment  implements  View.OnClickListener
{
    View rootview;
    AlertDialog alertDialog;
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
                sendEmail();
                break;
            case R.id.k_button:
                loadWebPage("https://twitter.com/kateinthecosmos");
                break;
            case R.id.r_button:
                loadWebPage("https://twitter.com/rickydeal11");
                break;
            case R.id.j_button:
                loadWebPage("https://twitter.com/jdole21");
                break;
            case R.id.f_button:
                loadWebPage("https://facebook.com/wvumobile");
                break;
            case R.id.t_button:
                loadWebPage("https://twitter.com/wvumobile");
                break;
        }
    }
    public void loadWebPage(String url)
    {
        try{
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(browserIntent);
        }
        catch(ActivityNotFoundException e) {
            Toast.makeText(getActivity(), "No application can handle this request."+ " Please install a webbrowser", Toast.LENGTH_LONG).show();
        }
    }
    public void sendEmail()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        alertDialog = builder.create();
        alertDialog.setOnDismissListener(new onDismissListener());
        alertDialog.setMessage("Feedback is welcomed! You can either email us directly or copy our email address.");
        alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE,"Copy", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton){
            }
        });
        alertDialog.setButton(DialogInterface.BUTTON_NEUTRAL, "Cancel", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int whichButton){
                ClipboardManager clipboard = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData copyClip = ClipData.newPlainText("WVU Mobile", "wvumobileapp@gmail.com");
                clipboard.setPrimaryClip(copyClip);
             }
        });
        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "E-mail", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int whichButton){

            }
        });
        alertDialog.show();
    }
    class onDismissListener implements DialogInterface.OnDismissListener {

        @Override
        public void onDismiss(DialogInterface dialog) {
            // TODO Auto-generated method stub
            alertDialog.dismiss();
        }
    }
}
