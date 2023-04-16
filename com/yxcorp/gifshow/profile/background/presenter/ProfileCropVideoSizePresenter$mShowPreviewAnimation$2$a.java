package com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$mShowPreviewAnimation$2$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter$mShowPreviewAnimation$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.profile.background.presenter.ProfileCropVideoSizePresenter;
import android.animation.Animator;
import ekd.f;
import kotlin.jvm.internal.a;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import c2c.a;
import android.animation.Animator$AnimatorListener;
import qrd.l1;

public final class ProfileCropVideoSizePresenter$mShowPreviewAnimation$2$a implements Runnable	// class@00125c
{
    public final ProfileCropVideoSizePresenter$mShowPreviewAnimation$2 b;

    public void ProfileCropVideoSizePresenter$mShowPreviewAnimation$2$a(ProfileCropVideoSizePresenter$mShowPreviewAnimation$2 p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileCropVideoSizePresenter$mShowPreviewAnimation$2$a.class, "1")) {
          return;
       }
       ProfileCropVideoSizePresenter$mShowPreviewAnimation$2 this$0 = this.b.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(objArray, this$0, ProfileCropVideoSizePresenter.class, "6")) {
          boolean b = true;
          this$0.C = b;
          f.a(this$0.A);
          f.a(this$0.z);
          ProfileCropVideoSizePresenter s = this$0.s;
          if (s == null) {
             a.S("mPreviewTop");
          }
          int i = 2;
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(s, View.ALPHA, new float[i]{0,0x3f800000});
          a.o(objectAnimat, "ObjectAnimator.ofFloat\(m¡­op, View.ALPHA, 0f, 1.0f\)");
          ProfileCropVideoSizePresenter t = this$0.t;
          if (t == null) {
             a.S("mPreviewBottom");
          }
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(t, View.ALPHA, new float[i]{0,0x3f800000});
          a.o(objectAnimat1, "ObjectAnimator.ofFloat\(m¡­om, View.ALPHA, 0f, 1.0f\)");
          AnimatorSet uAnimatorSet = new AnimatorSet();
          Animator[] uAnimatorArr = new Animator[i];
          uAnimatorArr[0] = objectAnimat;
          uAnimatorArr[b] = objectAnimat1;
          uAnimatorSet.playTogether(uAnimatorArr);
          uAnimatorSet.setDuration(500);
          uAnimatorSet.addListener(new a(uAnimatorSet, this$0, objectAnimat, objectAnimat1));
          uAnimatorSet.start();
          this$0.z = uAnimatorSet;
       }
       return;
    }
}
