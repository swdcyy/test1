package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$c;
import erd.g;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter;
import java.lang.Object;
import ln1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fn1.a;
import fn1.b;
import un1.k;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$3$1;
import msd.l;
import com.yxcorp.gifshow.log.c0;
import com.kwai.framework.model.feed.BaseFeed;

public final class LiveHotSpotDetailCoreMediaAdapter$c implements g	// class@001379
{
    public final LiveHotSpotDetailCoreMediaAdapter b;

    public void LiveHotSpotDetailCoreMediaAdapter$c(LiveHotSpotDetailCoreMediaAdapter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailCoreMediaAdapter$c.class, "1")) {
       }else {
          a.a.d("LIVE_HOTSPOT_DATAIL_CORE_CONTENT", this.b.m.E0(), this.b.m.a(), new LiveHotSpotDetailCoreMediaAdapter$3$1(this, p0));
          c0.q().k(p0.getBaseFeed());
       }
       return;
    }
}
