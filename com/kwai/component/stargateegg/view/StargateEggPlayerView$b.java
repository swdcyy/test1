package com.kwai.component.stargateegg.view.StargateEggPlayerView$b;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import qsd.d;

public final class StargateEggPlayerView$b implements IMediaPlayer$OnBufferingUpdateListener	// class@000b4b
{
    public final StargateEggPlayerView a;

    public void StargateEggPlayerView$b(StargateEggPlayerView p0){
       this.a = p0;
       super();
    }
    public final void onBufferingUpdate(IMediaPlayer p0,int p1){
       StargateEggPlayerView$b uob = StargateEggPlayerView$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       this.a.a();
       StargateEggPlayerView$b ta = this.a;
       ta.H = p1;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(StargateEggPlayerView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), ta, StargateEggPlayerView.class, "14")) {
          ta.w = d.G0(((double)(ta.v * (long)p1) / 100.00f));
       }
       return;
    }
}
