package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.c;
import hc.c;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$i;
import hc.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import java.util.List;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public final class c extends c	// class@0014e6
{
    public final ProfileHeaderStatusPresenter$i a;

    public void c(ProfileHeaderStatusPresenter$i p0){
       this.a = p0;
       super();
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "drawable");
       c ta = this.a;
       a$a uoa = a.d();
       uoa.b(":ks-features:ft-social:profile");
       ta.c.S(ta.e, uoa.a());
       return;
    }
}
