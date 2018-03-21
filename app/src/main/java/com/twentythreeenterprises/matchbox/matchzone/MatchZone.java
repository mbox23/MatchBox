package com.twentythreeenterprises.matchbox.matchzone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import com.twentythreeenterprises.matchbox.R;

public class MatchZone extends AppCompatActivity {
    private UserTray upperTray, lowerTray;
    private RelativeLayout buttonBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match_zone);
        initializeController();
        initializeLayout();
    }

    // TODO: 3/21/18 Initialize the controller and the socket, possibly fill trays
    private void initializeController(){

    }

    private void initializeLayout(){
//        upperTray = findViewById(R.id.upper_tray);
//        lowerTray = findViewById(R.id.lower_tray);
//        buttonBar = findViewById(R.id.button_bar);
    }
}
