package com.piveloper.androiddaggerrxjavamvp.ui.splash;

import android.content.Intent;
import android.os.Bundle;

import com.piveloper.androiddaggerrxjavamvp.ui.base.BaseActivity;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements SplashContract.View {
    @Inject
    SplashContract.Presenter<SplashContract.View> mPresenter;

    @Inject
    Intent mStartLoginActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivityComponent().inject(this);

        mPresenter.onViewAttached(SplashActivity.this);
        mPresenter.decideNextActivity();
    }

    @Override
    public void openLoginAcitivity() {
        startActivity(mStartLoginActivity);
        finish();
    }

    @Override
    public void openDrawerActivity() {
        finish();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onViewDetached();
        super.onDestroy();
    }
}
