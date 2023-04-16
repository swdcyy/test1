package com.kuaishou.growth.pendant.realtime.price.speed.StagFactoryksfeaturesftgrowthpendantrealtimeprice;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ze0.m;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedTableModel$TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedInferResult;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedInferResult$TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedSwitchConfig;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedSwitchConfig$TypeAdapter;

public final class StagFactoryksfeaturesftgrowthpendantrealtimeprice implements j	// class@0006d0
{

    public void StagFactoryksfeaturesftgrowthpendantrealtimeprice(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftgrowthpendantrealtimeprice.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class rawType = p1.getRawType();
       if (rawType == m.class) {
          return new PrtpSpeedTableModel$TypeAdapter(p0);
       }
       if (rawType == PrtpSpeedInferResult.class) {
          return new PrtpSpeedInferResult$TypeAdapter(p0);
       }
       if (rawType == PrtpSpeedSwitchConfig.class) {
          return new PrtpSpeedSwitchConfig$TypeAdapter(p0);
       }
       return null;
    }
}
