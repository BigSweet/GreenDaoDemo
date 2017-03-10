package com.anlaiye.swt.greendaodemo;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.anye.greendao.gen.DaoMaster;
import com.anye.greendao.gen.DaoSession;

/**
 * 介绍：这里写介绍
 * 作者：sweet
 * 邮箱：sunwentao@imcoming.cn
 * 时间: 2017/3/9
 */

public class MyApplication extends Application {
    private DaoMaster.DevOpenHelper mHelper;
    private SQLiteDatabase db;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;


    public static MyApplication newInstance() {
        MyApplication fragment = new MyApplication();
        return fragment;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public void initData() {
        mHelper = new DaoMaster.DevOpenHelper(MyApplication.this, "swt-db", null);
        db = mHelper.getWritableDatabase();
        mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();
    }


    public DaoSession getSession() {
        if (mDaoSession == null) {
            initData();
        }
        return mDaoSession;
    }


}
