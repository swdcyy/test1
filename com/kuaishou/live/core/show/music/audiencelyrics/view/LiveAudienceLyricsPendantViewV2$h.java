package com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$h;
import ekd.f$j;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2;
import com.kuaishou.live.core.show.music.audiencelyrics.LivePendantLyricsView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ScrollView;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView;
import android.view.ViewGroup;

public final class LiveAudienceLyricsPendantViewV2$h extends f$j	// class@000d42
{
    public final LiveAudienceLyricsPendantViewV2 a;
    public final LivePendantLyricsView b;

    public void LiveAudienceLyricsPendantViewV2$h(LiveAudienceLyricsPendantViewV2 p0,LivePendantLyricsView p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLyricsPendantViewV2$h.class, "1")) {
          return;
       }
       this.b.setVisibility(8);
       if (a.g(this.b, LiveAudienceLyricsPendantViewV2.k(this.a))) {
          LiveAudienceLyricsPendantView h = this.a.h;
          a.o(h, "mMusicLyricsContainer");
          h.setX((h.getX() + (float)(this.a.getLyricsViewWidth() + this.a.getLeftLyricsViewMarginRight())));
       }
       return;
    }
}
