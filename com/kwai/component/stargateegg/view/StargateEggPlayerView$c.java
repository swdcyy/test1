package com.kwai.component.stargateegg.view.StargateEggPlayerView$c;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import wg5.a;
import android.widget.FrameLayout;

public final class StargateEggPlayerView$c implements IMediaPlayer$OnCompletionListener	// class@000b4c
{
    public final StargateEggPlayerView b;

    public void StargateEggPlayerView$c(StargateEggPlayerView p0){
       this.b = p0;
       super();
    }
    public final void onCompletion(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StargateEggPlayerView$c.class, "1")) {
          return;
       }
       StargateEggPlayerView$c tb = this.b;
       tb.c = 4;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, StargateEggPlayerView.class, "15")) {
          StargateEggPlayerView w = tb.W;
          if (w != null) {
             w.a();
          }
          tb.x = true;
          if (tb.m == null) {
             tb.setKeepScreenOn(false);
          }
          tb.e();
       }
       return;
    }
}
