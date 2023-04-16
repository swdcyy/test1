package com.kwai.performance.fluency.runtime.RuntimeManager;
import java.lang.Object;
import jf7.a;
import com.bytedance.shadowhook.ShadowHook$b;
import com.bytedance.shadowhook.ShadowHook$Mode;
import com.bytedance.shadowhook.ShadowHook$a;
import com.bytedance.shadowhook.ShadowHook;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;
import com.kwai.performance.fluency.runtime.RuntimeManager$a;
import java.lang.Runnable;
import ekd.s1;
import java.lang.Throwable;
import android.os.Build$VERSION;
import ekd.e0;
import kotlin.jvm.internal.a;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import com.kwai.performance.fluency.runtime.RuntimeManager$b;
import ekd.v0;
import android.os.Build;
import java.util.Locale;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.TypeCastException;
import java.io.File;
import java.util.Objects;

public final class RuntimeManager	// class@0010dc
{
    public static String a;
    public static File b;
    public static boolean c;
    public static int d;
    public static final RuntimeManager e;

    static {
       RuntimeManager.e = new RuntimeManager();
    }
    public void RuntimeManager(){
       super();
    }
    public static synchronized final void a(double p0){
       _monitor_enter(RuntimeManager.class);
       int i = 1;
       RuntimeManager.d = RuntimeManager.d + i;
       if (RuntimeManager.c) {
          _monitor_exit(RuntimeManager.class);
          return;
       }else {
          RuntimeManager.c = i;
          RuntimeManager.e.c(2);
          a e = a.e;
          if (e.a(2)) {
             _monitor_exit(RuntimeManager.class);
             return;
          }else {
             e.h(2);
             ShadowHook$b uob = new ShadowHook$b();
             uob.b = ShadowHook$Mode.UNIQUE.getValue();
             i = ShadowHook.a(uob.a());
             if (i) {
                Log.b("RTMgr", "init errno "+i);
                e.g(2, "ERROR:  init errno "+i);
                _monitor_exit(RuntimeManager.class);
                return;
             }else {
                Log.b("RTMgr", " pre init");
                if (!RuntimeManager.nativeStartGcSuppress(p0)) {
                   e.g(2, "ERROR: failed gc suppress");
                   e.b(2);
                }
                s1.e(RuntimeManager$a.b, 3000);
                _monitor_exit(RuntimeManager.class);
                return;
             }
          }
       }
    }
    public static final void b(){
       RuntimeManager.e.c(1);
       a e = a.e;
       if (e.a(1)) {
          return;
       }
       e.h(1);
       Context b = e0.b;
       a.h(b, "GlobalConfig.CONTEXT");
       e.g(1, RuntimeManager.disableClassVerifyNative(Build$VERSION.SDK_INT, b.getApplicationInfo().targetSdkVersion));
       s1.e(RuntimeManager$b.b, 2000);
       return;
    }
    public static native final String disableClassVerifyNative(int p0,int p1);
    public static final String e(int p0){
       return a.e.c(p0);
    }
    public static native final boolean nativeStartGcSuppress(double p0);
    public static native final boolean nativeStopGcSuppress();
    public final void c(int p0){
       v0 ov0 = 1;
       ov0.b("libruntime-optimize.so");
       String str = 1;
       if (p0 != ov0) {
          if (p0 == 2 && !str) {
             a.e.b(2);
          }
       }else if(!str){
          a.e.b(ov0);
       }
       String str1 = Build.MANUFACTURER+'('+Build.MODEL+')';
       Locale uS = Locale.US;
       a.h(uS, "Locale.US");
       if (str1 != null) {
          str1 = str1.toUpperCase(uS);
          a.h(str1, "\(this as java.lang.String\).toUpperCase\(locale\)");
          String[] stringArray = new String[]{"HUAWEI\(MED-AL00\)","HUAWEI\(MOA-AL00\)","HUAWEI\(MED-AL20\)"};
          if (ArraysKt___ArraysKt.P7(stringArray, str1)) {
             a.e.b(ov0);
          }
       }else {
          throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
       }
    label_0062 :
       return;
    }
    public final File d(){
       File uFile;
       if (RuntimeManager.b == null) {
          if (RuntimeManager.a == null) {
             Context b = e0.b;
             a.h(b, "GlobalConfig.CONTEXT");
             Objects.requireNonNull(RuntimeManager.e);
             uFile = new File(b.getFilesDir(), "runtime_block_"+(e0.d).hashCode()+".flag");
             RuntimeManager.a = uFile.getAbsolutePath();
             RuntimeManager.b = uFile;
          }
          if (RuntimeManager.a == null) {
             a.L();
          }
       }
       uFile = RuntimeManager.b;
       if (uFile == null) {
          a.L();
       }
       return uFile;
    }
}
