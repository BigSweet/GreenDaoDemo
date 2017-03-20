package com.anlaiye.swt.greendaodemo.base;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.anye.greendao.gen.DaoMaster;
import com.anye.greendao.gen.DaoSession;

/**
 * 介绍：这里写介绍
 * 作者：sweet
 * 邮箱：sunwentao@imcoming.cn
 * 时间: 2017/3/20
 */

public abstract class BaseActivity extends AppCompatActivity {
     DaoMaster.DevOpenHelper mHelper;
     SQLiteDatabase db;
     DaoMaster mDaoMaster;
    public DaoSession mDaoSession;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        openDb();
        initview();
    }

    protected abstract void initview();

    protected abstract int getLayoutId();


    private void openDb() {
        mHelper = new DaoMaster.DevOpenHelper(this, getDbName(), null);
        db = mHelper.getWritableDatabase();
        mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();
        getDao();
    }

    protected abstract void getDao();

    protected abstract String getDbName();

}
