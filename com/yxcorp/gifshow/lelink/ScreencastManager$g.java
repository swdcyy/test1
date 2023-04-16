package com.yxcorp.gifshow.lelink.ScreencastManager$g;
import erd.g;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import java.lang.StringBuilder;
import q87.c;
import cgc.b;

public final class ScreencastManager$g implements g	// class@001a37
{
    public final ScreencastManager b;

    public void ScreencastManager$g(ScreencastManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScreencastManager$g.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          KLogLelink.e.a().s("Kwaiscreencast", "plugin fail "+p0, objArray);
          p0 = this.b.u;
          if (p0 != null) {
             p0.a();
          }
       }
       return;
    }
}
