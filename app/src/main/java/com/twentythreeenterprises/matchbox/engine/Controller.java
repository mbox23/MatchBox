package com.twentythreeenterprises.matchbox.engine;

import com.twentythreeenterprises.matchbox.matchzone.UserCard;

/**
 * Created by bwelton on 3/22/18.
 */

public class Controller implements AbstractController {
    @Override
    public void addAccount(String username, String password) {

    }

    @Override
    public boolean validateAccount(String username, String password) {
        return false;
    }

    @Override
    public void changeSetting(String settingName, String value) {

    }

    @Override
    public String querySetting(String settingName) {
        return null;
    }

    @Override
    public void acceptMatch() {

    }

    @Override
    public void rejectMatch() {

    }

    @Override
    public void rateMatch(int value, String review) {

    }

    @Override
    public void rateMatchmaker(int value, String review) {

    }

    @Override
    public UserCard nextMatch() {
        return null;
    }

    @Override
    public UserCard nextMatchee() {
        return null;
    }
}
