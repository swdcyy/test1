package com.yxcorp.gifshow.detail.playmodule.precreate.LaunchPlayerLogger;
import com.yxcorp.gifshow.detail.playmodule.precreate.LaunchPlayerLogger$tracker$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.yxcorp.gifshow.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import uv8.e1;
import s3a.a;
import s3a.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;

public final class LaunchPlayerLogger	// class@001655
{
    public static final p a;
    public static final LaunchPlayerLogger b;

    static {
       LaunchPlayerLogger.b = new LaunchPlayerLogger();
       LaunchPlayerLogger.a = s.c(LaunchPlayerLogger$tracker$2.INSTANCE);
    }
    public void LaunchPlayerLogger(){
       super();
    }
    public final w a(){
       Object obj = PatchProxy.apply(null, this, LaunchPlayerLogger.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LaunchPlayerLogger.a.getValue();
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LaunchPlayerLogger.class, "10")) {
          return;
       }
       a.p(p0, "jsonInfo");
       this.a().z().i(p0);
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LaunchPlayerLogger.class, "3")) {
          return;
       }
       a e = a.e;
       e.c().b();
       this.a().G();
       e.d();
       Log.g("LaunchPlayer_Logger", "preCreate cost: "+e.c().c());
       return;
    }
}
