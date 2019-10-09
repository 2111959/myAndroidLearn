package com.gd.learn.myandroidlearn.model;

/**
 * Created by MVP测试样例
 */
public interface TestMVPModel extends BaseModel {
    void getData();

    /**
     * 停止请求
     */
    void stopRequest();
}