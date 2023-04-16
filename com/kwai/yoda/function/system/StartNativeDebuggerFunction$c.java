package com.kwai.yoda.function.system.StartNativeDebuggerFunction$c;
import erd.g;
import com.kwai.yoda.function.system.StartNativeDebuggerFunction;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Object;
import xa7.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.function.system.StartNativeDebuggerFunction$StartNativeDebuggerResponseParam;
import com.kwai.yoda.function.FunctionResultParams;
import ty7.j;
import com.kuaishou.webkit.extension.KwSdk;
import com.kwai.middleware.azeroth.Azeroth2;
import u97.d;
import com.kwai.middleware.leia.handler.LeiaParamExtractor;
import java.io.File;
import yb7.m;
import java.io.FileFilter;
import java.lang.Exception;
import java.lang.Runtime;
import com.kwai.yoda.function.c;

public final class StartNativeDebuggerFunction$c implements g	// class@0011fd
{
    public final StartNativeDebuggerFunction b;
    public final YodaBaseWebView c;
    public final String d;
    public final String e;
    public final String f;

    public void StartNativeDebuggerFunction$c(StartNativeDebuggerFunction p0,YodaBaseWebView p1,String p2,String p3,String p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StartNativeDebuggerFunction$c.class, "1")) {
       }else {
          StartNativeDebuggerFunction$StartNativeDebuggerResponseParam startNativeD = new StartNativeDebuggerFunction$StartNativeDebuggerResponseParam();
          startNativeD.mResult = 1;
          startNativeD.canNativeDebug = j.c.b();
          startNativeD.isSysWebView = 1 ^ KwSdk.isCoreLoaded();
          p0 = Azeroth2.B.m();
          startNativeD.kpn = p0.m();
          startNativeD.systemVersion = p0.q();
          startNativeD.did = p0.f();
          startNativeD.mod = p0.k();
          startNativeD.deviceName = p0.k();
          int b = p0.z();
          try{
             startNativeD.isLowPhone = b;
             b = new File("/sys/devices/system/cpu/").listFiles(new m()).length;
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
             b = Runtime.getRuntime().availableProcessors();
          }
          startNativeD.cpuCount = b;
          startNativeD.isArm64 = p0.v();
          startNativeD.isSupportArm64 = p0.C();
          this.b.l(this.c, startNativeD, this.d, this.e, null, this.f);
       }
       return;
    }
}
