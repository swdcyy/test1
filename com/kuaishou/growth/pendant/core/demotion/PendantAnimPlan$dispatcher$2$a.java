package com.kuaishou.growth.pendant.core.demotion.PendantAnimPlan$dispatcher$2$a;
import z1.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.pendant.core.config.PendantCoreConfig;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevel;

public final class PendantAnimPlan$dispatcher$2$a implements k	// class@000641
{
    public static final PendantAnimPlan$dispatcher$2$a b;

    static {
       PendantAnimPlan$dispatcher$2$a.b = new PendantAnimPlan$dispatcher$2$a();
    }
    public void PendantAnimPlan$dispatcher$2$a(){
       super();
    }
    public Object get(){
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, PendantAnimPlan$dispatcher$2$a.class, "1");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          String b = PendantCoreConfig.b;
          String str = (b.length() > 0)? 1: null;
          if (str) {
             objArray = b;
          }
          if (objArray != null) {
             objArray1 = objArray;
          }else {
             b = a.t().c("activity_pendant_anim_plan", ActivityAnimLevel.DEFAULT.getKey());
          }
       }
       return objArray1;
    }
}
