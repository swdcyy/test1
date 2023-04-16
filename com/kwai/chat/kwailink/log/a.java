package com.kwai.chat.kwailink.log.a;
import c97.d;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.chat.kwailink.log.KLog$KLogLevel;
import java.lang.Throwable;
import com.kwai.chat.kwailink.log.KLog;

public final class a	// class@000a5f
{
    public static final boolean a;
    public static KLog b;

    static {
       a.a = d.a().i();
    }
    public void a(){
       super();
    }
    public static void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "6")) {
          return;
       }
       a.f(KLog$KLogLevel.kDebug, p0, p1);
       return;
    }
    public static void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "15")) {
          return;
       }
       a.f(KLog$KLogLevel.kError, p0, p1);
       return;
    }
    public static void c(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "17")) {
          return;
       }
       KLog$KLogLevel kError = KLog$KLogLevel.kError;
       if (!PatchProxy.applyVoidFourRefs(kError, p0, p1, p2, null, a.class, "2")) {
          KLog b = a.b;
          if (b != null) {
             b.b("Klink", kError, p0, p1, p2);
          }
       }
       return;
    }
    public static void d(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "16")) {
          return;
       }
       a.c(p0, "", p1);
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "9")) {
          return;
       }
       a.f(KLog$KLogLevel.kInfo, p0, p1);
       return;
    }
    public static void f(KLog$KLogLevel p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "1")) {
          return;
       }
       KLog b = a.b;
       if (b == null) {
          return;
       }
       b.a("Klink", p0, p1, p2);
       return;
    }
    public static void g(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "12")) {
          return;
       }
       a.f(KLog$KLogLevel.kWarn, p0, p1);
       return;
    }
}
