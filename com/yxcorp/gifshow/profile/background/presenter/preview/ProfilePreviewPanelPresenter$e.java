package com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter$e;
import erd.g;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$c;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager$b;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.io.File;
import wkd.b;
import j80.c;
import com.kwai.framework.model.feed.BaseFeed;

public final class ProfilePreviewPanelPresenter$e implements g	// class@001278
{
    public final ProfilePreviewPanelPresenter b;

    public void ProfilePreviewPanelPresenter$e(ProfilePreviewPanelPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewPanelPresenter$e.class, "1")) {
       }else {
          a.p(p0, "data");
          ProfileBackgroundPublishManager$c j = ProfileBackgroundPublishManager.j;
          j.a().u(new ProfileBackgroundPublishManager$b(true, true, null));
          Activity activity = this.b.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          ProfileBackgroundPublishManager.d(j.a(), activity, new File(b.a(-1504323719).o(), "background.jpg"), p0, null, 8, null);
          if (!p0.hasExtra("video")) {
             p0 = this.b.getActivity();
             if (p0 != null) {
                p0.finish();
             }
          }
       }
       return;
    }
}
