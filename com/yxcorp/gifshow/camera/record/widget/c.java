package com.yxcorp.gifshow.camera.record.widget.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.widget.CameraView;
import java.lang.Object;
import android.view.View;
import gxc.f;
import android.graphics.PointF;
import com.yxcorp.gifshow.camera.record.widget.CameraView$c;
import java.lang.Math;
import lnc.a1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import android.widget.FrameLayout;
import wu8.p;
import android.graphics.Rect;
import brd.t;
import gxc.a;
import com.yxcorp.gifshow.camera.record.widget.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class c implements View$OnClickListener	// class@000fe5
{
    public final CameraView b;

    public void c(CameraView p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       CameraView q = tb.q;
       if (q == null || !q.H1()) {
          q = tb.p;
          if (q != null) {
             CameraView c = tb.c;
             if (q.a(c.x, c.y)) {
             }
          }else if(tb.u != null){
             int i = 0x41a00000;
             if (Math.abs((tb.c.x - tb.b.x)) - i < 0 && (Math.abs((tb.c.y - tb.b.y)) - i < 0 && tb.c.y - (float)(a1.g() - a1.e(48.00f)) < 0)) {
                q = tb.b;
                PointF x = q.x;
                PointF y = q.y;
                if (!PatchProxy.isSupport(CameraView.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(x), Float.valueOf(y), tb, CameraView.class, "15")) {
                   int height = tb.getHeight();
                   if (tb.getWidth() && height) {
                      CameraView g = tb.g;
                      if (g != null) {
                         float f = (float)p.d().e("afaeMeteringRegion", 100);
                         g.a(new Rect((int)(x - f), (int)(y - f), (int)(x + f), (int)(f + y))).subscribe(new d(tb, x, y), Functions.d());
                      }
                   }
                }
             }
          }
       }
    label_00be :
       return;
    }
}
