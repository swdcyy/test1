package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$d;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class TKOlympicPlayerView$d implements IMediaPlayer$OnErrorListener	// class@000f9e
{
    public final TKOlympicPlayerView b;

    public void TKOlympicPlayerView$d(TKOlympicPlayerView p0){
       this.b = p0;
       super();
    }
    public final boolean onError(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(TKOlympicPlayerView$d.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TKOlympicPlayerView$d.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       TKOlympicPlayerView$d tb = this.b;
       tb.c = -1;
       return tb.b(p1, p2);
    }
}
