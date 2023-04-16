package com.yxcorp.gifshow.growth.demotion.GrowthDemotionHelper$dispatcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevelDispatcher;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.growth.demotion.GrowthDemotionHelper$dispatcher$2$a;
import z1.k;
import nsd.u;

public final class GrowthDemotionHelper$dispatcher$2 extends Lambda implements a	// class@001362
{
    public static final GrowthDemotionHelper$dispatcher$2 INSTANCE;

    static {
       GrowthDemotionHelper$dispatcher$2.INSTANCE = new GrowthDemotionHelper$dispatcher$2();
    }
    public void GrowthDemotionHelper$dispatcher$2(){
       super(0);
    }
    public final ActivityAnimLevelDispatcher invoke(){
       Object obj = PatchProxy.apply(null, this, GrowthDemotionHelper$dispatcher$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ActivityAnimLevelDispatcher uActivityAni = new ActivityAnimLevelDispatcher(null, null, false, GrowthDemotionHelper$dispatcher$2$a.b, 7, null);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
