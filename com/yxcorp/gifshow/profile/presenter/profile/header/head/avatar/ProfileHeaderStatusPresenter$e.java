package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$e;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter;
import java.lang.Object;
import eda.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import w5c.c;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.s;

public final class ProfileHeaderStatusPresenter$e implements g	// class@0014d6
{
    public final ProfileHeaderStatusPresenter b;

    public void ProfileHeaderStatusPresenter$e(ProfileHeaderStatusPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderStatusPresenter$e.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, ProfileHeaderStatusPresenter.class, "6")) {
             c.h.a();
             RxBus.f.b(s.a("STATUS_END"));
          }
       }
       return;
    }
}
