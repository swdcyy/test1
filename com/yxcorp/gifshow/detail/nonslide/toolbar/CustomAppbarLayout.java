package com.yxcorp.gifshow.detail.nonslide.toolbar.CustomAppbarLayout;
import com.google.android.material.appbar.AppBarLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public final class CustomAppbarLayout extends AppBarLayout	// class@0015e8
{

    public void CustomAppbarLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean onStartNestedScroll(View p0,View p1,int p2){
       return true;
    }
}
