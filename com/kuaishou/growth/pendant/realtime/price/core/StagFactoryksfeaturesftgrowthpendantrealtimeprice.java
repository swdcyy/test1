package com.kuaishou.growth.pendant.realtime.price.core.StagFactoryksfeaturesftgrowthpendantrealtimeprice;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import we0.n;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpStartupConfig$TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpRatioRangeConfig;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpRatioRangeConfig$TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpInferResult;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpInferResult$TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpAfkReportSwitchConfig;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpAfkReportSwitchConfig$TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpReportSwitchConfig;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpReportSwitchConfig$TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpSwitchConfig;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpSwitchConfig$TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpActivityConfig;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpActivityConfig$TypeAdapter;

public final class StagFactoryksfeaturesftgrowthpendantrealtimeprice implements j	// class@0006bb
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
       if (rawType == n.class) {
          return new PrtpStartupConfig$TypeAdapter(p0);
       }
       if (rawType == PrtpRatioRangeConfig.class) {
          return new PrtpRatioRangeConfig$TypeAdapter(p0);
       }
       if (rawType == PrtpInferResult.class) {
          return new PrtpInferResult$TypeAdapter(p0);
       }
       if (rawType == PrtpAfkReportSwitchConfig.class) {
          return new PrtpAfkReportSwitchConfig$TypeAdapter(p0);
       }
       if (rawType == PrtpReportSwitchConfig.class) {
          return new PrtpReportSwitchConfig$TypeAdapter(p0);
       }
       if (rawType == PrtpSwitchConfig.class) {
          return new PrtpSwitchConfig$TypeAdapter(p0);
       }
       if (rawType == PrtpActivityConfig.class) {
          return new PrtpActivityConfig$TypeAdapter(p0);
       }
       return null;
    }
}
