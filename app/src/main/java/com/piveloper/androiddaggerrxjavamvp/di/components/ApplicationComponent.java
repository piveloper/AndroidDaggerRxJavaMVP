package com.piveloper.androiddaggerrxjavamvp.di.components;

import android.content.Context;

import com.piveloper.androiddaggerrxjavamvp.AppController;
import com.piveloper.androiddaggerrxjavamvp.data.DataManager;
import com.piveloper.androiddaggerrxjavamvp.di.modules.ApplicationModule;
import com.piveloper.androiddaggerrxjavamvp.di.qualifier.ApplicationContext;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by P.Mohr on 18.09.2017.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(AppController appController);

    DataManager getDataManager();
}
