package com.google.android.material.tabs.TabLayout$SlidingTabIndicator;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.tabs.TabLayout$TabView;
import android.graphics.RectF;
import rj.a;
import android.animation.TimeInterpolator;
import com.google.android.material.tabs.TabLayout$SlidingTabIndicator$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.tabs.TabLayout$SlidingTabIndicator$b;
import android.animation.Animator$AnimatorListener;
import a2.i0;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import android.os.Build$VERSION;
import android.graphics.PorterDuff$Mode;
import java.lang.Math;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;

public class TabLayout$SlidingTabIndicator extends LinearLayout	// class@0016c7
{
    public int b;
    public final Paint c;
    public final GradientDrawable d;
    public int e;
    public float f;
    public int g;
    public int h;
    public int i;
    public ValueAnimator j;
    public final TabLayout k;

    public void TabLayout$SlidingTabIndicator(TabLayout p0,Context p1){
       this.k = p0;
       super(p1);
       this.e = -1;
       this.g = -1;
       this.h = -1;
       this.i = -1;
       this.setWillNotDraw(false);
       this.c = new Paint();
       this.d = new GradientDrawable();
    }
    public void a(int p0,int p1){
       TabLayout$SlidingTabIndicator tj = this.j;
       if (tj != null && tj.isRunning()) {
          this.j.cancel();
       }
       View childAt = this.getChildAt(p0);
       if (childAt == null) {
          this.f();
          return;
       }else {
          int left = childAt.getLeft();
          int right = childAt.getRight();
          TabLayout$SlidingTabIndicator tk = this.k;
          if (tk.tabIndicatorFullWidth == null && childAt instanceof TabLayout$TabView) {
             this.b(childAt, tk.tabViewContentBounds);
             TabLayout tabViewConte = this.k.tabViewContentBounds;
             left = (int)tabViewConte.left;
             right = (int)tabViewConte.right;
          }
          int i = left;
          int i1 = right;
          TabLayout$SlidingTabIndicator th = this.h;
          TabLayout$SlidingTabIndicator ti = this.i;
          if (th != i || ti != i1) {
             ValueAnimator valueAnimato = new ValueAnimator();
             this.j = valueAnimato;
             valueAnimato.setInterpolator(a.b);
             valueAnimato.setDuration((long)p1);
             valueAnimato.setFloatValues(new float[2]{0,0x3f800000});
             TabLayout$SlidingTabIndicator$a slidingTabIn = new TabLayout$SlidingTabIndicator$a(this, th, i, ti, i1);
             valueAnimato.addUpdateListener(new float[2]{0,0x3f800000});
             valueAnimato.addListener(new TabLayout$SlidingTabIndicator$b(this, p0));
             valueAnimato.start();
          }
          return;
       }
    }
    public final void b(TabLayout$TabView p0,RectF p1){
       int contentWidth = p0.getContentWidth();
       if (contentWidth < this.k.t(24)) {
          contentWidth = this.k.t(24);
       }
       int i = (p0.getLeft() + p0.getRight()) / 2;
       contentWidth = contentWidth / 2;
       int i1 = i - contentWidth;
       p1.set((float)i1, 0, (float)(i + contentWidth), 0);
       return;
    }
    public boolean c(){
       int childCount = this.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return false;
          }
          if (this.getChildAt(i).getWidth() <= 0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public void d(int p0,int p1){
       if (p0 != this.h || p1 != this.i) {
          this.h = p0;
          this.i = p1;
          i0.j0(this);
       }
       return;
    }
    public void draw(Canvas p0){
       TabLayout tabSelectedI = this.k.tabSelectedIndicator;
       int i = 0;
       int intrinsicHei = (tabSelectedI != null)? tabSelectedI.getIntrinsicHeight(): 0;
       TabLayout$SlidingTabIndicator tb = this.b;
       if (tb >= null) {
          intrinsicHei = tb;
       }
       TabLayout tabIndicator = this.k.tabIndicatorGravity;
       if (tabIndicator != null) {
          TabLayout$SlidingTabIndicator slidingTabIn = 2;
          if (tabIndicator != 1) {
             if (tabIndicator != slidingTabIn) {
                intrinsicHei = (tabIndicator != 3)? 0: this.getHeight();
             }
          }else {
             i = (this.getHeight() - intrinsicHei) / slidingTabIn;
             intrinsicHei = (this.getHeight() + intrinsicHei) / 2;
          }
       }else {
          i = this.getHeight() - intrinsicHei;
          intrinsicHei = this.getHeight();
       }
       tb = this.h;
       if (tb >= null && this.i > tb) {
          tabIndicator = this.k.tabSelectedIndicator;
          if (tabIndicator == null) {
             tb = this.d;
          }
          Drawable uDrawable = a.r(tabIndicator);
          uDrawable.setBounds(this.h, i, this.i, intrinsicHei);
          TabLayout$SlidingTabIndicator tc = this.c;
          if (tc != null) {
             if (Build$VERSION.SDK_INT == 21) {
                uDrawable.setColorFilter(tc.getColor(), PorterDuff$Mode.SRC_IN);
             }else {
                a.n(uDrawable, tc.getColor());
             }
          }
          uDrawable.draw(p0);
       }
       super.draw(p0);
       return;
    }
    public void e(int p0,float p1){
       TabLayout$SlidingTabIndicator tj = this.j;
       if (tj != null && tj.isRunning()) {
          this.j.cancel();
       }
       this.e = p0;
       this.f = p1;
       this.f();
       return;
    }
    public final void f(){
       int left;
       int right;
       TabLayout tabViewConte;
       View childAt = this.getChildAt(this.e);
       if (childAt != null && childAt.getWidth() > 0) {
          left = childAt.getLeft();
          right = childAt.getRight();
          TabLayout$SlidingTabIndicator tk = this.k;
          if (tk.tabIndicatorFullWidth == null && childAt instanceof TabLayout$TabView) {
             this.b(childAt, tk.tabViewContentBounds);
             tabViewConte = this.k.tabViewContentBounds;
             left = (int)tabViewConte.left;
             right = (int)tabViewConte.right;
          }
          if (this.f > 0 && this.e < (this.getChildCount() - 1)) {
             childAt = this.getChildAt((this.e + 1));
             int left1 = childAt.getLeft();
             int right1 = childAt.getRight();
             TabLayout$SlidingTabIndicator tk1 = this.k;
             if (tk1.tabIndicatorFullWidth == null && childAt instanceof TabLayout$TabView) {
                this.b(childAt, tk1.tabViewContentBounds);
                tabViewConte = this.k.tabViewContentBounds;
                left1 = (int)tabViewConte.left;
                right1 = (int)tabViewConte.right;
             }
             TabLayout$SlidingTabIndicator tf = this.f;
             left = (int)(((float)left1 * tf) + ((0x3f800000 - tf) * (float)left));
             float f = (float)right1 * tf;
             float f1 = 0x3f800000 - tf;
             right = (int)(f + (f1 * (float)right));
          }
       }else {
          left = -1;
          right = -1;
       }
       this.d(left, right);
       return;
    }
    public float getIndicatorPosition(){
       return ((float)this.e + this.f);
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       TabLayout$SlidingTabIndicator tj = this.j;
       if (tj != null && tj.isRunning()) {
          this.j.cancel();
          this.a(this.e, Math.round(((0x3f800000 - this.j.getAnimatedFraction()) * (float)this.j.getDuration())));
       }else {
          this.f();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if (View$MeasureSpec.getMode(p0) != 0x40000000) {
          return;
       }
       TabLayout$SlidingTabIndicator tk = this.k;
       int i = 1;
       if (tk.mode == i && tk.tabGravity == i) {
          int childCount = this.getChildCount();
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          while (i2 < childCount) {
             View childAt = this.getChildAt(i2);
             if (!childAt.getVisibility()) {
                i3 = Math.max(i3, childAt.getMeasuredWidth());
             }
             i2 = i2 + 1;
          }
          if (i3 <= 0) {
             return;
          }else if((i3 * childCount) <= (this.getMeasuredWidth() - (this.k.t(16) * 2))){
             i2 = 0;
             while (i1 < childCount) {
                LinearLayout$LayoutParams layoutParams = this.getChildAt(i1).getLayoutParams();
                if (layoutParams.width != i3 || layoutParams.weight) {
                   layoutParams.width = i3;
                   layoutParams.weight = 0;
                   i2 = 1;
                }
                i1 = i1 + 1;
             }
             i = i2;
          }else {
             tk = this.k;
             tk.tabGravity = i1;
             tk.M(i1);
          }
          if (i) {
             super.onMeasure(p0, p1);
          }
       }
       return;
    }
    public void onRtlPropertiesChanged(int p0){
       super.onRtlPropertiesChanged(p0);
       if (Build$VERSION.SDK_INT < 23 && this.g != p0) {
          this.requestLayout();
          this.g = p0;
       }
       return;
    }
    public void setSelectedIndicatorColor(int p0){
       if (this.c.getColor() != p0) {
          this.c.setColor(p0);
          i0.j0(this);
       }
       return;
    }
    public void setSelectedIndicatorHeight(int p0){
       if (this.b != p0) {
          this.b = p0;
          i0.j0(this);
       }
       return;
    }
}
