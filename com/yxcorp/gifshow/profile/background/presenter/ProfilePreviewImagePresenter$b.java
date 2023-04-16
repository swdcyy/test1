package com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$b;
import com.yxcorp.image.fresco.wrapper.a$g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$b$a;
import java.lang.Runnable;
import yb7.p;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter$b$b;

public final class ProfilePreviewImagePresenter$b implements a$g	// class@001262
{
    public static final ProfilePreviewImagePresenter$b a;

    static {
       ProfilePreviewImagePresenter$b.a = new ProfilePreviewImagePresenter$b();
    }
    public void ProfilePreviewImagePresenter$b(){
       super();
    }
    public final void onResult(boolean p0){
       ProfilePreviewImagePresenter$b uob = ProfilePreviewImagePresenter$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       if (p0) {
          p.d(ProfilePreviewImagePresenter$b$a.b);
       }else {
          p.d(ProfilePreviewImagePresenter$b$b.b);
       }
       return;
    }
}
