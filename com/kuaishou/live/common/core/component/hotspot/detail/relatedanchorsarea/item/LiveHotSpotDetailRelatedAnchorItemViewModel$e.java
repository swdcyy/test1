package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$e;
import z0.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailRelatedAnchorData$AuthorInfo;
import java.lang.Boolean;

public final class LiveHotSpotDetailRelatedAnchorItemViewModel$e implements a	// class@001401
{

    public void LiveHotSpotDetailRelatedAnchorItemViewModel$e(){
       super();
    }
    public final Object apply(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveHotSpotDetailRelatedAnchorItemViewModel$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Boolean.valueOf(p0.following);
    }
}
