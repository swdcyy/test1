package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$releasePlayer$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
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
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$releasePlayer$1$a;
import ai7.e;

public final class TKOlympicPlayerView$releasePlayer$1 extends Lambda implements a	// class@000fac
{
    public final TKOlympicPlayerView this$0;

    public void TKOlympicPlayerView$releasePlayer$1(TKOlympicPlayerView p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, TKOlympicPlayerView$releasePlayer$1.class, "1")) {
          return;
       }
       TKOlympicPlayerView$releasePlayer$1 tthis$0 = this.this$0;
       if (tthis$0.A != null) {
          tthis$0.c();
          tthis$0 = this.this$0;
          TKOlympicPlayerView b = tthis$0.B;
          if (b != null) {
             b.b(tthis$0.U0);
          }
          tthis$0 = this.this$0;
          tthis$0.n = true;
          tthis$0.x = true;
          tthis$0.c = -2;
          tthis$0.i = false;
          tthis$0.O = null;
          tthis$0.Q = null;
          tthis$0.b1 = null;
          tthis$0.R = null;
          tthis$0.Y0 = null;
          b = tthis$0.A;
          if (b != null) {
             b.O(tthis$0.getMPlayerStateChangedListener());
          }
          TKOlympicPlayerView a = this.this$0.A;
          if (a != null) {
             IKwaiMediaPlayer iKwaiMediaPl = a.getIKwaiMediaPlayer();
             if (iKwaiMediaPl != null) {
                iKwaiMediaPl.setOnABLoopEndOfCounterListener(null);
             }
          }
          a = this.this$0.A;
          if (a != null) {
             a.releaseAsync(new TKOlympicPlayerView$releasePlayer$1$a(this));
          }
          this.this$0.A = null;
       }
       return;
    }
}
