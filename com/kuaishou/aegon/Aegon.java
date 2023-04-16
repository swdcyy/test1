package com.kuaishou.aegon.Aegon;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import fo.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bo.e;
import java.lang.Runnable;
import io.b;
import java.lang.Boolean;
import bo.c;
import aegon.chrome.net.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import j0.j;
import android.content.Context;
import com.kuaishou.aegon.Aegon$a;
import aegon.chrome.net.d$a$a;
import aegon.chrome.net.impl.b;
import aegon.chrome.net.impl.CronetLibraryLoader;
import com.kuaishou.aegon.i;
import aegon.chrome.net.impl.CronetUrlRequestContext;
import com.kuaishou.aegon.h;
import java.lang.StringBuilder;
import bo.t;
import com.kuaishou.aegon.Aegon$b;
import bo.k;
import android.os.Handler;
import android.os.Looper;
import com.kuaishou.aegon.b;
import com.kuaishou.aegon.l;
import io.b$a;
import com.kuaishou.aegon.d;
import com.kuaishou.aegon.g;
import com.kuaishou.aegon.e;
import bo.b;
import bo.p;
import com.kuaishou.aegon.AegonLoggingDispatcher;
import bo.d;
import java.lang.Long;
import bo.h;
import bo.a;
import java.lang.Integer;
import bo.j;
import com.kuaishou.aegon.j;

public class Aegon	// class@0005d7
{
    public static String a = "aegon";
    public static Context b;
    public static NetworkStateHelper c;
    public static final Object d;
    public static CronetUrlRequestContext e;
    public static AtomicBoolean f;
    public static b g;

    static {
       Aegon.d = new Object();
       Aegon.f = new AtomicBoolean();
       Aegon.g = new b();
    }
    public void Aegon(){
       super();
    }
    public static void a(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Aegon.class, "27")) {
          return;
       }
       b.c(new e(p0));
       return;
    }
    public static void b(boolean p0){
       Aegon uAegon = Aegon.class;
       if (PatchProxy.isSupport(uAegon) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uAegon, "15")) {
          return;
       }
       if (!Aegon.f.get()) {
          return;
       }
       b.c(new c(p0));
       return;
    }
    public static d c(){
       CronetUrlRequestContext obj = PatchProxy.apply(null, null, Aegon.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Aegon.e;
       if (obj != null) {
          return obj;
       }
       if (!Aegon.f.get()) {
          return null;
       }
       Object d = Aegon.d;
       _monitor_enter(d);
       if (Aegon.e == null && Aegon.b != null) {
          j oj = new j(Aegon.b);
          oj.y(new Aegon$a());
          CronetLibraryLoader.a(Aegon.b, oj);
          CronetLibraryLoader.c(i.b);
          Aegon.e = new CronetUrlRequestContext(oj);
          b.a(h.b);
          t.c("Aegon", "Create cronet engine finished, cost = "+(System.nanoTime() - System.nanoTime()));
       }
       _monitor_exit(d);
       return Aegon.e;
    }
    public static void d(Context p0,String p1,String p2,Aegon$b p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, Aegon.class, "1")) {
          return;
       }
       t.c("Aegon", "Initializing, jsonConfig="+p1+", storagePath="+p2);
       long l = System.nanoTime();
       if (p3 != null) {
          p3.loadLibrary(Aegon.a);
       }else {
          System.loadLibrary(Aegon.a);
       }
       b.a(new k(p1, p2));
       t.c("Aegon", "Initialize finished, cost = "+(System.nanoTime() - l));
       Aegon.b = p0;
       Aegon.f.set(true);
       new Handler(p0.getMainLooper()).postDelayed(b.b, 3000);
       return;
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, Aegon.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!Aegon.f.get()) {
          return false;
       }
       return b.b(l.a).booleanValue();
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, Aegon.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Aegon.f.get();
    }
    public static void g(){
       if (PatchProxy.applyVoid(null, null, Aegon.class, "16")) {
          return;
       }
       if (!Aegon.f.get()) {
          return;
       }
       b.a(d.b);
       CronetLibraryLoader.c(g.b);
       return;
    }
    public static void h(){
       if (PatchProxy.applyVoid(null, null, Aegon.class, "17")) {
          return;
       }
       if (!Aegon.f.get()) {
          return;
       }
       b.a(e.b);
       return;
    }
    public static void i(boolean p0){
       Aegon uAegon = Aegon.class;
       if (PatchProxy.isSupport(uAegon) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uAegon, "7")) {
          return;
       }
       if (!Aegon.f.get()) {
          return;
       }
       b.c(new b(p0));
       return;
    }
    public static void j(p p0,boolean p1){
       Aegon uAegon = Aegon.class;
       if (PatchProxy.isSupport(uAegon) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uAegon, "22")) {
          return;
       }
       AegonLoggingDispatcher.a = p0;
       if (!Aegon.f.get()) {
          return;
       }
       b.c(new d(p1));
       return;
    }
    public static void k(long p0,boolean p1){
       Aegon uAegon = Aegon.class;
       if (PatchProxy.isSupport(uAegon) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Boolean.valueOf(p1), null, uAegon, "21")) {
          return;
       }
       if (!Aegon.f.get()) {
          return;
       }
       b.c(new h(p0, p1));
       return;
    }
    public static void l(String p0,String[] p1){
       Aegon uAegon = Aegon.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, uAegon, "9")) {
          return;
       }
       if (!PatchProxy.isSupport(uAegon) || (!PatchProxy.applyVoidFourRefs(p0, p1, null, Boolean.FALSE, null, Aegon.class, "10") && Aegon.f.get())) {
          b.c(new a(p0, p1, null, false));
       }
       return;
    }
    public static void m(String p0,int p1,int p2){
       if (PatchProxy.isSupport(Aegon.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, Aegon.class, "25")) {
          return;
       }
       if (!Aegon.f.get()) {
          return;
       }
       b.c(new j(p0, p1, p2));
       return;
    }
    public static void n(){
       if (PatchProxy.applyVoid(null, null, Aegon.class, "26")) {
          return;
       }
       if (!Aegon.f.get()) {
          return;
       }
       b.c(j.b);
       return;
    }
    public static native void nativeAddExtraRequestHeader(String p0,String p1);
    public static native void nativeCleanNetworkStatus(boolean p0);
    public static native void nativeClearHttpCache();
    public static native String nativeGetEffectiveConfig();
    public static native long nativeGetHttpCacheUsedBytes();
    public static native String nativeGetPublicIP();
    public static native String nativeGetRequestExtraInfo(String p0);
    public static native String nativeGetVersionString();
    public static native boolean nativeIsIPv6Available();
    public static native void nativeOnBackground();
    public static native void nativeOnForeground();
    public static native void nativeSetAutonomousNetworkAccessAllowed(boolean p0);
    public static native void nativeSetDebug(boolean p0);
    public static native void nativeSetInitialized(boolean p0);
    public static native void nativeSetKProxyConfig(String p0,int p1,int p2);
    public static native void nativeSetKProxyPathBlacklist(String[] p0);
    public static native void nativeSetLoggingCallback(long p0,boolean p1);
    public static native void nativeSetMaxThreadLimit(int p0);
    public static native void nativeSetPreconnectUrlsByIps(String p0,String[] p1,String[] p2,boolean p3,boolean p4);
    public static native void nativeSetProxySwitch(boolean p0);
    public static native void nativeSetQuicFallbackToTcpBlacklist(String[] p0);
    public static native void nativeUpdateConfig(String p0,String p1);
    public static native void nativeUpdateNqeConfig(String p0);
}
