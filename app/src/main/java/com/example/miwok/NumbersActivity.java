package com.example.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

//        String [] words =  new String[10];
        ArrayList<Word> words = new ArrayList<Word>();
//        words.add("one");

        words.add(new Word("One","Lutti"));
        words.add(new Word("Two","Ottiko"));
        words.add(new Word("Three","Tolokosu"));
        words.add(new Word("Four","oyissa"));
        words.add(new Word("Five","masokka"));
        words.add(new Word("Six","temmoka"));
        words.add(new Word("Seven","kenekaku"));
        words.add(new Word("Eight","kawinta"));
        words.add(new Word("Nine","wo'e"));
        words.add(new Word("Ten","na'accha"));

//        words.add("two");
//        words.add("three");
//        words.add("four");
//        words.add("five");
//        words.add("six");
//        words.add("seven");
//        words.add("eight");
//        words.add("nine");
//        words.add("ten");

//        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);
//
//        int index=0;
//
//        while (index< words.size()) {
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            rootView.addView(wordView);
//
//            index++;
//        }

        WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

//        Log.v("Number Activity","Word at index 0 :"+words[0]);
    }
}
