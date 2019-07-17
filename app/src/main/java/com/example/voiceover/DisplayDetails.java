package com.example.voiceover;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.ramotion.foldingcell.FoldingCell;

public class DisplayDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_details);
        final FoldingCell fc = findViewById(R.id.folding_cell);

        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fc.toggle(false);
            }
        });
    }
}
