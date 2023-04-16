package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$h;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.animation.PropertyValuesHolder;
import android.widget.FrameLayout;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$h$a;
import android.animation.Animator$AnimatorListener;

public final class LiveAdNeoEnhancePendantView$h extends AnimatorListenerAdapter	// class@0009cf
{
    public final LiveAdNeoEnhancePendantView a;
    public final long b;

    public void LiveAdNeoEnhancePendantView$h(LiveAdNeoEnhancePendantView p0,long p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveAdNeoEnhancePendantView$h.class, "1")) {
          return;
       }
       this.a.setPendentBgImg("https://static.yximgs.com/udata/pkg/ad-res/neo_live_pendent/live_neo_pendent_bg_granted.b5417627c3dbf8a9.webp");
       LiveAdNeoEnhancePendantView h = this.a.h;
       if (h == null) {
          a.S("mCountDownImageGroup");
       }
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(FrameLayout.SCALE_X, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(FrameLayout.SCALE_Y, new float[2]{0,0x3f800000})};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(h, propertyValu);
       a.o(objectAnimat, "imageEntryAnim");
       objectAnimat.setDuration(250);
       objectAnimat.addListener(new LiveAdNeoEnhancePendantView$h$a(this));
       objectAnimat.start();
       PatchProxy.onMethodExit(LiveAdNeoEnhancePendantView$h.class, "1");
       return;
    }
}
