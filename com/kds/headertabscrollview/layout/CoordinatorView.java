package com.kds.headertabscrollview.layout.CoordinatorView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.kds.headertabscrollview.layout.CoordinatorView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kds.headertabscrollview.layout.CoordinatorView$e;
import com.kds.headertabscrollview.layout.CoordinatorView$f;
import com.kds.headertabscrollview.layout.CoordinatorView$d;
import com.kds.headertabscrollview.layout.CoordinatorView$b;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import com.kds.headertabscrollview.layout.ReactNestedScrollView;
import com.kds.headertabscrollview.event.CoordinatorScrollEvent;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import kotlin.TypeCastException;
import android.view.MotionEvent;
import java.lang.Runnable;
import com.kds.headertabscrollview.layout.AppBarView;
import android.widget.LinearLayout;
import java.lang.Math;
import com.kds.headertabscrollview.layout.FlingViewPager;
import com.kds.headertabscrollview.layout.CoordinatorView$c;
import android.view.View$OnLayoutChangeListener;
import com.google.android.material.appbar.KdsReboundBehavior;
import sj.j;
import com.google.android.material.appbar.KdsReboundBehavior$b;
import com.kds.headertabscrollview.layout.ReboundView;
import android.widget.FrameLayout;
import com.google.android.material.appbar.KdsCustomAppBarLayoutBehavior;
import android.view.ViewParent;
import com.kds.headertabscrollview.animation.CoordinatorAnimation;
import a2.i0;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;

public final class CoordinatorView extends CoordinatorLayout	// class@00071e
{
    public boolean A;
    public ReboundView B;
    public AppBarView C;
    public FlingViewPager D;
    public int E;
    public int F;
    public final Runnable G;
    public Runnable H;
    public final j I;
    public final KdsReboundBehavior$b J;
    public boolean z;
    public static final CoordinatorView$a K;

    static {
       CoordinatorView.K = new CoordinatorView$a(null);
    }
    public void CoordinatorView(Context p0){
       a.q(p0, "context");
       super(p0);
       this.G = new CoordinatorView$e(this);
       this.H = new CoordinatorView$f(this);
       this.I = new CoordinatorView$d(this);
       this.J = new CoordinatorView$b(this);
       this.setLayoutParams(new CoordinatorLayout$LayoutParams(-1, -1));
       this.setClipChildren(true);
    }
    public final void Z(View p0){
       int i = 0;
       if (p0 instanceof ReactNestedScrollView) {
          p0.scrollTo(i, i);
          return;
       }else if(!p0 instanceof ViewGroup){
          return;
       }else {
          int childCount = p0.getChildCount();
          for (; i < childCount; i = i + 1) {
             View childAt = p0.getChildAt(i);
             a.h(childAt, "view.getChildAt\(i\)");
             this.Z(childAt);
          }
          return;
       }
    }
    public final void a0(CoordinatorScrollEvent p0,WritableMap p1){
       Context context = this.getContext();
       if (context == null) {
          throw new TypeCastException("null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
       }
       if (!context.hasActiveCatalystInstance()) {
          return;
       }
       context.getJSModule(RCTEventEmitter.class).receiveEvent(this.getId(), p0.toString(), p1);
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       a.q(p0, "ev");
       int action = p0.getAction();
       boolean b = true;
       if (action) {
          if (action == b || action == 3) {
             this.z = false;
          }
       }else {
          this.z = b;
       }
       return super.dispatchTouchEvent(p0);
    }
    public void forceLayout(){
       this.isInLayout();
       this.isLayoutRequested();
       super.forceLayout();
       this.post(this.G);
       this.post(this.H);
    }
    public final int getTopOffset(){
       CoordinatorView tC = this.C;
       int i = 0;
       int stickyHeader = (tC != null)? tC.getStickyHeaderHeight(): 0;
       CoordinatorView tC1 = this.C;
       int measuredHeig = (tC1 != null)? tC1.getMeasuredHeight(): 0;
       CoordinatorView tC2 = this.C;
       if (tC2 != null) {
          i = tC2.getTop();
       }
       i = Math.min(i, this.F);
       if ((i + measuredHeig) < stickyHeader) {
          i = stickyHeader - measuredHeig;
       }
       return i;
    }
    public void onAttachedToWindow(){
       super.onAttachedToWindow();
       if (this.A == null) {
          this.onFinishInflate();
          this.A = true;
       }
       return;
    }
    public void onFinishInflate(){
       KdsReboundBehavior reboundBehav;
       int childCount = this.getChildCount();
       int i = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          if (childAt != null) {
             if (childAt instanceof FlingViewPager) {
                this.D = childAt;
             }else if(childAt instanceof AppBarView){
                this.C = childAt;
                childAt.addOnLayoutChangeListener(new CoordinatorView$c(this));
                CoordinatorView tC = this.C;
                if (tC != null) {
                   reboundBehav = tC.getReboundBehavior();
                   if (reboundBehav != null) {
                      reboundBehav.N(this.I);
                   }
                }
                tC = this.C;
                if (tC != null) {
                   reboundBehav = tC.getReboundBehavior();
                   if (reboundBehav != null) {
                      reboundBehav.V(this.J);
                   }
                }
             }else if(childAt instanceof ReboundView){
                this.B = childAt;
             }
          }
          i = i + 1;
       }
       if (this.D != null) {
          CoordinatorView tC1 = this.C;
          if (tC1 != null) {
             if (tC1 == null) {
                a.L();
             }
             KdsReboundBehavior reboundBehav1 = tC1.getReboundBehavior();
             CoordinatorView tD = this.D;
             if (tD == null) {
                a.L();
             }
             reboundBehav1.J(tD.getId());
          }
       }
       this.post(this.H);
       this.setViewClipChildren(this.getParent());
       super.onFinishInflate();
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int topOffset = this.getTopOffset();
       CoordinatorView tC = this.C;
       if (tC != null) {
          tC.getTop();
       }
       CoordinatorAnimation d = CoordinatorAnimation.d;
       d.c();
       int i = 0;
       if (!d.c()) {
          super.onLayout(p0, p1, p2, p3, p4);
          if (this.getChildCount() > 0) {
             View childAt = this.getChildAt(i);
             if (childAt instanceof ReboundView && !childAt.getHeight()) {
                i0.e0(childAt, topOffset);
             }
          }
          return;
       }else {
          int paddingLeft = this.getPaddingLeft();
          p1 = this.getPaddingTop();
          p2 = this.getChildCount();
          while (true) {
             if (i >= p2) {
                return;
             }
             View childAt1 = this.getChildAt(i);
             if (childAt1 != null) {
                ViewGroup$LayoutParams layoutParams = childAt1.getLayoutParams();
                if (layoutParams != null) {
                   int i1 = paddingLeft + layoutParams.leftMargin;
                   p4 = layoutParams.topMargin + p1;
                   int measuredHeig = childAt1.getMeasuredHeight();
                   int i2 = p4 + topOffset;
                   CoordinatorAnimation.d.a(childAt1, i1, i2, childAt1.getMeasuredWidth(), measuredHeig);
                   p4 = layoutParams.topMargin + measuredHeig;
                   p4 = p4 + layoutParams.bottomMargin;
                   p1 = p1 + p4;
                }else {
                   break ;
                }
             }
             i = i + 1;
          }
          throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       }
    }
    public void onMeasure(int p0,int p1){
       View$MeasureSpec.getSize(p1);
       CoordinatorView tC = this.C;
       int stickyHeader = (tC != null)? tC.getStickyHeaderHeight(): 0;
       int i = View$MeasureSpec.getSize(p1) - stickyHeader;
       if (i > 0) {
          tC = this.D;
          if (tC != null) {
             tC.setMaxHeight(i);
          }
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void requestLayout(){
       super.requestLayout();
       if (this.z == null || this.E == null) {
          this.post(this.G);
       }else {
          this.postDelayed(this.G, 100);
       }
       this.post(this.H);
       return;
    }
    public final void setViewClipChildren(ViewParent p0){
       if (p0 != null && p0 instanceof ViewGroup) {
          p0.setClipChildren(true);
          this.setViewClipChildren(p0.getParent());
       }
       return;
    }
}
