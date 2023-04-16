package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$mLifecycleObserver$1;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import wkd.b;
import ql9.f;
import kotlin.jvm.internal.a;
import com.kwai.video.waynelive.LivePlayerController;

public final class LiveAudienceAdNeoMerchantPendantPresenter$mLifecycleObserver$1 implements LifecycleObserver	// class@00095d
{
    public final LiveAudienceAdNeoMerchantPendantPresenter b;

    public void LiveAudienceAdNeoMerchantPendantPresenter$mLifecycleObserver$1(LiveAudienceAdNeoMerchantPendantPresenter p0){
       this.b = p0;
       super();
    }
    public final void onPause(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdNeoMerchantPendantPresenter$mLifecycleObserver$1.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("LiveAudienceAdNeoMerchantPendant", "fragment pause", objArray);
       b.a(-618875779).e();
       return;
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceAdNeoMerchantPendantPresenter$mLifecycleObserver$1.class, "1")) {
          return;
       }
       LiveAudienceAdNeoMerchantPendantPresenter q = this.b.q;
       if (q == null) {
          a.S("mLivePlayerController");
       }
       if (q.isPlaying()) {
          Object[] objArray = new Object[0];
          j0.f("LiveAudienceAdNeoMerchantPendant", "fragment resume", objArray);
          b.a(-618875779).i();
       }
       return;
    }
}
