package com.kwai.video.wayne.player.main.WaynePlayer$1;
import com.kwai.video.wayne.player.listeners.OnPlayerLoadingChangedListener;
import com.kwai.video.wayne.player.main.WaynePlayer;
import java.lang.Object;
import com.kwai.video.wayne.player.main.LoadingType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.video.wayne.player.main.PlayerState;
import java.util.List;
import trd.t;

public final class WaynePlayer$1 implements OnPlayerLoadingChangedListener	// class@000d99
{
    public final WaynePlayer this$0;

    public void WaynePlayer$1(WaynePlayer p0){
       this.this$0 = p0;
       super();
    }
    public void onChanged(boolean p0,LoadingType p1){
       WaynePlayer$1 u1 = WaynePlayer$1.class;
       if (PatchProxy.isSupport(u1) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, u1, "1")) {
          return;
       }
       a.p(p1, "loadingType");
       if (p1 == LoadingType.STATE_FIRSTFRAME && !p0) {
          this.this$0.moveToState(t.k(PlayerState.Preparing), PlayerState.Playing);
       }
       return;
    }
}
