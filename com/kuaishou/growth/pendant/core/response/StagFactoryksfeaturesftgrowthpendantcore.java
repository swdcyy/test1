package com.kuaishou.growth.pendant.core.response.StagFactoryksfeaturesftgrowthpendantcore;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.growth.pendant.core.response.PendantCommonParams;
import com.kuaishou.growth.pendant.core.response.PendantCommonParams$TypeAdapter;

public final class StagFactoryksfeaturesftgrowthpendantcore implements j	// class@000652
{

    public void StagFactoryksfeaturesftgrowthpendantcore(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftgrowthpendantcore.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == PendantCommonParams.class) {
          return new PendantCommonParams$TypeAdapter(p0);
       }
       return null;
    }
}
