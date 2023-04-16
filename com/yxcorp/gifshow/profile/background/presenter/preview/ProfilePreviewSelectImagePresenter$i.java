package com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$i;
import erd.g;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;

public final class ProfilePreviewSelectImagePresenter$i implements g	// class@001286
{
    public final ProfilePreviewSelectImagePresenter b;

    public void ProfilePreviewSelectImagePresenter$i(ProfilePreviewSelectImagePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b = p0.booleanValue();
       ProfilePreviewSelectImagePresenter$i oi = ProfilePreviewSelectImagePresenter$i.class;
       if (PatchProxy.isSupport(oi) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), this, oi, "1") && b)) {
          this.b.V8();
       }
       return;
    }
}
