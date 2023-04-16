package com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter$b;
import com.kwai.video.waynelive.listeners.LivePlayerStateChangeListener;
import com.kuaishou.live.ad.fanstop.LiveMultiTriggeringNeoPendantPresenter;
import java.lang.Object;
import com.kwai.video.waynelive.LivePlayerState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;

public final class LiveMultiTriggeringNeoPendantPresenter$b implements LivePlayerStateChangeListener	// class@000987
{
    public final LiveMultiTriggeringNeoPendantPresenter b;

    public void LiveMultiTriggeringNeoPendantPresenter$b(LiveMultiTriggeringNeoPendantPresenter p0){
       this.b = p0;
       super();
    }
    public final void onStateChange(LivePlayerState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiTriggeringNeoPendantPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "newState");
       if (p0 == LivePlayerState.PLAYING && this.b.S8()) {
          this.b.e9();
       }else if(p0 == LivePlayerState.STOP){
          this.b.Y8();
          this.b.W8().c();
          this.b.W8().g1();
       }
       return;
    }
}
