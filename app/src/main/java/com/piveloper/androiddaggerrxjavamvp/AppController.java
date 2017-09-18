package com.piveloper.androiddaggerrxjavamvp;

import android.app.Application;

import com.piveloper.androiddaggerrxjavamvp.data.DataManager;
import com.piveloper.androiddaggerrxjavamvp.di.components.ApplicationComponent;
import com.piveloper.androiddaggerrxjavamvp.di.components.DaggerApplicationComponent;
import com.piveloper.androiddaggerrxjavamvp.di.modules.ApplicationModule;

import javax.inject.Inject;

/**
 * Created by P.Mohr on 18.09.2017.
 */

public class AppController extends Application {
    @Inject
    DataManager mDataManager;

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
        mApplicationComponent.inject(this);
    }


}
