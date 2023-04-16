package com.yxcorp.gifshow.util.ExceptionHorizontalScrollView;
import android.widget.HorizontalScrollView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Math;

public class ExceptionHorizontalScrollView extends HorizontalScrollView	// class@001eea
{
    public int b;
    public int c;

    public void ExceptionHorizontalScrollView(Context p0){
       super(p0);
    }
    public void ExceptionHorizontalScrollView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ExceptionHorizontalScrollView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       int i = (int)p0.getX();
       int i1 = (int)p0.getY();
       int i2 = p0.getAction() & 0x00ff;
       boolean b = true;
       if (i2) {
          if (i2 == b || (i2 == 2 && Math.abs((i - this.b)) > Math.abs((i1 - this.c)))) {
          label_0032 :
             this.c = i1;
             this.b = i;
             return b;
          }
       }else {
          super.onInterceptTouchEvent(p0);
       }
       b = false;
       goto label_0032 ;
    }
}
