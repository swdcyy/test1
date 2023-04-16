package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$f;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class UserProfileLastSeenPresenter$f extends AnimatorListenerAdapter	// class@00145d
{
    public final View a;

    public void UserProfileLastSeenPresenter$f(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileLastSeenPresenter$f.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       this.onAnimationEnd(p0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileLastSeenPresenter$f.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationEnd(p0);
       this.a.clearAnimation();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileLastSeenPresenter$f.class, "3")) {
          return;
       }
       a.p(p0, "animation");
       this.a.setVisibility(0);
       return;
    }
}
