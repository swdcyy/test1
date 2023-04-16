package com.kwai.chat.kwailink.base.b;
import java.util.concurrent.atomic.AtomicLong;
import java.lang.Math;
import java.lang.Object;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.RuntimeException;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import g85.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.lang.Number;
import com.kwai.chat.kwailink.data.ZtCommonInfo;
import n75.b;
import com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo;
import com.kwai.chat.kwailink.log.KLog;
import com.kwai.chat.kwailink.log.a;
import com.kwai.chat.kwailink.base.a;
import java.lang.Runnable;
import n75.a;
import java.lang.Boolean;
import com.kwai.chat.kwailink.utils.AndroidUtils;
import java.lang.StringBuilder;
import java.lang.Integer;

public class b	// class@000a23
{
    public static ClientAppInfo a;
    public static b b;
    public static ZtCommonInfo c;
    public static Context d;
    public static boolean e;
    public static int f;
    public static Boolean g;
    public static Boolean h;
    public static boolean i;
    public static String j;
    public static int k;
    public static final AtomicLong l;
    public static ScheduledExecutorService m;

    static {
       b.l = new AtomicLong(((((long)(Math.random() * 900000.00f) + 0x186a0) * 0x5f5e100) + 1));
    }
    public void b(){
       super();
    }
    public static ClientAppInfo a(){
       ClientAppInfo obj = PatchProxy.apply(null, null, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a;
       if (obj != null) {
          return obj;
       }
       throw new RuntimeException("KwaiLinkGlobal\'s clientAppInfo is NULL, have your call \'KwaiLinkGlobal.init\(this\)\' in your own Application ? ");
    }
    public static Context b(){
       return b.d;
    }
    public static ScheduledExecutorService c(){
       b uob = b.class;
       Object obj = PatchProxy.apply(null, null, uob, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.m == null) {
          _monitor_enter(uob);
          if (b.m == null) {
             b.m = Executors.newSingleThreadScheduledExecutor(new a("KwaiLinkGlobal"));
          }
          _monitor_exit(uob);
       }
       return b.m;
    }
    public static long d(){
       Object obj = PatchProxy.apply(null, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return b.l.getAndIncrement();
    }
    public static ZtCommonInfo e(){
       ZtCommonInfo obj = PatchProxy.apply(null, null, b.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.c;
       if (obj != null) {
          return obj;
       }
       throw new RuntimeException("KwaiLinkGlobal\'s ztCommonInfo is NULL, call \'KwaiLinkGlobal.init\(\)\' in Application ");
    }
    public static void f(b p0,ClientAppInfo p1,ZtCommonInfo p2,KwaiLinkDefaultServerInfo p3,KLog p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uob, "2")) {
             return;
          }
       }
       a.b = p4;
       b.b = p0;
       b.m(p0.a);
       b.l(p1);
       b.f = p1.a();
       b.c = p2;
       b.e = true;
       if (b.h()) {
          b.c().execute(a.b);
       }
       if (b.i()) {
          b.c().execute(new a(p0, p3));
       }
       return;
    }
    public static boolean g(){
       return b.e;
    }
    public static boolean h(){
       Boolean obj = PatchProxy.apply(null, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.g;
       if (obj != null) {
          return obj.booleanValue();
       }
       try{
          obj = Boolean.valueOf((b.d.getPackageName()).equalsIgnoreCase(AndroidUtils.getProcessName(b.d)));
          b.g = obj;
          return obj.booleanValue();
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public static boolean i(){
       Boolean obj = PatchProxy.apply(null, null, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.h;
       if (obj != null) {
          return obj.booleanValue();
       }
       try{
          obj = Boolean.valueOf((b.d.getPackageName()+":messagesdk").equalsIgnoreCase(AndroidUtils.getProcessName(b.d)));
          b.h = obj;
          return obj.booleanValue();
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public static boolean j(){
       return b.i;
    }
    public static void k(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uob, "14")) {
          return;
       }
       if (p0 && p0 != b.f) {
          a.e("KwaiLinkGlobal", "appId changed: old="+b.f+", new="+p0);
          b.f = p0;
       }
       return;
    }
    public static void l(ClientAppInfo p0){
       b.a = p0;
    }
    public static void m(Context p0){
       b.d = p0;
    }
}
