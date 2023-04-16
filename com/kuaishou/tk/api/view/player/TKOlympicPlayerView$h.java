package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$h;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class TKOlympicPlayerView$h implements IMediaPlayer$OnSeekCompleteListener	// class@000fa2
{
    public final TKOlympicPlayerView a;

    public void TKOlympicPlayerView$h(TKOlympicPlayerView p0){
       this.a = p0;
       super();
    }
    public final void onSeekComplete(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKOlympicPlayerView$h.class, "1")) {
          return;
       }
       p0.r = 0;
       return;
    }
}
