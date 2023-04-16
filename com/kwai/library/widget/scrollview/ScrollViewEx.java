package com.kwai.library.widget.scrollview.ScrollViewEx;
import android.widget.ScrollView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.kwai.library.widget.scrollview.ScrollViewEx$a;
import android.view.ViewGroup;
import java.lang.Exception;
import com.kwai.library.widget.scrollview.ScrollViewEx$d;
import com.kwai.library.widget.scrollview.ScrollViewEx$b;
import android.view.View;
import com.kwai.library.widget.scrollview.ScrollViewEx$c;

public class ScrollViewEx extends ScrollView	// class@0009ec
{
    public ScrollViewEx$d b;
    public ScrollViewEx$a c;
    public ScrollViewEx$c d;
    public ScrollViewEx$b e;
    public boolean f;

    public void ScrollViewEx(Context p0){
       super(p0);
       this.f = true;
    }
    public void ScrollViewEx(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = true;
    }
    public void ScrollViewEx(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = true;
    }
    public void a(){
       this.f = false;
    }
    public void b(){
       this.f = true;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       boolean b = true;
       try{
          ScrollViewEx tc = this.c;
          if (tc != null && tc.dispatchTouchEvent(p0)) {
             return b;
          }
          if (this.f == null) {
             return false;
          }
          return super.dispatchTouchEvent(p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          return (this.f ^ b);
       }
    }
    public ScrollViewEx$a getOnDispatchListener(){
       return this.c;
    }
    public ScrollViewEx$d getOnSizeChangedListener(){
       return this.b;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       ScrollViewEx te = this.e;
       if (te != null) {
          return te.a(p0);
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       super.onScrollChanged(p0, p1, p2, p3);
       ScrollViewEx td = this.d;
       if (td != null) {
          td.a(p1);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       ScrollViewEx tb = this.b;
       if (tb != null) {
          tb.onSizeChanged(p0, p1, p2, p3);
       }
       return;
    }
    public void setInterceptTouchListener(ScrollViewEx$b p0){
       this.e = p0;
    }
    public void setOnDispatchListener(ScrollViewEx$a p0){
       this.c = p0;
    }
    public void setOnSizeChangedListener(ScrollViewEx$d p0){
       this.b = p0;
    }
    public void setScrollViewListener(ScrollViewEx$c p0){
       this.d = p0;
    }
}
