package com.kuaishou.tk.api.view.player.TKOlympicPlayerView$c;
import com.kwai.video.player.IMediaPlayer$OnCompletionListener;
import com.kuaishou.tk.api.view.player.TKOlympicPlayerView;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import yx4.a;
import android.widget.FrameLayout;

public final class TKOlympicPlayerView$c implements IMediaPlayer$OnCompletionListener	// class@000f98
{
    public final TKOlympicPlayerView b;

    public void TKOlympicPlayerView$c(TKOlympicPlayerView p0){
       this.b = p0;
       super();
    }
    public final void onCompletion(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKOlympicPlayerView$c.class, "1")) {
          return;
       }
       TKOlympicPlayerView$c tb = this.b;
       tb.c = 4;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, TKOlympicPlayerView.class, "18")) {
          TKOlympicPlayerView r = tb.R;
          if (r != null) {
             r.a();
          }
          tb.x = true;
          if (tb.m == null) {
             tb.setKeepScreenOn(false);
          }
          tb.c();
       }
       return;
    }
}
