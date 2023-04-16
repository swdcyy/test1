package com.yxcorp.gifshow.camera.record.widget.h;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.yxcorp.gifshow.camera.record.widget.SampleVideoView;
import android.view.MotionEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import android.widget.RelativeLayout;
import j8c.a;
import q87.c;
import java.lang.Math;
import com.yxcorp.gifshow.camera.record.widget.SampleVideoView$b;

public class h extends GestureDetector$SimpleOnGestureListener	// class@000fea
{
    public final SampleVideoView b;

    public void h(SampleVideoView p0){
       this.b = p0;
       super();
    }
    public boolean onDown(MotionEvent p0){
       return true;
    }
    public boolean onScroll(MotionEvent p0,MotionEvent p1,float p2,float p3){
       h obj;
       if (PatchProxy.isSupport(h.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, h.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b;
       if (obj.o == null) {
          return true;
       }else {
          float f = 0;
          if (obj.c - f || obj.b - f) {
             float f1 = p1.getRawX() - this.b.b;
             h tb = this.b;
             float f2 = p1.getRawY() - tb.c;
             Objects.requireNonNull(tb);
             if (!PatchProxy.isSupport(SampleVideoView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f1), Float.valueOf(f2), tb, SampleVideoView.class, "9")) {
                float f3 = tb.getX() + f1;
                f1 = tb.getY() + f2;
                f2 = (float)((tb.getHeight() - tb.getWidth()) / 2);
                if (tb.d != null) {
                   Object[] objArray = new Object[0];
                   a.D().w("SampleVideoView", "original move", objArray);
                   f2 = Math.max(f3, f);
                   f1 = Math.max(f1, f);
                   if (f2 - (float)(tb.f - tb.getWidth()) > 0) {
                      f2 = (float)(tb.f - tb.getWidth());
                   }
                   if (f1 - (float)(tb.e - tb.getHeight()) > 0) {
                      f1 = (float)(tb.e - tb.getHeight());
                   }
                }else {
                   f2 = Math.min(Math.max(f3, f2), ((float)(tb.f - tb.getWidth()) - f2));
                   f1 = Math.min(Math.max(f1, (- f2)), ((float)(tb.e - tb.getHeight()) + f2));
                }
                tb.setX(f2);
                tb.setY(f1);
                tb.invalidate();
             }
          }
          this.b.b = p1.getRawX();
          this.b.c = p1.getRawY();
          return super.onScroll(p0, p1, p2, p3);
       }
    }
    public boolean onSingleTapUp(MotionEvent p0){
       p0 = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       h tb = this.b;
       SampleVideoView j = tb.j;
       if (j != null && tb.p != null) {
          j.a();
       }
       return true;
    }
}
