package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$b;
import com.kwai.video.player.IMediaPlayer$OnBufferingUpdateListener;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import qsd.d;

public final class TKOlympicPlayerView$b implements IMediaPlayer$OnBufferingUpdateListener	// class@000f97
{
    public final TKOlympicPlayerView a;

    public void TKOlympicPlayerView$b(TKOlympicPlayerView p0){
       this.a = p0;
       super();
    }
    public final void onBufferingUpdate(IMediaPlayer p0,int p1){
       TKOlympicPlayerView$b uob = TKOlympicPlayerView$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       TKOlympicPlayerView$b ta = this.a;
       ta.H = p1;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(TKOlympicPlayerView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), ta, TKOlympicPlayerView.class, "17")) {
          ta.w = d.G0(((double)(ta.v * (long)p1) / 100.00f));
       }
       return;
    }
}
