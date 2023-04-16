package com.yxcorp.gifshow.camera.record.widget.CameraView$d;
import unc.h;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import gxc.f;
import android.view.MotionEvent;
import x8c.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.GestureDetector$SimpleOnGestureListener;
import java.lang.Math;
import java.lang.Float;
import com.yxcorp.gifshow.camera.record.widget.FocusView;
import lnc.a1;
import android.os.Handler;
import gxc.d;
import android.view.View;
import android.view.View$OnClickListener;

public class CameraView$d extends h	// class@000fc1
{
    public boolean d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;
    public final CameraView i;

    public void CameraView$d(CameraView p0){
       this.i = p0;
       super();
       this.g = false;
       this.h = true;
    }
    public boolean b(){
       CameraView$d obj = PatchProxy.apply(null, this, CameraView$d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i;
       boolean b = true;
       if (obj.l != null) {
          CameraView q = obj.q;
          if (q != null && q.l(b)) {
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public boolean c(){
       CameraView$d obj = PatchProxy.apply(null, this, CameraView$d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i;
       boolean b = false;
       if (obj.l != null) {
          CameraView q = obj.q;
          if (q != null && q.l(b)) {
             b = true;
          }
       }
       return b;
    }
    public void d(boolean p0){
       this.d = p0;
    }
    public boolean onDoubleTap(MotionEvent p0){
       CameraView obj = PatchProxy.applyOneRefs(p0, this, CameraView$d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().A("GestureListener", "onDoubleTap "+p0.getAction(), objArray);
       obj = this.i.q;
       if (obj == null || this.h == null) {
          return super.onDoubleTap(p0);
       }
       obj.B();
       return true;
    }
    public boolean onDoubleTapEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraView$d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          if (action == 1) {
             float f = Math.abs((p0.getY() - this.f));
             if (Math.abs((p0.getX() - this.e)) - 0x42c80000 > 0 || f - 0x42c80000 > 0) {
                this.h = false;
                this.g = true;
             }
          }
       }else {
          this.e = p0.getX();
          this.f = p0.getY();
       }
       return super.onDoubleTapEvent(p0);
    }
    public boolean onFling(MotionEvent p0,MotionEvent p1,float p2,float p3){
       boolean b1;
       if (PatchProxy.isSupport(CameraView$d.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, CameraView$d.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.h = false;
       CameraView$d ti = this.i;
       if (p0 != null && p1 != null) {
          int b = CameraView.B;
          if (p0.getY() - (float)b <= 0 && p1.getY() - (float)b <= 0) {
             b1 = true;
          label_0047 :
             ti.l = b1;
             if (super.onFling(p0, p1, p2, p3)) {
                p0.s = 0;
                return true;
             }else {
                CameraView$d ti1 = this.i;
                if (ti1.s > 5) {
                   if (ti1.q != null && !ti1.e.d()) {
                      this.i.q.v0();
                   }
                   ti1.s = 0;
                   return true;
                }else {
                   ti1.s = 0;
                   return false;
                }
             }
          }
       }
       b1 = false;
       goto label_0047 ;
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraView$d.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("GestureListener", "onLongPress "+p0.getAction(), objArray);
       CameraView q = this.i.q;
       if (q != null) {
          q.s();
       }
       return;
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       CameraView$d obj;
       int i1;
       CameraView e;
       if (PatchProxy.isSupport(CameraView$d.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, CameraView$d.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (this.d != null) {
          return false;
       }else {
          int i = 1;
          float f = 2.00f;
          if (p3 > 0 && p3 - (Math.abs(p2) * f) > 0) {
             obj = this.i;
             i1 = obj.s + i;
             obj.s = i1;
             int i2 = (int)((p3 / 50.00f) - 0x3f800000);
             if (i2 > 0) {
                if (i2 > 0.00f) {
                   i2 = 3;
                }
                obj.s = i1 + i2;
             }
          }else {
             this.i.s = 0;
          }
          obj = this.i;
          if (obj.u == null) {
             e = obj.e;
             if (e.j != null && (e.n != null && (Math.abs((p0.getX() - p1.getX())) * f) - Math.abs((p0.getY() - p1.getY())) < 0)) {
                obj = this.i;
                if (obj.v == null) {
                   e = obj.e;
                   i1 = FocusView.s;
                   e.h = e.h + ((((float)i1 * (- p3)) / (float)a1.g()) * 3.00f);
                   this.i.A.sendEmptyMessage(i);
                   obj = this.i;
                   float f1 = (- obj.e.h) / (float)i1;
                   e = obj.i;
                   if (e != null) {
                      e.a(f1);
                   }
                }
             }
          }
          e = this.i.q;
          if (e != null) {
             e.onScroll(p0, p1, p2, p3);
          }
          return false;
       }
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       CameraView$d obj = PatchProxy.applyOneRefs(p0, this, CameraView$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i;
       obj.y.onClick(obj);
       return super.onSingleTapConfirmed(p0);
    }
    public boolean onSingleTapUp(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CameraView$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.h = (this.g == null)? true: false;
       return super.onSingleTapUp(p0);
    }
}
