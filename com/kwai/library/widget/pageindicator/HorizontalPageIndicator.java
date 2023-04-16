package com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator$a;
import java.util.ArrayList;
import ll8.c$b;
import android.content.res.TypedArray;
import j07.a;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import androidx.viewpager.widget.ViewPager$i;
import android.widget.LinearLayout$LayoutParams;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.drawable.StateListDrawable;
import java.lang.Integer;
import android.view.View$OnClickListener;
import android.view.ViewGroup$LayoutParams;

public class HorizontalPageIndicator extends LinearLayout	// class@00096a
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Drawable g;
    public Drawable h;
    public LinearLayout$LayoutParams i;
    public LinearLayout$LayoutParams j;
    public float k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public float p;
    public View$OnClickListener q;
    public List r;

    public void HorizontalPageIndicator(Context p0){
       super(p0, null, 0);
    }
    public void HorizontalPageIndicator(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void HorizontalPageIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = 0x3f800000;
       this.q = new HorizontalPageIndicator$a(this);
       this.r = new ArrayList();
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.g1);
       a uoa = a.a();
       this.b = typedArray.getDimensionPixelOffset(7, uoa.a);
       this.c = typedArray.getDimensionPixelOffset(6, -1);
       this.d = typedArray.getDimensionPixelOffset(4, -1);
       this.e = typedArray.getDimensionPixelOffset(2, uoa.b);
       this.f = typedArray.getResourceId(1, 0);
       this.g = typedArray.getDrawable(9);
       this.h = typedArray.getDrawable(10);
       this.l = typedArray.getBoolean(0, uoa.d);
       this.m = typedArray.getBoolean(11, uoa.e);
       this.k = typedArray.getFloat(5, uoa.c);
       this.setGravity(17);
       this.setOrientation(0);
       typedArray.recycle();
       this.c();
    }
    public final float a(){
       HorizontalPageIndicator tc = this.c;
       if (tc > null) {
          return ((((float)tc / 2.00f) + ((float)this.b / 2.00f)) + (float)this.e);
       }
       return (float)(this.b + this.e);
    }
    public void b(int p0){
       this.setPageIndex(p0);
       Iterator iterator = this.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().onPageSelected(this.o);
       }
       return;
    }
    public final void c(){
       HorizontalPageIndicator tc;
       HorizontalPageIndicator ti = this.i;
       if (ti == null) {
          this.i = new LinearLayout$LayoutParams(this.b, this.b);
       }else {
          tc = this.b;
          ti.width = tc;
          ti.height = tc;
       }
       this.i.setMargins(this.e, 0, 0, 0);
       if (this.j == null) {
          this.j = new LinearLayout$LayoutParams(this.b, this.b);
       }
       ti = this.j;
       tc = this.c;
       if (tc <= null) {
          tc = this.b;
       }
       ti.width = tc;
       tc = this.d;
       if (tc <= null) {
          tc = this.b;
       }
       ti.height = tc;
       ti.setMargins(this.e, 0, 0, 0);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       if (this.l == null) {
          return super.onInterceptTouchEvent(p0);
       }
       int action = p0.getAction();
       boolean b = false;
       if (action && action == 2) {
          b = true;
       }
       return b;
    }
    public boolean onTouchEvent(MotionEvent p0){
       HorizontalPageIndicator to;
       if (this.l != null) {
          float x = p0.getX();
          int action = p0.getAction();
          if (action) {
             if (action == 0.00f) {
                if ((x - this.p) - this.a() > 0) {
                   to = this.o;
                   if (to < (this.n - 1)) {
                      this.b((to + 1));
                      this.p = x;
                   }
                }
                if ((x - this.p) - (- this.a()) < 0) {
                   to = this.o;
                   if (to > null) {
                      this.b((to - 1));
                      this.p = x;
                   }
                }
             }
          }else {
             this.p = x;
             return 1;
          }
       }
       return super.onTouchEvent(p0);
    }
    public void setDrawableResId(int p0){
       this.f = p0;
    }
    public void setIndicatorClickable(boolean p0){
       this.l = p0;
    }
    public final void setIndicatorDrawable(View p0){
       if (this.g == null || this.h == null) {
          p0.setBackgroundResource(this.f);
          return;
       }else {
          StateListDrawable stateListDra = new StateListDrawable();
          int[] ointArray = new int[]{0x10100a1};
          stateListDra.addState(ointArray, this.g);
          ointArray = new int[0];
          stateListDra.addState(ointArray, this.h);
          p0.setBackground(stateListDra);
          return;
       }
    }
    public void setItemCount(int p0){
       this.n = p0;
       int i = 0;
       this.o = i;
       this.removeAllViews();
       if (this.m == null && p0 == 1) {
          return;
       }
       for (int i1 = 0; i1 < p0; i1 = i1 + 1) {
          View view = new View(this.getContext());
          view.setTag(Integer.valueOf(i1));
          view.setOnClickListener(this.q);
          this.setIndicatorDrawable(view);
          this.addView(view, this.i);
       }
       View childAt = this.getChildAt(i);
       childAt.setScaleX(this.k);
       childAt.setScaleY(this.k);
       childAt.setSelected(1);
       childAt.setLayoutParams(this.j);
       return;
    }
    public void setListener(ViewPager$i p0){
       this.r.add(p0);
    }
    public void setPageIndex(int p0){
       if (p0 != this.o) {
          View childAt = this.getChildAt(p0);
          if (childAt == null) {
             return;
          }else {
             childAt.setScaleX(this.k);
             childAt.setScaleY(this.k);
             childAt.setSelected(true);
             childAt.setLayoutParams(this.j);
             childAt = this.getChildAt(this.o);
             if (childAt == null) {
                return;
             }else {
                childAt.setScaleX(0x3f800000);
                childAt.setScaleY(0x3f800000);
                childAt.setSelected(false);
                childAt.setLayoutParams(this.i);
                this.o = p0;
             }
          }
       }
       return;
    }
    public void setPointMargin(int p0){
       this.e = p0;
       this.c();
    }
    public void setPointSize(int p0){
       this.b = p0;
       this.c();
    }
    public void setScale(float p0){
       this.k = p0;
    }
    public void setSelectedDrawable(Drawable p0){
       this.g = p0;
    }
    public void setSelectedHeight(int p0){
       this.d = p0;
       this.c();
    }
    public void setSelectedWidth(int p0){
       this.c = p0;
       this.c();
    }
    public void setShowIfOnlyOne(boolean p0){
       this.m = p0;
    }
    public void setUnselectedDrawable(Drawable p0){
       this.h = p0;
    }
}
