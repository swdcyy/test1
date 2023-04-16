package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$onCountDownEnd$5;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.response.magnetic.ProvideNeoInfo$Data;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yx.j0;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;

public final class LiveAudienceAdNeoPendantPresenter$onCountDownEnd$5 extends Lambda implements l	// class@000978
{
    public final LiveAudienceAdNeoPendantPresenter this$0;

    public void LiveAudienceAdNeoPendantPresenter$onCountDownEnd$5(LiveAudienceAdNeoPendantPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(ProvideNeoInfo$Data p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceAdNeoPendantPresenter$onCountDownEnd$5.class, "1")) {
          return;
       }
       a.p(p0, "it");
       Object[] objArray = new Object[0];
       j0.f("LiveAudienceAdNeoPendantPresenter", "report neo countdown success", objArray);
       LiveAudienceAdNeoPendantPresenter z = this.this$0.z;
       if (z != null) {
          PhotoAdvertisement mAdLiveForFa = z.mAdLiveForFansTop;
          if (mAdLiveForFa != null) {
             mAdLiveForFa.mHasCountdownReported = true;
          }
       }
       return;
    }
}
