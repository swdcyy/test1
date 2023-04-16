package com.kwai.video.player.mid.manifest.v2.filter.VipRepresentationFilterV2$Companion;
import java.lang.Object;
import nsd.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.player.mid.manifest.v2.filter.VipRepresentationFilterV2;
import java.util.concurrent.CopyOnWriteArraySet;

public final class VipRepresentationFilterV2$Companion	// class@000b7e
{

    public void VipRepresentationFilterV2$Companion(){
       super();
    }
    public void VipRepresentationFilterV2$Companion(u p0){
       super();
    }
    public final boolean shouldParseConfig(){
       Object obj = PatchProxy.apply(null, this, VipRepresentationFilterV2$Companion.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (VipRepresentationFilterV2.adTypeList.isEmpty() || VipRepresentationFilterV2.plcTypeList.isEmpty())? true: false;
       return b;
    }
}
