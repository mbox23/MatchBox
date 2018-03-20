package com.twentythreeenterprises.matchbox.matchzone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.twentythreeenterprises.matchbox.R;

public class MatchZone extends AppCompatActivity {
    private UserTray upperTray, lowerTray;
    private LinearLayout buttonBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_zone);
        initializeLayout();
    }

    private void initializeLayout(){
        upperTray = findViewById(R.id.upper_tray);
        lowerTray = findViewById(R.id.lower_tray);
        buttonBar = findViewById(R.id.button_bar);
    }
}
