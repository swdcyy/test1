package com.yxcorp.gifshow.widget.DisableTouchRelativeLayout;
import android.widget.RelativeLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class DisableTouchRelativeLayout extends RelativeLayout	// class@001819
{
    public boolean b;

    public void DisableTouchRelativeLayout(Context p0){
       super(p0, null);
    }
    public void DisableTouchRelativeLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void DisableTouchRelativeLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = false;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return this.b;
    }
    public void setInterceptTouch(boolean p0){
       this.b = p0;
    }
}
