package com.omar.mvp.ui.Base;


import com.omar.mvp.data.DataManager;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Omar on 3/29/2018.
 */

public class BasePresenter <V extends BaseMvpView> implements BaseMvpPresenter<V> {

    private final CompositeDisposable mCompositeDisposable;
    private final DataManager mDataManager;
    private V mMvpView;

    @Inject
    public BasePresenter( DataManager mDataManager , CompositeDisposable mCompositeDisposable) {
        this.mDataManager = mDataManager;
        this.mCompositeDisposable = mCompositeDisposable;
    }

    @Override
    public void onAttach(V mvpView) {
        this.mMvpView = mvpView;
    }

    @Override
    public void onDetach() {
        mCompositeDisposable.dispose();
        this.mMvpView = null;
    }


    public boolean isViewAttached() {
        return mMvpView != null;
    }


    public V getMvpView() {
        return mMvpView;
    }


    public CompositeDisposable getCompositeDisposable() {
        return mCompositeDisposable;
    }


    public DataManager getDataManager() {
        return mDataManager;
    }

}
