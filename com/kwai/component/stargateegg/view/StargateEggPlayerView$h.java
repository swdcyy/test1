package com.kwai.component.stargateegg.view.StargateEggPlayerView$h;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class StargateEggPlayerView$h implements IMediaPlayer$OnSeekCompleteListener	// class@000b58
{
    public final StargateEggPlayerView a;

    public void StargateEggPlayerView$h(StargateEggPlayerView p0){
       this.a = p0;
       super();
    }
    public final void onSeekComplete(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StargateEggPlayerView$h.class, "1")) {
          return;
       }
       p0.r = 0;
       return;
    }
}
