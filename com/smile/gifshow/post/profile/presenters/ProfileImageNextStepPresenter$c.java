package com.smile.gifshow.post.profile.presenters.ProfileImageNextStepPresenter$c;
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
import k2b.h;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import x79.g;

public final class ProfileImageNextStepPresenter$c extends m	// class@000c73
{
    public final ProfileImageNextStepPresenter c;

    public void ProfileImageNextStepPresenter$c(ProfileImageNextStepPresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       ProfileImageNextStepPresenter$c tc = this.c;
       Activity activity = tc.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       Objects.requireNonNull(g.a);
       a.p(activity, "page");
       h.m("", "PREVIEW_PHOTO_BUTTON").i(activity);
       Activity activity1 = tc.getActivity();
       Objects.requireNonNull(activity1, "null cannot be cast to non-null type com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity");
       activity1.D3(tc.z);
       activity1.w3();
    }
}
