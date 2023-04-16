package com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBarV2;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBar;
import android.content.Context;
import lnc.a1;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBarV2$a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBarV2$b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.ProgressBar;
import android.widget.FrameLayout;
import java.lang.Integer;
import android.view.View;
import android.app.Activity;
import e3a.a;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import joc.z;

public class SlidePlayVideoLoadingProgressBarV2 extends SlidePlayVideoLoadingProgressBar	// class@001a6d
{
    public SwipeLayout n;
    public int o;
    public int p;
    public boolean q;
    public int r;
    public boolean s;
    public int t;
    public SlidePlayVideoLoadingProgressBarV2$b u;
    public z v;

    public void SlidePlayVideoLoadingProgressBarV2(Context p0){
       super(p0);
       this.q = false;
       this.r = a1.e(50.00f);
       this.t = 2;
       this.v = new SlidePlayVideoLoadingProgressBarV2$a(this);
    }
    public void SlidePlayVideoLoadingProgressBarV2(Context p0,AttributeSet p1){
       super(p0, p1);
       this.q = false;
       this.r = a1.e(50.00f);
       this.t = 2;
       this.v = new SlidePlayVideoLoadingProgressBarV2$a(this);
    }
    public void SlidePlayVideoLoadingProgressBarV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.q = false;
       this.r = a1.e(50.00f);
       this.t = 2;
       this.v = new SlidePlayVideoLoadingProgressBarV2$a(this);
    }
    public void g(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayVideoLoadingProgressBarV2.class, "4")) {
          return;
       }
       this.q = true;
       int i = (int)p0.getX();
       int i1 = this.o - i;
       int i2 = this.p - (int)p0.getY();
       if (this.h(p0) && (i != this.o && Math.abs(i1) >= Math.abs(i2))) {
          SlidePlayVideoLoadingProgressBarV2 tu = this.u;
          if (tu != null) {
             this.s = true;
             tu.e();
          }
       }
       return;
    }
    public final boolean h(MotionEvent p0){
       boolean b;
       int[] obj = PatchProxy.applyOneRefs(p0, this, SlidePlayVideoLoadingProgressBarV2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int[] ointArray = new int[2];
       this.getLocationInWindow(ointArray);
       obj = new int[2];
       SlidePlayVideoLoadingProgressBarV2 tn = this.n;
       if (tn != null) {
          tn.getLocationInWindow(obj);
       }
       if (ointArray[0] <= ((int)p0.getX() + obj[0]) && (((int)p0.getX() + obj[0]) <= (ointArray[0] + this.getMeasuredWidth()) && (((int)p0.getY() + obj[1]) >= (ointArray[1] - this.r) && ((int)p0.getY() + obj[1]) <= ((ointArray[1] + this.getMeasuredHeight()) + this.r)))) {
          p0 = PatchProxy.apply(null, this, SlidePlayVideoLoadingProgressBarV2.class, "6");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          }else if(!this.getVisibility()){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             return 1;
          }
       }
    label_0082 :
       return 0;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, SlidePlayVideoLoadingProgressBarV2.class, "7")) {
          return;
       }
       this.q = false;
       this.s = false;
       SlidePlayVideoLoadingProgressBarV2 tu = this.u;
       if (tu != null) {
          tu.a();
       }
       return;
    }
    public void setLoadingBarStatus(int p0){
       SlidePlayVideoLoadingProgressBarV2 tv;
       if (PatchProxy.isSupport(SlidePlayVideoLoadingProgressBarV2.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SlidePlayVideoLoadingProgressBarV2.class, "8")) {
          return;
       }
       if (this.t == p0) {
          return;
       }
       this.t = p0;
       Object[] objArray = null;
       int i = 1;
       if (p0 == i) {
          if (!PatchProxy.applyVoid(objArray, this, SlidePlayVideoLoadingProgressBarV2.class, "1")) {
             if (this.n == null) {
                this.n = w9.c(a.a(this));
             }
             if (this.n != null) {
                tv = this.v;
                if (tv != null) {
                   tv.i(i);
                   this.n.b(i, this.v);
                }
             }
          }
       }else if(PatchProxy.applyVoid(objArray, this, SlidePlayVideoLoadingProgressBarV2.class, "2")){
          tv = this.n;
          if (tv != null) {
             tv.m(this.v);
          }
       }
       return;
    }
    public void setTouchEventListener(SlidePlayVideoLoadingProgressBarV2$b p0){
       this.u = p0;
    }
}
