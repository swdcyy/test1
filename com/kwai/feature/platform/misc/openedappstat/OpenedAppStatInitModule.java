package com.kwai.feature.platform.misc.openedappstat.OpenedAppStatInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oe6.b;
import o56.d;
import q06.a;
import com.kwai.feature.platform.misc.openedappstat.a;
import java.util.Objects;
import o56.a;
import android.app.Application;
import android.app.KeyguardManager;
import ekd.k1;
import java.lang.System;
import q06.a$a;
import o2b.a$a;
import java.lang.Runnable;
import android.os.Handler;

public class OpenedAppStatInitModule extends TTIInitModule	// class@0012be
{
    public static final int q;

    public void OpenedAppStatInitModule(){
       super();
    }
    public int f0(){
       return 21;
    }
    public void h0(){
       a a;
       String str = "1";
       if (PatchProxy.applyVoid(null, this, OpenedAppStatInitModule.class, str)) {
          return;
       }
       if (b.r() && d.i) {
          a uoa = a.b();
          a = a.a;
          Objects.requireNonNull(uoa);
          if (!PatchProxy.applyVoidOneRefs(a, uoa, a.class, str) && uoa.b == null) {
             KeyguardManager systemServic = a.B.getSystemService("keyguard");
             if (systemServic == null || !systemServic.inKeyguardRestrictedInputMode()) {
                k1.b(a, "onCompleted is null");
                a.f = 0;
                a$a uoa1 = new a$a(uoa, System.currentTimeMillis(), a);
                uoa.b = uoa1;
                uoa.d.postDelayed(uoa1, 5000);
                uoa.a = true;
             }
          }
       }
       return;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, OpenedAppStatInitModule.class, "2")) {
          return;
       }
       if (b.r() && d.i) {
          a.b().stop();
       }
       return;
    }
}
