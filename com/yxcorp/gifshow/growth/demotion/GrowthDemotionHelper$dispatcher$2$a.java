package com.yxcorp.gifshow.growth.demotion.GrowthDemotionHelper$dispatcher$2$a;
import z1.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.detail.wolverine.activity.ActivityAnimLevel;

public final class GrowthDemotionHelper$dispatcher$2$a implements k	// class@001361
{
    public static final GrowthDemotionHelper$dispatcher$2$a b;

    static {
       GrowthDemotionHelper$dispatcher$2$a.b = new GrowthDemotionHelper$dispatcher$2$a();
    }
    public void GrowthDemotionHelper$dispatcher$2$a(){
       super();
    }
    public Object get(){
       String str = PatchProxy.apply(null, this, GrowthDemotionHelper$dispatcher$2$a.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          str = a.t().c("growthAnimDemotionConfig", ActivityAnimLevel.DEFAULT.getKey());
       }
       return str;
    }
}
