package com.yxcorp.gifshow.prettify.makeup.f0;
import erd.g;
import com.yxcorp.gifshow.prettify.makeup.g0;
import java.lang.Object;
import w16.j;
import java.util.Objects;
import f1c.k2;

public final class f0 implements g	// class@001178
{
    public final g0 b;

    public void f0(g0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       f0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.a != 1) {
       }else if(tb.z != null){
          tb.w2(p0);
       }else {
          tb.A = new k2(tb, p0);
       }
       return;
    }
}
