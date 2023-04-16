package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter;
import java.lang.Object;
import msd.a;
import java.lang.Number;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1$a;
import java.lang.Runnable;
import ekd.k1;

public final class LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1 extends Lambda implements p	// class@000962
{
    public final LiveAudienceAdNeoMerchantPendantPresenter this$0;

    public void LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1(LiveAudienceAdNeoMerchantPendantPresenter p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       this.invoke(p0, p1.longValue());
       return l1.a;
    }
    public final void invoke(a p0,long p1){
       if (PatchProxy.isSupport(LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1.class) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1.class, "1")) {
          return;
       }
       a.p(p0, "callback");
       ActivityContext uActivityCon = ActivityContext.g();
       a.o(uActivityCon, "ActivityContext.getInstance\(\)");
       if (a.g(uActivityCon.e(), this.this$0.getActivity())) {
          k1.p(new LiveAudienceAdNeoMerchantPendantPresenter$mStartSuccessAnimation$1$a(this, p1, p0), this.this$0);
       }
       return;
    }
}
