package com.yxcorp.gifshow.longinus.LonginusInitModule;
import com.kwai.framework.init.TTIInitModule;
import com.yxcorp.gifshow.longinus.LonginusInitModule$a;
import nsd.u;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.longinus.LonginusLog;
import com.kwai.android.longinus.Longinus;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.Context;
import java.lang.Throwable;
import com.yxcorp.gifshow.longinus.LonginusInitModule$onLaunchFinish$1;
import msd.l;

public final class LonginusInitModule extends TTIInitModule	// class@001b6c
{
    public static final LonginusInitModule$a q;

    static {
       LonginusInitModule.q = new LonginusInitModule$a(null);
    }
    public void LonginusInitModule(){
       super();
    }
    public int f0(){
       return 9;
    }
    public void k0(a p0){
       Application uApplication1;
       if (PatchProxy.applyVoidOneRefs(p0, this, LonginusInitModule.class, "1")) {
          return;
       }
       LonginusInitModule$a q = LonginusInitModule.q;
       boolean b = q.b();
       LonginusLog.d("longinus", "launch finish enableLong="+b);
       if (b) {
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          Longinus.INSTANCE.setLonginusServiceComponent(uApplication, Class.forName(q.a()));
          uApplication1 = a.b();
          a.o(uApplication1, "AppEnv.getAppContext\(\)");
          Longinus.prepare(uApplication1, LonginusInitModule$onLaunchFinish$1.INSTANCE);
       }else {
          uApplication1 = a.b();
          a.o(uApplication1, "AppEnv.getAppContext\(\)");
          Longinus.release(uApplication1);
       }
       return;
    }
}
