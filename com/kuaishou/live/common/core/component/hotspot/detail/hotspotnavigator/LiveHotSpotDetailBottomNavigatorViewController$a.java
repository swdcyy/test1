package com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewController$a;
import androidx.lifecycle.Observer;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewController;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailNavigatorModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fn1.a;
import fn1.b;
import un1.k;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.common.core.component.hotspot.detail.hotspotnavigator.LiveHotSpotDetailBottomNavigatorViewController$onCreate$1$1;
import msd.l;

public final class LiveHotSpotDetailBottomNavigatorViewController$a implements Observer	// class@0013b1
{
    public final LiveHotSpotDetailBottomNavigatorViewController b;

    public void LiveHotSpotDetailBottomNavigatorViewController$a(LiveHotSpotDetailBottomNavigatorViewController p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailBottomNavigatorViewController$a.class, "1")) {
       }else {
          p0 = this.b;
          if (p0.j == null) {
             p0.j = true;
             a.a.d("LIVE_HOTSPOT_DATAIL_BOTTOM_BAR", p0.l.E0(), this.b.l.a(), LiveHotSpotDetailBottomNavigatorViewController$onCreate$1$1.INSTANCE);
          }
       }
       return;
    }
}
