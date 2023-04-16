package com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$g;
import x79.g;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter;
import java.lang.Object;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$DialogStatus;
import ym8.f;
import android.widget.CheckBox;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Throwable;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.postwork.PostWorkErrorTips;
import xm8.d;
import w46.b;
import e17.i;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import xm8.g;
import java.util.Objects;
import k2b.e0;
import k2b.f3;
import java.lang.Boolean;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.animation.AnimatorSet;
import zm8.d;
import java.lang.Runnable;
import q87.c;
import oa0.a;
import android.graphics.Bitmap;
import x79.g$a;

public final class ProfileImageNextStepPresenter$g implements g	// class@000c77
{
    public final ProfileImageNextStepPresenter a;

    public void ProfileImageNextStepPresenter$g(ProfileImageNextStepPresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       ProfileImageNextStepPresenter$g ta = this.a;
       if (ta.y != ProfileImageNextStepPresenter$DialogStatus.WILL_POP && (!ProfileImageNextStepPresenter.R8(ta).g() || !ProfileImageNextStepPresenter.P8(this.a).isChecked())) {
          Activity activity = this.a.getActivity();
          if (activity != null) {
             activity.finish();
          }
       }
       return;
    }
    public void b(Throwable p0){
       a.p(p0, "e");
       if (PostWorkErrorTips.a(p0)) {
          d.D().e("ProfileImageNextStepPresenter", "onSaveFailed\(\) no space left", p0);
          i.a(R.style.arg_RES_7f110668, 0x7f104ab3);
       }
       d.D().e("ProfileImageNextStepPresenter", "onSaveFailed\(\) save failed.", p0);
       Activity activity = this.a.getActivity();
       if (activity != null) {
          activity.finish();
       }
       return;
    }
    public void c(int p0,int p1,Uri p2){
       Activity activity;
       g a;
       ProfileImageNextStepPresenter t;
       a.p(p2, "saveUri");
       ProfileImageNextStepPresenter$g ta = this.a;
       boolean b = (ta.y != ProfileImageNextStepPresenter$DialogStatus.NOT_POP)? ProfileImageNextStepPresenter.S8(ta).isChecked(): ProfileImageNextStepPresenter.P8(ta).isChecked();
       ProfileImageNextStepPresenter$g ta1 = this.a;
       if (ta1.y != ProfileImageNextStepPresenter$DialogStatus.WILL_POP) {
          Bundle uBundle = new Bundle();
          uBundle.putInt("outputX", p0);
          uBundle.putInt("outputY", p1);
          if (ProfileImageNextStepPresenter.R8(this.a).g() && b) {
             if (ProfileImageNextStepPresenter.R8(this.a).e(p0, p1)) {
                ProfileImageNextStepPresenter.R8(this.a).h(p2);
             }else {
                activity = this.a.getActivity();
                if (activity != null) {
                   activity.setResult(-1, new Intent(p2.toString()).putExtras(uBundle));
                   activity.finish();
                }
             }
          }else {
             activity = this.a.getActivity();
             if (activity != null) {
                activity.setResult(-1, new Intent(p2.toString()).putExtras(uBundle));
             }
          }
       }else {
          a = g.a;
          Activity activity1 = ta1.getActivity();
          Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
          Objects.requireNonNull(a);
          a.p(activity1, "page");
          f3 uof3 = f3.l("", "UPDATE_MESSAGE_PRODUCE_POPUP");
          uof3.m(a.a(ta1.x, null));
          uof3.h(activity1);
          Fresco.getImagePipeline().evictFromMemoryCache(p2);
          if (ta1.x == null) {
             t = ta1.t;
             if (t == null) {
                a.S("mAvatarImage");
             }
             t.setImageURI(p2);
          }else {
             t = ta1.u;
             if (t == null) {
                a.S("mBgImage");
             }
             t.setImageURI(p2);
          }
          t = ta1.p;
          String str = "mDelegate";
          if (t == null) {
             a.S(str);
          }
          AnimatorSet uAnimatorSet = t.b();
          if (uAnimatorSet != null) {
             uAnimatorSet.start();
          }
          t = ta1.p;
          if (t == null) {
             a.S(str);
          }
          t.f(new d(ta1));
          ta1.y = ProfileImageNextStepPresenter$DialogStatus.HAS_POP;
          Object[] objArray = new Object[0];
          d.D().w("ProfileImageNextStepPresenter", "popUpDialog change status to HAS_POP", objArray);
          if (ta1.x != null) {
             a.x1(true);
          }else {
             a.w1(true);
          }
       }
       return;
    }
    public boolean d(Bitmap p0){
       a.p(p0, "corpBitmap");
       return g$a.a(this, p0);
    }
}
