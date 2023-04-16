package com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter$b;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.ad.fanstop.LiveAudienceAdNeoPendantPresenter;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import yx.j0;
import java.util.Objects;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;

public final class LiveAudienceAdNeoPendantPresenter$b implements LivePlayerStateChangeListener	// class@000967
{
    public final LiveAudienceAdNeoPendantPresenter b;

    public void LiveAudienceAdNeoPendantPresenter$b(LiveAudienceAdNeoPendantPresenter p0){
       this.b = p0;
       super();
    }
    public final void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceAdNeoPendantPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "newState");
       Object[] objArray = new Object[0];
       j0.f("LiveAudienceAdNeoPendantPresenter", "Live player state: "+p0, objArray);
       if (p0 == LivePlayerState.PLAYING) {
          this.b.d9();
       }else if(p0 == LivePlayerState.STOP){
          LiveAudienceAdNeoPendantPresenter$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, LiveAudienceAdNeoPendantPresenter.class, "15")) {
             tb.e9();
             tb.X8().c();
             tb.X8().g1();
          }
       }
       return;
    }
}
