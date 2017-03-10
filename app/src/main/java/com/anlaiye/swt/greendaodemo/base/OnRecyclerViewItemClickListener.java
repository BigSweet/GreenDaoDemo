package com.anlaiye.swt.greendaodemo.base;

import android.view.View;

public interface OnRecyclerViewItemClickListener<T> {

    /**
     * 点击
     * @param position
     * @param t
     */
    void onClick(int position, T t, View view);


}
