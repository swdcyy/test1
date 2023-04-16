package com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService;
import android.app.Service;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$a;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ti9.b;
import com.yxcorp.gifshow.util.PostUtils;
import java.lang.Boolean;
import java.lang.System;
import v16.a;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$g;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$e;
import android.content.Intent;
import android.os.IBinder;
import qi9.q1;
import q87.c;
import com.yxcorp.gifshow.camerasdk.compatibility.a;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Thread;
import com.yxcorp.gifshow.media.model.EncodeConfig;
import cj9.b;
import v16.b;
import android.os.Handler;
import ti9.d;
import java.lang.Runnable;
import ti9.c;

public class HardwareEncodeTestService extends Service	// class@001012
{
    public final HardwareEncodeTestService$a b;
    public static int c;

    public void HardwareEncodeTestService(){
       super();
       this.b = new HardwareEncodeTestService$a(this);
    }
    public static File a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       File obj = PatchProxy.apply(objArray, objArray, HardwareEncodeTestService.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.apply(objArray, objArray, b.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = new File(PostUtils.h(), "15encode.mp4");
       }
       return obj;
    }
    public boolean b(){
       Object obj = PatchProxy.apply(null, this, HardwareEncodeTestService.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (HardwareEncodeTestService.a().exists()) {
          long l = System.currentTimeMillis() - HardwareEncodeTestService.a().lastModified();
          if (l > 0 && l - 0x36ee80 < 0) {
             b = true;
          }
       }
       return b;
    }
    public synchronized void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HardwareEncodeTestService.class, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, a.class, "18")) {
          SharedPreferences sharedPrefer = a.f();
          SharedPreferences$Editor uEditor = sharedPrefer.edit();
          g.b(uEditor.putInt("opengl_sync_test_cnt:15", (sharedPrefer.getInt("opengl_sync_test_cnt:15", 0) + 1)));
       }
       new HardwareEncodeTestService$g(this, "opengl-sync-test-thread").g();
       return;
    }
    public IBinder onBind(Intent p0){
       return null;
    }
    public void onCreate(){
       if (PatchProxy.applyVoid(null, this, HardwareEncodeTestService.class, "1")) {
          return;
       }
       super.onCreate();
       Object[] objArray = new Object[0];
       q1.C().w("RecorderCompatibility", "service onCreate", objArray);
       Thread.setDefaultUncaughtExceptionHandler(a.a);
       if (b.c().isAllowHardwareEncodeTest() && (!b.c().isUseHardwareEncode() && b.k())) {
          new Handler().postDelayed(new d(this), 5000);
       }else {
          this.b.a();
       }
       if (!b.c().isForceDisableOpenglSync() && b.l()) {
          new Handler().postDelayed(new c(this), 3000);
       }else {
          this.b.b();
       }
       return;
    }
}
