package com.kwai.android.longinus.Longinus;
import java.lang.Object;
import msd.l;
import android.content.Context;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.android.longinus.AdamProvider;
import java.io.File;
import e45.a;
import zsd.u;
import java.lang.Boolean;
import kotlin.Result;
import java.lang.Throwable;
import qrd.j0;
import android.app.ActivityManager;
import android.os.Process;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import android.app.ActivityManager$RunningServiceInfo;
import android.content.ComponentName;
import com.kwai.android.longinus.LilithService;
import java.lang.Class;
import com.kwai.android.longinus.AdamService;
import com.kwai.android.longinus.InsuranceAdamService;
import com.kwai.android.longinus.InsuranceLilithService;
import c45.g;
import android.os.Handler;
import android.os.Looper;
import c45.a;
import java.lang.Runnable;
import c45.b;
import com.kwai.android.longinus.d;
import com.kwai.android.longinus.g;
import c45.f;
import msd.a;
import com.kwai.android.longinus.q.a;
import com.kwai.android.longinus.e;
import java.lang.Integer;
import wsd.m;
import kotlin.io.FileWalkDirection;
import isd.h;
import isd.l;
import com.kwai.android.longinus.h;
import kotlin.sequences.SequencesKt___SequencesKt;
import com.kwai.android.longinus.i;
import android.app.Instrumentation;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.android.longinus.j;
import com.kwai.android.longinus.k;

public final class Longinus	// class@0009bf
{
    public static final Longinus INSTANCE;
    public static final int STATUS_ALREADY_PREPARED_SUCCESS;
    public static final int STATUS_ALREADY_RELEASED;
    public static final int STATUS_PREPARE_SUCCESS;

    static {
       Longinus.INSTANCE = new Longinus();
    }
    public void Longinus(){
       super();
    }
    public static void a(l p0){
       Longinus.prepare$lambda-0(p0);
    }
    public static void b(l p0){
       Longinus.prepare$lambda-1(p0);
    }
    public static final boolean isFromLonginus(Context p0){
       a.p(p0, "context");
       a.p(p0, "context");
       return new File(p0.getCacheDir(), "from_longinus_flag").exists();
    }
    public static final boolean isLonginusProcess(Context p0){
       a.p(p0, "context");
       return Longinus.isLonginusProcess$default(p0, null, 2, null);
    }
    public static final boolean isLonginusProcess(Context p0,String p1){
       a.p(p0, "context");
       String str = null;
       boolean b = false;
       if (p1 == null) {
       }else {
          String str1 = a.a(p0);
          boolean b1 = (str1 == null)? false: u.H1(str1, p1, b, 2, str);
          str = Boolean.valueOf(b1);
       }
       if (str == null) {
          p1 = a.a(p0);
          if (a.g(p1, a.C(p0.getPackageName(), ":lilith")) || (a.g(p1, a.C(p0.getPackageName(), ":insurance")) || (a.g(p1, "com.android.systemui.adam") || a.g(p1, "com.android.vending.lilith")))) {
             b = true;
          }
       }else {
          b = str.booleanValue();
       }
       Boolean uBoolean = Result.constructor-impl(Boolean.valueOf(b));
       Boolean fALSE = Boolean.FALSE;
       if (Result.isFailure-impl(uBoolean)) {
          uBoolean = fALSE;
       }
       return uBoolean.booleanValue();
    }
    public static boolean isLonginusProcess$default(Context p0,String p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = null;
       }
       return Longinus.isLonginusProcess(p0, p1);
    }
    public static final boolean isReady(Context p0){
       int i1;
       a.p(p0, "context");
       if (!new File(p0.getCacheDir(), "longinus_spears").exists() || (!new File(p0.getCacheDir(), "lockB_status").exists() || (!new File(p0.getCacheDir(), "lockA_status").exists() || (!new File(p0.getCacheDir(), "insuranceB_status").exists() || (!new File(p0.getCacheDir(), "insuranceA_status").exists() || (!new File(p0.getCacheDir(), "lockB_orphan_status").exists() || (!new File(p0.getCacheDir(), "lockA_orphan_status").exists() || (!new File(p0.getCacheDir(), "insuranceB_orphan_status").exists() || !new File(p0.getCacheDir(), "insuranceA_orphan_status").exists())))))))) {
          return false;
       }
       p0 = p0.getSystemService("activity");
       if (p0 instanceof ActivityManager) {
       }else {
          p0 = null;
       }
       int i = Process.myUid();
       if (p0 != null) {
          List runningServi = p0.getRunningServices(Integer.MAX_VALUE);
          if (runningServi != null) {
             Iterator iterator = runningServi.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   ActivityManager$RunningServiceInfo runningServi1 = iterator.next();
                   if (runningServi1.uid == i) {
                      String className = runningServi1.service.getClassName();
                      if (a.g(className, LilithService.class.getName()) || (a.g(className, AdamService.class.getName()) || (a.g(className, InsuranceAdamService.class.getName()) || a.g(className, InsuranceLilithService.class.getName())))) {
                         iterator = 1;
                         break ;
                      }
                   }
                }
             }
             if (!i1) {
                return false;
             }else {
                return true;
             }
          }
       }
       i1 = 0;
       goto label_010f ;
    }
    public static final void prepare(Context p0,l p1){
       a.p(p0, "context");
       a.p(p1, "after");
       g.a("LonginusSpears", "prepare");
       if (Longinus.INSTANCE.isServiceRunning(p0)) {
          if (new File(p0.getCacheDir(), "longinus_spears").exists()) {
             new Handler(Looper.getMainLooper()).postDelayed(new a(p1), 100);
          }else {
             new Handler(Looper.getMainLooper()).postDelayed(new b(p1), 100);
          }
       }else {
          new File(p0.getCacheDir(), "longinus_spears").createNewFile();
          a.a(d.d, p0, AdamService.class, 3000, new g(p0, p1));
       }
       return;
    }
    public static void prepare$default(Context p0,l p1,int p2,Object p3){
       e a;
       if (p2 & 0x02) {
          a = e.a;
       }
       Longinus.prepare(p0, a);
       return;
    }
    public static final void prepare$lambda-0(l p0){
       a.p(p0, "$after");
       p0.invoke(Integer.valueOf(3));
    }
    public static final void prepare$lambda-1(l p0){
       a.p(p0, "$after");
       p0.invoke(Integer.valueOf(2));
    }
    public static final void release(Context p0){
       a.p(p0, "context");
       Longinus iNSTANCE = Longinus.INSTANCE;
       if (Longinus.isReady(p0)) {
          Iterator iterator = SequencesKt___SequencesKt.n0(SequencesKt___SequencesKt.n0(l.K(new File(p0.getCacheDir(), "orphan"), null, 1, null).c(1), h.a), new i(iNSTANCE.selfPidStrSequence(p0))).iterator();
          while (iterator.hasNext()) {
             String name = iterator.next().getName();
             a.o(name, "it.name");
             Process.killProcess(Integer.parseInt(name));
          }
          Longinus.INSTANCE.removeStateFile(p0);
       }
       new File(p0.getCacheDir(), "longinus_spears").delete();
       return;
    }
    public static final void setOriginInstrumentation(Context p0,Instrumentation p1){
       a.p(p0, "context");
       a.p(p1, "origin");
       a.p(p0, "context");
       a.p(p1, "origin");
       if (Longinus.isLonginusProcess(p0, "com.android.systemui.adam")) {
          AdamProvider.c = p1;
       }
       return;
    }
    public final boolean isServiceRunning(Context p0){
       int i1;
       p0 = p0.getSystemService("activity");
       if (p0 instanceof ActivityManager) {
       }else {
          p0 = null;
       }
       int i = Process.myUid();
       boolean b = true;
       if (p0 == null) {
       label_0020 :
          i1 = 0;
       }else {
          List runningServi = p0.getRunningServices(Integer.MAX_VALUE);
          if (runningServi == null) {
             goto label_0020 ;
          }else {
             Iterator iterator = runningServi.iterator();
             int i2 = 0;
             i1 = 0;
             while (iterator.hasNext()) {
                ActivityManager$RunningServiceInfo runningServi1 = iterator.next();
                if (runningServi1.uid == i) {
                   String className = runningServi1.service.getClassName();
                   if (a.g(className, LilithService.class.getName())) {
                      i1 = 1;
                      if (!i2) {
                      }
                   }else if(a.g(className, AdamService.class.getName())){
                      i2 = 1;
                      if (!i1) {
                      }
                   }
                }
             }
          }
       }
       if (!0 || !i1) {
          b = false;
       }
       return b;
    }
    public final void removeStateFile(Context p0){
       new File(p0.getCacheDir(), "lockB_status").delete();
       new File(p0.getCacheDir(), "lockA_status").delete();
       new File(p0.getCacheDir(), "insuranceB_status").delete();
       new File(p0.getCacheDir(), "insuranceA_status").delete();
       new File(p0.getCacheDir(), "lockB_orphan_status").delete();
       new File(p0.getCacheDir(), "lockA_orphan_status").delete();
       new File(p0.getCacheDir(), "insuranceB_orphan_status").delete();
       new File(p0.getCacheDir(), "insuranceA_orphan_status").delete();
       FilesKt__UtilsKt.V(new File(p0.getCacheDir(), "orphan"));
    }
    public final m selfPidStrSequence(Context p0){
       int i = Process.myUid();
       m systemServic = p0.getSystemService("activity");
       m om = null;
       if (systemServic instanceof ActivityManager) {
       }else {
          systemServic = om;
       }
       if (systemServic != null) {
          List runningAppPr = systemServic.getRunningAppProcesses();
          if (runningAppPr != null) {
             systemServic = CollectionsKt___CollectionsKt.l1(runningAppPr);
          label_0022 :
             if (systemServic != null) {
                systemServic = SequencesKt___SequencesKt.i0(systemServic, new j(i));
                if (systemServic != null) {
                   om = SequencesKt___SequencesKt.b1(systemServic, k.a);
                }
             }
             return om;
          }
       }
       systemServic = om;
       goto label_0022 ;
    }
    public final void setLonginusServiceComponent(Context p0,Class p1){
       a.p(p0, "context");
       File uFile = new File(p0.getCacheDir(), "component");
       uFile.mkdirs();
       if (p1 == null) {
          FilesKt__UtilsKt.V(uFile);
          return;
       }else {
          String[] stringArray = uFile.list();
          String str = 1;
          if (stringArray != null) {
             int i = (!stringArray.length)? 1: 0;
             if (!i) {
                str = null;
             }
          }
          if (!str && a.g(stringArray[0], p1.getName())) {
             return;
          }else {
             FilesKt__UtilsKt.V(uFile);
             uFile.mkdirs();
             new File(uFile, p1.getName()).createNewFile();
             return;
          }
       }
    }
}
