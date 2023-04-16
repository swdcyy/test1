package com.kuaishou.live.lite.performance.LivePerformanceMonitorFrameLayout;
import ya1.a;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.basic.widget.AlphaGradientHelper;
import android.view.View;
import android.view.ViewGroup;
import ec3.b;
import android.graphics.Canvas;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import android.graphics.Paint;
import java.lang.Math;
import java.lang.Boolean;
import java.lang.Integer;

public class LivePerformanceMonitorFrameLayout extends FrameLayout implements a	// class@000a3e
{
    public b b;
    public AlphaGradientHelper c;

    public void LivePerformanceMonitorFrameLayout(Context p0){
       super(p0);
    }
    public void LivePerformanceMonitorFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LivePerformanceMonitorFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void a(float p0,float p1,float p2,float p3){
       if (PatchProxy.isSupport(LivePerformanceMonitorFrameLayout.class) && PatchProxy.applyVoidFourRefs(Float.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), Float.valueOf(p3), this, LivePerformanceMonitorFrameLayout.class, "1")) {
          return;
       }
       if (this.c == null) {
          this.c = new AlphaGradientHelper(this);
       }
       this.c.a(p0, p1, p2, p3);
       return;
    }
    public void addView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePerformanceMonitorFrameLayout.class, "3")) {
          return;
       }
       super.addView(p0);
       LivePerformanceMonitorFrameLayout tb = this.b;
       if (tb == null) {
          return;
       }
       tb.e(p0);
       return;
    }
    public final void b(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePerformanceMonitorFrameLayout.class, "7")) {
          return;
       }
       if (this.c != null) {
          int i = p0.save();
          super.dispatchDraw(p0);
          LivePerformanceMonitorFrameLayout tc = this.c;
          Objects.requireNonNull(tc);
          AlphaGradientHelper uAlphaGradie = AlphaGradientHelper.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tc, uAlphaGradie, "3")) {
             a.p(p0, "canvas");
             if (tc.e - tc.f < 0) {
                Object obj = PatchProxy.apply(null, tc, uAlphaGradie, "1");
                if (obj == PatchProxyResult.class) {
                   obj = tc.g.getValue();
                }
                Object obj1 = obj;
                if (obj1 != null) {
                   float f = (tc.f - tc.e) / Math.abs((tc.d - tc.c));
                   int i1 = p0.save();
                   float f1 = 0;
                   p0.clipRect(f1, tc.e, (float)tc.b.getWidth(), tc.f);
                   p0.translate(f1, (tc.e - (Math.min(tc.c, tc.d) * f)));
                   if (tc.d - tc.c < 0) {
                      float f2 = (float)2;
                      float f3 = (float)tc.b.getWidth() / f2;
                      p0.rotate(180.00f, f3, (f / f2));
                   }
                   p0.scale(0x3f800000, (f / 100.00f));
                   p0.drawRect(0, 0, (float)tc.b.getWidth(), 100.00f, obj1);
                   p0.restoreToCount(i1);
                }
             }
          }
          p0.restoreToCount(i);
       }else {
          super.dispatchDraw(p0);
       }
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePerformanceMonitorFrameLayout.class, "6")) {
          return;
       }
       LivePerformanceMonitorFrameLayout tb = this.b;
       if (tb == null) {
          this.b(p0);
       }else {
          tb.a();
          this.b(p0);
          this.b.c();
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LivePerformanceMonitorFrameLayout.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LivePerformanceMonitorFrameLayout.class, "5")) {
             return;
          }
       }
       LivePerformanceMonitorFrameLayout tb = this.b;
       if (tb == null) {
          super.onLayout(p0, p1, p2, p3, p4);
       }else {
          tb.b();
          super.onLayout(p0, p1, p2, p3, p4);
          this.b.h();
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(LivePerformanceMonitorFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, LivePerformanceMonitorFrameLayout.class, "4")) {
          return;
       }
       LivePerformanceMonitorFrameLayout tb = this.b;
       if (tb == null) {
          super.onMeasure(p0, p1);
       }else {
          tb.f();
          super.onMeasure(p0, p1);
          this.b.d();
       }
       return;
    }
    public void removeView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePerformanceMonitorFrameLayout.class, "2")) {
          return;
       }
       super.removeView(p0);
       LivePerformanceMonitorFrameLayout tb = this.b;
       if (tb == null) {
          return;
       }
       tb.g(p0);
       return;
    }
    public void setPerformanceDelegate(b p0){
       this.b = p0;
    }
}
