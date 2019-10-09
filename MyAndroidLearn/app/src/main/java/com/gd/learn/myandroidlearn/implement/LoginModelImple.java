package com.gd.learn.myandroidlearn.implement;

import io.reactivex.Observable;

import com.gd.learn.myandroidlearn.bean.LoginBean;
import com.gd.learn.myandroidlearn.model.LoginModel;
import com.gd.learn.myandroidlearn.retrofit.RetrofitFactory;
import com.gd.learn.myandroidlearn.rxjava.BaseEntity;

/**
 * Created by 第一步先新建一个MVP项目 .
 * 在这里只负责处理或获取数据，不直接与View交互
 */
public class LoginModelImple implements LoginModel {

    @Override
    public Observable<BaseEntity<LoginBean>> login(String account, String psw) {
        return RetrofitFactory.getInstance().login(account, psw);
    }

}
