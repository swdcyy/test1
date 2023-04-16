package com.yxcorp.gifshow.lelink.ScreencastManager$f;
import erd.g;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import cgc.c;
import cgc.d;
import cgc.b;
import android.os.Handler;
import java.lang.Runnable;

public final class ScreencastManager$f implements g	// class@001a36
{
    public final ScreencastManager b;

    public void ScreencastManager$f(ScreencastManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScreencastManager$f.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          KLogLelink.e.a().s("Kwaiscreencast", "plugin success "+p0, objArray);
          a.o(p0, "it");
          if (p0.booleanValue()) {
             p0 = this.b.d;
             int i = -1990007504;
             if (p0 != null) {
                d.a(i).Uh(p0);
             }
             p0 = this.b.u;
             if (p0 != null) {
                d.a(i).JI(p0);
             }
             this.b.f().removeCallbacks(this.b.w);
             p0 = this.b;
             if (p0.t != null) {
                p0.t();
                p0.t = false;
             }
          }
       }
       return;
    }
}
