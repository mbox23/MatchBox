package com.twentythreeenterprises.matchbox.matchzone;

import android.content.Context;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

import com.twentythreeenterprises.matchbox.R;

/**
 * This is the class that the user interacts with when looking through people to match up.
 * Includes ability to long tap for a more detailed view of the profile and the ability to
 * swipe right or left to move through the list of users.
 * Created by bwelton on 3/20/18.
 */

public class UserTray extends RelativeLayout implements GestureDetector.OnGestureListener{
    private final int TRAY_LAYOUT = R.layout.user_tray;

    public UserTray(Context context) {
        super(context);
        initializeLayout(context);
    }

    // TODO: 3/20/18 Implement the actual layout
    private void initializeLayout(Context context){
        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mInflater.inflate(TRAY_LAYOUT, this, true);
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    // TODO: 3/20/18 Implement user selected on single tap
    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        return false;
    }

    // TODO: 3/20/18 Implement show more details on long tap, should bring up a dialog of some sort
    @Override
    public void onLongPress(MotionEvent motionEvent) {

    }

    // TODO: 3/20/18 Implement next, previous
    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        if(v < 0){
            previousUser();
        }else{
            nextUser();
        }
        return false;
    }

    private void previousUser(){
        Log.d("Test", "Swipe left");
    }

    private void nextUser(){
        Log.d("Test", "Swipe right");
    }
}
