package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$releasePlayer$1$a;
import ai7.e;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$releasePlayer$1;
import java.lang.Object;
import com.kwai.player.qos.KwaiPlayerResultQos;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tk.api.view.player.a;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
import xx4.a;

public final class TKOlympicPlayerView$releasePlayer$1$a implements e	// class@000fab
{
    public final TKOlympicPlayerView$releasePlayer$1 a;

    public void TKOlympicPlayerView$releasePlayer$1$a(TKOlympicPlayerView$releasePlayer$1 p0){
       this.a = p0;
       super();
    }
    public final void onRelease(KwaiPlayerResultQos p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKOlympicPlayerView$releasePlayer$1$a.class, "1")) {
          return;
       }
       a.b("TKOlympicPlayer", "mediaPlayer released async.\n");
       TKOlympicPlayerView$releasePlayer$1 this$0 = this.a.this$0;
       this$0.M.c(p0, this$0.v, this$0.K, this$0.f, this$0.L);
       return;
    }
}
