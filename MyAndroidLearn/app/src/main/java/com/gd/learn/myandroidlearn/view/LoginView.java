package com.gd.learn.myandroidlearn.view;

import com.gd.learn.myandroidlearn.bean.LoginBean;

/**
 * Created by 第一步先新建一个MVP项目
 * 在这里定义布局上需要实现的工作
 * 如获取数据、显示数据等等
 */
public interface LoginView extends BaseView {

    /**
     * 获取账号
     */
    String getAccount();

    /**
     * 获取密码
     */
    String getPassword();

    /**
     * 点击登陆按钮
     */
    void clickLoginBtn();

    /**
     * 登录成功
     */
    void loginSuccess(LoginBean t);

    /**
     * 登录失败
     */
    void loginFail(String msg);
}
