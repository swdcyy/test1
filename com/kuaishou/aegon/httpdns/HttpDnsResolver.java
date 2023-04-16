package com.kuaishou.aegon.httpdns.HttpDnsResolver;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.aegon.Aegon;
import aegon.chrome.net.d;
import do.d;
import java.lang.Runnable;
import io.b;
import com.kuaishou.aegon.httpdns.ResolveFinishedInfo;
import com.kuaishou.aegon.httpdns.HttpDnsResolver$a;
import do.b;
import aegon.chrome.net.impl.CronetLibraryLoader;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import do.a;
import io.b$a;
import do.c;

public class HttpDnsResolver	// class@0007ab
{
    public static HttpDnsResolver$a sLogger;

    public void HttpDnsResolver(){
       super();
    }
    public static void increasePriority(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, HttpDnsResolver.class, "1")) {
          return;
       }
       if (Aegon.f() && p0 != null) {
          Aegon.c();
          b.c(new d(p0));
       }
       return;
    }
    public static void lambda$increasePriority$0(List p0){
       String[] stringArray = new String[0];
       HttpDnsResolver.nativeIncreasePriority(p0.toArray(stringArray));
    }
    public static void lambda$onResolveFinish$3(ResolveFinishedInfo p0){
       HttpDnsResolver.sLogger.a(p0);
    }
    public static List lambda$resolve$1(String p0){
       return HttpDnsResolver.nativeResolve(p0);
    }
    public static void lambda$updateConfig$2(String p0){
       HttpDnsResolver.nativeSetJsonConfig(p0);
    }
    public static native void nativeIncreasePriority(String[] p0);
    public static native List nativeResolve(String p0);
    public static native void nativeSetJsonConfig(String p0);
    public static void onResolveFinish(ResolveFinishedInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, HttpDnsResolver.class, "4")) {
          return;
       }
       _monitor_enter(HttpDnsResolver.class);
       if (HttpDnsResolver.sLogger != null) {
          CronetLibraryLoader.c(new b(p0));
       }
       _monitor_exit(HttpDnsResolver.class);
       return;
    }
    public static List resolve(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HttpDnsResolver.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!Aegon.f()) {
          return new ArrayList();
       }
       Aegon.c();
       List list = b.b(new a(p0));
       if (list == null) {
          list = new ArrayList();
       }
       return list;
    }
    public static void setLogger(HttpDnsResolver$a p0){
       _monitor_enter(HttpDnsResolver.class);
       HttpDnsResolver.sLogger = p0;
       _monitor_exit(HttpDnsResolver.class);
    }
    public static void updateConfig(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, HttpDnsResolver.class, "3")) {
          return;
       }
       if (!Aegon.f()) {
          return;
       }
       Aegon.c();
       b.c(new c(p0));
       return;
    }
}
