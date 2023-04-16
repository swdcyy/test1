package com.yxcorp.gifshow.postwork.c;
import erd.g;
import com.yxcorp.gifshow.postwork.e;
import java.lang.Object;
import eda.n;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import f0c.h;
import java.lang.Runnable;

public final class c implements g	// class@0010c4
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "20")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("PostStuckDetector", "LogoutEvent: "+p0, objArray);
          if (!PatchProxy.applyVoid(null, tb, e.class, "21")) {
             tb.g(new h(tb));
          }
       }
       return;
    }
}
