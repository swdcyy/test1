package com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter$j;
import ekd.f$j;
import com.yxcorp.gifshow.profile.presenter.profile.hover.UserProfileFollowGuidePresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.View;

public final class UserProfileFollowGuidePresenter$j extends f$j	// class@001553
{
    public final UserProfileFollowGuidePresenter a;

    public void UserProfileFollowGuidePresenter$j(UserProfileFollowGuidePresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFollowGuidePresenter$j.class, "1")) {
          return;
       }
       a.p(p0, "animation");
       UserProfileFollowGuidePresenter y = this.a.y;
       if (y != null) {
          y.setVisibility(8);
       }
       return;
    }
}
