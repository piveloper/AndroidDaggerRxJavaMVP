package com.piveloper.androiddaggerrxjavamvp.ui.base;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by P.Mohr on 18.09.2017.
 */

public class BaseActivity extends AppCompatActivity implements BaseContract.View {
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
}
