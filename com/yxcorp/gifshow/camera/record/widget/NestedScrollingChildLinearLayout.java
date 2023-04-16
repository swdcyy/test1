package com.yxcorp.gifshow.camera.record.widget.NestedScrollingChildLinearLayout;
import a2.t;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.camera.record.widget.NestedScrollingChildLinearLayout$a;
import nsd.u;
import android.content.Context;
import android.util.AttributeSet;
import a2.u;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import android.view.MotionEvent;
import java.lang.Math;

public final class NestedScrollingChildLinearLayout extends LinearLayout implements t	// class@000fc7
{
    public final int[] b;
    public final int[] c;
    public final int d;
    public int e;
    public int f;
    public boolean g;
    public final u h;
    public static final NestedScrollingChildLinearLayout$a i;

    static {
       NestedScrollingChildLinearLayout.i = new NestedScrollingChildLinearLayout$a(null);
    }
    public void NestedScrollingChildLinearLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       int[] ointArray = new int[2];
       this.b = ointArray;
       int[] ointArray1 = new int[2];
       this.c = ointArray1;
       this.d = 22;
       this.h = new u(this);
    }
    public boolean dispatchNestedFling(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(NestedScrollingChildLinearLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, NestedScrollingChildLinearLayout.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.h.a(p0, p1, p2);
    }
    public boolean dispatchNestedPreFling(float p0,float p1){
       if (PatchProxy.isSupport(NestedScrollingChildLinearLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, NestedScrollingChildLinearLayout.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.h.b(p0, p1);
    }
    public boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3){
       if (PatchProxy.isSupport(NestedScrollingChildLinearLayout.class)) {
          Object obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, p3, this, NestedScrollingChildLinearLayout.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.h.c(p0, p1, p2, p3);
    }
    public boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4){
       if (PatchProxy.isSupport(NestedScrollingChildLinearLayout.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),p4};
          Object obj = PatchProxy.apply(objArray, this, NestedScrollingChildLinearLayout.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.h.f(p0, p1, p2, p3, p4);
    }
    public boolean hasNestedScrollingParent(){
       Object obj = PatchProxy.apply(null, this, NestedScrollingChildLinearLayout.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.h.k();
    }
    public boolean isNestedScrollingEnabled(){
       Object obj = PatchProxy.apply(null, this, NestedScrollingChildLinearLayout.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.h.m();
    }
    public boolean onTouchEvent(MotionEvent p0){
       int i;
       Integer obj = PatchProxy.applyOneRefs(p0, this, NestedScrollingChildLinearLayout.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = (p0 != null)? Integer.valueOf(p0.getAction()): null;
       float f = 0x3f000000;
       if (obj != null && !obj.intValue()) {
          i = (int)(p0.getRawY() + f);
          this.e = i;
          this.g = false;
          this.f = i;
          this.startNestedScroll(2);
       }else if(obj != null && obj.intValue() == 2){
          i = (int)(p0.getRawY() + f);
          if (this.g == null && Math.abs((i - this.f)) >= this.d) {
             this.g = true;
          }
          int i1 = this.e - i;
          this.e = i;
          if (this.g != null) {
             this.dispatchNestedPreScroll(0, i1, this.b, this.c);
          }
       }else if(obj != null && obj.intValue() == 1){
          this.stopNestedScroll();
       }else if(obj != null && obj.intValue() == 3){
          this.stopNestedScroll();
       }
       return true;
    }
    public void setNestedScrollingEnabled(boolean p0){
       if (PatchProxy.isSupport(NestedScrollingChildLinearLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, NestedScrollingChildLinearLayout.class, "7")) {
          return;
       }
       this.h.n(p0);
       return;
    }
    public boolean startNestedScroll(int p0){
       if (PatchProxy.isSupport(NestedScrollingChildLinearLayout.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, NestedScrollingChildLinearLayout.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.h.p(p0);
    }
    public void stopNestedScroll(){
       if (PatchProxy.applyVoid(null, this, NestedScrollingChildLinearLayout.class, "4")) {
          return;
       }
       this.h.r();
       return;
    }
}
