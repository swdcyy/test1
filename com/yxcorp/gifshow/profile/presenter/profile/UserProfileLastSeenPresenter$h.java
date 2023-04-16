package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$h;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class UserProfileLastSeenPresenter$h extends AnimatorListenerAdapter	// class@00145f
{
    public final View a;

    public void UserProfileLastSeenPresenter$h(View p0){
       this.a = p0;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileLastSeenPresenter$h.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       this.onAnimationEnd(p0);
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileLastSeenPresenter$h.class, "2")) {
          return;
       }
       a.p(p0, "animation");
       super.onAnimationEnd(p0);
       this.a.clearAnimation();
       return;
    }
}
