package com.gd.learn.myandroidlearn.activity;

import android.os.Bundle;
import android.widget.Button;

import com.gd.learn.myandroidlearn.R;
import com.gd.learn.myandroidlearn.implement.TestMVPModelImple;
import com.gd.learn.myandroidlearn.model.TestMVPModel;
import com.gd.learn.myandroidlearn.presenter.TestMVPPresenter;
import com.gd.learn.myandroidlearn.test.TestRxJava;
import com.gd.learn.myandroidlearn.utils.MyUtils;
import com.gd.learn.myandroidlearn.view.TestMVPView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by MVP测试样例
 */
public class TestMVPActivity extends BaseMvpActivity<TestMVPModel, TestMVPView, TestMVPPresenter> implements TestMVPView {

    @BindView(R.id.enterSeekBar)
    Button enterSeekBar;


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

    @OnClick(R.id.enterSeekBar)
    public void enterSeekBar() {
        MyUtils.logInformation("进入seekBar界面");


    }

    @Override
    public void back() {
        finish();
    }
}