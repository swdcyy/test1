package com.kuaishou.growth.pendant.core.demotion.PendantAnimPlan;
import com.kuaishou.growth.pendant.core.demotion.PendantAnimPlan$dispatcher$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kuaishou.growth.pendant.core.config.PendantCoreConfig;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevel;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevelDispatcher;
import ce0.b;
import java.lang.StringBuilder;

public final class PendantAnimPlan	// class@000643
{
    public static ActivityAnimLevel a;
    public static final p b;
    public static final PendantAnimPlan c;

    static {
       PendantAnimPlan.c = new PendantAnimPlan();
       PendantAnimPlan.b = s.c(PendantAnimPlan$dispatcher$2.INSTANCE);
    }
    public void PendantAnimPlan(){
       super();
    }
    public static final boolean a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PendantAnimPlan pendantAnimP = PendantAnimPlan.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, objArray, pendantAnimP, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (PendantAnimPlan.a == null) {
          obj = PendantCoreConfig.b;
          ActivityAnimLevel dEFAULT = ActivityAnimLevel.DEFAULT;
          if (!a.g(obj, dEFAULT.getKey())) {
             dEFAULT = ActivityAnimLevel.DEMOTION;
             if (!a.g(obj, dEFAULT.getKey())) {
                dEFAULT = ActivityAnimLevel.BASELINE;
                if (!a.g(obj, dEFAULT.getKey())) {
                   Object obj1 = PatchProxy.apply(objArray, objArray, pendantAnimP, "2");
                   if (obj1 != patchProxyRe) {
                   }else {
                      obj1 = PendantAnimPlan.b.getValue();
                   }
                   dEFAULT = obj1.a();
                }
             }
          }
          PendantAnimPlan.a = dEFAULT;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       b.C().w("PendantAnimPlan", "currentLevelInternal is "+PendantAnimPlan.a, objArray1);
       if (PendantAnimPlan.a != ActivityAnimLevel.DEFAULT) {
          i = true;
       }
       return i;
    }
}
