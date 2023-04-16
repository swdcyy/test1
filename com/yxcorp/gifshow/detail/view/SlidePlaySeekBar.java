package com.yxcorp.gifshow.detail.view.SlidePlaySeekBar;
import android.widget.SeekBar;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class SlidePlaySeekBar extends SeekBar	// class@001a68
{

    public void SlidePlaySeekBar(Context p0){
       super(p0);
    }
    public void SlidePlaySeekBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.setPadding(0, 0, 0, 0);
    }
    public void SlidePlaySeekBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setPadding(0, 0, 0, 0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       return false;
    }
}
