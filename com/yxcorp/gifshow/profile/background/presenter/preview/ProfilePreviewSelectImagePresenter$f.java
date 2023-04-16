package com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$f;
import com.yxcorp.image.fresco.wrapper.a$g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$f$a;
import java.lang.Runnable;
import yb7.p;
import com.yxcorp.gifshow.profile.background.presenter.preview.ProfilePreviewSelectImagePresenter$f$b;

public final class ProfilePreviewSelectImagePresenter$f implements a$g	// class@001283
{
    public static final ProfilePreviewSelectImagePresenter$f a;

    static {
       ProfilePreviewSelectImagePresenter$f.a = new ProfilePreviewSelectImagePresenter$f();
    }
    public void ProfilePreviewSelectImagePresenter$f(){
       super();
    }
    public final void onResult(boolean p0){
       ProfilePreviewSelectImagePresenter$f uof = ProfilePreviewSelectImagePresenter$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "1")) {
          return;
       }
       if (p0) {
          p.d(ProfilePreviewSelectImagePresenter$f$a.b);
       }else {
          p.d(ProfilePreviewSelectImagePresenter$f$b.b);
       }
       return;
    }
}
