package com.piveloper.androiddaggerrxjavamvp.ui.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.piveloper.androiddaggerrxjavamvp.R;
import com.piveloper.androiddaggerrxjavamvp.di.qualifier.DrawerIntent;
import com.piveloper.androiddaggerrxjavamvp.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity implements LoginContract.View{
    @Inject
    LoginContract.Presenter<LoginContract.View> mPresenter;

    @Inject
    @DrawerIntent
    Intent mStartDrawerActivity;

    @BindView(R.id.et_email)
    EditText mEmailEditText;

    @BindView(R.id.et_password)
    EditText mPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getActivityComponent().inject(this);
        setUnBinder(ButterKnife.bind(this));
        mPresenter.onViewAttached(LoginActivity.this);
    }

    @OnClick(R.id.btn_server_login)
    void onLoginClick(View v){
        mPresenter.onLoginClicked(mEmailEditText.getText().toString(),
                mPasswordEditText.getText().toString());
    }

    @Override
    public void openDrawerActivity() {
        startActivity(mStartDrawerActivity);
        finish();
    }
}
