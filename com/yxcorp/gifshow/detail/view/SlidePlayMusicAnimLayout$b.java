package com.yxcorp.gifshow.detail.view.SlidePlayMusicAnimLayout$b;
import android.animation.TypeEvaluator;
import android.graphics.PointF;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Math;

public class SlidePlayMusicAnimLayout$b implements TypeEvaluator	// class@001a65
{
    public PointF a;
    public PointF b;

    public void SlidePlayMusicAnimLayout$b(PointF p0,PointF p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Object evaluate(float p0,Object p1,Object p2){
       PointF pointF2;
       double this;
       SlidePlayMusicAnimLayout$b uob = this;
       float f = p0;
       PointF pointF = p1;
       PointF pointF1 = p2;
       if (PatchProxy.isSupport(SlidePlayMusicAnimLayout$b.class)) {
          pointF2 = PatchProxy.applyThreeRefs(Float.valueOf(p0), pointF, pointF1, this, SlidePlayMusicAnimLayout$b.class, "1");
          if (pointF2 != PatchProxyResult.class) {
             int i = uob;
          label_00ab :
             return pointF2;
          }
       }
       this = (double)(0x3f800000 - f);
       double d = (double)f;
       double d1 = d;
       SlidePlayMusicAnimLayout$b uob1 = this;
       pointF2 = new PointF((float)(((((double)pointF.x * Math.pow(this, 3.00f)) + ((double)((uob.a.x * 3.00f) * f) * Math.pow(this, 2.00f))) + (((double)(uob.b.x * 3.00f) * Math.pow(d, 2.00f)) * this)) + ((double)pointF1.x * Math.pow(d, 3.00f))), (float)(((((double)pointF.y * Math.pow(this, 3.00f)) + ((double)((uob1.a.y * 3.00f) * f) * Math.pow(this, 2.00f))) + (((double)(uob1.b.y * 3.00f) * Math.pow(d1, 2.00f)) * this)) + ((double)pointF1.y * Math.pow(d1, 3.00f))));
       goto label_00ab ;
    }
}
