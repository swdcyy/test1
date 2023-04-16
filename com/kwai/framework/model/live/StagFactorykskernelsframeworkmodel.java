package com.kwai.framework.model.live.StagFactorykskernelsframeworkmodel;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.live.LiveTipInfo;
import com.kwai.framework.model.live.LiveTipInfo$TypeAdapter;

public final class StagFactorykskernelsframeworkmodel implements j	// class@0016c4
{

    public void StagFactorykskernelsframeworkmodel(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykskernelsframeworkmodel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == LiveTipInfo.class) {
          return new LiveTipInfo$TypeAdapter(p0);
       }
       return null;
    }
}
