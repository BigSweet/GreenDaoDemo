package com.anlaiye.swt.greendaodemo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 介绍：这里写介绍
 * 作者：sweet
 * 邮箱：sunwentao@imcoming.cn
 * 时间: 2017/3/20
 */
@Entity
public class PeoPle {
    private  int test;

    @Generated(hash = 858056803)
    public PeoPle(int test) {
        this.test = test;
    }

    @Generated(hash = 1838377736)
    public PeoPle() {
    }

    public int getTest() {
        return this.test;
    }

    public void setTest(int test) {
        this.test = test;
    }

}
