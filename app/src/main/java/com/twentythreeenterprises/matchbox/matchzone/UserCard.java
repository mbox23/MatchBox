package com.twentythreeenterprises.matchbox.matchzone;

import android.widget.ImageView;

/**
 * Created by bwelton on 3/20/18.
 */

public class UserCard {

    private String username;
    private String userid;

    public UserCard(){
        // TODO: 3/21/18 Construct usercard from backend
    }

    public String getUsername(){
        return new String(username);
    }

    protected String getUserid(){
        return new String(userid);
    }
}
