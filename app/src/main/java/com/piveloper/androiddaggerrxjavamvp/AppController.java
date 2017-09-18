package com.piveloper.androiddaggerrxjavamvp;

import android.app.Application;

import com.piveloper.androiddaggerrxjavamvp.di.components.ApplicationComponent;

/**
 * Created by P.Mohr on 18.09.2017.
 */

public class AppController extends Application {
    public static ApplicationComponent sApplicationComponent;

    ApplicationComponent getApplicationComponent(){
        return sApplicationComponent;
    }
    @Override
    public void onCreate() {
        super.onCreate();
    }
}
