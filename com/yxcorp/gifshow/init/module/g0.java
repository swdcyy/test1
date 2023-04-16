package com.yxcorp.gifshow.init.module.g0;
import java.lang.Runnable;
import com.yxcorp.gifshow.init.module.MiniAppMainInitModule;
import ju5.g;
import java.lang.Object;
import java.util.Objects;
import sxa.w;
import ekd.k1;

public final class g0 implements Runnable	// class@0019c0
{
    public final MiniAppMainInitModule b;
    public final g c;

    public void g0(MiniAppMainInitModule p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       g0 tb = this.b;
       Objects.requireNonNull(tb);
       w ow = new w(tb, this.c);
       k1.r(ow, 0x2710);
    }
}
