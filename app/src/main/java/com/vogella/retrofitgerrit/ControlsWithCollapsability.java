package com.vogella.retrofitgerrit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.m.designandanimations.R;

public class ControlsWithCollapsability extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controls_with_collapsability);
        listView = findViewById(R.id.listBox);
        ArrayAdapter<String> newArrayAdapter = new ArrayAdapter<String>(ControlsWithCollapsability.this, R.layout.support_simple_spinner_dropdown_item, Controller.changeResponses);
        listView.setAdapter(newArrayAdapter);

    }
}
