package wvumobile.wvumobile;

import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
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
import android.widget.TableRow;
import android.widget.Toast;

/**
 * Created by jeremydole on 2/4/15.
 */
public class help_Fragment extends Fragment implements  View.OnClickListener
{
    View rootview;
    AlertDialog alertDialog;
    private TableRow helpRow1;
    private TableRow helpRow2;
    private TableRow helpRow3;
    private TableRow helpRow4;
    private TableRow helpRow5;
    private TableRow helpRow6;
    private TableRow helpRow7;
    private TableRow helpRow8;
    private TableRow helpRow9;
    private TableRow helpRow10;
    private TableRow helpRow11;
    private TableRow helpRow12;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        rootview = inflater.inflate(R.layout.help_layout, container, false);

        ActionBar actionBar = ((ActionBarActivity)getActivity()).getSupportActionBar();
        actionBar.setTitle("Help");

        helpRow1 = (TableRow) rootview.findViewById(R.id.h_row1);
        helpRow1.setOnClickListener(this);
        helpRow2 = (TableRow) rootview.findViewById(R.id.h_row2);
        helpRow2.setOnClickListener(this);
        helpRow3 = (TableRow) rootview.findViewById(R.id.h_row3);
        helpRow3.setOnClickListener(this);
        helpRow4 = (TableRow) rootview.findViewById(R.id.h_row4);
        helpRow4.setOnClickListener(this);
        helpRow5 = (TableRow) rootview.findViewById(R.id.h_row5);
        helpRow5.setOnClickListener(this);
        helpRow6 = (TableRow) rootview.findViewById(R.id.h_row6);
        helpRow6.setOnClickListener(this);
        helpRow7 = (TableRow) rootview.findViewById(R.id.h_row7);
        helpRow7.setOnClickListener(this);
        helpRow8 = (TableRow) rootview.findViewById(R.id.h_row8);
        helpRow8.setOnClickListener(this);
        helpRow9 = (TableRow) rootview.findViewById(R.id.h_row9);
        helpRow9.setOnClickListener(this);
        helpRow10 = (TableRow) rootview.findViewById(R.id.h_row10);
        helpRow10.setOnClickListener(this);
        helpRow11 = (TableRow) rootview.findViewById(R.id.h_row11);
        helpRow11.setOnClickListener(this);
        helpRow12 = (TableRow) rootview.findViewById(R.id.h_row12);
        helpRow12.setOnClickListener(this);


        return rootview;
    }
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.h_row1:
                makeCall("tel:304-284-7522","the Morgantown Police");
                break;
            case R.id.h_row2:
                makeCall("tel:304-293-2677", "the University Police");
                break;
            case R.id.h_row3:
                makeCall("tel:1-800-988-0096", "WVU Emergency");
                break;
            case R.id.h_row4:
                makeCall("tel:304-292-5100","the Rape & Domestic Violence Information Center");
                break;
            case R.id.h_row5:
                makeCall("tel:1-800-784-2433", "the National 24/7 Suicide Hotline");
                break;
            case R.id.h_row6:
                makeCall("tel:1-800-273-TALK", "the Military Veterans Suicide Hotline");
                break;
            case R.id.h_row7:
                makeCall("tel:304-293-6997","the Carruth Center");
                break;
            case R.id.h_row8:
                makeCall("tel:304-293-3792","Environmental Health");
                break;
            case R.id.h_row9:
                makeCall("tel:304-293-6924","Health Sciences");
                break;
            case R.id.h_row10:
                makeCall("tel:304-293-5590","Faculty-Staff Assist.");
                break;
            case R.id.h_row11:
                makeCall("tel:1-800-WVU-0096","the Parents Club");
                break;
            case R.id.h_row12:
                makeCall("tel:304-285-7200","Student Health");
                break;
        }
    }
    public void makeCall(String telNumber, String message)
    {
        final String number = telNumber;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        alertDialog = builder.create();
        alertDialog.setOnDismissListener(new onDismissListener());
        alertDialog.setMessage("Are you sure you want to call "+message+"?");
        alertDialog.setButton(DialogInterface.BUTTON_NEGATIVE,"Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton){
            }
        });
        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Call", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int whichButton){
                Intent phoneIntent = new Intent(Intent.ACTION_CALL);
                phoneIntent.setData(Uri.parse(number));
                try{
                    startActivity(phoneIntent);
                }
                catch(ActivityNotFoundException e){
                    Toast.makeText(getActivity(), "Call failed, please try again later.", Toast.LENGTH_SHORT).show();
                }
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
