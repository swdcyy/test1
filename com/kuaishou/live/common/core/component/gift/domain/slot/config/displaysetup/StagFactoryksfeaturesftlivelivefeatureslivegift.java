package com.kuaishou.live.common.core.component.gift.domain.slot.config.displaysetup.StagFactoryksfeaturesftlivelivefeatureslivegift;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.domain.slot.config.displaysetup.LiveGiftDisplayConfig;
import com.kuaishou.live.common.core.component.gift.domain.slot.config.displaysetup.LiveGiftDisplayConfig$TypeAdapter;

public final class StagFactoryksfeaturesftlivelivefeatureslivegift implements j	// class@00125e
{

    public void StagFactoryksfeaturesftlivelivefeatureslivegift(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftlivelivefeatureslivegift.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == LiveGiftDisplayConfig.class) {
          return new LiveGiftDisplayConfig$TypeAdapter(p0);
       }
       return null;
    }
}
