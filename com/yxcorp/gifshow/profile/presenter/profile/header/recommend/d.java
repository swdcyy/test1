package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.d;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePymkPresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u4c.c0;
import java.lang.Runnable;
import android.view.View;

public class d extends AnimatorListenerAdapter	// class@001535
{
    public final UserProfilePymkPresenter a;

    public void d(UserProfilePymkPresenter p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.a.a9(true);
       this.a.B.post(new c0(this));
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       this.a.a9(false);
       return;
    }
}
