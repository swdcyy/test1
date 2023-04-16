package com.kwai.slide.play.detail.danmaku.topguide.SectionInterpolator;
import android.view.animation.Interpolator;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.slide.play.detail.danmaku.topguide.SectionInterpolator$mSum$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;

public final class SectionInterpolator implements Interpolator	// class@0017a5
{
    public final long[] a;
    public final float b;
    public final p c;

    public void SectionInterpolator(long[] p0){
       a.p(p0, "durations");
       super();
       this.a = p0;
       this.b = 0x3f800000 / (float)p0.length;
       this.c = s.c(new SectionInterpolator$mSum$2(p0));
    }
    public final long a(){
       Object obj = PatchProxy.apply(null, this, SectionInterpolator.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.c.getValue();
       }
       return obj.longValue();
    }
    public float getInterpolation(float p0){
       SectionInterpolator obj;
       float f1;
       float f2;
       if (PatchProxy.isSupport(SectionInterpolator.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, SectionInterpolator.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       float f = 0;
       SectionInterpolator ta = this.a;
       int len = ta.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i >= len) {
             return p0;
          }
          int i2 = i1 + 1;
          f1 = f / (float)this.a();
          f = f + (float)ta[i];
          f2 = f / (float)this.a();
          if (p0 - f2 < 0) {
             break ;
          }else {
             i = i + 1;
             i1 = i2;
          }
       }
       obj = this.b;
       return (((float)i1 * obj) + (((p0 - f1) / (f2 - f1)) * obj));
    }
}
