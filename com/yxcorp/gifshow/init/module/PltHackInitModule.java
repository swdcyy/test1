package com.yxcorp.gifshow.init.module.PltHackInitModule;
import com.kwai.framework.init.a;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.init.module.n0;
import com.kwai.performance.stability.runtimehack.RuntimeHack;
import android.app.Application;
import o56.a;
import wg7.e;
import com.kwai.performance.stability.hack.b$a;
import kotlin.jvm.internal.a;
import sxa.a0;
import com.yxcorp.gifshow.init.module.s0;
import com.yxcorp.gifshow.init.module.r0;
import com.yxcorp.gifshow.init.module.p0;
import com.yxcorp.gifshow.init.module.PltHackInitModule$2;
import com.yxcorp.gifshow.init.module.PltHackInitModule$1;
import com.yxcorp.gifshow.init.module.q0;
import com.kwai.performance.stability.hack.b;
import wg7.d;
import wg7.c;
import com.kwai.performance.stability.hack.StabilityHackerConfig$Builder$build$1;
import com.kwai.performance.stability.hack.StabilityHackerConfig$Builder$build$2;
import com.kwai.performance.stability.hack.b$c;
import com.kwai.performance.stability.hack.b$b;
import msd.l;
import msd.a;
import nsd.u;
import java.util.Objects;
import wg7.b;
import o56.d;
import sxa.y;
import java.lang.Runnable;
import com.kwai.framework.init.c;
import sxa.z;
import am8.d;
import com.yxcorp.gifshow.init.module.o0;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import android.content.SharedPreferences;
import vid.b;
import com.yxcorp.utility.AbiUtil$Abi;
import com.yxcorp.utility.AbiUtil;
import java.lang.Enum;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.io.File;
import qkd.b;
import java.lang.Exception;

public class PltHackInitModule extends a	// class@001995
{
    public static final int q;

    public void PltHackInitModule(){
       super();
    }
    public boolean H7(){
       return true;
    }
    public int f0(){
       return 19;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PltHackInitModule.class, "6")) {
          return;
       }
       n0 a = n0.a;
       if (RuntimeHack.a != 1) {
          a.a(RuntimeHack.a);
       }
       PatchProxy.onMethodExit(PltHackInitModule.class, "6");
       return;
    }
    public void n(){
       b$a a;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, obj, PltHackInitModule.class, "1")) {
          return;
       }
       Application uApplication = a.b();
       e b = e.b;
       b$a uoa = new b$a();
       a.q(uApplication, "application");
       uoa.a = uApplication;
       a0 uoa0 = new a0(uApplication);
       a.q(uoa0, "sharedPreferencesInvoker");
       uoa.e = uoa0;
       s0 b1 = s0.b;
       a.q(b1, "loadLibraryInvoker");
       uoa.b = b1;
       r0 b2 = r0.b;
       a.q(b2, "isRomInvoker");
       uoa.d = b2;
       p0 b3 = p0.b;
       a.q(b3, "isArm64Invoker");
       uoa.c = b3;
       PltHackInitModule$2 u2 = new PltHackInitModule$2(obj);
       a.q(u2, "bufferSizeFetcher");
       uoa.g = u2;
       PltHackInitModule$1 u1 = new PltHackInitModule$1(obj);
       a.q(u1, "logger");
       uoa.f = u1;
       q0 b4 = q0.b;
       a.q(b4, "syncInvoker");
       uoa.h = b4;
       a = uoa.a;
       if (a == null) {
          a.S("mApplication");
       }
       b$a f = uoa.f;
       if (f == null) {
          f = new d();
       }
       b$a uoa1 = f;
       b$a b5 = uoa.b;
       if (b5 == null) {
          a.S("mLoadLibraryInvoker");
       }
       f = uoa.g;
       if (f == null) {
          c uoc = new c();
       }
       b$a uoa2 = f;
       b$a c = uoa.c;
       if (c == null) {
          a.S("mIsArm64Invoker");
       }
       b$a d = uoa.d;
       if (d == null) {
          a.S("mIsRomInvoker");
       }
       f = uoa.e;
       if (f == null) {
          StabilityHackerConfig$Builder$build$1 uBuilder$bui = new StabilityHackerConfig$Builder$build$1(uoa);
       }
       b$a uoa3 = f;
       uoa = uoa.h;
       if (uoa == null) {
          StabilityHackerConfig$Builder$build$2 iNSTANCE = StabilityHackerConfig$Builder$build$2.INSTANCE;
       }
       b uob = new b(a, uoa1, uoa2, b5, c, d, uoa3, uoa, null);
       Objects.requireNonNull(b);
       a.q(b4, "config");
       e.a = b4;
       d.n = b.b();
       String str = "4";
       if (!PatchProxy.applyVoidWithListener(objArray, obj, PltHackInitModule.class, str)) {
          PatchProxy.onMethodExit(PltHackInitModule.class, str);
       }
       c.b(new y(obj));
       d.d(new z(obj), "PltHackInitModule", 0);
       str = "5";
       if (!PatchProxy.applyVoidWithListener(objArray, obj, PltHackInitModule.class, str)) {
          if (!(a.k).equalsIgnoreCase("HUAWEI")) {
             PatchProxy.onMethodExit(PltHackInitModule.class, str);
          }else {
             c.b(o0.b);
             PatchProxy.onMethodExit(PltHackInitModule.class, str);
          }
       }
       if (SystemUtil.L(a.B)) {
          SharedPreferences sharedPrefer = b.c(uApplication, "apm", 0);
          if (AbiUtil.a().ordinal() != sharedPrefer.getInt("last_abi", AbiUtil$Abi.UNKNOWN.ordinal())) {
             g.a(o.c(uApplication, "WebViewChromiumPrefs", 0).edit().clear());
             File dir = uApplication.getDir("webview", 0);
             try{
                File uFile = new File(dir, "GPUCache");
                b.b(uFile);
             }catch(java.io.IOException e0){
             }catch(java.lang.IllegalArgumentException e0){
             }
             e0.printStackTrace();
          }
          g.a(sharedPrefer.edit().putInt("last_abi", AbiUtil.a().ordinal()));
       }
       PatchProxy.onMethodExit(PltHackInitModule.class, "1");
       return;
    }
}
