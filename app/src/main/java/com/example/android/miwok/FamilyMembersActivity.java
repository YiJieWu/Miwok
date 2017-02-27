package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Work> words = new ArrayList<Work>();
        words.add(new Work("father","weṭeṭṭi"));
        words.add(new Work("mother","chokokki"));
        words.add(new Work("son","ṭakaakki"));
        words.add(new Work("daughter","ṭopoppi"));
        words.add(new Work("older brother","kululli"));
        words.add(new Work("younger brother","kelelli"));
        words.add(new Work("older sister","ṭopiisә"));
        words.add(new Work("younger sister","chiwiiṭә"));
        words.add(new Work("grandmother","ṭopiisә"));
        words.add(new Work("grandfather","chiwiiṭә"));



        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter itemsAdapter = new WordAdapter(this,words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        //GridView gView = (GridView) findViewById(R.id.gridview);


        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
