package com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$f;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator$AnimatorListener;
import android.view.View;

public final class ProfileCropVideoSizePresenter$f extends AnimatorListenerAdapter	// class@001257
{
    public final AnimatorSet a;
    public final ProfileCropVideoSizePresenter b;
    public final Animator c;
    public final Animator d;

    public void ProfileCropVideoSizePresenter$f(AnimatorSet p0,ProfileCropVideoSizePresenter p1,Animator p2,Animator p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileCropVideoSizePresenter$f.class, "3")) {
          return;
       }
       super.onAnimationCancel(p0);
       this.a.removeListener(this);
       ProfileCropVideoSizePresenter.V8(this.b).setVisibility(8);
       ProfileCropVideoSizePresenter.S8(this.b).setVisibility(8);
       PatchProxy.onMethodExit(ProfileCropVideoSizePresenter$f.class, "3");
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileCropVideoSizePresenter$f.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       this.a.removeListener(this);
       ProfileCropVideoSizePresenter.V8(this.b).setVisibility(8);
       ProfileCropVideoSizePresenter.S8(this.b).setVisibility(8);
       PatchProxy.onMethodExit(ProfileCropVideoSizePresenter$f.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileCropVideoSizePresenter$f.class, "1")) {
          return;
       }
       ProfileCropVideoSizePresenter.P8(this.b).setVisibility(0);
       ProfileCropVideoSizePresenter.V8(this.b).setVisibility(0);
       ProfileCropVideoSizePresenter.S8(this.b).setVisibility(0);
       PatchProxy.onMethodExit(ProfileCropVideoSizePresenter$f.class, "1");
       return;
    }
}
