package com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$g;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService$e;
import com.yxcorp.gifshow.camerasdk.compatibility.HardwareEncodeTestService;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import com.kwai.camerasdk.render.OpenGLAvailabilityChecker;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.camerasdk.render.OpengGL.EglBase;
import com.kwai.camerasdk.render.OpengGL.EglBase$Context;
import java.lang.Throwable;
import java.lang.Long;
import qi9.q1;
import q87.c;
import java.lang.StringBuilder;
import v16.a;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import com.yxcorp.gifshow.util.PostUtils;

public class HardwareEncodeTestService$g extends HardwareEncodeTestService$e	// class@001011
{
    public Boolean h;
    public final HardwareEncodeTestService i;

    public void HardwareEncodeTestService$g(HardwareEncodeTestService p0,String p1){
       this.i = p0;
       super(p0, p1);
       this.h = null;
    }
    public void a(){
    }
    public void c(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HardwareEncodeTestService$g.class, "1")) {
          return;
       }
       long l = System.currentTimeMillis();
       EglBase obj = PatchProxy.apply(objArray, objArray, OpenGLAvailabilityChecker.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = EglBase.a();
          obj.l();
          b = OpenGLAvailabilityChecker.nativeTestGlSyncAvailable(obj.i());
       }
       this.h = Boolean.valueOf(b);
       this.e((System.currentTimeMillis() - l));
       return;
    }
    public void d(Throwable p0,long p1){
       HardwareEncodeTestService$g og = HardwareEncodeTestService$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, og, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().t("RecorderCompatibility", "OpenGL Test Failed", objArray);
       return;
    }
    public void e(long p0){
       HardwareEncodeTestService$g og = HardwareEncodeTestService$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, og, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("RecorderCompatibility", "OpenGL Test Success: result = "+this.h, objArray);
       boolean b = this.h.booleanValue();
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), null, uoa, "9")) {
          g.b(a.f().edit().putBoolean("opengl_sync_test_result:15", b));
       }
       PostUtils.x("OpenGLSyncTestResult", String.valueOf(this.h));
       return;
    }
    public void f(long p0){
       HardwareEncodeTestService$g og = HardwareEncodeTestService$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, og, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       q1.C().w("RecorderCompatibility", "OpenGL Test Timeout", objArray);
       return;
    }
}
