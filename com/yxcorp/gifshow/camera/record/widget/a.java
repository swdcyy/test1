package com.yxcorp.gifshow.camera.record.widget.a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Float;
import java.util.Objects;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout$LayoutParams;
import java.lang.Math;
import com.yxcorp.gifshow.camera.record.widget.AdjustableCameraView$d;

public class a extends GestureDetector$SimpleOnGestureListener	// class@000fe3
{
    public final AdjustableCameraView b;

    public void a(AdjustableCameraView p0){
       this.b = p0;
       super();
    }
    public boolean onDown(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b.t != null || super.onDown(p0))? true: false;
       return b;
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       a obj;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, a.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b;
       if (obj.s == null) {
          return true;
       }else {
          float f = 0;
          if (obj.n - f || obj.m - f) {
             float f1 = p1.getRawX() - this.b.m;
             a tb = this.b;
             float f2 = p1.getRawY() - tb.n;
             Objects.requireNonNull(tb);
             if (!PatchProxy.isSupport(AdjustableCameraView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f1), Float.valueOf(f2), tb, AdjustableCameraView.class, "6")) {
                RelativeLayout$LayoutParams layoutParams = tb.getLayoutParams();
                float f3 = (float)layoutParams.topMargin + f2;
                f2 = (float)layoutParams.leftMargin + f1;
                if (f2 - f < 0) {
                   f2 = 0;
                }else {
                   f1 = (float)(tb.p - layoutParams.width);
                   if (f2 - f1 > 0) {
                      f2 = f1;
                   }
                }
                f1 = Math.max(f3, f);
                f = (float)(tb.o - layoutParams.height);
                if (f1 - f > 0) {
                   f1 = f;
                }
                layoutParams.topMargin = (int)f1;
                layoutParams.leftMargin = (int)f2;
                tb.requestLayout();
             }
          }
          this.b.m = p1.getRawX();
          this.b.n = p1.getRawY();
          return super.onScroll(p0, p1, p2, p3);
       }
    }
    public boolean onSingleTapUp(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       AdjustableCameraView j = this.b.j;
       if (j != null) {
          j.a();
       }
       return true;
    }
}
