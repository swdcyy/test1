package com.kuaishou.live.core.show.music.audiencelyrics.LivePendantLyricsView$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.music.audiencelyrics.LivePendantLyricsView;
import android.widget.TextView;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;

public class LivePendantLyricsView$a implements ValueAnimator$AnimatorUpdateListener	// class@000d29
{
    public final TextView a;
    public final LivePendantLyricsView b;

    public void LivePendantLyricsView$a(LivePendantLyricsView p0,TextView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePendantLyricsView$a.class, "1")) {
          return;
       }
       LivePendantLyricsView$a tb = this.b;
       LivePendantLyricsView v0 = tb.V0;
       this.a.setTextSize(0, (v0 + (((tb.T - 0x3f800000) * p0.getAnimatedValue().floatValue()) * v0)));
       return;
    }
}
