package com.yxcorp.gifshow.ad.eve.CommercialEveHelper;
import com.yxcorp.gifshow.ad.eve.CommercialEveHelper$fallbackImpl$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import java.lang.StringBuilder;
import yx.j0;
import tkd.b;
import tkd.d;
import kotlin.jvm.internal.a;
import java.util.concurrent.TimeUnit;
import brd.w;
import com.yxcorp.gifshow.ad.eve.CommercialEveHelper$a;
import erd.o;
import com.yxcorp.gifshow.ad.eve.CommercialEveHelper$b;
import com.yxcorp.gifshow.ad.eve.CommercialEveHelper$c;
import erd.g;
import crd.b;
import android.os.SystemClock;
import ul9.a;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.eve.CommercialEveHelper$d;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.yxcorp.gifshow.ad.eve.CommercialEveHelper$e;
import com.yxcorp.gifshow.ad.eve.CommercialEveHelper$f;
import com.yxcorp.gifshow.ad.eve.CommercialEveHelper$g;

public final class CommercialEveHelper	// class@00176a
{
    public static final p a;
    public static final CommercialEveHelper b;

    static {
       CommercialEveHelper.b = new CommercialEveHelper();
       CommercialEveHelper.a = s.c(CommercialEveHelper$fallbackImpl$2.INSTANCE);
    }
    public void CommercialEveHelper(){
       super();
    }
    public final t a(){
       boolean b;
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CommercialEveHelper uCommercialE = CommercialEveHelper.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uCommercialE, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       Object obj1 = PatchProxy.apply(objArray, this, uCommercialE, "7");
       int i = 0;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          boolean b1 = g.e("commercial_ml_eve");
          b = Dva.instance().isLoaded("commercial_ml_eve");
          Object[] objArray2 = new Object[i];
          j0.f("CommercialEveHelper", "isPluginInstalled isSourceMode: "+b1+", isLoaded: "+b, objArray2);
          b = (b1 || b)? true: false;
       }
       if (b) {
          ot = t.just(d.a(0x943d4c1));
          a.o(ot, "Observable.just\(PluginMa¡­alEvePlugin::class.java\)\)");
          return ot;
       }else {
          Object[] objArray1 = new Object[i];
          j0.f("CommercialEveHelper", "getPluginImplRx start", objArray1);
          ot = this.c().timeout(1000, TimeUnit.MILLISECONDS, t.just(Boolean.FALSE)).map(CommercialEveHelper$a.b);
          a.o(ot, "installPluginRx\(\)\n      ¡­ackImpl\n        }\n      }");
          return ot;
       }
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, CommercialEveHelper.class, "3")) {
          return;
       }
       this.c().subscribe(CommercialEveHelper$b.b, CommercialEveHelper$c.b);
       return;
    }
    public final t c(){
       t obj = PatchProxy.apply(null, this, CommercialEveHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       z c = d.c;
       t ot = a.c("commercial_ml_eve", 0, 0, 20).subscribeOn(c).observeOn(c);
       obj = ot.doOnNext(new CommercialEveHelper$d(SystemClock.elapsedRealtime()));
       a.o(obj, "AdDvaPluginUtils.install¡­ead\(\)}\"\n        \)\n      }");
       return obj;
    }
    public final void d(RequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialEveHelper.class, "2")) {
          return;
       }
       a.p(p0, "requestTiming");
       int i = 0;
       if (p0 != RequestTiming.COLD_START && p0 != RequestTiming.ON_HOME_PAGE_CREATED) {
          Object[] objArray = new Object[i];
          j0.f("CommercialEveHelper", "invokerColdAndWarmLaunched requestTiming not match: "+p0, objArray);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          j0.f("CommercialEveHelper", "invokerColdAndWarmLaunched AdLaunchPredict plugin startLoad"+" requestTiming: "+p0, objArray1);
          this.c().map(new CommercialEveHelper$e(p0)).observeOn(d.a).subscribe(new CommercialEveHelper$f(p0), CommercialEveHelper$g.b);
          return;
       }
    }
}
