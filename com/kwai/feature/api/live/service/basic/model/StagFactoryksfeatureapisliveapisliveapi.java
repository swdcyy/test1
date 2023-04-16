package com.kwai.feature.api.live.service.basic.model.StagFactoryksfeatureapisliveapisliveapi;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.live.service.basic.model.NebulaLiveAudienceAdWidgetConfig;
import com.kwai.feature.api.live.service.basic.model.NebulaLiveAudienceAdWidgetConfig$TypeAdapter;

public final class StagFactoryksfeatureapisliveapisliveapi implements j	// class@00100c
{

    public void StagFactoryksfeatureapisliveapisliveapi(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeatureapisliveapisliveapi.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == NebulaLiveAudienceAdWidgetConfig.class) {
          return new NebulaLiveAudienceAdWidgetConfig$TypeAdapter(p0);
       }
       return null;
    }
}
