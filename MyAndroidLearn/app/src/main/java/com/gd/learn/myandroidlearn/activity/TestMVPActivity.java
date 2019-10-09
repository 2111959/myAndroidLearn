package com.gd.learn.myandroidlearn.activity;

import android.os.Bundle;

import com.gd.learn.myandroidlearn.R;
import com.gd.learn.myandroidlearn.implement.TestMVPModelImple;
import com.gd.learn.myandroidlearn.model.TestMVPModel;
import com.gd.learn.myandroidlearn.presenter.TestMVPPresenter;
import com.gd.learn.myandroidlearn.view.TestMVPView;

/**
 * Created by MVP测试样例
 */
public class TestMVPActivity extends BaseMvpActivity<TestMVPModel, TestMVPView, TestMVPPresenter> implements TestMVPView {


    @Override
    protected void initContentView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_test_mvp);
    }

    @Override
    public void init() {
        presenter.getData();
    }

    @Override
    public TestMVPModel createModel() {
        return new TestMVPModelImple();
    }

    @Override
    public TestMVPView createView() {
        return this;
    }

    @Override
    public TestMVPPresenter createPresenter() {
        return new TestMVPPresenter();
    }

    @Override
    public void setData() {

    }

    @Override
    public void back() {
        finish();
    }
}