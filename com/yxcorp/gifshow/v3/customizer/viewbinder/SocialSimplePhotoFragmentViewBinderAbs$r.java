package com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs$r;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.v3.customizer.viewbinder.SocialSimplePhotoFragmentViewBinderAbs;
import java.lang.Object;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class SocialSimplePhotoFragmentViewBinderAbs$r implements Animator$AnimatorListener	// class@000d89
{
    public final SocialSimplePhotoFragmentViewBinderAbs a;
    public final float b;
    public final boolean c;

    public void SocialSimplePhotoFragmentViewBinderAbs$r(SocialSimplePhotoFragmentViewBinderAbs p0,float p1,boolean p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SocialSimplePhotoFragmentViewBinderAbs$r.class, "3")) {
          return;
       }
       a.p(p0, "animation");
       this.a.K0(this.c);
       PatchProxy.onMethodExit(SocialSimplePhotoFragmentViewBinderAbs$r.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SocialSimplePhotoFragmentViewBinderAbs$r.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       this.a.K0(this.c);
       PatchProxy.onMethodExit(SocialSimplePhotoFragmentViewBinderAbs$r.class, "2");
       return;
    }
    public void onAnimationRepeat(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SocialSimplePhotoFragmentViewBinderAbs$r.class, "4")) {
          return;
       }
       a.p(p0, "animation");
       this.a.K0(this.c);
       PatchProxy.onMethodExit(SocialSimplePhotoFragmentViewBinderAbs$r.class, "4");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SocialSimplePhotoFragmentViewBinderAbs$r.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       PatchProxy.onMethodExit(SocialSimplePhotoFragmentViewBinderAbs$r.class, "1");
       return;
    }
}
