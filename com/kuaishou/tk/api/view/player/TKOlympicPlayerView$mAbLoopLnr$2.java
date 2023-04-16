package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$mAbLoopLnr$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
import com.kwai.video.player.IMediaPlayer$OnABLoopEndOfCounterListener;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView$mAbLoopLnr$2$a;

public final class TKOlympicPlayerView$mAbLoopLnr$2 extends Lambda implements a	// class@000fa7
{
    public final TKOlympicPlayerView this$0;

    public void TKOlympicPlayerView$mAbLoopLnr$2(TKOlympicPlayerView p0){
       this.this$0 = p0;
       super(0);
    }
    public final IMediaPlayer$OnABLoopEndOfCounterListener invoke(){
       Object obj = PatchProxy.apply(null, this, TKOlympicPlayerView$mAbLoopLnr$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new TKOlympicPlayerView$mAbLoopLnr$2$a(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
