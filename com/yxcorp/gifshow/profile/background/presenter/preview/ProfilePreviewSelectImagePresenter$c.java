package com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class ProfilePreviewSelectImagePresenter$c extends m	// class@00127e
{
    public final ProfilePreviewSelectImagePresenter c;

    public void ProfilePreviewSelectImagePresenter$c(ProfilePreviewSelectImagePresenter p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewSelectImagePresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "v");
       Activity activity = this.c.getActivity();
       if (activity != null) {
          activity.finish();
       }
       return;
    }
}
