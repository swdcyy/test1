package com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView$a;
import ekd.f$i;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView;
import android.view.animation.Animation;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ScrollView;

public class LiveAudienceLyricsPendantView$a extends f$i	// class@000d37
{
    public final LiveAudienceLyricsPendantView b;

    public void LiveAudienceLyricsPendantView$a(LiveAudienceLyricsPendantView p0){
       this.b = p0;
       super();
    }
    public void onAnimationEnd(Animation p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceLyricsPendantView$a.class, "1")) {
          return;
       }
       this.b.k.setVisibility(0);
       return;
    }
}
