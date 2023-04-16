package com.yxcorp.gifshow.camera.record.intelligentidentify.ui.FlashPointsView$c;
import com.yxcorp.gifshow.camera.record.intelligentidentify.ui.FlashPointsView;
import android.graphics.Point;
import java.lang.Object;
import java.util.Random;
import lnc.a1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import java.lang.Long;
import java.lang.Float;
import java.lang.Math;
import java.lang.StringBuffer;

public class FlashPointsView$c	// class@000e05
{
    public final Point a;
    public final int b;
    public final long c;
    public final float d;
    public final int e;
    public final int f;
    public float g;
    public float h;
    public boolean i;
    public int j;
    public final FlashPointsView k;

    public void FlashPointsView$c(FlashPointsView p0,long p1,int p2,Point p3){
       this.k = p0;
       super();
       this.a = p3;
       this.b = p2;
       this.c = p1 + (long)(p2 * 80);
       this.d = (((float)p0.c.nextInt(11) * 0x3f333333) / 10.00f) + 0.30f;
       this.e = a1.e((float)(p0.c.nextInt(5) + 3));
       this.f = p0.c.nextInt(401);
    }
    public final long a(){
       Object obj = PatchProxy.apply(null, this, FlashPointsView$c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (this.c + (long)((this.j * 80) * this.k.b.size()));
    }
    public final float b(long p0){
       String obj;
       float f;
       float f1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(FlashPointsView$c.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, FlashPointsView$c.class, "8");
          if (obj != patchProxyRe) {
             return obj.floatValue();
          }
       }
       p0 = p0 - this.a();
       obj = 0x3f800000;
       double d = 0x3ff0000000000000;
       long l = 400;
       if ((v7 = p0 - l) < 0) {
          f = (float)p0 / 400.00f;
          if (PatchProxy.isSupport(FlashPointsView$c.class)) {
             Object obj1 = PatchProxy.applyOneRefs(Float.valueOf(f), this, FlashPointsView$c.class, "11");
             if (obj1 != patchProxyRe) {
                f = obj1.floatValue();
             }
          }
          d = (d - Math.cos(((double)f * 0x400921fb54442d18))) * 0x3fe0000000000000;
       label_005a :
          f = (float)d;
       }else if(v7 >= 0 && p0 - (long)(this.f + 400) <= 0){
       label_009a :
          return f1;
       }else {
          f1 = obj - ((float)((p0 - l) - (long)this.f) / 300.00f);
          if (PatchProxy.isSupport(FlashPointsView$c.class)) {
             Object obj2 = PatchProxy.applyOneRefs(Float.valueOf(f1), this, FlashPointsView$c.class, "12");
             if (obj2 != patchProxyRe) {
                f = obj2.floatValue();
             }
          }
          d = d - Math.cos(((double)f1 * 0x3ff921fb54442d18));
          goto label_005a ;
       }
       f1 = f;
       goto label_009a ;
    }
    public final float c(long p0){
       Object obj;
       float f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(FlashPointsView$c.class)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, FlashPointsView$c.class, "10");
          if (obj != patchProxyRe) {
             return obj.floatValue();
          }
       }
       if (!this.k.g) {
          f = this.b(p0);
       }else if(PatchProxy.isSupport(FlashPointsView$c.class)){
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, FlashPointsView$c.class, "9");
          if (obj != patchProxyRe) {
             f = obj.floatValue();
          }
       }
       float f1 = 0x3f800000 - ((float)(p0 - this.k.g) / (float)FlashPointsView.j);
       if (PatchProxy.isSupport(FlashPointsView$c.class)) {
          Object obj1 = PatchProxy.applyOneRefs(Float.valueOf(f1), this, FlashPointsView$c.class, "13");
          if (obj1 != patchProxyRe) {
             f = obj1.floatValue();
          }
       }
       f = (float)Math.sin(((double)f1 * 0x3ff921fb54442d18));
       return f;
    }
    public String toString(){
       StringBuffer obj = PatchProxy.apply(null, this, FlashPointsView$c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "FlashPoint{"+"index="+this.b+", showRound="+this.j;
       obj = (!this.k.g)? obj+", alpha="+this.d+", radius="+this.e: obj+", lastAlpha="+this.g+", lastRadius="+this.h;
       return obj+'}';
    }
}
