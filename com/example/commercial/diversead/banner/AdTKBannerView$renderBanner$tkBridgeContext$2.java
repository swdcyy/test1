package com.example.commercial.diversead.banner.AdTKBannerView$renderBanner$tkBridgeContext$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.example.commercial.diversead.banner.AdTKBannerView;
import java.lang.Object;
import java.util.Map;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;

public final class AdTKBannerView$renderBanner$tkBridgeContext$2 extends Lambda implements a	// class@00102c
{
    public final AdTKBannerView this$0;

    public void AdTKBannerView$renderBanner$tkBridgeContext$2(AdTKBannerView p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       PhotoAdvertisement$AdData mPlayedRepor;
       PhotoAdvertisement photoAdverti = k.B(this.this$0.m);
       AdTKBannerView n = this.this$0.n;
       PhotoAdvertisement$AdData uAdData = null;
       if (photoAdverti != null) {
          PhotoAdvertisement mAdData = photoAdverti.mAdData;
          if (mAdData != null) {
             mPlayedRepor = mAdData.mPlayedReportTime;
          label_0017 :
             n.put("playedReportTime", mPlayedRepor);
             if (photoAdverti != null) {
                photoAdverti = photoAdverti.mAdData;
                if (photoAdverti != null) {
                   uAdData = photoAdverti.mPlayedReportRate;
                }
             }
             n.put("playedReportRate", uAdData);
             return n;
          }
       }
       mPlayedRepor = uAdData;
       goto label_0017 ;
    }
}
