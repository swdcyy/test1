package com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$c;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter;
import java.lang.Object;
import java.lang.CharSequence;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import lu7.f;
import com.kwai.framework.model.user.User$FollowStatus;

public final class UserProfileFavoriteAndMakerPresenter$c implements g	// class@0014e9
{
    public final UserProfileFavoriteAndMakerPresenter b;

    public void UserProfileFavoriteAndMakerPresenter$c(UserProfileFavoriteAndMakerPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFavoriteAndMakerPresenter$c.class, "1")) {
       }else {
          a.p(p0, "showName");
          if (a.g(this.b.V8().getName(), p0) && (!f.i(this.b.V8()) && this.b.V8().getFollowStatus() == User$FollowStatus.FOLLOWING)) {
             this.b.G = true;
          }
       label_0041 :
          this.b.Z8(p0);
       }
       return;
    }
}
