package com.yxcorp.gifshow.detailbubble.LikeRandomBubbleView$c;
import android.animation.TimeInterpolator;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;

public final class LikeRandomBubbleView$c implements TimeInterpolator	// class@001a95
{
    public final double a;

    public void LikeRandomBubbleView$c(){
       super();
       this.a = 0x3fe0000000000000;
    }
    public float getInterpolation(float p0){
       if (PatchProxy.isSupport(LikeRandomBubbleView$c.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, LikeRandomBubbleView$c.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       double d = (double)p0;
       LikeRandomBubbleView$c ta = this.a;
       return ((float)1 - (float)(Math.pow(2.00f, (-10.00f * d)) * Math.sin((((d - (ta / (double)12)) * 0x401921fb54442d18) / ta))));
    }
}
