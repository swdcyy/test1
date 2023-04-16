package com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$d;
import com.yxcorp.gifshow.widget.m;
import com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter;
import android.view.View;
import xm8.g;
import android.widget.CheckBox;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import k2b.e0;
import kotlin.jvm.internal.a;
import k2b.h;
import java.lang.Boolean;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;

public final class ProfileImageNextStepPresenter$d extends m	// class@000c74
{
    public final ProfileImageNextStepPresenter c;

    public void ProfileImageNextStepPresenter$d(ProfileImageNextStepPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       g a = g.a;
       ProfileImageNextStepPresenter$d tc = this.c;
       Activity activity = this.c.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       Objects.requireNonNull(a);
       a.p(activity, "page");
       h oh = h.m("", "UPDATE_MESSAGE_PRODUCE_POPUP_FINISH");
       oh.n(a.a(tc.x, Boolean.valueOf(ProfileImageNextStepPresenter.S8(tc).isChecked())));
       oh.i(activity);
       ProfileImageNextStepPresenter.P8(this.c).setChecked(ProfileImageNextStepPresenter.S8(this.c).isChecked());
       Activity activity1 = this.c.getActivity();
       Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity");
       activity1.w3();
    }
}
