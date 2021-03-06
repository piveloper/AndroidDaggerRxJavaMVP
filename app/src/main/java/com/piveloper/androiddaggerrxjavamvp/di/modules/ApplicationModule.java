package com.piveloper.androiddaggerrxjavamvp.di.modules;

import android.content.Context;

import com.piveloper.androiddaggerrxjavamvp.AppController;
import com.piveloper.androiddaggerrxjavamvp.data.DataManager;
import com.piveloper.androiddaggerrxjavamvp.data.ImplDataManager;
import com.piveloper.androiddaggerrxjavamvp.di.qualifier.ApplicationContext;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by P.Mohr on 18.09.2017.
 */

@Module
public class ApplicationModule {
    private final AppController mApplication;

    public ApplicationModule(AppController mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return mApplication;
    }

    @Provides
    @ApplicationContext
    AppController provideAppController(){
        return mApplication;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(ImplDataManager dataManager){
        return dataManager;
    }
}
