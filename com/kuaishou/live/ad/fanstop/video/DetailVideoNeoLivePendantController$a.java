package com.kuaishou.live.ad.fanstop.video.DetailVideoNeoLivePendantController$a;
import java.lang.Object;
import nsd.u;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.ad.fanstop.NeoPendentType;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.ad.fanstop.NeoPendentType$a;

public final class DetailVideoNeoLivePendantController$a	// class@0009ab
{

    public void DetailVideoNeoLivePendantController$a(){
       super();
    }
    public void DetailVideoNeoLivePendantController$a(u p0){
       super();
    }
    public final boolean a(BaseFeed p0){
       NeoPendentType$a obj = PatchProxy.applyOneRefs(p0, this, DetailVideoNeoLivePendantController$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = NeoPendentType.Companion;
       NeoPendentType vIDEO_DETAIL = NeoPendentType.VIDEO_DETAIL_NEO_LIVE;
       PhotoAdvertisement photoAdverti = (p0 != null)? p0.get("AD"): null;
       return obj.a(vIDEO_DETAIL, null, null, photoAdverti);
    }
}
