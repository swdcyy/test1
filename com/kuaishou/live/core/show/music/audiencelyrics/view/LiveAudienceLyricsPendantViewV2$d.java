package com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$d;
import ekd.f$i;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView;
import android.widget.ScrollView;

public final class LiveAudienceLyricsPendantViewV2$d extends f$i	// class@000d3e
{
    public final LiveAudienceLyricsPendantViewV2 b;

    public void LiveAudienceLyricsPendantViewV2$d(LiveAudienceLyricsPendantViewV2 p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLyricsPendantViewV2$d.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       LiveAudienceLyricsPendantView k = this.b.k;
       a.o(k, "mCurrentLyricsView");
       k.setVisibility(4);
       LiveAudienceLyricsPendantViewV2$d tb = this.b;
       tb.t = true;
       tb.m();
       return;
    }
}
