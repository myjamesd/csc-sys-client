package cn.tomoya.android.md.presenter.contract;

import android.support.annotation.NonNull;

public interface IUserDetailPresenter {

    void getUserAsyncTask(@NonNull String loginName);

}
