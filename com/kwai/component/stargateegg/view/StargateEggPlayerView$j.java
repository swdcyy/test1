package com.kwai.component.stargateegg.view.StargateEggPlayerView$j;
import com.kwai.video.cache.AwesomeCacheCallback;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import com.kwai.video.cache.AcCallBackInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.framework.player.core.b;
import java.util.Objects;
import com.kwai.component.stargateegg.stargate.StargatePlayerLogger;

public final class StargateEggPlayerView$j extends AwesomeCacheCallback	// class@000b5a
{
    public final StargateEggPlayerView a;

    public void StargateEggPlayerView$j(StargateEggPlayerView p0){
       this.a = p0;
       super();
    }
    public void onDownloadFinish(AcCallBackInfo p0){
       StargateEggPlayerView a;
       if (PatchProxy.applyVoidOneRefs(p0, this, StargateEggPlayerView$j.class, "2")) {
          return;
       }
       a.p(p0, "info");
       StargateEggPlayerView$j ta = this.a;
       StargateEggPlayerView r = ta.R;
       a = ta.A;
       IKwaiMediaPlayer iKwaiMediaPl = (a != null)? a.getIKwaiMediaPlayer(): null;
       Objects.requireNonNull(r);
       if (!PatchProxy.applyVoidTwoRefs(iKwaiMediaPl, p0, r, StargatePlayerLogger.class, "3")) {
          a.p(p0, "info");
       }
       return;
    }
    public void onSessionProgress(AcCallBackInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StargateEggPlayerView$j.class, "1")) {
          return;
       }
       a.p(p0, "info");
       return;
    }
}
