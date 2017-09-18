package com.piveloper.androiddaggerrxjavamvp.ui.login;

import com.piveloper.androiddaggerrxjavamvp.data.DataManager;
import com.piveloper.androiddaggerrxjavamvp.ui.base.BasePresenter;

/**
 * Created by P.Mohr on 18.09.2017.
 */

public class Presenter<V extends LoginContract.View> extends BasePresenter<V>
        implements LoginContract.Presenter<V> {

    public Presenter(DataManager mDataManager) {
        super(mDataManager);
    }
}
