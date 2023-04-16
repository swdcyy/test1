package com.kuaishou.live.common.core.component.hotspot.detail.explain.LiveHotSpotDetailExplainLinkItemViewController$logEvent$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailExplainData$HotSpotLinkData;
import java.lang.Object;
import lnc.i3;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveHotSpotDetailExplainLinkItemViewController$logEvent$1 extends Lambda implements l	// class@0013a2
{
    public final LiveHotSpotDetailExplainData$HotSpotLinkData $item;

    public void LiveHotSpotDetailExplainLinkItemViewController$logEvent$1(LiveHotSpotDetailExplainData$HotSpotLinkData p0){
       this.$item = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailExplainLinkItemViewController$logEvent$1.class, "1")) {
          return;
       }
       a.p(p0, "$receiver");
       p0.d("related_hot_id", this.$item.mHotSpotId);
       p0.d("related_hot_name", this.$item.mTitle);
       return;
    }
}
