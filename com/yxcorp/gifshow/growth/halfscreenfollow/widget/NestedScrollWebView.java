package com.yxcorp.gifshow.growth.halfscreenfollow.widget.NestedScrollWebView;
import a2.t;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.webkit.WebView;
import a2.u;
import java.lang.Integer;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.widget.AbsoluteLayout;
import android.view.MotionEvent;
import a2.q;
import android.view.VelocityTracker;
import com.yxcorp.gifshow.growth.halfscreenfollow.widget.a;
import android.view.View$OnLongClickListener;
import java.lang.Math;
import a2.h0;
import android.view.View;
import android.view.ViewConfiguration;

public class NestedScrollWebView extends KwaiYodaWebView implements t	// class@001395
{
    public int A;
    public int B;
    public u C;
    public VelocityTracker D;
    public boolean E;
    public int u;
    public int v;
    public final int[] w;
    public final int[] x;
    public int y;
    public boolean z;
    public static final int F;

    public void NestedScrollWebView(Context p0){
       super(p0);
       int[] ointArray = new int[2];
       this.w = ointArray;
       int[] ointArray1 = new int[2];
       this.x = ointArray1;
       this.x(null);
    }
    public void NestedScrollWebView(Context p0,AttributeSet p1){
       super(p0, p1);
       int[] ointArray = new int[2];
       this.w = ointArray;
       int[] ointArray1 = new int[2];
       this.x = ointArray1;
       this.x(p1);
    }
    public void NestedScrollWebView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[2];
       this.w = ointArray;
       int[] ointArray1 = new int[2];
       this.x = ointArray1;
       this.x(p1);
    }
    public boolean dispatchNestedFling(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(NestedScrollWebView.class)) {
          Object obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, NestedScrollWebView.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!this.getWebScrollY()) {
          return this.C.a(p0, p1, p2);
       }else {
          return true;
       }
    }
    public boolean dispatchNestedPreFling(float p0,float p1){
       if (PatchProxy.isSupport(NestedScrollWebView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, NestedScrollWebView.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!this.getWebScrollY()) {
          return this.C.b(p0, p1);
       }else {
          return true;
       }
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3){
       if (PatchProxy.isSupport(NestedScrollWebView.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, NestedScrollWebView.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.C.c(p0, p1, p2, p3);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4){
       if (PatchProxy.isSupport(NestedScrollWebView.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, NestedScrollWebView.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.C.f(p0, p1, p2, p3, p4);
    }
    public boolean hasNestedScrollingParent(){
       Object obj = PatchProxy.apply(null, this, NestedScrollWebView.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.C.k();
    }
    public boolean isNestedScrollingEnabled(){
       Object obj = PatchProxy.apply(null, this, NestedScrollWebView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.C.m();
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(NestedScrollWebView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, NestedScrollWebView.class, "7")) {
          return;
       }
       if (p3) {
          this.E = true;
       }
       super.onOverScrolled(p0, p1, p2, p3);
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(NestedScrollWebView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, NestedScrollWebView.class, "8")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       if (!this.hasFocus()) {
          this.requestFocus();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int i = this;
       Object obj = p0;
       NestedScrollWebView obj1 = PatchProxy.applyOneRefs(obj, i, NestedScrollWebView.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       MotionEvent motionEvent = MotionEvent.obtain(p0);
       boolean i1 = q.c(p0);
       boolean i2 = 0;
       if (!i1) {
          i.y = i2;
       }
       if (i.D == null) {
          i.D = VelocityTracker.obtain();
       }
       int i3 = q.b(p0);
       int i4 = (int)p0.getY();
       obj.offsetLocation(0, (float)i.y);
       NestedScrollWebView nestedScroll = 2;
       if (i1) {
          if (i1 != 1) {
             if (i1 != nestedScroll) {
                if (i1 != 3) {
                   i1 = false;
                }
             }else {
                i1 = i.u - i4;
                i.y(motionEvent, i1);
                if (i.dispatchNestedPreScroll(i2, i1, i.x, i.w)) {
                   i1 = i1 - i.x[1];
                   motionEvent.offsetLocation(0, (float)i.w[1]);
                   i.y = i.y + i.w[1];
                   i.setOnLongClickListener(a.b);
                   i.z = true;
                }else {
                   i.y(motionEvent, i1);
                   i.z = i2;
                }
                i3 = this.getWebScrollY();
                i.u = i4 - i.w[1];
                i4 = Math.max(i2, (i3 + i1));
                int i5 = i1 - (i4 - i3);
                if (this.dispatchNestedScroll(0, (i4 - i5), 0, i5, i.w)) {
                   NestedScrollWebView w = i.w;
                   i.u = i.u - w[1];
                   motionEvent.offsetLocation(0, (float)w[1]);
                   i.y = i.y + i.w[1];
                   i1 = super.onTouchEvent(motionEvent);
                }else {
                   i1 = false;
                }
                motionEvent.recycle();
             }
          }
          if (i.z != null) {
             super.onTouchEvent(MotionEvent.obtain(0, 0, 3, 0, 0, 0));
          }
          i.setOnLongClickListener(null);
          i.D.addMovement(obj);
          i.D.computeCurrentVelocity(1000, (float)i.B);
          float f = - h0.b(i.D, q.e(obj, i3));
          if (Math.abs(f) - (float)i.A > 0 && (!i.dispatchNestedPreFling(0, f) && this.hasNestedScrollingParent())) {
             i.dispatchNestedFling(0, f, true);
          }
       label_0113 :
          i2 = super.onTouchEvent(p0);
          this.stopNestedScroll();
          if (Math.abs((p0.getY() - (float)i.u)) - 0x41200000 < 0) {
             Math.abs((p0.getX() - (float)i.v));
          }
          i1 = i2;
          i2 = 1;
       }else {
          i.u = i4;
          i.v = (int)p0.getX();
          i.startNestedScroll(nestedScroll);
          obj1 = i.x;
          obj1[i2] = i2;
          obj1[1] = i2;
          obj1 = i.w;
          obj1[i2] = i2;
          obj1[1] = i2;
          i.E = i2;
          i1 = super.onTouchEvent(p0);
          i.z = i2;
       }
       if (!i2) {
          i.D.addMovement(obj);
       }
       return i1;
    }
    public boolean performHapticFeedback(int p0,int p1){
       if (PatchProxy.isSupport(NestedScrollWebView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NestedScrollWebView.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!p0 && this.z != null) {
          return false;
       }else {
          return super.performHapticFeedback(p0, p1);
       }
    }
    public void setNestedScrollingEnabled(boolean p0){
       if (PatchProxy.isSupport(NestedScrollWebView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NestedScrollWebView.class, "9")) {
          return;
       }
       this.C.n(p0);
       return;
    }
    public boolean startNestedScroll(int p0){
       if (PatchProxy.isSupport(NestedScrollWebView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NestedScrollWebView.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.C.p(p0);
    }
    public void stopNestedScroll(){
       if (PatchProxy.applyVoid(null, this, NestedScrollWebView.class, "12")) {
          return;
       }
       this.C.r();
       return;
    }
    public final void x(AttributeSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NestedScrollWebView.class, "1")) {
          return;
       }
       ViewConfiguration viewConfigur = ViewConfiguration.get(this.getContext());
       this.C = new u(this);
       this.setNestedScrollingEnabled(true);
       this.B = viewConfigur.getScaledMaximumFlingVelocity();
       this.A = viewConfigur.getScaledMinimumFlingVelocity();
       this.setOverScrollMode(0);
       return;
    }
    public final void y(MotionEvent p0,int p1){
       boolean b;
       if (PatchProxy.isSupport(NestedScrollWebView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NestedScrollWebView.class, "3")) {
          return;
       }
       if (p1 < 0) {
          Object obj = PatchProxy.apply(null, this, NestedScrollWebView.class, "6");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(((float)(this.getContentHeight() - 1) * this.getScale()) - (float)this.getHeight() <= 0){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             p0.offsetLocation(0, 0x3f800000);
             super.onTouchEvent(p0);
          }
       }
       return;
    }
}
