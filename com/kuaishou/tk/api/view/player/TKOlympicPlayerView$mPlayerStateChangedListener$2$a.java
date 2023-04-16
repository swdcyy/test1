package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$mPlayerStateChangedListener$2$a;
import com.kwai.framework.player.core.b$b;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$mPlayerStateChangedListener$2;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;

public final class TKOlympicPlayerView$mPlayerStateChangedListener$2$a implements b$b	// class@000fa8
{
    public final TKOlympicPlayerView$mPlayerStateChangedListener$2 b;

    public void TKOlympicPlayerView$mPlayerStateChangedListener$2$a(TKOlympicPlayerView$mPlayerStateChangedListener$2 p0){
       this.b = p0;
       super();
    }
    public final void d(int p0){
       TKOlympicPlayerView$mPlayerStateChangedListener$2$a omPlayerStat = TKOlympicPlayerView$mPlayerStateChangedListener$2$a.class;
       if (PatchProxy.isSupport(omPlayerStat) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, omPlayerStat, "1")) {
          return;
       }
       TKOlympicPlayerView o = this.b.this$0.O;
       if (o != null) {
          o.d(p0);
       }
       return;
    }
}
