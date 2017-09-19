package com.piveloper.androiddaggerrxjavamvp.ui.login;

import com.piveloper.androiddaggerrxjavamvp.ui.base.BaseContract;

/**
 * Created by P.Mohr on 18.09.2017.
 */

public interface LoginContract {
    interface View extends BaseContract.View{
        void openDrawerActivity();
    }
    interface Presenter<V extends LoginContract.View> extends BaseContract.Presenter<V>{
        void onLoginClicked(String title, String password);
    }
}
