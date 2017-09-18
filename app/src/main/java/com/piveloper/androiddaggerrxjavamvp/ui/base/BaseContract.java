package com.piveloper.androiddaggerrxjavamvp.ui.base;

/**
 * Created by P.Mohr on 18.09.2017.
 */

public interface BaseContract {
    interface View{
        void showMessage(String message);

        void showError(String error);

        void showLoading();

        void hideLoading();
    }
    interface Presenter<V extends BaseContract.View>{
        void onViewAttached(V view);

        void onViewDetached();

        void onUserSetAsLoggedOut();
    }
}
