package com.yxcorp.gifshow.profile.presenter.profile.header.operation.n$d;
import android.view.animation.Interpolator;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.n;
import java.lang.Object;
import com.yxcorp.gifshow.profile.presenter.profile.header.operation.n$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;

public class n$d implements Interpolator	// class@00150f
{
    public final n a;

    public void n$d(n p0){
       this.a = p0;
       super();
    }
    public void n$d(n p0,n$a p1){
       super(p0);
    }
    public float getInterpolation(float p0){
       if (PatchProxy.isSupport(n$d.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, n$d.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return (float)(0x3ff0000000000000 - Math.pow((double)(0x3f800000 - p0), 3.00f));
    }
}
