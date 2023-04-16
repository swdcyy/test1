package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter$b;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoMerchantPendantPresenter;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;
import yx.j0;
import wkd.b;
import ql9.f;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.y0;

public final class LiveAudienceAdNeoMerchantPendantPresenter$b implements LivePlayerStateChangeListener	// class@00095b
{
    public final LiveAudienceAdNeoMerchantPendantPresenter b;

    public void LiveAudienceAdNeoMerchantPendantPresenter$b(LiveAudienceAdNeoMerchantPendantPresenter p0){
       this.b = p0;
       super();
    }
    public final void onStateChange(LivePlayerState p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceAdNeoMerchantPendantPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "newState");
       if (p0 == LivePlayerState.PLAYING) {
          LiveAudienceAdNeoMerchantPendantPresenter t = this.b.t;
          if (t == null) {
             a.S("mHostFragment");
          }
          Lifecycle lifecycle = t.getLifecycle();
          a.o(lifecycle, "mHostFragment.lifecycle");
          if (lifecycle.getCurrentState() == Lifecycle$State.RESUMED) {
             objArray = new Object[0];
             j0.f("LiveAudienceAdNeoMerchantPendant", "player start play", objArray);
             b.a(-618875779).i();
          }else if(p0 == LivePlayerState.STOP && !y0.o(this.b.getActivity())){
             objArray = new Object[0];
             j0.f("LiveAudienceAdNeoMerchantPendant", "player stop", objArray);
             b.a(-618875779).e();
          }else if(p0 == LivePlayerState.DESTROY){
             objArray = new Object[0];
             j0.f("LiveAudienceAdNeoMerchantPendant", "player destroy", objArray);
             this.b.R8();
          }
       }else {
          goto label_0047 ;
       }
       return;
    }
}
