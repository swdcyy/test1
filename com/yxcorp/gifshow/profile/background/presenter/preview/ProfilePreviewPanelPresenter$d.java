package com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter$d;
import erd.g;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewPanelPresenter;
import java.lang.Object;
import i3c.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class ProfilePreviewPanelPresenter$d implements g	// class@001277
{
    public final ProfilePreviewPanelPresenter b;

    public void ProfilePreviewPanelPresenter$d(ProfilePreviewPanelPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfilePreviewPanelPresenter$d.class, "1")) {
       }else {
          p0 = this.b.getActivity();
          if (p0 != null) {
             p0.finish();
          }
       }
       return;
    }
}
