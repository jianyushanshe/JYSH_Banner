package com.jianyushanshe.bannerlib.holder;

/**
 * Author:wangjianming
 * Time:2019/6/3
 * Description:
 */
import android.content.Context;
import android.view.View;

public interface Holder<T>{
    View createView(Context context);
    void UpdateUI(Context context, int position, T data);
}