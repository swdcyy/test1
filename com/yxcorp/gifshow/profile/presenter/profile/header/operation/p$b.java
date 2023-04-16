package com.yxcorp.gifshow.profile.presenter.profile.header.operation.p$b;
import android.animation.TypeEvaluator;
import android.graphics.PointF;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class p$b implements TypeEvaluator	// class@001513
{
    public final PointF a;

    public void p$b(PointF p0){
       super();
       this.a = p0;
    }
    public Object evaluate(float p0,Object p1,Object p2){
       PointF pointF;
       if (PatchProxy.isSupport(p$b.class)) {
          pointF = PatchProxy.applyThreeRefs(Float.valueOf(p0), p1, p2, this, p$b.class, "1");
          if (pointF != PatchProxyResult.class) {
          label_0052 :
             return pointF;
          }
       }
       float f = 0x3f800000 - p0;
       float f1 = f * f;
       float f2 = (2.00f * p0) * f;
       p$b ta = this.a;
       p0 = p0 * p0;
       pointF = new PointF((((p1.x * f1) + (ta.x * f2)) + (p2.x * p0)), (((f1 * p1.y) + (f2 * ta.y)) + (p0 * p2.y)));
       goto label_0052 ;
    }
}
