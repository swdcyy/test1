package com.kuaishou.gifshow.kuaishan.ui.feed.NoScrollViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NoScrollViewPager extends ViewPager	// class@001ad6
{

    public void NoScrollViewPager(Context p0){
       super(p0);
    }
    public void NoScrollViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean canScrollHorizontally(int p0){
       return false;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       return false;
    }
    public boolean onTouchEvent(MotionEvent p0){
       return false;
    }
}
