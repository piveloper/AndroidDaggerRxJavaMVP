package com.piveloper.androiddaggerrxjavamvp.ui.drawer;

import com.piveloper.androiddaggerrxjavamvp.ui.base.BaseContract;


/**
 * Created by Philipp on 19.09.2017.
 */

public interface DrawerContract {
    interface View extends BaseContract.View{


    }
    interface Presenter<V extends DrawerContract.View> extends BaseContract.Presenter<V>{

    }
}
