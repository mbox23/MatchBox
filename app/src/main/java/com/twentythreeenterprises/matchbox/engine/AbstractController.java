package com.twentythreeenterprises.matchbox.engine;

import com.twentythreeenterprises.matchbox.matchzone.UserCard;

/**
 * Created by bwelton on 3/15/18.
 */

public interface AbstractController {

    /**
     * Create a new user account
     * @// TODO: 3/15/18 Security concerns. Need to address at what stage we hash passwords 
     * @// TODO: 3/15/18 Eventually may need to return data structure to prompt info or autoload info
     * @param username
     * @param password
     */
    public void addAccount(String username, String password);

    /**
     * Check to see if the inputted username and password match a valid Matchbox account
     * @// TODO: 3/15/18 Security concerns. Need to address at what stage we hash passwords 
     * @// TODO: 3/15/18 Eventually may need to return data structure to autoload info
     * @param username
     * @param password
     * @return
     */
    public boolean validateAccount(String username, String password);

    public void changeSetting(String settingName, String value);

    public String querySetting(String settingName);

    public void acceptMatch();

    public void rejectMatch();

    public void rateMatch(int value, String review);

    public void rateMatchmaker(int value, String review);

    /**
     * Return the next Matchcard object
     * @// TODO: 3/15/18 Do we want the matchcards held on back end or fed information and created
     * @// by request on front end?
     * @return
     */
    public UserCard nextMatch();

    public UserCard nextMatchee();


}
