package com.gd.learn.myandroidlearn;

import com.gd.learn.myandroidlearn.model.BaseModel;
import com.gd.learn.myandroidlearn.presenter.BasePresenter;
import com.gd.learn.myandroidlearn.view.BaseView;

public interface BaseMvp<M extends BaseModel, V extends BaseView, P extends BasePresenter> {
    M createModel();

    V createView();

    P createPresenter();
}
