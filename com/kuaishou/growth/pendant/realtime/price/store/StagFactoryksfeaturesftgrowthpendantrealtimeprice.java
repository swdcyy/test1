package com.kuaishou.growth.pendant.realtime.price.store.StagFactoryksfeaturesftgrowthpendantrealtimeprice;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import af0.a;
import com.kuaishou.growth.pendant.realtime.price.store.PrtpPreference$TypeAdapter;

public final class StagFactoryksfeaturesftgrowthpendantrealtimeprice implements j	// class@0006d2
{

    public void StagFactoryksfeaturesftgrowthpendantrealtimeprice(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftgrowthpendantrealtimeprice.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == a.class) {
          return new PrtpPreference$TypeAdapter(p0);
       }
       return null;
    }
}
