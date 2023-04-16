package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoBottomPendantPresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoBottomPendantPresenter;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ks3.r;
import mxb.j0;
import mxb.i0;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.LiveAdNeoParam;
import com.kuaishou.android.model.ads.LiveAdNeoParam$TaskInfoParam;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoBottomPendantPresenter$onBind$1$a;
import erd.g;

public final class LiveAudienceAdNeoBottomPendantPresenter$onBind$1 extends Lambda implements l	// class@000958
{
    public final LiveAudienceAdNeoBottomPendantPresenter this$0;

    public void LiveAudienceAdNeoBottomPendantPresenter$onBind$1(LiveAudienceAdNeoBottomPendantPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       LiveAdNeoParam$TaskInfoParam mExtData;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceAdNeoBottomPendantPresenter$onBind$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       LiveAudienceAdNeoBottomPendantPresenter r = this.this$0.r;
       if (r == null) {
          a.S("mMerchantBottomBarService");
       }
       r.f();
       j0 oj0 = i0.a().e(307, LiveAudienceAdNeoBottomPendantPresenter.P8(this.this$0).mPhoto);
       LiveAudienceAdNeoBottomPendantPresenter p = this.this$0.p;
       if (p != null) {
          LiveAdNeoParam mTaskInfoPar = p.mTaskInfoParam;
          if (mTaskInfoPar != null) {
             mExtData = mTaskInfoPar.mExtData;
          label_003e :
             oj0.q("neo_ext_data", mExtData).d(LiveAudienceAdNeoBottomPendantPresenter$onBind$1$a.b).a();
             return;
          }
       }
       mExtData = null;
       goto label_003e ;
    }
}
