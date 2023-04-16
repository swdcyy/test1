package com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$b;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import im8.f;
import com.kwai.framework.model.user.UserProfile;
import xl8.b;
import java.lang.CharSequence;

public final class UserProfileFavoriteAndMakerPresenter$b implements g	// class@0014e8
{
    public final UserProfileFavoriteAndMakerPresenter b;

    public void UserProfileFavoriteAndMakerPresenter$b(UserProfileFavoriteAndMakerPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFavoriteAndMakerPresenter$b.class, "1")) {
       }else {
          a.p(p0, "user");
          if (this.b.W8().get() != null) {
             this.b.W8().get().mIsFavorite = p0.mFavorited;
          }
          this.b.Y8(p0.mFavorited);
          this.b.X8(p0.mFavorited);
          p0 = this.b;
          p0.Z8(p0.S8().a());
       }
       return;
    }
}
