package com.gd.learn.myandroidlearn.model;

import io.reactivex.Observable;

import com.gd.learn.myandroidlearn.bean.LoginBean;
import com.gd.learn.myandroidlearn.rxjava.BaseEntity;

public interface LoginModel extends BaseModel {
    /**
     * 登录
     */
    Observable<BaseEntity<LoginBean>> login(String account, String psw);


}
