package com.yxcorp.gifshow.ad.webview.YodaNestedScrollWebView;
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
import k59.g2;
import com.kwai.yoda.bridge.YodaBaseWebView;
import ekd.i;
import android.widget.AbsoluteLayout;
import com.yxcorp.utility.n;
import java.lang.ref.WeakReference;
import android.app.Activity;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import a2.q;
import android.view.VelocityTracker;
import u19.b;
import com.yxcorp.gifshow.ad.webview.p;
import android.view.View$OnLongClickListener;
import java.lang.Math;
import a2.h0;
import u19.a;
import android.view.View;
import com.kuaishou.webkit.WebViewClient;
import ll8.c$b;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import e3a.a;

public class YodaNestedScrollWebView extends KwaiYodaWebView implements t	// class@0018b0
{
    public int A;
    public int B;
    public u C;
    public VelocityTracker D;
    public WebViewClient E;
    public int F;
    public b G;
    public boolean H;
    public WeakReference I;
    public int u;
    public int v;
    public final int[] w;
    public final int[] x;
    public int y;
    public boolean z;
    public static final int J;

    public void YodaNestedScrollWebView(Context p0){
       super(p0);
       int[] ointArray = new int[2];
       this.w = ointArray;
       int[] ointArray1 = new int[2];
       this.x = ointArray1;
       this.x(null);
    }
    public void YodaNestedScrollWebView(Context p0,AttributeSet p1){
       super(p0, p1);
       int[] ointArray = new int[2];
       this.w = ointArray;
       int[] ointArray1 = new int[2];
       this.x = ointArray1;
       this.x(p1);
    }
    public void YodaNestedScrollWebView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[2];
       this.w = ointArray;
       int[] ointArray1 = new int[2];
       this.x = ointArray1;
       this.x(p1);
    }
    public boolean dispatchNestedFling(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(YodaNestedScrollWebView.class)) {
          Object obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, YodaNestedScrollWebView.class, "21");
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
       if (PatchProxy.isSupport(YodaNestedScrollWebView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, YodaNestedScrollWebView.class, "22");
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
       if (PatchProxy.isSupport(YodaNestedScrollWebView.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, YodaNestedScrollWebView.class, "20");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.C.c(p0, p1, p2, p3);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4){
       if (PatchProxy.isSupport(YodaNestedScrollWebView.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, YodaNestedScrollWebView.class, "19");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.C.f(p0, p1, p2, p3, p4);
    }
    public boolean hasNestedScrollingParent(){
       Object obj = PatchProxy.apply(null, this, YodaNestedScrollWebView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.C.k();
    }
    public void initJavascriptBridge(){
       if (PatchProxy.applyVoid(null, this, YodaNestedScrollWebView.class, "3")) {
          return;
       }
       this.mJavascriptBridge = new g2(this);
       return;
    }
    public boolean isNestedScrollingEnabled(){
       Object obj = PatchProxy.apply(null, this, YodaNestedScrollWebView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.C.m();
    }
    public void onMeasure(int p0,int p1){
       int i;
       if (PatchProxy.isSupport(YodaNestedScrollWebView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, YodaNestedScrollWebView.class, "2")) {
          return;
       }
       if (this.F != null) {
          p1 = (i.c())? n.A(this.getContext()): 0;
          YodaNestedScrollWebView tI = this.I;
          i = (tI != null && tI.get() != null)? n.j(this.I.get()): n.u(this.getContext());
          p1 = View$MeasureSpec.makeMeasureSpec(((i - p1) - this.F), 0x40000000);
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(YodaNestedScrollWebView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, YodaNestedScrollWebView.class, "12")) {
          return;
       }
       if (p3) {
          this.H = true;
       }
       super.onOverScrolled(p0, p1, p2, p3);
       return;
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(YodaNestedScrollWebView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, YodaNestedScrollWebView.class, "13")) {
          return;
       }
       super.onScrollChanged(p0, p1, p2, p3);
       if (!this.hasFocus()) {
          this.requestFocus();
       }
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int b;
       YodaNestedScrollWebView e;
       int i = this;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       View$OnLongClickListener obj1 = PatchProxy.applyOneRefs(obj, i, YodaNestedScrollWebView.class, "4");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       MotionEvent motionEvent = MotionEvent.obtain(p0);
       int i1 = q.c(p0);
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
       YodaNestedScrollWebView g = i.G;
       if (g != null) {
          g.a(obj);
       }
       g = 2;
       if (i1) {
          if (i1 != 1) {
             if (i1 != g) {
                if (i1 != 3) {
                   if (i1 != 5) {
                      b = false;
                   }else {
                      this.stopNestedScroll();
                      b = super.onTouchEvent(p0);
                   }
                }
             }else if(PatchProxy.isSupport(YodaNestedScrollWebView.class)){
                Object obj3 = PatchProxy.applyTwoRefs(motionEvent, Integer.valueOf(i4), i, YodaNestedScrollWebView.class, "5");
                if (obj3 != patchProxyRe) {
                   b = obj3.booleanValue();
                }
             }
             b = i.u - i4;
             i.y(motionEvent, b);
             if (i.dispatchNestedPreScroll(i2, b, i.x, i.w)) {
                b = b - i.x[1];
                motionEvent.offsetLocation(0, (float)i.w[1]);
                i.y = i.y + i.w[1];
                i.setOnLongClickListener(p.b);
                i.z = true;
             }else {
                i.y(motionEvent, b);
                i.z = i2;
             }
             i1 = this.getWebScrollY();
             i.u = i4 - i.w[1];
             i3 = Math.max(i2, (i1 + b));
             int i5 = b - (i3 - i1);
             if (this.dispatchNestedScroll(0, (i3 - i5), 0, i5, i.w)) {
                e = i.w;
                i.u = i.u - e[1];
                motionEvent.offsetLocation(0, (float)e[1]);
                i.y = i.y + i.w[1];
                b = super.onTouchEvent(motionEvent);
             }else {
                b = false;
             }
             motionEvent.recycle();
          }
          if (i.z != null) {
             super.onTouchEvent(MotionEvent.obtain(0, 0, 3, 0, 0, 0));
          }
          obj1 = null;
          i.setOnLongClickListener(obj1);
          i.D.addMovement(obj);
          if (PatchProxy.isSupport(YodaNestedScrollWebView.class)) {
             String obj2 = PatchProxy.applyTwoRefs(obj, Integer.valueOf(i3), i, YodaNestedScrollWebView.class, "6");
             if (obj2 != patchProxyRe) {
                b = obj2.booleanValue();
             }else {
             label_0133 :
                i.D.computeCurrentVelocity(1000, (float)i.B);
                float f = - h0.b(i.D, q.e(obj, i3));
                if (Math.abs(f) - (float)i.A > 0 && (!i.dispatchNestedPreFling(0, f) && this.hasNestedScrollingParent())) {
                   i.dispatchNestedFling(0, f, true);
                }
                b = super.onTouchEvent(p0);
                this.stopNestedScroll();
                obj2 = 0x41200000;
                if (Math.abs((p0.getY() - (float)i.u)) - obj2 >= 0 || (Math.abs((p0.getX() - (float)i.v)) - obj2 < 0 && !PatchProxy.applyVoid(obj1, i, YodaNestedScrollWebView.class, "9"))) {
                   e = i.E;
                   if (e instanceof a) {
                      e.a();
                   }
                }
             }
          }else {
             goto label_0133 ;
          }
          i2 = b;
          b = i2;
          i2 = 1;
       }else {
          i.u = i4;
          i.v = (int)p0.getX();
          i.startNestedScroll(g);
          YodaNestedScrollWebView x = i.x;
          x[i2] = i2;
          x[1] = i2;
          x = i.w;
          x[i2] = i2;
          x[1] = i2;
          i.H = i2;
          b = super.onTouchEvent(p0);
          i.z = i2;
       }
       if (!i2) {
          i.D.addMovement(obj);
       }
       return b;
    }
    public boolean performHapticFeedback(int p0,int p1){
       if (PatchProxy.isSupport(YodaNestedScrollWebView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, YodaNestedScrollWebView.class, "8");
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
       if (PatchProxy.isSupport(YodaNestedScrollWebView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, YodaNestedScrollWebView.class, "14")) {
          return;
       }
       this.C.n(p0);
       return;
    }
    public void setOnTouchDownCallback(b p0){
       this.G = p0;
    }
    public void setWebViewClient(WebViewClient p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaNestedScrollWebView.class, "23")) {
          return;
       }
       this.E = p0;
       super.setWebViewClient(p0);
       return;
    }
    public boolean startNestedScroll(int p0){
       if (PatchProxy.isSupport(YodaNestedScrollWebView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, YodaNestedScrollWebView.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.C.p(p0);
    }
    public void stopNestedScroll(){
       if (PatchProxy.applyVoid(null, this, YodaNestedScrollWebView.class, "17")) {
          return;
       }
       this.C.r();
       return;
    }
    public final void x(AttributeSet p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaNestedScrollWebView.class, "1")) {
          return;
       }
       int i = 0;
       if (p0 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.t4);
          this.F = (int)typedArray.getDimension(i, 0);
          typedArray.recycle();
       }
       ViewConfiguration viewConfigur = ViewConfiguration.get(this.getContext());
       this.C = new u(this);
       this.setNestedScrollingEnabled(true);
       this.B = viewConfigur.getScaledMaximumFlingVelocity();
       this.A = viewConfigur.getScaledMinimumFlingVelocity();
       this.setOverScrollMode(i);
       this.I = new WeakReference(a.b(this.getContext()));
       return;
    }
    public final void y(MotionEvent p0,int p1){
       boolean b;
       if (PatchProxy.isSupport(YodaNestedScrollWebView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, YodaNestedScrollWebView.class, "7")) {
          return;
       }
       if (p1 < 0) {
          Object obj = PatchProxy.apply(null, this, YodaNestedScrollWebView.class, "11");
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
