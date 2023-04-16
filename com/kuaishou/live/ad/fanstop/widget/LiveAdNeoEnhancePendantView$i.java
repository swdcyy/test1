package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView$i;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoEnhancePendantView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import android.widget.TextView;
import android.animation.PropertyValuesHolder;
import android.widget.FrameLayout;
import android.util.Property;
import android.animation.ObjectAnimator;
import kotlin.jvm.internal.a;

public final class LiveAdNeoEnhancePendantView$i extends AnimatorListenerAdapter	// class@0009d0
{
    public final LiveAdNeoEnhancePendantView a;

    public void LiveAdNeoEnhancePendantView$i(LiveAdNeoEnhancePendantView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, LiveAdNeoEnhancePendantView$i.class, "1")) {
          return;
       }
       this.a.k(a1.p(R.string.arg_RES_7f1014d2), false);
       PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(FrameLayout.ALPHA, new float[2]{0,0x3f800000})};
       ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(this.a.getMCountDownTextView$commercial_live_release(), propertyValu);
       a.o(objectAnimat, "textEntryAnim");
       objectAnimat.setDuration(250);
       objectAnimat.start();
       PatchProxy.onMethodExit(LiveAdNeoEnhancePendantView$i.class, "1");
       return;
    }
}
