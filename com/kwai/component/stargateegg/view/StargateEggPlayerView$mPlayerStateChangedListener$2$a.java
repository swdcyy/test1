package com.kwai.component.stargateegg.view.StargateEggPlayerView$mPlayerStateChangedListener$2$a;
import com.kwai.framework.player.core.b$b;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$mPlayerStateChangedListener$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;

public final class StargateEggPlayerView$mPlayerStateChangedListener$2$a implements b$b	// class@000b5d
{
    public final StargateEggPlayerView$mPlayerStateChangedListener$2 b;

    public void StargateEggPlayerView$mPlayerStateChangedListener$2$a(StargateEggPlayerView$mPlayerStateChangedListener$2 p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       StargateEggPlayerView$mPlayerStateChangedListener$2$a omPlayerStat = StargateEggPlayerView$mPlayerStateChangedListener$2$a.class;
       if (PatchProxy.isSupport(omPlayerStat) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, omPlayerStat, "1")) {
          return;
       }
       StargateEggPlayerView t = this.b.this$0.T;
       if (t != null) {
          t.d(p0);
       }
       return;
    }
}
