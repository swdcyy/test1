package com.google.android.material.bottomsheet.ForwardBottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Math;
import java.lang.IllegalArgumentException;

public final class ForwardBottomSheetBehavior extends BottomSheetBehavior	// class@00165e
{
    public boolean a;
    public int b;
    public int c;

    public void ForwardBottomSheetBehavior(){
       super();
       this.a = true;
       this.b = -1;
       this.c = -1;
    }
    public void ForwardBottomSheetBehavior(Context p0,AttributeSet p1){
       a.p(p0, "context");
       a.p(p1, "attrs");
       super(p0, p1);
       this.a = true;
       this.b = -1;
       this.c = -1;
    }
    public final void c(boolean p0){
       this.a = p0;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       a.p(p0, "parent");
       a.p(p1, "child");
       a.p(p2, "event");
       boolean b = false;
       int i = (this.a != null && super.onInterceptTouchEvent(p0, p1, p2))? 1: 0;
       if (!p2.getActionMasked()) {
          this.b = (int)p2.getX();
          this.c = (int)p2.getY();
       }
       if (!i || (p2.getActionMasked() != 2 || Math.abs((p2.getX() - (float)this.b)) - Math.abs((p2.getY() - (float)this.c)) < 0)) {
          b = i;
       }
       return b;
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       a.p(p0, "parent");
       a.p(p1, "child");
       this.setPeekHeight(p1.getHeight());
       return super.onLayoutChild(p0, p1, p2);
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       a.p(p0, "coordinatorLayout");
       a.p(p1, "child");
       a.p(p2, "directTargetChild");
       a.p(p3, "target");
       boolean b = false;
       if (!(p4 & 0x02)) {
          this.touchingScrollingChild = b;
       }
       if (this.a != null && super.onStartNestedScroll(p0, p1, p2, p3, p4, p5)) {
          b = true;
       }
       return b;
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       boolean i;
       a.p(p0, "parent");
       a.p(p1, "child");
       a.p(p2, "event");
       try{
          i = 0;
          if (this.a != null && super.onTouchEvent(p0, p1, p2)) {
             i = true;
          }
          return i;
       }catch(java.lang.IllegalArgumentException e3){
          e3.printStackTrace();
          return i;
       }
    }
    public boolean shouldHide(View p0,float p1){
       a.p(p0, "child");
       boolean b = (((float)p0.getTop() + (p1 * 0.20f)) - ((float)this.fitToContentsOffset + ((float)p0.getHeight() / 2.00f)) >= 0)? true: false;
       return b;
    }
}
