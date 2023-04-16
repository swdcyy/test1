package com.yxcorp.gifshow.performance.monitor.a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Thread;
import kotlin.jvm.internal.a;
import yf7.h;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.kwai.sdk.switchconfig.a;
import java.util.concurrent.TimeUnit;
import android.os.Build$VERSION;
import com.yxcorp.utility.AbiUtil;
import java.lang.Math;
import java.lang.StringBuilder;
import com.kwai.kmalloc.KMalloc;
import k2b.u1;
import java.lang.Float;
import java.lang.reflect.Type;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$a;

public final class a implements Runnable	// class@001296
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void run(){
       String str = "kmallocSucceed: ";
       String str1 = "forbidden reason: ";
       String str2 = " forbidden: ";
       String str3 = "enabled: ";
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       Thread thread = Thread.currentThread();
       a.o(thread, "Thread.currentThread\(\)");
       thread.setName("kmalloc");
       h.d("kmalloc", "kmallocInit");
       int b = SystemUtil.L(a.b());
       if (!b) {
          return;
       }
       TimeUnit.SECONDS.sleep((long)a.t().a("kmalloc_must_alive_time", 6));
       boolean b1 = a.t().d("kmalloc_replace_disabled", false);
       boolean b2 = a.t().d("kmalloc_replace_arm32_enabled", false);
       boolean b3 = true;
       if (!b) {
       label_005b :
          b3 = false;
       }else {
          b = Build$VERSION.SDK_INT;
          if (b < 24 || (b > -4317417600901156800000000000000000000000000.00f || (!AbiUtil.b() && (!b2 || b1)))) {
             goto label_005b ;
          }else if(SystemUtil.I()){
             if (SystemUtil.J()) {
                if (Math.random() - (double)0x3f333333 > 0) {
                }
             }else {
                a.d();
             }
          }
       }
       h.d("kmalloc", "remote enableKmalloc: "+b3+" remoteDisabled: "+b1+" debug: "+SystemUtil.I()+" testChannel: "+a.d());
       KMalloc.recordLaunchSuccess();
       b = KMalloc.isEnabled();
       b1 = KMalloc.isForbidden();
       h.d("kmalloc", str3+b+str2+b1);
       u1.Q("kmalloc", str3+b+str2+b1);
       if (b && !b1) {
          boolean b4 = KMalloc.isReplacedIndeed();
          h.d("kmalloc", str+b4);
          u1.Q("kmalloc", str+b4);
       }
       if (b1) {
          h.d("kmalloc", str1+KMalloc.getForbiddenReason());
          u1.Q("kmalloc", str1+KMalloc.getForbiddenReason());
       }
       if (!b3) {
          KMalloc.disable();
       }else {
          KMalloc.enable();
       }
       boolean b5 = a.t().d("kmalloc_gwp_asan_disabled", false);
       if (!b5) {
          Class tYPE = Float.TYPE;
          Float value = a.t().getValue("kmalloc_gwp_asan_huidu_ratio", tYPE, Float.valueOf(0.15f));
          Float value1 = a.t().getValue("kmalloc_gwp_asan_release_ratio", tYPE, Float.valueOf(0.00f));
          float f = 0x3f800000;
          if (!a.d() && !SystemUtil.N()) {
             String str4 = "gwpAsanReleaseRatio";
             if (SystemUtil.R()) {
                a.o(value1, str4);
                f = value1.floatValue();
             }else if(SystemUtil.J() && PerformanceMonitorInitModule.t.c()){
                a.o(value, "gwpAsanHuiduRatio");
                f = value.floatValue();
             }else if(SystemUtil.J()){
                a.o(value1, str4);
                f = value1.floatValue();
             }else if(SystemUtil.P()){
                f = 0;
             }else {
                a.o(value1, str4);
                f = value1.floatValue();
             }
          }
          h.d("kmalloc", "gwpAsanDisabled: "+b5+" gwpAsanEnableRatio: "+f);
          if (Math.random() - (double)f < 0 && Build$VERSION.SDK_INT >= 30) {
             KMalloc.enableMemoryCorruptDetection();
          }else {
             KMalloc.disableMemoryCorruptDetection();
          }
       }else {
          KMalloc.disableMemoryCorruptDetection();
       }
       return;
    }
}
