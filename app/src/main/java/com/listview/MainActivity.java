package com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> ar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.listView);
        ar=new ArrayList<>();
        ar.add("Diary");
        ar.add("Profile");
        ar.add("Notifications");

        ArrayAdapter<String> ad=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,ar);

        lv.setAdapter(ad);
    }
}
