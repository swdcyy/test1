package com.kuaishou.live.ad.fanstop.NeoPendentType$FEEDS_TO_LIVE_NEO;
import com.kuaishou.live.ad.fanstop.NeoPendentType;
import java.lang.String;
import nsd.u;
import com.kwai.feature.api.live.base.model.LiveAdNeoMerchantParam;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$InspireAdInfo;

public final class NeoPendentType$FEEDS_TO_LIVE_NEO extends NeoPendentType	// class@000996
{

    public void NeoPendentType$FEEDS_TO_LIVE_NEO(String p0,int p1){
       super(p0, p1, null);
    }
    public boolean valid(LiveAdNeoMerchantParam p0,LiveBizParam p1,PhotoAdvertisement p2){
       boolean b = true;
       if (p2 != null) {
          PhotoAdvertisement mAdLiveForFa = p2.mAdLiveForFansTop;
          if (mAdLiveForFa != null) {
             PhotoAdvertisement$FanstopLiveInfo mAdData = mAdLiveForFa.mAdData;
             if (mAdData != null) {
                PhotoAdvertisement$AdData mInspireAdIn = mAdData.mInspireAdInfo;
                if (mInspireAdIn != null && mInspireAdIn.mSourceType == b) {
                label_0015 :
                   return b;
                }
             }
          }
       }
       b = false;
       goto label_0015 ;
    }
}
