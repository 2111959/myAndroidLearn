package com.gd.learn.myandroidlearn.presenter;

import com.gd.learn.myandroidlearn.model.TestMVPModel;
import com.gd.learn.myandroidlearn.view.TestMVPView;

/**
 * Created by MVP测试样例
 */
public class TestMVPPresenter extends BasePresenter<TestMVPModel, TestMVPView> {

    /**
     * 获取数据
     */
    public void getData() {

    }

    @Override
    protected void onViewDestroy() {
        if (model != null) {
            model.stopRequest();
        }
    }
}