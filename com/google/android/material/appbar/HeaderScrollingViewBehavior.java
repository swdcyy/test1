package com.google.android.material.appbar.HeaderScrollingViewBehavior;
import com.google.android.material.appbar.ViewOffsetBehavior;
import android.graphics.Rect;
import android.content.Context;
import android.util.AttributeSet;
import java.util.List;
import android.view.View;
import u1.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewGroup$MarginLayoutParams;
import a2.u0;
import a2.i0;
import a2.g;
import android.view.View$MeasureSpec;

public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior	// class@001623
{
    public final Rect a;
    public final Rect b;
    public int c;
    public int d;

    public void HeaderScrollingViewBehavior(){
       super();
       this.a = new Rect();
       this.b = new Rect();
       this.c = 0;
    }
    public void HeaderScrollingViewBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = new Rect();
       this.b = new Rect();
       this.c = 0;
    }
    public static int j(int p0){
       if (!p0) {
          p0 = 0x800033;
       }
       return p0;
    }
    public abstract View c(List p0);
    public final int d(View p0){
       int i = 0;
       if (this.d == null) {
       }else {
          HeaderScrollingViewBehavior td = this.d;
          i = a.b((int)(this.e(p0) * (float)td), i, td);
       }
       return i;
    }
    public float e(View p0){
       return 0x3f800000;
    }
    public final int g(){
       return this.d;
    }
    public int h(View p0){
       return p0.getMeasuredHeight();
    }
    public final int i(){
       return this.c;
    }
    public final void k(int p0){
       this.d = p0;
    }
    public void layoutChild(CoordinatorLayout p0,View p1,int p2){
       View view = this.c(p0.s(p1));
       if (view != null) {
          CoordinatorLayout$LayoutParams layoutParams = p1.getLayoutParams();
          HeaderScrollingViewBehavior ta = this.a;
          ta.set((p0.getPaddingLeft() + layoutParams.leftMargin), (view.getBottom() + layoutParams.topMargin), ((p0.getWidth() - p0.getPaddingRight()) - layoutParams.rightMargin), (((p0.getHeight() + view.getBottom()) - p0.getPaddingBottom()) - layoutParams.bottomMargin));
          u0 lastWindowIn = p0.getLastWindowInsets();
          if (lastWindowIn != null && (i0.y(p0) && !i0.y(p1))) {
             ta.left = ta.left + lastWindowIn.i();
             ta.right = ta.right - lastWindowIn.j();
          }
       label_0064 :
          HeaderScrollingViewBehavior tb = this.b;
          g.a(HeaderScrollingViewBehavior.j(layoutParams.c), p1.getMeasuredWidth(), p1.getMeasuredHeight(), ta, tb, p2);
          p2 = this.d(view);
          p1.layout(tb.left, (tb.top - p2), tb.right, (tb.bottom - p2));
          this.c = tb.top - view.getBottom();
       }else {
          super.layoutChild(p0, p1, p2);
          this.c = 0;
       }
       return;
    }
    public boolean onMeasureChild(CoordinatorLayout p0,View p1,int p2,int p3,int p4,int p5){
       ViewGroup$LayoutParams height = p1.getLayoutParams().height;
       if (height == -1 || height == -2) {
          View view = this.c(p0.s(p1));
          if (view != null) {
             if (i0.y(view) && !i0.y(p1)) {
                i0.B0(p1, true);
                if (i0.y(p1)) {
                   p1.requestLayout();
                   return true;
                }
             }else {
                int i1 = p1;
             }
             int size = View$MeasureSpec.getSize(p4);
             if (!size) {
                size = p0.getHeight();
             }
             size = (size - view.getMeasuredHeight()) + this.h(view);
             int i = (height == -1)? 0x40000000: Integer.MIN_VALUE;
             p0.K(p1, p2, p3, View$MeasureSpec.makeMeasureSpec(size, i), p5);
             return true;
          }
       }
       return false;
    }
}
