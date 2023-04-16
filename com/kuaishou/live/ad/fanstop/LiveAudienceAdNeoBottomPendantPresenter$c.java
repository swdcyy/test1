package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoBottomPendantPresenter$c;
import ks3.r$b;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoBottomPendantPresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import pq5.c;
import rq5.a;
import mxb.j0;
import mxb.i0;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoBottomPendantPresenter$c$a;
import erd.g;

public final class LiveAudienceAdNeoBottomPendantPresenter$c implements r$b	// class@000956
{
    public final LiveAudienceAdNeoBottomPendantPresenter a;

    public void LiveAudienceAdNeoBottomPendantPresenter$c(LiveAudienceAdNeoBottomPendantPresenter p0){
       this.a = p0;
       super();
    }
    public final void a(int p0){
       LiveAdNeoParam$TaskInfoParam mExtData;
       LiveAudienceAdNeoBottomPendantPresenter$c uoc = LiveAudienceAdNeoBottomPendantPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (!p0 && this.a.S8()) {
          LiveAudienceAdNeoBottomPendantPresenter.R8(this.a).eo(this.a.u);
          j0 oj0 = i0.a().e(140, LiveAudienceAdNeoBottomPendantPresenter.P8(this.a).mPhoto);
          LiveAudienceAdNeoBottomPendantPresenter p = this.a.p;
          if (p != null) {
             LiveAdNeoParam mTaskInfoPar = p.mTaskInfoParam;
             if (mTaskInfoPar != null) {
                mExtData = mTaskInfoPar.mExtData;
             label_004c :
                oj0.q("neo_ext_data", mExtData).d(LiveAudienceAdNeoBottomPendantPresenter$c$a.b).a();
             }
          }
          mExtData = null;
          goto label_004c ;
       }else {
          LiveAudienceAdNeoBottomPendantPresenter.R8(this.a).g9(this.a.u);
       }
       return;
    }
}
