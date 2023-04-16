package com.kwai.library.widget.viewpager.ScrollViewPager;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;

public class ScrollViewPager extends ViewPager	// class@000a74
{
    public int b;
    public boolean c;

    public void ScrollViewPager(Context p0){
       super(p0);
       this.c = false;
    }
    public void ScrollViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
       this.c = false;
    }
    public boolean canScrollHorizontally(int p0){
       if (this.c == null) {
          return false;
       }
       return super.canScrollHorizontally(p0);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       if (this.c == null) {
          return super.dispatchTouchEvent(p0);
       }
       int i = (int)p0.getX();
       int action = p0.getAction();
       if (action) {
          if (action == 2) {
             action = i - this.b;
             if (!this.getCurrentItem() && action > 0) {
                this.getParent().requestDisallowInterceptTouchEvent(false);
             }
          }
       }else {
          this.getParent().requestDisallowInterceptTouchEvent(true);
       }
       this.b = i;
       return super.dispatchTouchEvent(p0);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b = (this.c != null && super.onInterceptTouchEvent(p0))? true: false;
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       boolean b = (this.c != null && super.onTouchEvent(p0))? true: false;
       return b;
    }
    public void setScrollable(boolean p0){
       this.c = p0;
    }
}
