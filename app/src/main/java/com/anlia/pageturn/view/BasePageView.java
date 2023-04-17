package com.anlia.pageturn.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/*
 * User: xuhuawei
 * Date: 2022/7/10
 * Desc:
 */ public  class BasePageView extends View {

    public BasePageView(Context context) {
        super(context);
    }

    public BasePageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BasePageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
