package com.yxcorp.gifshow.camerasdk.i;
import qi9.s1;
import com.yxcorp.gifshow.camerasdk.j;
import java.lang.Object;
import java.lang.Boolean;
import qi9.b0;
import java.lang.Runnable;
import ekd.k1;

public final class i implements s1	// class@001019
{
    public final j a;

    public void i(j p0){
       this.a = p0;
    }
    public final void onLowLightDetectorResult(boolean p0){
       i ta = this.a;
       j v0 = ta.v0;
       if (v0 == null || v0.booleanValue() != p0) {
          ta.v0 = Boolean.valueOf(p0);
          k1.o(new b0(ta, p0));
       }
       return;
    }
}
