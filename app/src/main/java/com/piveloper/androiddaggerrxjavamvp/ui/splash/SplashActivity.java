package com.piveloper.androiddaggerrxjavamvp.ui.splash;

import android.os.Bundle;

import com.piveloper.androiddaggerrxjavamvp.ui.base.BaseActivity;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements SplashContract.View {
    @Inject
    SplashContract.Presenter<SplashContract.View> mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivityComponent().inject(this);

        mPresenter.attachView(SplashActivity.this);
    }

    @Override
    public void openLoginAcitivity() {

    }

    @Override
    public void openDrawerActivity() {

    }

    @Override
    protected void onDestroy() {
        mPresenter.detachView();
        super.onDestroy();
    }
}
