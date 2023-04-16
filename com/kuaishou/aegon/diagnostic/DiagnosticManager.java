package com.kuaishou.aegon.diagnostic.DiagnosticManager;
import java.lang.Object;
import com.kuaishou.aegon.diagnostic.DiagnosticResult;
import com.kuaishou.aegon.diagnostic.DiagnosticManager$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import co.d;
import java.lang.Runnable;
import aegon.chrome.net.impl.CronetLibraryLoader;
import com.kuaishou.aegon.Aegon;
import co.g;
import io.b;
import co.e;
import java.lang.Integer;
import co.a;
import co.b;
import java.lang.Boolean;
import co.f;
import co.h;
import co.c;
import co.i;

public class DiagnosticManager	// class@0007a0
{
    public static DiagnosticManager$a sListener;

    public void DiagnosticManager(){
       super();
    }
    public static void lambda$onDiagnoseFinished$8(DiagnosticResult p0){
       DiagnosticManager.sListener.a(p0);
    }
    public static void lambda$setAttentionErrorCodes$7(int[] p0){
       DiagnosticManager.nativeSetAttentionErrorCodeList(p0);
    }
    public static void lambda$setDialTestConfig$3(String p0){
       DiagnosticManager.nativeSetDialTestConfigJson(p0);
    }
    public static void lambda$setDialUrlSelectionTimeRange$4(int p0){
       DiagnosticManager.nativeSetDialUrlSelectionTimeRange(p0);
    }
    public static void lambda$setDomainStatisticsTimeRange$5(int p0){
       DiagnosticManager.nativeSetDomainStatisticsTimeRange(p0);
    }
    public static void lambda$setEnable$0(boolean p0){
       DiagnosticManager.nativeSetEnable(p0);
    }
    public static void lambda$setExcludedHosts$2(String[] p0){
       DiagnosticManager.nativeSetExcludedHostList(p0);
    }
    public static void lambda$setMinimalIntervalPerDomainSec$6(int p0){
       DiagnosticManager.nativeSetMinimalIntervalPerDomainSec(p0);
    }
    public static void lambda$setMonitoredHosts$1(String[] p0){
       DiagnosticManager.nativeSetMonitoredHostList(p0);
    }
    public static native void nativeSetAttentionErrorCodeList(int[] p0);
    public static native void nativeSetDialTestConfigJson(String p0);
    public static native void nativeSetDialUrlSelectionTimeRange(int p0);
    public static native void nativeSetDomainStatisticsTimeRange(int p0);
    public static native void nativeSetEnable(boolean p0);
    public static native void nativeSetExcludedHostList(String[] p0);
    public static native void nativeSetMinimalIntervalPerDomainSec(int p0);
    public static native void nativeSetMonitoredHostList(String[] p0);
    public static void onDiagnoseFinished(DiagnosticResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DiagnosticManager.class, "9")) {
          return;
       }
       _monitor_enter(DiagnosticManager.class);
       if (DiagnosticManager.sListener != null) {
          CronetLibraryLoader.c(new d(p0));
       }
       _monitor_exit(DiagnosticManager.class);
       return;
    }
    public static void setAttentionErrorCodes(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DiagnosticManager.class, "8")) {
          return;
       }
       if (!Aegon.f()) {
          return;
       }
       b.c(new g(p0));
       return;
    }
    public static void setDialTestConfig(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DiagnosticManager.class, "4")) {
          return;
       }
       if (!Aegon.f()) {
          return;
       }
       b.c(new e(p0));
       return;
    }
    public static void setDialUrlSelectionTimeRange(int p0){
       DiagnosticManager uDiagnosticM = DiagnosticManager.class;
       if (PatchProxy.isSupport(uDiagnosticM) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uDiagnosticM, "5")) {
          return;
       }
       if (!Aegon.f()) {
          return;
       }
       b.c(new a(p0));
       return;
    }
    public static void setDomainStatisticsTimeRange(int p0){
       DiagnosticManager uDiagnosticM = DiagnosticManager.class;
       if (PatchProxy.isSupport(uDiagnosticM) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uDiagnosticM, "6")) {
          return;
       }
       if (!Aegon.f()) {
          return;
       }
       b.c(new b(p0));
       return;
    }
    public static void setEnable(boolean p0){
       DiagnosticManager uDiagnosticM = DiagnosticManager.class;
       if (PatchProxy.isSupport(uDiagnosticM) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, uDiagnosticM, "1")) {
          return;
       }
       if (!Aegon.f()) {
          return;
       }
       b.c(new f(p0));
       return;
    }
    public static void setExcludedHosts(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DiagnosticManager.class, "3")) {
          return;
       }
       if (!Aegon.f()) {
          return;
       }
       b.c(new h(p0));
       return;
    }
    public static void setListener(DiagnosticManager$a p0){
       _monitor_enter(DiagnosticManager.class);
       DiagnosticManager.sListener = p0;
       _monitor_exit(DiagnosticManager.class);
    }
    public static void setMinimalIntervalPerDomainSec(int p0){
       DiagnosticManager uDiagnosticM = DiagnosticManager.class;
       if (PatchProxy.isSupport(uDiagnosticM) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, uDiagnosticM, "7")) {
          return;
       }
       if (!Aegon.f()) {
          return;
       }
       b.c(new c(p0));
       return;
    }
    public static void setMonitoredHosts(String[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DiagnosticManager.class, "2")) {
          return;
       }
       if (!Aegon.f()) {
          return;
       }
       b.c(new i(p0));
       return;
    }
}
