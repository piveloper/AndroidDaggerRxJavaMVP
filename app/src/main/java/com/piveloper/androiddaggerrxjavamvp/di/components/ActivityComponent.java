package com.piveloper.androiddaggerrxjavamvp.di.components;

import com.piveloper.androiddaggerrxjavamvp.di.modules.ActivityModule;
import com.piveloper.androiddaggerrxjavamvp.di.scopes.PerActivity;
import com.piveloper.androiddaggerrxjavamvp.ui.login.LoginActivity;
import com.piveloper.androiddaggerrxjavamvp.ui.splash.SplashActivity;

import dagger.Component;

/**
 * Created by P.Mohr on 18.09.2017.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(SplashActivity activity);

    void inject(LoginActivity activity);
}
