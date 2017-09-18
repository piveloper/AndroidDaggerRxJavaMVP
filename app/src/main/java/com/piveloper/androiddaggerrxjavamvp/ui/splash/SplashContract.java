package com.piveloper.androiddaggerrxjavamvp.ui.splash;

import com.piveloper.androiddaggerrxjavamvp.ui.base.BaseContract;

/**
 * Created by P.Mohr on 18.09.2017.
 */

public interface SplashContract {
    interface View extends BaseContract.View{
        void openLoginAcitivity();

        void openDrawerActivity();
    }
    interface Presenter<V extends SplashContract.View> extends BaseContract.Presenter<V>{
        void decideNextActivity();
    }
}
