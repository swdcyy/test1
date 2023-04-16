package com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView;
import android.view.ViewGroup;
import java.lang.NullPointerException;

public final class LiveAudienceLyricsPendantViewV2$f implements ValueAnimator$AnimatorUpdateListener	// class@000d40
{
    public int a;
    public final LiveAudienceLyricsPendantViewV2 b;

    public void LiveAudienceLyricsPendantViewV2$f(LiveAudienceLyricsPendantViewV2 p0){
       this.b = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveAudienceLyricsPendantViewV2$f.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          int i = p0.intValue();
          int i1 = i - this.a;
          this.a = i;
          LiveAudienceLyricsPendantViewV2$f tb = this.b;
          LiveAudienceLyricsPendantView h = tb.h;
          a.o(h, "mMusicLyricsContainer");
          LiveAudienceLyricsPendantView h1 = this.b.h;
          a.o(h1, "mMusicLyricsContainer");
          float y = h1.getY();
          tb.e(h.getX(), i1, y, 0);
          PatchProxy.onMethodExit(LiveAudienceLyricsPendantViewV2$f.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(LiveAudienceLyricsPendantViewV2$f.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
       }
    }
}
