package com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$g;
import ekd.f$j;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;

public final class LiveAudienceLyricsPendantViewV2$g extends f$j	// class@000d41
{
    public final LiveAudienceLyricsPendantViewV2 a;

    public void LiveAudienceLyricsPendantViewV2$g(LiveAudienceLyricsPendantViewV2 p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0,boolean p1){
       if (PatchProxy.isSupport2(LiveAudienceLyricsPendantViewV2$g.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Boolean.valueOf(p1), this, LiveAudienceLyricsPendantViewV2$g.class, "1")) {
          return;
       }
       LiveAudienceLyricsPendantViewV2$g ta = this.a;
       if (ta.t != null) {
          ta.m();
       }
       PatchProxy.onMethodExit(LiveAudienceLyricsPendantViewV2$g.class, "1");
       return;
    }
}
