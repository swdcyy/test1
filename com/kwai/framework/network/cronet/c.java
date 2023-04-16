package com.kwai.framework.network.cronet.c;
import java.lang.Runnable;
import java.lang.Object;
import db6.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Long;
import bo.t;

public final class c implements Runnable	// class@0017a4
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, e.class, "1")) {
       }else {
          e.c("cronetConfig", e.d());
          e.c("cronetInterceptorWhitelist", "[\"*\"]");
          e.c("cronetInterceptorBlacklist", "[]");
          e.c("cronetPostEarlyDataRouteWhitelist", objArray);
          e.c("cronetRequestXExp", "");
          e.c("apiRequestPriorityConfig", "");
          e.c("nqeParamsConfig", "");
          e.c("quicFallbackToTcpBlacklist", "");
          e.c("networkActivationConfig", "");
          Boolean fALSE = Boolean.FALSE;
          e.a("cronetInterceptorEnableHttpCache", fALSE);
          e.a("clientPreConnectionAhead", fALSE);
          e.a("preinitCronet", fALSE);
          e.a("enableSwitchNetWork", fALSE);
          e.b("cronetInterceptorCallbackThreadPoolSize", Long.valueOf(1));
          e.b("cronetThreadPoolLimit", Long.valueOf(-1));
          t.c("CronetPreferenceManger", "register\(\)");
       }
       return;
    }
}
