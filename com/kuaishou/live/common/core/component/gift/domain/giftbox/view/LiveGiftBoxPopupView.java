package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Boolean;
import a2.i0;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$e;
import android.widget.Scroller;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$c;
import java.lang.Runnable;
import android.view.animation.LinearInterpolator;
import android.view.animation.Interpolator;
import android.content.res.Resources;
import cw9.c;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.ViewParent;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$d;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$f;
import java.lang.Math;
import android.content.res.Configuration;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView$b;
import android.view.View$OnKeyListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public class LiveGiftBoxPopupView extends FrameLayout	// class@001216
{
    public ViewGroup A;
    public boolean B;
    public int C;
    public boolean D;
    public View b;
    public FrameLayout c;
    public View d;
    public LiveGiftBoxPopupView$f e;
    public LiveGiftBoxPopupView$d f;
    public LiveGiftBoxPopupView$e g;
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

    public void LiveGiftBoxPopupView(Context p0){
       super(p0);
       this.w = true;
       this.z = false;
       this.C = 250;
       this.D = false;
       this.e();
    }
    public void LiveGiftBoxPopupView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.w = true;
       this.z = false;
       this.C = 250;
       this.D = false;
       this.e();
    }
    public void LiveGiftBoxPopupView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.w = true;
       this.z = false;
       this.C = 250;
       this.D = false;
       this.e();
    }
    public static LiveGiftBoxPopupView g(Activity p0,int p1){
       if (PatchProxy.isSupport(LiveGiftBoxPopupView.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, LiveGiftBoxPopupView.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return LayoutInflater.from(p0).inflate(p1, null);
    }
    public boolean a(View p0,boolean p1,int p2,int p3,int p4){
       object obj;
       object oobject = p0;
       int i = 1;
       if (PatchProxy.isSupport(LiveGiftBoxPopupView.class)) {
          Object[] objArray = new Object[]{oobject,Boolean.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, LiveGiftBoxPopupView.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }else {
          int i6 = this;
       }
       if (oobject instanceof ViewGroup) {
          obj = oobject;
          int scrollX = p0.getScrollX();
          int scrollY = p0.getScrollY();
          int i1 = obj.getChildCount() - i;
          while (true) {
             if (i1 >= 0) {
                View childAt = obj.getChildAt(i1);
                int i2 = p3 + scrollX;
                if (i2 >= childAt.getLeft() && i2 < childAt.getRight()) {
                   int i3 = p4 + scrollY;
                   if (i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                      int i4 = i2 - childAt.getLeft();
                      int i5 = i3 - childAt.getTop();
                      if (this.a(childAt, 1, p2, i4, i5)) {
                         return i;
                      }
                   }
                }
                i1 = i1 - 1;
             }
          }
       }
       if (!p1 || !i0.e(p0, (- p2))) {
          i = false;
       }
       return i;
    }
    public final void b(int p0){
       if (PatchProxy.isSupport(LiveGiftBoxPopupView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftBoxPopupView.class, "15")) {
          return;
       }
       this.c.scrollTo(p0, 0);
       i0.u0(this.b, (0x3f800000 - ((float)((- p0) - this.j) / (float)(this.getMeasuredWidth() - this.j))));
       LiveGiftBoxPopupView tg = this.g;
       if (tg != null) {
          tg.b((this.l + p0), 0);
       }
       return;
    }
    public final void c(int p0){
       if (PatchProxy.isSupport(LiveGiftBoxPopupView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftBoxPopupView.class, "14")) {
          return;
       }
       this.c.scrollTo(0, p0);
       i0.u0(this.b, (0x3f800000 - ((float)((- p0) - this.i) / (float)(this.getMeasuredHeight() - this.i))));
       LiveGiftBoxPopupView tg = this.g;
       if (tg != null) {
          tg.b(0, (this.k + p0));
       }
       return;
    }
    public void computeScroll(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxPopupView.class, "9")) {
          return;
       }
       if (!this.q.isFinished() && this.q.computeScrollOffset()) {
          if (this.B != null) {
             this.b(this.q.getCurrX());
          }else {
             this.c(this.q.getCurrY());
          }
          i0.j0(this);
       }else if(this.c.getScrollY() == (- this.getMeasuredHeight()) || this.c.getScrollX() == (- this.getMeasuredWidth())){
          this.d();
       }else {
          this.D = true;
       }
       if (this.g != null && (this.q.isFinished() && this.p == null)) {
          this.g.a();
       }
    label_006e :
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxPopupView.class, "29")) {
          return;
       }
       this.postDelayed(new LiveGiftBoxPopupView$c(this), 50);
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxPopupView.class, "2")) {
          return;
       }
       this.q = new Scroller(this.getContext(), new LinearInterpolator());
       this.h = c.a(this.getResources(), 0x7f0710e8);
       this.o = ViewConfiguration.get(this.getContext()).getScaledMaximumFlingVelocity();
       this.B = this.f();
       return;
    }
    public final boolean f(){
       Object obj = PatchProxy.apply(null, this, LiveGiftBoxPopupView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean requestedOri = this.getContext().getRequestedOrientation();
       requestedOri = (requestedOri && (requestedOri == 8 || requestedOri == 6))? true: false;
       return requestedOri;
    }
    public ViewGroup getAttachTargetView(){
       ViewGroup viewGroup;
       LiveGiftBoxPopupView obj = PatchProxy.apply(null, this, LiveGiftBoxPopupView.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj == null) {
          viewGroup = this.getContext().getWindow().getDecorView().findViewById(0x1020002);
       }
       return viewGroup;
    }
    public final void h(boolean p0){
       if (PatchProxy.isSupport(LiveGiftBoxPopupView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGiftBoxPopupView.class, "13")) {
          return;
       }
       ViewParent parent = this.getParent();
       if (parent != null) {
          parent.requestDisallowInterceptTouchEvent(p0);
       }
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxPopupView.class, "28")) {
          return;
       }
       if (this.B != null) {
          int i = - this.getMeasuredWidth();
          if (!PatchProxy.isSupport(LiveGiftBoxPopupView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(0), this, LiveGiftBoxPopupView.class, "25")) {
             this.l(i, 0, true);
          }
       }else {
          this.m((- this.getMeasuredHeight()), 0);
       }
       LiveGiftBoxPopupView tf = this.f;
       if (tf != null) {
          tf.a();
       }
       return;
    }
    public final void j(boolean p0){
       if (PatchProxy.isSupport(LiveGiftBoxPopupView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveGiftBoxPopupView.class, "27")) {
          return;
       }
       if (this.B != null) {
          this.l((- this.j), 0, p0);
       }else {
          this.n((- this.i), 0, p0);
       }
       return;
    }
    public void k(int p0,int p1){
       if (PatchProxy.isSupport(LiveGiftBoxPopupView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveGiftBoxPopupView.class, "19")) {
          return;
       }
       if (this.getParent() != null) {
          this.getParent().removeView(this);
       }
       ViewGroup attachTarVie = this.getAttachTargetView();
       attachTarVie.addView(this, p0, p1);
       i0.u0(this.b, 0);
       LiveGiftBoxPopupView te = this.e;
       if (te != null) {
          te.onShow();
       }
       this.requestFocus();
       attachTarVie.requestLayout();
       this.j(true);
       return;
    }
    public final void l(int p0,int p1,boolean p2){
       int this;
       if (PatchProxy.isSupport(LiveGiftBoxPopupView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, LiveGiftBoxPopupView.class, "26")) {
          return;
       }
       this = p0 - this.c.getScrollX();
       if (!this) {
          return;
       }
       LiveGiftBoxPopupView tC = this.C;
       if (p1) {
          tC = Math.round((Math.abs(((float)this / (float)p1)) * 1000.00f)) * 4;
       }
       tC = Math.min(tC, this.C);
       int i = (!p2)? 0: tC;
       this.q.startScroll(this.c.getScrollX(), 0, this, 0, i);
       i0.j0(this);
       return;
    }
    public final void m(int p0,int p1){
       if (PatchProxy.isSupport(LiveGiftBoxPopupView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveGiftBoxPopupView.class, "23")) {
          return;
       }
       this.n(p0, p1, true);
       return;
    }
    public final void n(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(LiveGiftBoxPopupView.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, LiveGiftBoxPopupView.class, "24")) {
          return;
       }
       int i = p0 - this.c.getScrollY();
       if (!i) {
          return;
       }
       LiveGiftBoxPopupView tC = this.C;
       if (p1) {
          tC = Math.round((Math.abs(((float)i / (float)p1)) * 1000.00f)) * 4;
       }
       tC = Math.min(tC, this.C);
       int i1 = (!p2)? 0: tC;
       this.q.startScroll(0, this.c.getScrollY(), 0, i, i1);
       i0.j0(this);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxPopupView.class, "6")) {
          return;
       }
       super.onAttachedToWindow();
       this.B = this.f();
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxPopupView.class, "5")) {
          return;
       }
       super.onConfigurationChanged(p0);
       this.B = this.f();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxPopupView.class, "4")) {
          return;
       }
       super.onFinishInflate();
       this.c = this.findViewById(0x7f0a0923);
       this.b = this.findViewById(0x7f0a03a0);
       this.c.setOnClickListener(new LiveGiftBoxPopupView$a(this));
       this.setFocusableInTouchMode(true);
       this.setOnKeyListener(new LiveGiftBoxPopupView$b(this));
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       float x;
       LiveGiftBoxPopupView obj = PatchProxy.applyOneRefs(p0, this, LiveGiftBoxPopupView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
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
                   this.h(true);
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
             this.h(true);
          }
       }
       if (this.r == null) {
          this.r = VelocityTracker.obtain();
       }
       this.r.addMovement(p0);
       return this.p;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LiveGiftBoxPopupView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LiveGiftBoxPopupView.class, "8")) {
          return;
       }
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
                boolean b = false;
                this.z = b;
                this.m = measuredHeig;
                this.n = measuredWidt;
                this.k = p0;
                this.l = p1;
                p0 = p0 - measuredHeig;
                this.i = p0;
                this.j = p1 - measuredWidt;
                LiveGiftBoxPopupView th = this.h;
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
                if (this.D != null) {
                   Object obj = PatchProxy.apply(null, this, LiveGiftBoxPopupView.class, "30");
                   boolean b1 = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableGiftBoxScrollAnimOpt", b);
                   if (b1) {
                   label_00d0 :
                      this.j(b);
                   }
                }
                b = true;
                goto label_00d0 ;
             }
          }
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftBoxPopupView.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
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
             if (!PatchProxy.isSupport(LiveGiftBoxPopupView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, LiveGiftBoxPopupView.class, "22")) {
                if (i <= -100) {
                   this.m(Math.max((this.m - this.getMeasuredHeight()), (- this.i)), i);
                }else if(i >= 100){
                   this.m((- this.getMeasuredHeight()), i);
                }else if(this.c.getScrollY() >= (- this.i)){
                   LiveGiftBoxPopupView ti = this.i;
                   if ((float)this.c.getScrollY() - (- (((float)(this.getMeasuredHeight() - ti) * 0.20f) + (float)ti)) >= 0) {
                      this.m((- ti), i);
                   }else {
                      this.m((- this.getMeasuredHeight()), i);
                   }
                }
             }
             this.p = b;
             b = true;
          }
          LiveGiftBoxPopupView tr = this.r;
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
       if (PatchProxy.isSupport(LiveGiftBoxPopupView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveGiftBoxPopupView.class, "3")) {
          return;
       }
       this.b.setBackgroundResource(p0);
       return;
    }
    public void setContentView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftBoxPopupView.class, "16")) {
          return;
       }
       FrameLayout$LayoutParams layoutParams = null;
       if (p0.getLayoutParams() instanceof FrameLayout$LayoutParams) {
          layoutParams = p0.getLayoutParams();
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, layoutParams, this, LiveGiftBoxPopupView.class, "17")) {
          if (layoutParams == null) {
             layoutParams = new FrameLayout$LayoutParams(-1, -2);
          }
          LiveGiftBoxPopupView td = this.d;
          if (td != null) {
             this.c.removeView(td);
          }
          this.d = p0;
          p0.setClickable(true);
          this.c.addView(p0, layoutParams);
       }
       return;
    }
    public void setDragEnable(boolean p0){
       this.w = p0;
    }
    public void setMaxScrollDuration(int p0){
       this.C = p0;
    }
    public void setMinInitialTopOffset(int p0){
       this.z = true;
       this.h = p0;
    }
    public void setOnDismissListener(LiveGiftBoxPopupView$d p0){
       this.f = p0;
    }
    public void setOnScrollListener(LiveGiftBoxPopupView$e p0){
       this.g = p0;
    }
    public void setOnShowListener(LiveGiftBoxPopupView$f p0){
       this.e = p0;
    }
}
