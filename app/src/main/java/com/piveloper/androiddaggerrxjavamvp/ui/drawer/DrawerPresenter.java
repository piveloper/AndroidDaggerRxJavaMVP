package com.piveloper.androiddaggerrxjavamvp.ui.drawer;

import com.piveloper.androiddaggerrxjavamvp.data.DataManager;
import com.piveloper.androiddaggerrxjavamvp.ui.base.BasePresenter;

/**
 * Created by Philipp on 19.09.2017.
 */

public class DrawerPresenter<V extends DrawerContract.View> extends BasePresenter<V>
        implements DrawerContract.Presenter<V>  {

    public DrawerPresenter(DataManager mDataManager) {
        super(mDataManager);
    }
}
