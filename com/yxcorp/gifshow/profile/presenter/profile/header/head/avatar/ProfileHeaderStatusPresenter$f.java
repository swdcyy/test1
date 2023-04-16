package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.ProfileHeaderStatusPresenter$f;
import erd.g;
import java.lang.Object;
import u36.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.liveavatar.LiveAvatarPostedStatus;

public final class ProfileHeaderStatusPresenter$f implements g	// class@0014d7
{
    public final int b;

    public void ProfileHeaderStatusPresenter$f(int p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileHeaderStatusPresenter$f.class, "1")) {
       }else {
          a.p(p0, "plugin");
          p0.Ej(this.b, LiveAvatarPostedStatus.STATE);
       }
       return;
    }
}
