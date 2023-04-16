package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$h$a;
import hc.c;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$h;
import hc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.io.File;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class ProfileHeaderStatusPresenter$h$a extends c	// class@0014d9
{
    public final ProfileHeaderStatusPresenter$h a;

    public void ProfileHeaderStatusPresenter$h$a(ProfileHeaderStatusPresenter$h p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProfileHeaderStatusPresenter$h$a.class, "1")) {
          return;
       }
       a.p(p0, "drawable");
       this.a.c.v(new File(this.a.e), 0, 0);
       PatchProxy.onMethodExit(ProfileHeaderStatusPresenter$h$a.class, "1");
       return;
    }
}
