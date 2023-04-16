package com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter$a;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.UserProfileFavoriteAndMakerPresenter;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import xl8.b;
import java.lang.CharSequence;

public final class UserProfileFavoriteAndMakerPresenter$a implements g	// class@0014e7
{
    public final UserProfileFavoriteAndMakerPresenter b;

    public void UserProfileFavoriteAndMakerPresenter$a(UserProfileFavoriteAndMakerPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfileFavoriteAndMakerPresenter$a.class, "1")) {
       }else {
          a.p(p0, "profile");
          this.b.Y8(p0.mIsFavorite);
          UserProfileFavoriteAndMakerPresenter$a tb = this.b;
          tb.Z8(tb.S8().a());
          this.b.X8(p0.mIsFavorite);
       }
       return;
    }
}
