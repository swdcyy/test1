package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$mAbLoopLnr$2$a;
import com.kwai.video.player.IMediaPlayer$OnABLoopEndOfCounterListener;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$mAbLoopLnr$2;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;

public final class TKOlympicPlayerView$mAbLoopLnr$2$a implements IMediaPlayer$OnABLoopEndOfCounterListener	// class@000fa6
{
    public final TKOlympicPlayerView$mAbLoopLnr$2 a;

    public void TKOlympicPlayerView$mAbLoopLnr$2$a(TKOlympicPlayerView$mAbLoopLnr$2 p0){
       this.a = p0;
       super();
    }
    public final void onABLoopEndOfCounter(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKOlympicPlayerView$mAbLoopLnr$2$a.class, "1")) {
          return;
       }
       TKOlympicPlayerView s = this.a.this$0.S;
       if (s != null) {
          s.onABLoopEndOfCounter(p0);
       }
       return;
    }
}
