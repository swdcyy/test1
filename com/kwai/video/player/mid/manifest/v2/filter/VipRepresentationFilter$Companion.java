package com.kwai.video.player.mid.manifest.v2.filter.VipRepresentationFilter$Companion;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.player.mid.manifest.v2.filter.VipRepresentationFilter;
import java.util.concurrent.CopyOnWriteArraySet;

public final class VipRepresentationFilter$Companion	// class@000b7c
{

    public void VipRepresentationFilter$Companion(){
       super();
    }
    public void VipRepresentationFilter$Companion(u p0){
       super();
    }
    public final boolean shouldParseConfig(){
       Object obj = PatchProxy.apply(null, this, VipRepresentationFilter$Companion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (VipRepresentationFilter.adTypeList.isEmpty() || VipRepresentationFilter.plcTypeList.isEmpty())? true: false;
       return b;
    }
}
