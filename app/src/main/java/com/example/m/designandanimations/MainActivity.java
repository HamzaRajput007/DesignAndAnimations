package com.example.m.designandanimations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vogella.retrofitgerrit.Controller;
import com.vogella.retrofitgerrit.ControlsWithCollapsability;

public class MainActivity extends AppCompatActivity {

    Button changesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changesBtn = findViewById(R.id.btnChanges);
        changesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ControlsWithCollapsability.class);
                startActivity(intent);
            }
        });

        Controller controller = new Controller();
        controller.start();


    }

}
