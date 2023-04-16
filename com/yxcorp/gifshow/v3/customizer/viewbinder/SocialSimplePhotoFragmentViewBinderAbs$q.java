package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$q;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import java.lang.NullPointerException;

public final class SocialSimplePhotoFragmentViewBinderAbs$q implements ValueAnimator$AnimatorUpdateListener	// class@000d88
{
    public final SocialSimplePhotoFragmentViewBinderAbs a;
    public final float b;
    public final boolean c;

    public void SocialSimplePhotoFragmentViewBinderAbs$q(SocialSimplePhotoFragmentViewBinderAbs p0,float p1,boolean p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SocialSimplePhotoFragmentViewBinderAbs$q.class, "1")) {
          return;
       }
       a.p(p0, "value");
       SocialSimplePhotoFragmentViewBinderAbs$q ta = this.a;
       p0 = p0.getAnimatedValue();
       if (p0 != null) {
          ta.J0(p0.floatValue());
          PatchProxy.onMethodExit(SocialSimplePhotoFragmentViewBinderAbs$q.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(SocialSimplePhotoFragmentViewBinderAbs$q.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
       }
    }
}
