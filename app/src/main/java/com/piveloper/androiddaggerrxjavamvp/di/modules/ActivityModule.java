package com.piveloper.androiddaggerrxjavamvp.di.modules;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import com.piveloper.androiddaggerrxjavamvp.di.qualifier.ActivityContext;
import com.piveloper.androiddaggerrxjavamvp.di.scopes.PerActivity;
import com.piveloper.androiddaggerrxjavamvp.ui.login.LoginActivity;
import com.piveloper.androiddaggerrxjavamvp.ui.splash.SplashContract;
import com.piveloper.androiddaggerrxjavamvp.ui.splash.SplashPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by P.Mohr on 18.09.2017.
 */
@Module
public class ActivityModule {
    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mActivity;
    }

    @Provides
    @PerActivity
    SplashContract.Presenter<SplashContract.View> provideSplashPresenter(SplashPresenter<SplashContract.View> presenter){
        return presenter;
    }

    @Provides
    Intent provideStartLoginActivity(@ActivityContext Context context){
        return new Intent(context, LoginActivity.class);
    }
}
