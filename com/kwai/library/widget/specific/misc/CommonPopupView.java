package com.kwai.library.widget.specific.misc.CommonPopupView;
import android.widget.FrameLayout;
import com.kwai.library.widget.specific.misc.CommonPopupView$a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import a2.i0;
import com.kwai.library.widget.specific.misc.CommonPopupView$f;
import android.widget.Scroller;
import com.kwai.library.widget.specific.misc.CommonPopupView$d;
import java.lang.Runnable;
import android.view.animation.Interpolator;
import android.content.res.Resources;
import cw9.c;
import android.view.ViewConfiguration;
import android.app.Activity;
import android.view.ViewParent;
import android.view.Window;
import com.kwai.library.widget.specific.misc.CommonPopupView$e;
import java.lang.Math;
import android.content.res.Configuration;
import com.kwai.library.widget.specific.misc.CommonPopupView$b;
import android.view.View$OnClickListener;
import com.kwai.library.widget.specific.misc.CommonPopupView$c;
import android.view.View$OnKeyListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kwai.library.widget.specific.misc.CommonPopupView$g;

public class CommonPopupView extends FrameLayout	// class@000a0f
{
    public ViewGroup A;
    public boolean B;
    public View b;
    public FrameLayout c;
    public View d;
    public CommonPopupView$g e;
    public CommonPopupView$e f;
    public CommonPopupView$f g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public Scroller q;
    public VelocityTracker r;
    public float s;
    public float t;
    public float u;
    public float v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static final Interpolator C;

    static {
       CommonPopupView.C = new CommonPopupView$a();
    }
    public void CommonPopupView(Context p0){
       super(p0);
       this.w = true;
       this.z = false;
       this.e();
    }
    public void CommonPopupView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.w = true;
       this.z = false;
       this.e();
    }
    public void CommonPopupView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.w = true;
       this.z = false;
       this.e();
    }
    public boolean a(View p0,boolean p1,int p2,int p3,int p4){
       int i = p0;
       int i1 = 1;
       if (i instanceof ViewGroup) {
          ViewGroup viewGroup = i;
          int scrollX = p0.getScrollX();
          int scrollY = p0.getScrollY();
          int i2 = viewGroup.getChildCount() - i1;
          while (true) {
             if (i2 >= 0) {
                View childAt = viewGroup.getChildAt(i2);
                int i3 = p3 + scrollX;
                if (i3 >= childAt.getLeft() && i3 < childAt.getRight()) {
                   int i4 = p4 + scrollY;
                   if (i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                      int i5 = i3 - childAt.getLeft();
                      int i6 = i4 - childAt.getTop();
                      if (this.a(childAt, 1, p2, i5, i6)) {
                         return i1;
                      }
                   }
                }
                i2 = i2 - 1;
             }
          }
       }
       if (!p1 || !i0.e(p0, (- p2))) {
          i1 = false;
       }
       return i1;
    }
    public final void b(int p0){
       this.c.scrollTo(p0, 0);
       i0.u0(this.b, (0x3f800000 - ((float)((- p0) - this.j) / (float)(this.getMeasuredWidth() - this.j))));
       CommonPopupView tg = this.g;
       if (tg != null) {
          tg.b((this.l + p0), 0);
       }
       return;
    }
    public final void c(int p0){
       this.c.scrollTo(0, p0);
       i0.u0(this.b, (0x3f800000 - ((float)((- p0) - this.i) / (float)(this.getMeasuredHeight() - this.i))));
       CommonPopupView tg = this.g;
       if (tg != null) {
          tg.b(0, (this.k + p0));
       }
       return;
    }
    public void computeScroll(){
       if (!this.q.isFinished() && this.q.computeScrollOffset()) {
          if (this.B != null) {
             this.b(this.q.getCurrX());
          }else {
             this.c(this.q.getCurrY());
          }
          i0.j0(this);
       }else if(this.c.getScrollY() == (- this.getMeasuredHeight()) || this.c.getScrollX() == (- this.getMeasuredWidth())){
          this.d();
       }
       if (this.g != null && (this.q.isFinished() && this.p == null)) {
          this.g.a();
       }
    label_005d :
       return;
    }
    public final void d(){
       this.postDelayed(new CommonPopupView$d(this), 50);
    }
    public final void e(){
       this.q = new Scroller(this.getContext(), CommonPopupView.C);
       this.h = c.a(this.getResources(), 0x7f0710e8);
       this.o = ViewConfiguration.get(this.getContext()).getScaledMaximumFlingVelocity();
       this.B = this.f();
    }
    public final boolean f(){
       boolean requestedOri = this.getContext().getRequestedOrientation();
       requestedOri = (requestedOri && (requestedOri == 8 || requestedOri == 6))? true: false;
       return requestedOri;
    }
    public final void g(boolean p0){
       ViewParent parent = this.getParent();
       if (parent != null) {
          parent.requestDisallowInterceptTouchEvent(p0);
       }
       return;
    }
    public ViewGroup getAttachTargetView(){
       CommonPopupView tA = this.A;
       if (tA == null) {
          tA = this.getContext().getWindow().getDecorView().findViewById(0x1020002);
       }
       return tA;
    }
    public void h(){
       if (this.B != null) {
          this.i((- this.getMeasuredWidth()), 0);
       }else {
          this.j((- this.getMeasuredHeight()), 0);
       }
       CommonPopupView tf = this.f;
       if (tf != null) {
          tf.a();
       }
       return;
    }
    public final void i(int p0,int p1){
       int i = p0 - this.c.getScrollX();
       if (!i) {
          return;
       }
       p0 = 600;
       p1 = (p1)? Math.round((Math.abs(((float)i / (float)p1)) * 1000.00f)) * 4: 600;
       this.q.startScroll(this.c.getScrollX(), 0, i, 0, Math.min(p1, p0));
       i0.j0(this);
       return;
    }
    public final void j(int p0,int p1){
       int i = p0 - this.c.getScrollY();
       if (!i) {
          return;
       }
       p0 = 600;
       p1 = (p1)? Math.round((Math.abs(((float)i / (float)p1)) * 1000.00f)) * 4: 600;
       this.q.startScroll(0, this.c.getScrollY(), 0, i, Math.min(p1, p0));
       i0.j0(this);
       return;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       this.B = this.f();
    }
    public void onConfigurationChanged(Configuration p0){
       super.onConfigurationChanged(p0);
       this.B = this.f();
    }
    public void onFinishInflate(){
       super.onFinishInflate();
       this.c = this.findViewById(0x7f0a0923);
       this.b = this.findViewById(0x7f0a03a0);
       this.c.setOnClickListener(new CommonPopupView$b(this));
       this.setFocusableInTouchMode(true);
       this.setOnKeyListener(new CommonPopupView$c(this));
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       CommonPopupView tr;
       float x;
       if (this.w == null || this.B != null) {
          return false;
       }
       if (p0.getY() - (float)(- this.c.getScrollY()) < 0) {
          return false;
       }
       if (this.p != null) {
          return true;
       }
       int i = p0.getAction() & 0x00ff;
       if (i) {
          if (i != 1) {
             if (i != 0.00f) {
                if (i == 3) {
                }
             }else if(this.x == null){
                return false;
             }else if(this.y != null){
                return true;
             }else {
                x = p0.getX();
                float y = p0.getY();
                float f = y - this.t;
                float f1 = y - this.v;
                float f2 = x - this.u;
                this.s = x;
                this.t = y;
                if (Math.abs(f1) - 0x41200000 < 0) {
                   return false;
                }else if(Math.abs(f1) - Math.abs(f2) < 0){
                   this.x = false;
                   this.y = false;
                   return false;
                }else if(f && this.a(this, false, (int)f, (int)x, (int)y)){
                   return false;
                }else {
                   Math.abs(f);
                   this.p = true;
                   this.y = true;
                   this.g(true);
                }
             }
          }else {
          }
       }else {
          x = p0.getX();
          this.u = x;
          this.s = x;
          x = p0.getY();
          this.v = x;
          this.t = x;
          this.x = true;
          this.y = false;
          if (!this.q.isFinished()) {
             this.q.forceFinished(true);
             this.p = true;
             this.y = true;
             this.g(true);
          }
       }
       if (this.r == null) {
          this.r = VelocityTracker.obtain();
       }
       this.r.addMovement(p0);
       return this.p;
    }
    public void onMeasure(int p0,int p1){
       FrameLayout$LayoutParams layoutParams = this.d.getLayoutParams();
       if (this.w == null) {
          layoutParams.bottomMargin = this.h;
       }else if(layoutParams.height == -1){
          layoutParams.bottomMargin = this.h;
       }
       super.onMeasure(p0, p1);
       p0 = this.getMeasuredHeight();
       p1 = this.getMeasuredWidth();
       if (p0 && p1) {
          int measuredHeig = this.d.getMeasuredHeight();
          int measuredWidt = this.d.getMeasuredWidth();
          if (measuredHeig && measuredWidt) {
             if (this.z == null && (measuredHeig != this.m && (measuredWidt != this.n && (p0 == this.k || p1 == this.l)))) {
                return;
             }else {
                this.z = false;
                this.m = measuredHeig;
                this.n = measuredWidt;
                this.k = p0;
                this.l = p1;
                p0 = p0 - measuredHeig;
                this.i = p0;
                this.j = p1 - measuredWidt;
                CommonPopupView th = this.h;
                if (p0 < th) {
                   this.i = th;
                }
                if (this.B != null) {
                   if (!this.c.getScrollX()) {
                      this.b((- this.l));
                   }
                }else if(!this.c.getScrollY()){
                   this.c((- this.k));
                }
                if (this.B != null) {
                   this.i((- this.j), false);
                }else {
                   this.j((- this.i), false);
                }
             }
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int b = false;
       if (this.y == null) {
          return b;
       }
       if (this.r == null) {
          this.r = VelocityTracker.obtain();
       }
       this.r.addMovement(p0);
       int action = p0.getAction();
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action != 3) {
                   return b;
                }
             }else {
                this.p = true;
                action = (int)(p0.getY() - this.t);
                if (action <= 0 && this.c.getScrollY() >= (this.m - this.getMeasuredHeight())) {
                   return true;
                }else {
                   b = this.c.getScrollY() - action;
                   if (b >= (this.m - this.getMeasuredHeight())) {
                      this.c((this.m - this.getMeasuredHeight()));
                   }else if(b <= (- this.getMeasuredHeight())){
                      this.d();
                   }else {
                      this.c(b);
                   }
                   this.s = p0.getX();
                   this.t = p0.getY();
                   return true;
                }
             }
          }
          this.t = 0;
          if (this.p != null) {
             this.r.computeCurrentVelocity(1000, (float)this.o);
             int i = (int)this.r.getYVelocity();
             if (i <= -100) {
                this.j(Math.max((this.m - this.getMeasuredHeight()), (- this.i)), i);
             }else if(i >= 100){
                this.j((- this.getMeasuredHeight()), i);
             }else if(this.c.getScrollY() >= (- this.i)){
                CommonPopupView ti = this.i;
                if ((float)this.c.getScrollY() - (- (((float)(this.getMeasuredHeight() - ti) * 0.20f) + (float)ti)) >= 0) {
                   this.j((- ti), i);
                }else {
                   this.j((- this.getMeasuredHeight()), i);
                }
             }
             this.p = b;
             b = true;
          }
          CommonPopupView tr = this.r;
          if (tr != null) {
             tr.recycle();
             this.r = null;
          }
          return b;
       }else {
          this.s = p0.getX();
          this.t = p0.getY();
          this.q.forceFinished(true);
          return true;
       }
    }
    public void setAttachTargetView(ViewGroup p0){
       this.A = p0;
    }
    public void setBackgroundResource(int p0){
       this.b.setBackgroundResource(p0);
    }
    public void setContentView(View p0){
       FrameLayout$LayoutParams layoutParams = (p0.getLayoutParams() instanceof FrameLayout$LayoutParams)? p0.getLayoutParams(): null;
       if (layoutParams == null) {
          layoutParams = new FrameLayout$LayoutParams(-1, -2);
       }
       CommonPopupView td = this.d;
       if (td != null) {
          this.c.removeView(td);
       }
       this.d = p0;
       p0.setClickable(true);
       this.c.addView(p0, layoutParams);
       return;
    }
    public void setDragEnable(boolean p0){
       this.w = p0;
    }
    public void setMinInitialTopOffset(int p0){
       this.z = true;
       this.h = p0;
    }
    public void setOnDismissListener(CommonPopupView$e p0){
       this.f = p0;
    }
    public void setOnScrollListener(CommonPopupView$f p0){
       this.g = p0;
    }
    public void setOnShowListener(CommonPopupView$g p0){
       this.e = p0;
    }
}
