package com.kuaishou.live.core.show.music.audiencelyrics.d$d;
import ekd.x;
import com.kuaishou.live.core.show.music.audiencelyrics.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.show.music.audiencelyrics.view.LiveAudienceLyricsPendantView;
import java.util.Objects;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;

public class d$d extends x	// class@000d32
{
    public final d a;

    public void d$d(d p0,long p1){
       this.a = p0;
       super(p1);
    }
    public void a(long p0){
       d$d uod = d$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uod, "1")) {
          return;
       }
       d$d ta = this.a;
       long l = ta.E + 40;
       ta.E = l;
       d t = ta.t;
       if (t != null) {
          t.j(l);
          t = this.a.t;
          Objects.requireNonNull(t);
          if (!PatchProxy.applyVoid(null, t, LiveAudienceLyricsPendantView.class, "9")) {
             if (t.m == null) {
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(t.i, View.ROTATION, new float[2]{0,0x43b40000});
                t.m = objectAnimat;
                objectAnimat.setDuration(7200);
                t.m.setRepeatCount(0x2710);
                t.m.setRepeatMode(1);
                t.m.setInterpolator(new LinearInterpolator());
             }
             if (!t.m.isRunning()) {
                t.m.start();
             }
          }
       }
       return;
    }
}
