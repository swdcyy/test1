package com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$b;
import com.yxcorp.gifshow.widget.m;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter;
import android.view.View;
import xm8.g;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import k2b.e0;
import kotlin.jvm.internal.a;
import android.widget.CheckBox;
import k2b.h;
import ym8.f;
import oa0.a;
import android.content.SharedPreferences;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$DialogStatus;
import xm8.d;
import q87.c;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import x79.g;

public final class ProfileImageNextStepPresenter$b extends m	// class@000c72
{
    public final ProfileImageNextStepPresenter c;

    public void ProfileImageNextStepPresenter$b(ProfileImageNextStepPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       ProfileImageNextStepPresenter$b tc = this.c;
       g a = g.a;
       Activity activity = tc.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       ProfileImageNextStepPresenter r = tc.r;
       String str = "mCheckbox";
       if (r == null) {
          a.S(str);
       }
       Objects.requireNonNull(a);
       a.p(activity, "page");
       h oh = h.m("", "UPLOAD_POST_PHOTO_BUTTON");
       oh.n(a.b(r.isChecked()));
       oh.i(activity);
       ProfileImageNextStepPresenter r1 = tc.r;
       if (r1 == null) {
          a.S(str);
       }
       String str1 = "mDelegate";
       if (r1.isChecked()) {
          r1 = tc.p;
          if (r1 == null) {
             a.S(str1);
          }
          if (r1.g()) {
             boolean b = false;
             if (tc.x == null || (!a.a.getBoolean("profile_post_bg_guide_dialog_showed", b) || (tc.x == null && !a.a.getBoolean("profile_post_avator_guide_dialog_showed", b)))) {
                tc.y = ProfileImageNextStepPresenter$DialogStatus.WILL_POP;
                Object[] objArray = new Object[b];
                d.D().w("ProfileImageNextStepPresenter", "onUpdateClick change status to WILL_POP", objArray);
             }
          }
       }
    label_0080 :
       Activity activity1 = tc.getActivity();
       Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity");
       r = tc.p;
       if (r == null) {
          a.S(str1);
       }
       if (r.z() == ImageSelectSupplier$ImageSelectType.MIYOU.getValue()) {
          activity1.D3(tc.B);
       }else {
          activity1.D3(tc.A);
       }
       activity1.w3();
       return;
    }
}
