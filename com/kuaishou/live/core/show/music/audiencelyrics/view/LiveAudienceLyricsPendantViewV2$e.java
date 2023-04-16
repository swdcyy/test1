package com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2$e;
import java.lang.Runnable;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantViewV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.animation.ValueAnimator;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import rc2.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import rc2.e;
import android.animation.Animator$AnimatorListener;
import th0.d;
import android.animation.TimeInterpolator;

public final class LiveAudienceLyricsPendantViewV2$e implements Runnable	// class@000d3f
{
    public final LiveAudienceLyricsPendantViewV2 b;

    public void LiveAudienceLyricsPendantViewV2$e(LiveAudienceLyricsPendantViewV2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceLyricsPendantViewV2$e.class, "1")) {
          return;
       }
       LiveAudienceLyricsPendantViewV2$e tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, LiveAudienceLyricsPendantViewV2.class, "26")) {
          ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
          LiveAudienceLyricsPendantView h = tb.h;
          a.o(h, "mMusicLyricsContainer");
          valueAnimato.addUpdateListener(new d(tb, h.getX()));
          valueAnimato.addListener(new e(tb));
          a.o(valueAnimato, "animator");
          valueAnimato.setDuration(200);
          valueAnimato.setInterpolator(new d());
          valueAnimato.start();
       }
       return;
    }
}
