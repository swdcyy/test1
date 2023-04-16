package com.kuaishou.live.ad.fanstop.NeoPendentType$H5_TO_LIVE_NEO_COMMON;
import com.kuaishou.live.ad.fanstop.NeoPendentType;
import java.lang.String;
import nsd.u;
import com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;

public final class NeoPendentType$H5_TO_LIVE_NEO_COMMON extends NeoPendentType	// class@000997
{

    public void NeoPendentType$H5_TO_LIVE_NEO_COMMON(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean valid(LiveAdNeoMerchantParam p0,LiveBizParam p1,PhotoAdvertisement p2){
       LiveAdNeoParam mStartParam;
       LiveAdNeoParam liveAdNeoPar1;
       LiveAdNeoParam liveAdNeoPar = null;
       p2 = (p2 != null)? p2.mAdLiveForFansTop: liveAdNeoPar;
       if (p2 != null) {
          PhotoAdvertisement$FanstopLiveInfo mFeedFlowAdN = p2.mFeedFlowAdNeoParam;
          if (mFeedFlowAdN != null) {
             mStartParam = mFeedFlowAdN.mStartParam;
          label_0011 :
             boolean b = false;
             if (mStartParam == null) {
                if (p1 != null) {
                   p1 = p1.mAdNeoPendantParam;
                   if (p1 != null) {
                      liveAdNeoPar = p1.mStartParam;
                   }
                }
                if (liveAdNeoPar == null) {
                label_002d :
                   return b;
                }
             }else {
                PhotoAdvertisement$FanstopLiveInfo mAdData = p2.mAdData;
                if (mAdData != null) {
                   PhotoAdvertisement$AdData mInspireAdIn = mAdData.mInspireAdInfo;
                   if (mInspireAdIn != null && mInspireAdIn.mPendantScene == 1) {
                   }
                }
             }
             b = true;
             goto label_002d ;
          }
       }
       mStartParam = liveAdNeoPar;
       goto label_0011 ;
    }
}
