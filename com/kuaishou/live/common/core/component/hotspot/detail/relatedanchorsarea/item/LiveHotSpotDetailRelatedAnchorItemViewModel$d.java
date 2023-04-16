package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$d;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailRelatedAnchorData$AuthorInfo;
import java.lang.Boolean;

public final class LiveHotSpotDetailRelatedAnchorItemViewModel$d implements a	// class@001400
{

    public void LiveHotSpotDetailRelatedAnchorItemViewModel$d(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveHotSpotDetailRelatedAnchorItemViewModel$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Boolean.valueOf(p0.living);
    }
}
