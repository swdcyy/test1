package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter$b;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.User;
import z5c.d3;
import android.view.View;

public final class UserProfilePhotoEmptyPymkTipsPresenter$b implements g	// class@001527
{
    public final UserProfilePhotoEmptyPymkTipsPresenter b;

    public void UserProfilePhotoEmptyPymkTipsPresenter$b(UserProfilePhotoEmptyPymkTipsPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfilePhotoEmptyPymkTipsPresenter$b.class, "1")) {
       }else {
          a.o(p0, "userProfile");
          this.b.u = p0;
          if (!d3.d(UserProfilePhotoEmptyPymkTipsPresenter.P8(this.b).mUser, UserProfilePhotoEmptyPymkTipsPresenter.V8(this.b))) {
             p0 = this.b;
             UserProfilePhotoEmptyPymkTipsPresenter f = p0.F;
             if (f == null && (p0.z != null && (f == null || (p0.z != null && p0.X8() != null)))) {
                p0 = this.b;
                if (p0.F != null) {
                   ProfileParam mUser = UserProfilePhotoEmptyPymkTipsPresenter.P8(p0).mUser;
                   a.o(mUser, "mParam.mUser");
                   p0.m9(mUser);
                }else {
                   p0.k9();
                }
             }
          }
          this.b.c9();
       }
       return;
    }
}
