package com.kuaishou.live.core.basic.model.StagFactoryksfeaturesftlivelive;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo;
import com.kuaishou.live.core.basic.model.QLivePushEndInfo$TypeAdapter;

public final class StagFactoryksfeaturesftlivelive implements j	// class@0008bb
{

    public void StagFactoryksfeaturesftlivelive(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftlivelive.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == QLivePushEndInfo.class) {
          return new QLivePushEndInfo$TypeAdapter(p0);
       }
       return null;
    }
}
