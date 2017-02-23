package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yijiewu on 2/22/17.
 */

public class WordAdapter extends ArrayAdapter<Work> {
    //create the constructor
    public WordAdapter(Context context, ArrayList<Work> curword) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, curword);
    }

    @NonNull
    @Override
    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }



        // Get the Word object located at this position in the list
        Work current_word=getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok);

        // Find the TextView in the list_item.xml layout with the ID eng
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english);


        // Get the miwok word from the word object &
        // set this text on the name miwoktextView
        miwokTextView.setText(current_word.getMiwokTrans());

        // Get the miwok word from the word object &
        // set this text on the name miwoktextView
        englishTextView.setText(current_word.getDefaultTrans());

        return listItemView;




    }
}
