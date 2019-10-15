package com.gd.learn.myandroidlearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gd.learn.myandroidlearn.activity.TestMVPActivity;
import com.gd.learn.myandroidlearn.test.TestRxJava;
import com.gd.learn.myandroidlearn.utils.MyUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button enterMVP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewId();
        initOnClickListener();
    }

    private void initViewId() {
        enterMVP = findViewById(R.id.enterMVP);
    }

    private void initOnClickListener() {
        enterMVP.setOnClickListener(this);
    }

    public void enterMVP() {
//        MyUtils.logInformation("进入MVP项目");
//        Intent intent = new Intent(this, TestMVPActivity.class);
//        startActivity(intent);
        TestRxJava testRxJava=new TestRxJava();
        testRxJava.test();
//        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.enterMVP:
                enterMVP();
                break;
        }
    }
}
