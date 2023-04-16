package com.kuaishou.live.ad.fanstop.NeoPendentType$VIDEO_DETAIL_NEO_LIVE;
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

public final class NeoPendentType$VIDEO_DETAIL_NEO_LIVE extends NeoPendentType	// class@000999
{

    public void NeoPendentType$VIDEO_DETAIL_NEO_LIVE(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean valid(LiveAdNeoMerchantParam p0,LiveBizParam p1,PhotoAdvertisement p2){
       PhotoAdvertisement$AdData mInspireAdIn;
       LiveAdNeoParam liveAdNeoPar = null;
       PhotoAdvertisement mAdLiveForFa = (p2 != null)? p2.mAdLiveForFansTop: liveAdNeoPar;
       if (mAdLiveForFa != null) {
          PhotoAdvertisement$FanstopLiveInfo mFeedFlowAdN = mAdLiveForFa.mFeedFlowAdNeoParam;
          if (mFeedFlowAdN != null) {
             liveAdNeoPar = mFeedFlowAdN.mStartParam;
          }
       }
       boolean b = false;
       liveAdNeoPar = (liveAdNeoPar != null)? 1: 0;
       if (mAdLiveForFa != null) {
          PhotoAdvertisement$FanstopLiveInfo mAdData = mAdLiveForFa.mAdData;
          if (mAdData != null) {
             mInspireAdIn = mAdData.mInspireAdInfo;
             if (mInspireAdIn != null && mInspireAdIn.mPendantScene == 1) {
                mInspireAdIn = 1;
             label_0027 :
                if (liveAdNeoPar && mInspireAdIn) {
                   b = true;
                }
                return b;
             }
          }
       }
       mInspireAdIn = 0;
       goto label_0027 ;
    }
}
