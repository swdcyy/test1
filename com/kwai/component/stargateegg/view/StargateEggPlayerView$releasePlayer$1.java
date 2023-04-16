package com.kwai.component.stargateegg.view.StargateEggPlayerView$releasePlayer$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.stargateegg.view.StargateEggPlayerView;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wx4.a$b;
import wx4.a;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.player.IMediaPlayer$OnABLoopEndOfCounterListener;
import com.kwai.component.stargateegg.view.StargateEggPlayerView$releasePlayer$1$a;
import ai7.e;

public final class StargateEggPlayerView$releasePlayer$1 extends Lambda implements a	// class@000b61
{
    public final StargateEggPlayerView this$0;

    public void StargateEggPlayerView$releasePlayer$1(StargateEggPlayerView p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, StargateEggPlayerView$releasePlayer$1.class, "1")) {
          return;
       }
       StargateEggPlayerView$releasePlayer$1 tthis$0 = this.this$0;
       if (tthis$0.A != null) {
          tthis$0.e();
          tthis$0 = this.this$0;
          StargateEggPlayerView b = tthis$0.B;
          if (b != null) {
             b.b(tthis$0.U0);
          }
          tthis$0 = this.this$0;
          tthis$0.n = true;
          tthis$0.x = true;
          tthis$0.c = -2;
          tthis$0.i = false;
          tthis$0.T = null;
          tthis$0.V = null;
          tthis$0.b1 = null;
          tthis$0.W = null;
          tthis$0.Y0 = null;
          b = tthis$0.A;
          if (b != null) {
             b.O(tthis$0.getMPlayerStateChangedListener());
          }
          StargateEggPlayerView a = this.this$0.A;
          if (a != null) {
             IKwaiMediaPlayer iKwaiMediaPl = a.getIKwaiMediaPlayer();
             if (iKwaiMediaPl != null) {
                iKwaiMediaPl.setOnABLoopEndOfCounterListener(null);
             }
          }
          a = this.this$0.A;
          if (a != null) {
             a.releaseAsync(new StargateEggPlayerView$releasePlayer$1$a(this));
          }
          this.this$0.A = null;
       }
       return;
    }
}
