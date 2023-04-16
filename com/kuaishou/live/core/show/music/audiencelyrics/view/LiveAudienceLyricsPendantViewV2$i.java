package com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$i;
import ekd.f$j;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2;
import com.kuaishou.live.core.show.music.audiencelyrics.LivePendantLyricsView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView;
import java.lang.Boolean;
import android.widget.ScrollView;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;

public final class LiveAudienceLyricsPendantViewV2$i extends f$j	// class@000d43
{
    public final LiveAudienceLyricsPendantViewV2 a;
    public final LivePendantLyricsView b;

    public void LiveAudienceLyricsPendantViewV2$i(LiveAudienceLyricsPendantViewV2 p0,LivePendantLyricsView p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLyricsPendantViewV2$i.class, "2")) {
          return;
       }
       LiveAudienceLyricsPendantViewV2$i ta = this.a;
       ta.k = this.b;
       ta.j(ta.r);
       return;
    }
    public void onAnimationStart(Animator p0,boolean p1){
       if (PatchProxy.isSupport(LiveAudienceLyricsPendantViewV2$i.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, LiveAudienceLyricsPendantViewV2$i.class, "1")) {
          return;
       }
       LiveAudienceLyricsPendantViewV2$i tb = this.b;
       int i = (this.a.t != null)? 4: 0;
       tb.setVisibility(i);
       if (a.g(this.b, LiveAudienceLyricsPendantViewV2.k(this.a))) {
          LiveAudienceLyricsPendantView h = this.a.h;
          a.o(h, "mMusicLyricsContainer");
          h.setX((h.getX() - (float)(this.a.getLyricsViewWidth() + this.a.getLeftLyricsViewMarginRight())));
       }
       return;
    }
}
