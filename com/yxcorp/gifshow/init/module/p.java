package com.yxcorp.gifshow.init.module.p;
import erd.g;
import java.lang.Object;
import e06.b;
import com.yxcorp.gifshow.init.module.DebugLogInitModule;
import android.net.Uri;
import com.kwai.framework.debuglog.realtime.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.debuglog.realtime.RealTimeLogConfig;
import com.kwai.logger.KwaiLog;

public final class p implements g	// class@0019d3
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final void accept(Object p0){
       RealTimeLogConfig a;
       p0 = p0.b();
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "6")) {
       }else {
          a = a.a;
          if (a != null && a.screenshotEnable != null) {
             Object[] objArray = new Object[0];
             KwaiLog.m("KwaiRealTimeLogger", "screenShortUri", p0.getScheme(), objArray);
             a.b("SCREENSHOT");
          }
       }
       return;
    }
}
