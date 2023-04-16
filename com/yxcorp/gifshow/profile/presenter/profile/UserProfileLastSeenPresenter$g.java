package com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter$g;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.profile.presenter.profile.UserProfileLastSeenPresenter;
import android.view.View;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;

public final class UserProfileLastSeenPresenter$g implements ValueAnimator$AnimatorUpdateListener	// class@00145e
{
    public final UserProfileLastSeenPresenter a;
    public final View b;

    public void UserProfileLastSeenPresenter$g(UserProfileLastSeenPresenter p0,View p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileLastSeenPresenter$g.class, "1")) {
          return;
       }
       a.o(p0, "animation");
       p0 = p0.getAnimatedValue();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Float");
       this.a.R8(this.b, p0.floatValue());
       return;
    }
}
