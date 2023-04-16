package com.kwai.library.widget.deprecated.UnSrollGridView;
import android.widget.GridView;
import android.view.ViewConfiguration;
import android.content.Context;
import com.kwai.library.widget.deprecated.UnSrollGridView$b;
import com.kwai.library.widget.deprecated.UnSrollGridView$a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.kwai.library.widget.deprecated.UnSrollGridView$c;
import java.lang.Runnable;
import android.os.SystemClock;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.view.View$MeasureSpec;

public class UnSrollGridView extends GridView	// class@000922
{
    public boolean b;
    public Context c;
    public UnSrollGridView$c d;
    public long e;
    public int f;
    public boolean g;
    public UnSrollGridView$b h;
    public static final long i;

    static {
       UnSrollGridView.i = (long)ViewConfiguration.getLongPressTimeout();
    }
    public void UnSrollGridView(Context p0){
       super(p0);
       this.f = -1;
       this.h = new UnSrollGridView$b(this, null);
       this.c = p0;
    }
    public void UnSrollGridView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = -1;
       this.h = new UnSrollGridView$b(this, null);
       this.c = p0;
    }
    public final int a(MotionEvent p0){
       float rawX = p0.getRawX();
       float rawY = p0.getRawY();
       int childCount = this.getChildCount();
       int[] ointArray = new int[2];
       int width = this.getChildAt(0).getWidth();
       int height = this.getChildAt(0).getHeight();
       int i = 0;
       while (true) {
          if (i < childCount) {
             this.getChildAt(i).getLocationOnScreen(ointArray);
             if (rawX - (float)ointArray[0] >= 0) {
                int i1 = ointArray[0] + width;
                if (rawX - (float)i1 <= 0) {
                   i1 = 1;
                   if (rawY - (float)ointArray[i1] > 0) {
                      i1 = ointArray[i1] + height;
                      if (rawY - (float)i1 <= 0) {
                         break ;
                      }
                   }
                }
             }
             i = i + 1;
          }else {
             i = -1;
             break ;
          }
       }
       return i;
    }
    public void b(int p0){
       UnSrollGridView td = this.d;
       if (td != null) {
          UnSrollGridView tf = this.f;
          if (p0 != tf) {
             if (p0 == -1) {
                td.a();
             }else {
                td.b(tf, p0);
             }
             this.f = p0;
          }
       }
       return;
    }
    public final void c(MotionEvent p0){
       if (this.g != null) {
          int i = p0.getAction() & 0x00ff;
          if (this.a(p0) != -1 && (i == 3 || i == 1)) {
             this.removeCallbacks(this.h);
             this.g = false;
          }
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       int i = p0.getAction() & 0x00ff;
       p0.getAction();
       if (i == 3 || i == 1) {
          this.c(p0);
          this.getParent().requestDisallowInterceptTouchEvent(true);
          UnSrollGridView td = this.d;
          if (td != null) {
             td.c();
          }
          return false;
       }else if(i){
          if (i == 2) {
             this.c(p0);
             if ((SystemClock.elapsedRealtime() - this.e) - UnSrollGridView.i > 0) {
                this.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
             }
          }
       }else {
          this.e = SystemClock.elapsedRealtime();
          this.f = -1;
          UnSrollGridView th = this.h;
          th.b = this.a(p0);
          this.postDelayed(th, UnSrollGridView.i);
          this.g = true;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       this.b = false;
       super.onLayout(p0, p1, p2, p3, p4);
    }
    public void onMeasure(int p0,int p1){
       this.b = true;
       super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(0x1fffffff, Integer.MIN_VALUE));
    }
    public boolean onTouchEvent(MotionEvent p0){
       int i = p0.getAction() & 0x00ff;
       p0.getAction();
       if (i == 2) {
          this.c(p0);
          if ((SystemClock.elapsedRealtime() - this.e) - UnSrollGridView.i < 0) {
             return super.onTouchEvent(p0);
          }else {
             this.b(this.a(p0));
          }
       }else if(i == 3 || i == 1){
          this.c(p0);
          UnSrollGridView td = this.d;
          if (td != null) {
             td.c();
          }
       }
       return super.onTouchEvent(p0);
    }
    public void setOnLongClickPreviewListener(UnSrollGridView$c p0){
       this.d = p0;
    }
}
