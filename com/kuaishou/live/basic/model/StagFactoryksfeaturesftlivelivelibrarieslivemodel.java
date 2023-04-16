package com.kuaishou.live.basic.model.StagFactoryksfeaturesftlivelivelibrarieslivemodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.basic.model.CheckResolutionResponse;
import com.kuaishou.live.basic.model.CheckResolutionResponse$TypeAdapter;

public final class StagFactoryksfeaturesftlivelivelibrarieslivemodel implements j	// class@000ce0
{

    public void StagFactoryksfeaturesftlivelivelibrarieslivemodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftlivelivelibrarieslivemodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == CheckResolutionResponse.class) {
          return new CheckResolutionResponse$TypeAdapter(p0);
       }
       return null;
    }
}
