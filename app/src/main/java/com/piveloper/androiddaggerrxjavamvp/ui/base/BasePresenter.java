package com.piveloper.androiddaggerrxjavamvp.ui.base;

import com.piveloper.androiddaggerrxjavamvp.data.DataManager;

/**
 * Created by P.Mohr on 18.09.2017.
 */

public class BasePresenter<V extends BaseContract.View>
        implements BaseContract.Presenter<V> {

    private final DataManager mDataManager;
    private V mView;

    public BasePresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void attachView(V view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }

    @Override
    public void setUserAsLoggedOut() {

    }
}
