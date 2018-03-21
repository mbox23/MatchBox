package com.twentythreeenterprises.matchbox.matchzone;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.twentythreeenterprises.matchbox.R;
import com.twentythreeenterprises.matchbox.engine.Controller;

/**
 * This is the class that the user interacts with when looking through people to match up.
 * Includes ability to long tap for a more detailed view of the profile and the ability to
 * swipe right or left to move through the list of users.
 * Created by bwelton on 3/20/18.
 */

public class UserTray extends ConstraintLayout implements GestureDetector.OnGestureListener{
    private final int TRAY_LAYOUT = R.layout.user_tray;

    private Controller myController;
    private View trayView;
    private TextView username;
    private ImageView image;
    private ListView description;

    private boolean matchSelected = false;
    private UserCard currentUser;

    public UserTray(Context context) {
        super(context);
        initializeLayout(context);
    }

    public UserTray(Context context, AttributeSet attrs) {
        super(context, attrs);
        initializeLayout(context);
    }

    public UserTray(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initializeLayout(context);
    }

    private void initializeLayout(Context context){
        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        trayView = mInflater.inflate(TRAY_LAYOUT, this, true);
        username = trayView.findViewById(R.id.username);
        image = trayView.findViewById(R.id.profile_image);
        description = trayView.findViewById(R.id.description);
    }

    protected void initializeTray(Controller controller){
        myController = controller;
        nextUser();
    }

    private void previousUser(){
        Log.d("Test", "Swipe left");
    }

    private void nextUser(){
        //receive some new user from the controller
        //deal with the queue of previous users
//        UserCard next = myController.nextMatch();
//        username.setText(next.getUsername());
        //set imageview
        //set list of interests or description
        //currentUser = next;
        Log.d("Test", "Swipe right");
    }

    public boolean isMatchSelected(){
        return matchSelected;
    }

    public UserCard getCurrentMatch(){
        return currentUser;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {

    }

    // TODO: 3/20/18 Implement a visible change when the current match is selected
    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        matchSelected = !matchSelected;
        //toggle visible layout conditions
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
}
