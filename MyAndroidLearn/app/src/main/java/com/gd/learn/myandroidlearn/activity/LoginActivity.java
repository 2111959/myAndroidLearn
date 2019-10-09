package com.gd.learn.myandroidlearn.activity;

import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;

import com.gd.learn.myandroidlearn.R;
import com.gd.learn.myandroidlearn.bean.LoginBean;
import com.gd.learn.myandroidlearn.implement.LoginModelImple;
import com.gd.learn.myandroidlearn.model.LoginModel;
import com.gd.learn.myandroidlearn.presenter.LoginPresenter;
import com.gd.learn.myandroidlearn.utils.MyUtils;
import com.gd.learn.myandroidlearn.view.LoginView;

/**
 * Created by 第一步先新建一个MVP项目
 */
public class LoginActivity extends BaseMvpActivity<LoginModel, LoginView, LoginPresenter> implements LoginView {


    @BindView(R.id.edt_account)
    EditText edtAccount;
    @BindView(R.id.edt_psw)
    EditText edtPsw;


    @Override
    protected void initContentView(Bundle savedInstanceState) {
        setContentView(R.layout.activity_login);
    }

    @Override
    public void init() {

    }


    @Override
    public LoginModel createModel() {
        return new LoginModelImple();
    }

    @Override
    public LoginView createView() {
        return this;
    }

    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter();
    }


    @Override
    public String getAccount() {
        return edtAccount.getText().toString();
    }

    @Override
    public String getPassword() {
        return edtPsw.getText().toString();
    }

    @OnClick(R.id.btn_login)
    public void clickLoginBtn() {
        presenter.login(this);
    }

    @Override
    public void loginSuccess(LoginBean t) {
        MyUtils.showToast(this, "登录成功!" + "token:" + t.getToken());
    }

    @Override
    public void loginFail(String msg) {
        MyUtils.showToast(this, msg);
    }


}
