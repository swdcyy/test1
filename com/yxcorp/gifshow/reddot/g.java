package com.yxcorp.gifshow.reddot.g;
import brd.x;
import java.lang.Object;
import brd.t;
import brd.w;
import com.yxcorp.gifshow.reddot.i;
import wkd.b;
import ob6.p;
import ob6.f;
import com.kwai.framework.network.keyconfig.ApiFeature;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;

public final class g implements x	// class@0017c7
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final w apply(t p0){
       long l = b.a(0x36463d96).i().f(ApiFeature.RED_DOT);
       if (l - null > 0) {
          p0 = p0.delay(l, TimeUnit.MILLISECONDS, d.c).observeOn(d.a);
       }
       return p0;
    }
}
