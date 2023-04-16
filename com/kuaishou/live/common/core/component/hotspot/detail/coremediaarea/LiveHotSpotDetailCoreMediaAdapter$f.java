package com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$f;
import erd.g;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter;
import android.app.Activity;
import java.lang.Object;
import hn1.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ln1.b;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import trd.t;
import android.view.View;
import un1.k;
import fn1.a;
import fn1.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.common.core.component.hotspot.detail.coremediaarea.LiveHotSpotDetailCoreMediaAdapter$6$$special$$inlined$let$lambda$1;
import msd.l;

public final class LiveHotSpotDetailCoreMediaAdapter$f implements g	// class@00137c
{
    public final LiveHotSpotDetailCoreMediaAdapter b;
    public final Activity c;

    public void LiveHotSpotDetailCoreMediaAdapter$f(LiveHotSpotDetailCoreMediaAdapter p0,Activity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailCoreMediaAdapter$f.class, "1")) {
       }else {
          BaseFeed baseFeed = p0.a().getBaseFeed();
          if (baseFeed != null && this.b.m.s1(baseFeed, t.k(baseFeed), p0.b, this.c)) {
             a.a.b("LIVE_HOTSPOT_DATAIL_CORE_CONTENT", this.b.m.E0(), this.b.m.a(), new LiveHotSpotDetailCoreMediaAdapter$6$$special$$inlined$let$lambda$1(this, p0));
          }
       }
       return;
    }
}
