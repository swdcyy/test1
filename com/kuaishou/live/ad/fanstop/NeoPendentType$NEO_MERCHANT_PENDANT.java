package com.kuaishou.live.ad.fanstop.NeoPendentType$NEO_MERCHANT_PENDANT;
import com.kuaishou.live.ad.fanstop.NeoPendentType;
import java.lang.String;
import nsd.u;
import com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.android.model.ads.PhotoAdvertisement;

public final class NeoPendentType$NEO_MERCHANT_PENDANT extends NeoPendentType	// class@000998
{

    public void NeoPendentType$NEO_MERCHANT_PENDANT(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean valid(LiveAdNeoMerchantParam p0,LiveBizParam p1,PhotoAdvertisement p2){
       boolean b = true;
       if (p0 == null || p0.mNeedShowPendant != b) {
          b = false;
       }
       return b;
    }
}
