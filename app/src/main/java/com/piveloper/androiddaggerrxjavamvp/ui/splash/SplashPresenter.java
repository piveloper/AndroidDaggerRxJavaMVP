package com.piveloper.androiddaggerrxjavamvp.ui.splash;

import com.piveloper.androiddaggerrxjavamvp.data.DataManager;
import com.piveloper.androiddaggerrxjavamvp.ui.base.BasePresenter;

/**
 * Created by P.Mohr on 18.09.2017.
 */

public class SplashPresenter<V extends SplashContract.View> extends BasePresenter<V>
        implements  SplashContract.Presenter<V>{

    public SplashPresenter(DataManager mDataManager) {
        super(mDataManager);
    }


}
