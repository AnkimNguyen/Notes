package com.example.ankim.messinaroun.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button  button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.ankim.messinaroun.feature.R.layout.activity_main);

        button= (Button) findViewById(com.example.ankim.messinaroun.feature.R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotes();

            }
        });
    }
    public void openNotes(){
        Intent intent = new Intent(this, NotesPage.class);
        startActivity(intent);
    }
}
