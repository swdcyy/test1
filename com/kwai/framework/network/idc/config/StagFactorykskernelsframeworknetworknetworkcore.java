package com.kwai.framework.network.idc.config.StagFactorykskernelsframeworknetworknetworkcore;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.network.idc.config.ScheduleConfig;
import com.kwai.framework.network.idc.config.ScheduleConfig$TypeAdapter;

public final class StagFactorykskernelsframeworknetworknetworkcore implements j	// class@000c0f
{

    public void StagFactorykskernelsframeworknetworknetworkcore(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykskernelsframeworknetworknetworkcore.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == ScheduleConfig.class) {
          return new ScheduleConfig$TypeAdapter(p0);
       }
       return null;
    }
}
