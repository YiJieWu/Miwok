package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Work> words = new ArrayList<Work>();
        words.add(new Work("red","weṭeṭṭi",R.drawable.color_red));
        words.add(new Work("green","chokokki",R.drawable.color_green));
        words.add(new Work("brown","ṭakaakki",R.drawable.color_brown));
        words.add(new Work("gray","ṭopoppi",R.drawable.color_gray));
        words.add(new Work("black","kululli",R.drawable.color_black));
        words.add(new Work("white","kelelli",R.drawable.color_white));
        words.add(new Work("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        words.add(new Work("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));



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
