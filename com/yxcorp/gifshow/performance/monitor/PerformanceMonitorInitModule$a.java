package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$a;
import java.lang.Object;
import nsd.u;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.PerformanceBaseInitModule;
import com.yxcorp.gifshow.performance.monitor.oom.OOMMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.block.BlockMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.thermal.ThermalMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.page.PageMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.memory.MemoryMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.battery.BatteryMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.memorysanitizer.MemorySanitizerInitModule;
import com.yxcorp.gifshow.performance.monitor.traffic.TrafficMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.gpubusy.GpuBusyMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.artti.ArtTiMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.heaptrimmer.DalvikHeapTrimmerInitModule;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.appexit.AppExitMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.thread.ThreadMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.jank.JankMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule;
import com.yxcorp.gifshow.performance.monitor.boost.RenderThrBoostInitModule;
import com.yxcorp.gifshow.performance.monitor.gc.GcManageInitModule;
import java.lang.Boolean;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.res.AssetManager;
import java.io.InputStream;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import zsd.d;
import java.nio.charset.Charset;
import org.json.JSONObject;
import java.lang.StringBuilder;
import yf7.h;
import zsd.u;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import android.os.Build$VERSION;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$a$a;
import java.lang.Runnable;
import t45.c;

public final class PerformanceMonitorInitModule$a	// class@001290
{

    public void PerformanceMonitorInitModule$a(){
       super();
    }
    public void PerformanceMonitorInitModule$a(u p0){
       super();
    }
    public final ArrayList a(){
       PerformanceBaseInitModule[] obj = PatchProxy.apply(null, this, PerformanceMonitorInitModule$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (PerformanceMonitorInitModule.r == null) {
          obj = new PerformanceBaseInitModule[11];
          obj[0] = new OOMMonitorInitModule();
          obj[1] = new BlockMonitorInitModule();
          obj[2] = new ThermalMonitorInitModule();
          obj[3] = new PageMonitorInitModule();
          obj[4] = new MemoryMonitorInitModule();
          obj[5] = new BatteryMonitorInitModule();
          obj[6] = new MemorySanitizerInitModule();
          obj[7] = new TrafficMonitorInitModule();
          obj[8] = new GpuBusyMonitorInitModule();
          obj[9] = new ArtTiMonitorInitModule();
          obj[10] = new DalvikHeapTrimmerInitModule();
          PerformanceMonitorInitModule.r = CollectionsKt__CollectionsKt.r(obj);
       }
       return PerformanceMonitorInitModule.r;
    }
    public final ArrayList b(){
       PerformanceBaseInitModule[] obj = PatchProxy.apply(null, this, PerformanceMonitorInitModule$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (PerformanceMonitorInitModule.q == null) {
          obj = new PerformanceBaseInitModule[9];
          obj[0] = new CrashMonitorInitModule();
          obj[1] = new AppExitMonitorInitModule();
          obj[2] = new ThreadMonitorInitModule();
          obj[3] = new FPSMonitorInitModule();
          obj[4] = new JankMonitorInitModule();
          obj[5] = new NewPageMonitorInitModule();
          obj[6] = new IOMonitorInitModule();
          obj[7] = new RenderThrBoostInitModule();
          obj[8] = new GcManageInitModule();
          PerformanceMonitorInitModule.q = CollectionsKt__CollectionsKt.r(obj);
       }
       return PerformanceMonitorInitModule.q;
    }
    public final boolean c(){
       String str = "branch_name";
       Object obj = PatchProxy.apply(null, this, PerformanceMonitorInitModule$a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       InputStream inputStream = SplitAssetHelper.open(uApplication.getAssets(), "apk.json");
       byte[] uobyteArray = new byte[inputStream.available()];
       inputStream.read(uobyteArray);
       String str1 = new String(uobyteArray, d.a);
       JSONObject jSONObject = new JSONObject(str1);
       h.d("PerformanceMonitorInitModule", "branch_name: "+jSONObject.getString(str));
       str = jSONObject.getString(str);
       a.o(str, "json.getString\(\"branch_name\"\)");
       b.a(inputStream, null);
       return u.q2(str, "release/RB", false, 2, null);
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, PerformanceMonitorInitModule$a.class, "9")) {
          return;
       }
       boolean b = false;
       if (SystemUtil.L(a.b())) {
          PerformanceMonitorInitModule$a$a uoa$a = 25;
          int sDK_INT = Build$VERSION.SDK_INT;
          if (23 <= sDK_INT && uoa$a >= sDK_INT) {
             b = a.t().d("enableNativeBitmapTwo", b);
             h.d("native_bitmap", "modelEnabled: "+b);
          }
       }
       if (!b) {
          return;
       }else {
          c.a(PerformanceMonitorInitModule$a$a.b);
          return;
       }
    }
}
