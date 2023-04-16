package com.kuaishou.merchant.live.basic.widget.NoTouchFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NoTouchFrameLayout extends FrameLayout	// class@0018d4
{

    public void NoTouchFrameLayout(Context p0){
       super(p0);
    }
    public void NoTouchFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void NoTouchFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       return false;
    }
}
