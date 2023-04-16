package com.yxcorp.gifshow.postwork.x;
import erd.g;
import com.yxcorp.gifshow.postwork.z;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import tra.b;
import java.lang.String;
import q87.c;
import r16.f;
import java.lang.Class;
import lnc.x6;
import lnc.y6;
import lnc.s;
import f0c.p0;

public final class x implements g	// class@0010db
{
    public final z b;
    public final boolean c;

    public void x(z p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       x tb = this.b;
       x tc = this.c;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       b.C().w("PostWorkRecoverHelper", "autoRetryUpload: after installPluginObservable", objArray);
       p0 = y6.r(f.class);
       if (p0 != null && p0.isAvailable()) {
          if (tc != null) {
             tb.e = true;
          }
          p0.D1(new p0(tb));
       }else {
          tb.b();
          Object[] objArray1 = new Object[0];
          b.C().A("PostWorkRecoverHelper", "autoRetryUpload: plugin not ready", objArray1);
       }
       return;
    }
}
