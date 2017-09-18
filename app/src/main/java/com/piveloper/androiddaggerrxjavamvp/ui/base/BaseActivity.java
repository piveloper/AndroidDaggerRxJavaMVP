package com.piveloper.androiddaggerrxjavamvp.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.piveloper.androiddaggerrxjavamvp.AppController;
import com.piveloper.androiddaggerrxjavamvp.di.components.ActivityComponent;
import com.piveloper.androiddaggerrxjavamvp.di.components.DaggerActivityComponent;
import com.piveloper.androiddaggerrxjavamvp.di.modules.ActivityModule;

/**
 * Created by P.Mohr on 18.09.2017.
 */

public class BaseActivity extends AppCompatActivity implements BaseContract.View {

    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((AppController) getApplication()).getApplicationComponent())
                .build();
    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showError(String error) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }
}
