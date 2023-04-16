package com.kwai.library.widget.pageindicator.PagerIndicator;
import android.widget.LinearLayout;
import android.content.Context;
import com.kwai.library.widget.pageindicator.PagerIndicator$a;
import com.kwai.library.widget.pageindicator.PagerIndicator$b;
import android.util.AttributeSet;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Object;
import android.animation.AnimatorInflater;
import com.kwai.library.widget.pageindicator.PagerIndicator$e;
import android.animation.TimeInterpolator;
import com.kwai.library.widget.pageindicator.PagerIndicator$d;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Math;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import java.lang.String;
import android.animation.ObjectAnimator;
import android.database.DataSetObserver;
import android.view.WindowManager;
import android.view.Display;
import j07.a;
import ll8.c$b;
import android.content.res.TypedArray;
import com.kwai.library.widget.pageindicator.PagerIndicator$c;
import java.util.Objects;

public class PagerIndicator extends LinearLayout	// class@000970
{
    public int A;
    public int B;
    public PagerIndicator$d C;
    public final PagerIndicator$c D;
    public DataSetObserver E;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public Animator l;
    public Animator m;
    public Animator n;
    public Animator o;
    public Animator p;
    public Animator q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public ObjectAnimator y;
    public ObjectAnimator z;

    public void PagerIndicator(Context p0){
       super(p0);
       this.b = -1;
       this.c = -1;
       this.d = -1;
       this.e = 0x7f010138;
       this.f = 0;
       this.g = 0x7f082557;
       this.h = 0x7f082556;
       this.i = 0x7f010138;
       this.j = 0x7f01013a;
       this.k = 0x7f010139;
       this.r = false;
       this.s = 0;
       this.t = 0;
       this.u = 0;
       this.v = 2;
       this.x = 7;
       this.D = new PagerIndicator$a(this);
       this.E = new PagerIndicator$b(this);
       this.h(p0, null);
    }
    public void PagerIndicator(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = -1;
       this.c = -1;
       this.d = -1;
       this.e = 0x7f010138;
       this.f = 0;
       this.g = 0x7f082557;
       this.h = 0x7f082556;
       this.i = 0x7f010138;
       this.j = 0x7f01013a;
       this.k = 0x7f010139;
       this.r = false;
       this.s = 0;
       this.t = 0;
       this.u = 0;
       this.v = 2;
       this.x = 7;
       this.D = new PagerIndicator$a(this);
       this.E = new PagerIndicator$b(this);
       this.h(p0, p1);
    }
    public void PagerIndicator(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = -1;
       this.c = -1;
       this.d = -1;
       this.e = 0x7f010138;
       this.f = 0;
       this.g = 0x7f082557;
       this.h = 0x7f082556;
       this.i = 0x7f010138;
       this.j = 0x7f01013a;
       this.k = 0x7f010139;
       this.r = false;
       this.s = 0;
       this.t = 0;
       this.u = 0;
       this.v = 2;
       this.x = 7;
       this.D = new PagerIndicator$a(this);
       this.E = new PagerIndicator$b(this);
       this.h(p0, p1);
    }
    public final void a(int p0,int p1,Animator p2){
       PagerIndicator tb;
       if (p2.isRunning()) {
          p2.end();
          p2.cancel();
       }
       View view = new View(this.getContext());
       view.setBackgroundResource(p1);
       this.addView(view, this.c, this.d);
       LinearLayout$LayoutParams layoutParams = view.getLayoutParams();
       if (!p0) {
          tb = this.b;
          layoutParams.leftMargin = tb;
          layoutParams.rightMargin = tb;
       }else {
          tb = this.b;
          layoutParams.topMargin = tb;
          layoutParams.bottomMargin = tb;
       }
       view.setLayoutParams(layoutParams);
       int[] ointArray = new int[2];
       this.getLocationOnScreen(ointArray);
       p2.setTarget(view);
       p2.start();
       return;
    }
    public final void b(int p0,boolean p1,boolean p2){
       if (this.p == null) {
          this.p = AnimatorInflater.loadAnimator(this.getContext(), this.j);
       }
       if (this.o == null) {
          this.o = AnimatorInflater.loadAnimator(this.getContext(), this.i);
       }
       View childAt = this.getChildAt(p0);
       PagerIndicator tp = this.p;
       if (p1) {
          tp = this.o;
       }
       if (childAt != null) {
          if (tp.isRunning()) {
             tp.end();
             tp.cancel();
          }
          if (p2) {
             tp.setDuration(0);
          }else {
             tp.setDuration(400);
          }
          tp.setTarget(childAt);
          tp.start();
       }
       return;
    }
    public final void c(int p0,boolean p1){
       View childAt = this.getChildAt(p0);
       if (childAt != null) {
          if (this.q == null) {
             this.q = AnimatorInflater.loadAnimator(this.getContext(), this.k);
          }
          if (this.q.isRunning()) {
             this.q.end();
             this.q.cancel();
          }
          if (p1) {
             this.q.setDuration(0);
          }else {
             this.q.setDuration(400);
          }
          this.q.setTarget(childAt);
          this.q.start();
       }
       return;
    }
    public final void d(int p0,boolean p1){
       View childAt = this.getChildAt(p0);
       if (childAt != null) {
          if (this.n == null) {
             this.n = AnimatorInflater.loadAnimator(this.getContext(), this.j);
          }
          if (this.n.isRunning()) {
             this.n.end();
             this.n.cancel();
          }
          this.n.setInterpolator(new PagerIndicator$e(this, null));
          if (p1) {
             this.n.setDuration(0);
          }else {
             this.n.setDuration(400);
          }
          this.n.setTarget(childAt);
          this.n.start();
       }
       return;
    }
    public void e(){
       PagerIndicator tw;
       this.removeAllViews();
       this.i();
       int i = this.C.b();
       if (i <= 0) {
          return;
       }
       int i1 = this.C.e();
       int orientation = this.getOrientation();
       int i2 = 0;
       int i3 = 0;
       while (i2 < i) {
          PagerIndicator tb = this.b;
          int i4 = this.c + tb;
          i4 = i4 + tb;
          i3 = i3 + i4;
          if (i3 > this.getViewWidth() || i >= 6) {
             tw = this.w;
             if (tw < null) {
                tw = 19;
             }
             this.setGravity(tw);
          }else {
             tw = this.w;
             if (tw < null) {
                i4 = 17;
             }
             this.setGravity(tw);
          }
          if (i1 != i2) {
             i4 = i1 - 1;
             if (i4 != i2) {
                i4 = i1 + 1;
                if (i4 != i2) {
                   this.a(orientation, this.h, this.m);
                label_0067 :
                   i2 = i2 + 1;
                }
             }
          }
          if (i1 == i2) {
             this.a(orientation, this.g, this.l);
             goto label_0067 ;
          }else {
             this.a(orientation, this.h, this.m);
             goto label_0067 ;
          }
       }
       this.C.c(this.v);
       return;
    }
    public int f(float p0){
       return (int)((p0 * c.c(this.getResources()).density) + 0x3f000000);
    }
    public void g(int p0){
       boolean i7;
       int[] ointArray;
       ObjectAnimator objectAnimat;
       int scrollX = this.getScrollX();
       PagerIndicator tt = this.t;
       if (scrollX % tt) {
          scrollX = this.u;
       }
       int i = 2;
       scrollX = scrollX + i;
       int i1 = scrollX / tt;
       int i2 = this.C.b();
       int width = this.getWidth();
       if (width <= 0) {
          width = this.s;
       }
       if (scrollX < 0) {
          width = width + scrollX;
       }
       width = ((width / this.t) + i1) - 1;
       if (Math.abs((p0 - this.v)) != 1) {
          i1 = (p0 == (this.C.b() - 1))? Math.max(0, ((p0 - 7) + 1)): Math.max(0, ((p0 - 7) + i));
          width = (i1 + 7) - 1;
       }
       int i3 = -1000;
       int i4 = 5;
       int i5 = (i1 != p0 && (i2 > i4 && i1))? i1: -1000;
       if (width != p0 && i2 > i4) {
          i3 = width;
       }
       int i6 = i1;
       while (i6 <= width) {
          View childAt = this.getChildAt(i6);
          if (childAt != null) {
             if (p0 == i6) {
                childAt.setBackgroundResource(this.g);
             }else {
                childAt.setBackgroundResource(this.h);
             }
             Drawable background = childAt.getBackground();
             if (background instanceof ColorDrawable) {
                PagerIndicator tA = this.A;
                if (tA != null || this.B != null) {
                   if (p0 == i6) {
                      PagerIndicator tB = this.B;
                      if (tB != null) {
                         background.setColor(tB);
                      }
                   }
                   if (tA != null) {
                      background.setColor(tA);
                   }
                }
             }
             if (i6 != p0) {
                if (i6 == i1 && (i6 != p0 && (i2 > i4 && i6))) {
                   this.d(i6, 1);
                }else if(i6 == width && (i6 != p0 && i2 > i4)){
                   this.d(i6, 1);
                }else {
                   i7 = i5 + 1;
                   if (i7 != i6) {
                      i7 = i3 - 1;
                      if (i7 != i6 || i6 == p0) {
                         i7 = (i6 == p0)? true: false;
                         this.b(i6, i7, 1);
                      }
                   }
                   this.c(i6, 1);
                }
             }else if(i6 == p0){
                i7 = true;
             }else {
                i7 = false;
             }
             this.b(i6, i7, 1);
          }
          i6 = i6 + 1;
       }
       if (Math.abs((this.v - p0)) == 1) {
          if (i2 > i4) {
             if (p0 == i1 && (p0 < this.v || this.r == null)) {
                this.i();
                scrollX = this.t * (p0 - 1);
                i2 = this.getScrollX();
                ointArray = new int[i];
                ointArray[0] = i2;
                ointArray[1] = scrollX;
                objectAnimat = ObjectAnimator.ofInt(this, "scrollX", ointArray);
                this.y = objectAnimat;
                this.u = scrollX;
                objectAnimat.setDuration(400);
                this.y.start();
                this.d((i1 - 1), 1);
                if (i2 != scrollX) {
                   this.d((width - 1), 0);
                   this.c((width - i), 0);
                }
             }else if(p0 == width && p0 > this.v){
                this.i();
                i2 = (p0 - (this.x - i)) * this.t;
                ointArray = new int[i];
                ointArray[0] = this.getScrollX();
                ointArray[1] = i2;
                objectAnimat = ObjectAnimator.ofInt(this, "scrollX", ointArray);
                this.z = objectAnimat;
                this.u = i2;
                objectAnimat.setDuration(400);
                this.z.start();
                this.d((width + 1), 1);
                if ((scrollX + this.t) > i) {
                   this.d((i1 + 1), 0);
                   this.c((i1 + i), 0);
                }else {
                   this.d((i1 + 0), 0);
                   this.c((i1 + 1), 0);
                }
             }
             this.r = true;
          }
       }else {
          scrollX = Math.max(0, ((p0 - (this.x - i)) * this.t));
          if (scrollX != this.getScrollX()) {
             int[] ointArray1 = new int[i];
             ointArray1[0] = this.getScrollX();
             ointArray1[1] = scrollX;
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofInt(this, "scrollX", ointArray1);
             this.z = objectAnimat1;
             this.u = scrollX;
             objectAnimat1.setDuration(400);
             this.z.start();
          }
       }
       this.v = p0;
       return;
    }
    public DataSetObserver getDataSetObserver(){
       return this.E;
    }
    public int getScreenWidth(){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       this.getContext().getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
       return uDisplayMetr.widthPixels;
    }
    public int getTranslateX(){
       int scrollX = this.getScrollX();
       if (scrollX % this.t) {
          scrollX = this.u;
       }
       return scrollX;
    }
    public final int getViewWidth(){
       return this.s;
    }
    public final void h(Context p0,AttributeSet p1){
       Animator uAnimator1;
       if (p1 == null) {
       }else {
          a uoa = a.a();
          this.A = uoa.f;
          this.B = uoa.g;
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.N3);
          int i2 = -1;
          this.c = typedArray.getDimensionPixelSize(9, i2);
          this.d = typedArray.getDimensionPixelSize(5, i2);
          this.b = typedArray.getDimensionPixelSize(6, i2);
          int i3 = 0;
          this.e = typedArray.getResourceId(i3, uoa.h);
          this.f = typedArray.getResourceId(1, i3);
          this.g = typedArray.getResourceId(2, uoa.i);
          this.h = typedArray.getResourceId(3, uoa.j);
          this.s = typedArray.getDimensionPixelSize(7, this.getScreenWidth());
          if (typedArray.getInt(8, i2) == 1) {
             i3 = 1;
          }
          this.setOrientation(i3);
          int intx = typedArray.getInt(4, i2);
          this.w = intx;
          if (intx < 0) {
             intx = 19;
          }
          this.setGravity(intx);
          typedArray.recycle();
       }
       float f = 5.00f;
       if (this.c <= null) {
          this.c = this.f(f);
       }
       if (this.d <= null) {
          this.d = this.f(f);
       }
       if (this.b <= null) {
          this.b = this.f(f);
       }
       if (this.g == null) {
          this.g = 0x7f082557;
       }
       if (this.h == null) {
          this.h = 0x7f082556;
       }
       if (this.e == null) {
          this.e = 0x7f010138;
       }
       Animator uAnimator = AnimatorInflater.loadAnimator(p0, this.e);
       this.l = uAnimator;
       uAnimator.setDuration(0);
       PagerIndicator tf = this.f;
       if (tf == null) {
          uAnimator1 = AnimatorInflater.loadAnimator(p0, this.e);
          uAnimator1.setInterpolator(new PagerIndicator$e(this, null));
       }else {
          uAnimator1 = AnimatorInflater.loadAnimator(p0, tf);
       }
       this.m = uAnimator1;
       uAnimator1.setDuration(0);
       tf = this.b;
       int i = (this.c + tf) + tf;
       this.t = i;
       int i1 = i * 7;
       this.s = i1;
       this.x = i1 / i;
       return;
    }
    public final void i(){
       PagerIndicator ty = this.y;
       if (ty != null && ty.isRunning()) {
          this.y.end();
          this.y.cancel();
       }
       ty = this.z;
       if (ty != null && ty.isRunning()) {
          this.z.end();
          this.z.cancel();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       this.setMeasuredDimension(this.s, p1);
    }
    public void setIndicatorHeight(int p0){
       this.d = p0;
       this.invalidate();
    }
    public void setIndicatorMargin(int p0){
       this.b = p0;
       this.invalidate();
    }
    public void setIndicatorWidth(int p0){
       this.c = p0;
       this.invalidate();
    }
    public void setOnPageChangeListener(PagerIndicator$c p0){
       PagerIndicator tC = this.C;
       Objects.requireNonNull(tC, "can not find Viewpager , setViewPager first");
       tC.a(p0);
       this.C.d(p0);
    }
    public void setPager(PagerIndicator$d p0){
       this.C = p0;
       if (p0 != null && p0.isValid()) {
          this.v = -1;
          this.e();
          this.C.a(this.D);
          this.C.d(this.D);
          this.D.onPageSelected(this.C.e());
       }
       return;
    }
}
