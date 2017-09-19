package com.piveloper.androiddaggerrxjavamvp.ui.login;

import com.piveloper.androiddaggerrxjavamvp.data.DataManager;
import com.piveloper.androiddaggerrxjavamvp.ui.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by P.Mohr on 18.09.2017.
 */

public class LoginPresenter<V extends LoginContract.View> extends BasePresenter<V>
        implements LoginContract.Presenter<V> {

    @Inject
    public LoginPresenter(DataManager mDataManager) {
        super(mDataManager);
    }

    @Override
    public void onLoginClicked(String title, String password) {
        getmView().openDrawerActivity();
    }
}
