package com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusDeserializer;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$BaseTaskStatus;
import kotlin.jvm.internal.a;
import com.google.gson.JsonObject;
import ekd.k0;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$ShopOrderTaskStatus;
import com.yxcorp.gifshow.ad.award.flow.model.NeoTaskStatusResponse$WatchLiveTaskStatus;
import fg6.a;
import com.google.gson.Gson;

public final class NeoTaskStatusDeserializer implements b	// class@00103b
{

    public void NeoTaskStatusDeserializer(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       NeoTaskStatusResponse$BaseTaskStatus uBaseTaskSta;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, NeoTaskStatusDeserializer.class, "1");
       if (p2 != PatchProxyResult.class) {
       }else {
          a.p(p0, "json");
          a.p(p1, "typeOfT");
          int i = k0.f(p0.r(), "type", 0);
          if (i != 1) {
             uBaseTaskSta = (i != 2)? NeoTaskStatusResponse$BaseTaskStatus.class: NeoTaskStatusResponse$ShopOrderTaskStatus.class;
          }else {
             uBaseTaskSta = NeoTaskStatusResponse$WatchLiveTaskStatus.class;
          }
          p0 = a.a.c(p0, uBaseTaskSta);
          a.o(p0, "Gsons.KWAI_GSON.fromJson\(json, modelClass\)");
          p2 = p0;
       }
       return p2;
    }
}
