package wvumobile.wvumobile;

/**
 * Created by jeremydole on 4/6/15.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;



public class Navigation_adapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public Navigation_adapter(Context context, String[] values) {
        super(context, R.layout.navigation_adapter, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.navigation_adapter, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.placeholder);

        textView.setText(values[position]);
        //textView.setBackgroundColor(parent.getResources().getColor(R.color.ColorPRTGray2));

        return rowView;
    }
}