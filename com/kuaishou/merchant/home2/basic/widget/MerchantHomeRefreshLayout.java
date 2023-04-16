package com.kuaishou.merchant.home2.basic.widget.MerchantHomeRefreshLayout;
import ft3.a;
import com.kwai.library.widget.refresh.CustomRefreshLayout;
import android.content.Context;
import android.util.AttributeSet;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.ViewConfiguration;
import android.view.View;
import com.kwai.library.widget.refresh.RefreshLayout;
import ex3.e;
import android.view.MotionEvent;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Canvas;
import java.lang.Boolean;
import brd.y;
import brd.t;
import java.lang.Math;

public class MerchantHomeRefreshLayout extends CustomRefreshLayout implements a	// class@0016f1
{
    public float h1;
    public float i1;
    public float j1;
    public int k1;
    public boolean l1;
    public c m1;
    public e n1;

    public void MerchantHomeRefreshLayout(Context p0){
       super(p0, null);
    }
    public void MerchantHomeRefreshLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.m1 = PublishSubject.g();
       if (PatchProxy.applyVoid(null, this, MerchantHomeRefreshLayout.class, "1")) {
       }else {
          this.h1 = (float)ViewConfiguration.get(this.getContext()).getScaledTouchSlop();
       }
       return;
    }
    public void K(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomeRefreshLayout.class, "2")) {
          return;
       }
       MerchantHomeRefreshLayout tn1 = this.n1;
       if (tn1 == null) {
          super.K(p0);
       }else {
          tn1.a(p0);
       }
       return;
    }
    public final float M(MotionEvent p0,int p1){
       if (PatchProxy.isSupport(MerchantHomeRefreshLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, MerchantHomeRefreshLayout.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       p1 = p0.findPointerIndex(p1);
       if (p1 < 0) {
          return 0xbf800000;
       }else {
          return p0.getX(p1);
       }
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomeRefreshLayout.class, "8")) {
          return;
       }
       super.dispatchDraw(p0);
       this.m1.onNext(Boolean.TRUE);
       return;
    }
    public t getDispatchDrawObservable(){
       Object obj = PatchProxy.apply(null, this, MerchantHomeRefreshLayout.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.m1.hide();
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       MerchantHomeRefreshLayout obj = PatchProxy.applyOneRefs(p0, this, MerchantHomeRefreshLayout.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       int i = -1;
       boolean b = false;
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                }
             }else if(this.l1 != null){
                return b;
             }else {
                obj = this.k1;
                if (obj != i) {
                   float f = this.M(p0, obj);
                   float f1 = this.r(p0, this.k1);
                   int i1 = 0xbf800000;
                   if (f - i1 && f1 - i1) {
                      f = Math.abs((f - this.i1));
                      f1 = Math.abs((f1 - this.j1));
                      if (f - this.h1 > 0 && f - f1 > 0) {
                         return b;
                      }
                   }
                }
             }
          }else {
          }
       }else {
          this.l1 = b;
          action = p0.getPointerId(b);
          this.k1 = action;
          if (action != i) {
             this.i1 = this.M(p0, action);
             this.j1 = this.r(p0, this.k1);
          }
       }
    label_0079 :
       return super.onInterceptTouchEvent(p0);
    }
    public float r(MotionEvent p0,int p1){
       if (PatchProxy.isSupport(MerchantHomeRefreshLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, MerchantHomeRefreshLayout.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       p1 = p0.findPointerIndex(p1);
       if (p1 < 0) {
          return 0xbf800000;
       }else {
          return p0.getY(p1);
       }
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       if (PatchProxy.isSupport(MerchantHomeRefreshLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MerchantHomeRefreshLayout.class, "5")) {
          return;
       }
       this.l1 = p0;
       super.requestDisallowInterceptTouchEvent(p0);
       return;
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, MerchantHomeRefreshLayout.class, "3")) {
          return;
       }
       MerchantHomeRefreshLayout tn1 = this.n1;
       if (tn1 == null) {
          super.s();
       }else {
          tn1.b();
       }
       return;
    }
    public void setStateViewDelegate(e p0){
       this.n1 = p0;
    }
}
