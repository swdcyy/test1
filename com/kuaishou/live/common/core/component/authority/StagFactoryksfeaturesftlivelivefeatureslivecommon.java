package com.kuaishou.live.common.core.component.authority.StagFactoryksfeaturesftlivelivefeatureslivecommon;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.authority.LiveAnchorCommonAuthority;
import com.kuaishou.live.common.core.component.authority.LiveAnchorCommonAuthority$TypeAdapter;

public final class StagFactoryksfeaturesftlivelivefeatureslivecommon implements j	// class@000f77
{

    public void StagFactoryksfeaturesftlivelivefeatureslivecommon(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftlivelivefeatureslivecommon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == LiveAnchorCommonAuthority.class) {
          return new LiveAnchorCommonAuthority$TypeAdapter(p0);
       }
       return null;
    }
}
