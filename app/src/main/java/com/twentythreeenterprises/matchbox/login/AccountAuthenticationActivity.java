package com.twentythreeenterprises.matchbox.login;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.twentythreeenterprises.matchbox.R;
import com.twentythreeenterprises.matchbox.engine.Controller;
import com.twentythreeenterprises.matchbox.matchzone.MatchZone;

import java.util.Arrays;

public class AccountAuthenticationActivity extends AppCompatActivity {
    private static final String EMAIL = "email";

    private Activity activity;
    private Controller myController;
    private CallbackManager callbackManager;
    private LoginButton loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_authentication);
        initialize();
    }

    private void initialize(){
        myController = new Controller();
        activity = this;
        callbackManager = CallbackManager.Factory.create();

        loginButton = findViewById(R.id.login_button);
        loginButton.setReadPermissions(Arrays.asList(EMAIL));

        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                AccessToken access = loginResult.getAccessToken();
                String userId = access.getUserId();
                Log.d("facebook", "success");
                if(myController.validateAccount(userId)){
                    Log.d("facebook", "validated");
                    startActivity(new Intent(activity, MatchZone.class));
                    finish();
                }else {
                    //launch new account creation
                }
            }

            @Override
            public void onCancel() {
                // do nothing
                Log.d("facebook", "cancel");
            }

            @Override
            public void onError(FacebookException exception) {
                // TODO: 3/22/18 Launch error dialog
                Log.d("facebook", "error");
            }
        });
    }
}
