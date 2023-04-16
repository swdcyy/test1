package com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$Companion;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.tuna_logger.KsLogTunaCodDynamicLogTag;
import java.util.List;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$Companion$reportHasCodPlcWhenBoot$1;
import msd.a;
import c15.b;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import xx5.g;
import zx5.c;
import zx5.e;
import zx5.c$a;
import zx5.a;
import com.kuaishou.tuna_core.plugin.TunaCodPluginReporter$Companion$reportHasCodPlcWhenBoot$2;
import zx5.a$a;

public final class TunaCodPluginReporter$Companion	// class@001109
{

    public void TunaCodPluginReporter$Companion(){
       super();
    }
    public void TunaCodPluginReporter$Companion(u p0){
       super();
    }
    public final void a(boolean p0,boolean p1){
       boolean b;
       TunaCodPluginReporter$Companion uCompanion = TunaCodPluginReporter$Companion.class;
       if (PatchProxy.isSupport(uCompanion) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uCompanion, "2")) {
          return;
       }
       b.f(KsLogTunaCodDynamicLogTag.PLUGIN.appendTag("TunaCodPluginReporter"), new TunaCodPluginReporter$Companion$reportHasCodPlcWhenBoot$1(p0, p1));
       Object[] objArray = null;
       g obj = PatchProxy.apply(objArray, this, uCompanion, "4");
       int i = -174493078;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = d.a(i);
          c uoc = (obj != null)? obj.PB(c.class): objArray;
          boolean b1 = false;
          if (uoc != null) {
             b = c$a.a(uoc, "tunaPlcFirstFeedSampling", b1, 2, objArray);
          }else {
             b = false;
          }
       }
       if (!b) {
          return;
       }else {
          obj = d.a(i);
          if (obj != null) {
             objArray = obj.PB(a.class);
          }
          Object[] objArray1 = objArray;
          if (objArray1 != null) {
             a$a.a(objArray1, "cod_boot", false, new TunaCodPluginReporter$Companion$reportHasCodPlcWhenBoot$2(p1, p0), 2, null);
          }
          return;
       }
    }
}
