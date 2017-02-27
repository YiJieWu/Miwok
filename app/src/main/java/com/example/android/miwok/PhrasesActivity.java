package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Work> words = new ArrayList<Work>();
        words.add(new Work("Where are you going?","weṭeṭṭi"));
        words.add(new Work("What is your name?","chokokki"));
        words.add(new Work("My name is...","ṭakaakki"));
        words.add(new Work("How are you feeling?","ṭopoppi"));
        words.add(new Work("I’m feeling good.","kululli"));
        words.add(new Work("Are you coming?","kelelli"));
        words.add(new Work("Yes, I’m coming.","ṭopiisә"));
        words.add(new Work("I’m coming.","chiwiiṭә"));
        words.add(new Work("Let’s go.","ṭopiisә"));
        words.add(new Work("Come here.","chiwiiṭә"));



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
