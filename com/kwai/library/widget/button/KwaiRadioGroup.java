package com.kwai.library.widget.button.KwaiRadioGroup;
import android.widget.RadioGroup;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;

public class KwaiRadioGroup extends RadioGroup	// class@000905
{
    public boolean b;

    public void KwaiRadioGroup(Context p0){
       super(p0);
    }
    public void KwaiRadioGroup(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b = (this.b != null || super.onInterceptTouchEvent(p0))? true: false;
       return b;
    }
    public void setInterceptTouchEvent(boolean p0){
       this.b = p0;
    }
}
