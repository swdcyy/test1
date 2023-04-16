package com.kwai.component.stargateegg.view.StargateEggPlayerView$d;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class StargateEggPlayerView$d implements IMediaPlayer$OnErrorListener	// class@000b54
{
    public final StargateEggPlayerView b;

    public void StargateEggPlayerView$d(StargateEggPlayerView p0){
       this.b = p0;
       super();
    }
    public final boolean onError(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(StargateEggPlayerView$d.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, StargateEggPlayerView$d.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       StargateEggPlayerView$d tb = this.b;
       tb.c = -1;
       return tb.c(p1, p2);
    }
}
