package com.gd.learn.myandroidlearn.test;


import android.util.Log;


import com.gd.learn.myandroidlearn.utils.MyUtils;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class TestRxJava {

    public static TestRxJava testRxJava = null;

    String TAG = "";

    public static void main(String[] args) {
        if (testRxJava == null) {
            testRxJava = new TestRxJava();
        }
        testRxJava.test();
    }

    public void test() {
        MyUtils.logInformation("初始化Observable");
        //第一步，初始化Observable
        Observable
                .create(new ObservableOnSubscribe<Integer>() {
                    @Override
                    public void subscribe(@NonNull ObservableEmitter<Integer> emitter) throws Exception {
                        MyUtils.logInformation("RxJava2执行----------进程名称:" + Thread.currentThread().getName());
                        MyUtils.logInformation("RxJava2执行----------1");
                        emitter.onNext(1);
                        MyUtils.logInformation("RxJava2执行----------执行结束");
                        emitter.onComplete();
                    }
                })
                .subscribe(new Observer<Integer>() {
                    //第二步，订阅，并初始化Observer
                    //用于取消订阅
                    private Disposable mDisposable;

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        //赋值
                        mDisposable = d;
                    }

                    @Override
                    public void onNext(@NonNull Integer integer) {
                        MyUtils.logInformation("RxJava2执行----------订阅的值:" + integer);
                        if (integer == 2) {
                            //取消订阅
                            mDisposable.dispose();
                            MyUtils.logInformation("RxJava2执行----------取消订阅:" + integer);
                        }
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        MyUtils.logInformation("RxJava2执行----------失败");
                    }

                    @Override
                    public void onComplete() {
                        MyUtils.logInformation("RxJava2执行----------结束");
                    }
                });


    }

}
