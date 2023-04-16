package com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$b;
import java.lang.Runnable;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rc2.a;
import java.lang.Enum;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView;
import kotlin.jvm.internal.a;
import android.graphics.PointF;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public final class LiveAudienceLyricsPendantViewV2$b implements Runnable	// class@000d3c
{
    public final LiveAudienceLyricsPendantViewV2 b;

    public void LiveAudienceLyricsPendantViewV2$b(LiveAudienceLyricsPendantViewV2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       LiveAudienceLyricsPendantView h;
       if (PatchProxy.applyVoid(null, this, LiveAudienceLyricsPendantViewV2$b.class, "1")) {
          return;
       }
       LiveAudienceLyricsPendantViewV2$b tb = this.b;
       PointF pointF = 1;
       LiveAudienceLyricsPendantViewV2 liveAudience = (tb.v != null && (tb.w != null && tb.x != null))? 1: null;
       if (!liveAudience) {
          return;
       }else {
          liveAudience = tb.x;
          if (liveAudience != null) {
             LiveAudienceLyricsPendantViewV2 w = tb.w;
             if (w != null) {
                int i = a.a[w.ordinal()];
                if (i != pointF) {
                   if (i != 2) {
                      if (i != 3) {
                         if (i == 4) {
                            h = this.b.h;
                            a.o(h, "mMusicLyricsContainer");
                            h.setX(liveAudience.x);
                            h = this.b.h;
                            a.o(h, "mMusicLyricsContainer");
                            h.setY((liveAudience.y - (float)this.b.getHeight()));
                         }
                      }else {
                         h = this.b.h;
                         a.o(h, "mMusicLyricsContainer");
                         h.setX((liveAudience.x - (float)LiveAudienceLyricsPendantViewV2.G));
                         h = this.b.h;
                         a.o(h, "mMusicLyricsContainer");
                         h.setY(liveAudience.y);
                      }
                   }else {
                      h = this.b.h;
                      a.o(h, "mMusicLyricsContainer");
                      h.setX(liveAudience.x);
                      h = this.b.h;
                      a.o(h, "mMusicLyricsContainer");
                      h.setY((liveAudience.y - (float)this.b.getHeight()));
                   }
                }else {
                   h = this.b.h;
                   a.o(h, "mMusicLyricsContainer");
                   h.setX(liveAudience.x);
                   h = this.b.h;
                   a.o(h, "mMusicLyricsContainer");
                   h.setY(liveAudience.y);
                }
             }
             tb = this.b;
             tb.j(tb.r);
          }
          return;
       }
    }
}
