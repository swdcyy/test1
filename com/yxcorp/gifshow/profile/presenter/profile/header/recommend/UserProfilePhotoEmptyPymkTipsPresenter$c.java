package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter$c;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter;
import java.lang.Object;
import wca.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.UserProfile;
import com.yxcorp.gifshow.profile.util.o;
import s1c.r0;
import s1c.a;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import android.widget.TextView;

public final class UserProfilePhotoEmptyPymkTipsPresenter$c implements g	// class@001528
{
    public final UserProfilePhotoEmptyPymkTipsPresenter b;

    public void UserProfilePhotoEmptyPymkTipsPresenter$c(UserProfilePhotoEmptyPymkTipsPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfilePhotoEmptyPymkTipsPresenter$c.class, "1")) {
       }else {
          ProfileParam mUser = UserProfilePhotoEmptyPymkTipsPresenter.P8(this.b).mUser;
          a.o(mUser, "mParam.mUser");
          if (TextUtils.n(p0.b, mUser.getId()) && !o.w(UserProfilePhotoEmptyPymkTipsPresenter.V8(this.b), UserProfilePhotoEmptyPymkTipsPresenter.P8(this.b).mUser)) {
             if (p0.c != null && o.v(UserProfilePhotoEmptyPymkTipsPresenter.V8(this.b), UserProfilePhotoEmptyPymkTipsPresenter.P8(this.b).mUser)) {
                p0 = this.b;
                if (p0.I != null) {
                   p0 = p0.s;
                   if (p0 == null) {
                      a.S("mPageParam");
                   }
                   p0.e.d.a("PROFILE_EMPTY_PHOTO_MISSU_SHOW");
                   p0 = this.b.A;
                   if (p0 != null) {
                      p0.setVisibility(0);
                   }
                   p0 = this.b;
                   p0.e9(p0.H);
                }
             }
             p0 = this.b.A;
             if (p0 != null) {
                p0.setVisibility(8);
             }
             p0 = this.b;
             UserProfilePhotoEmptyPymkTipsPresenter c = p0.C;
             if (c != null) {
                c.setText(p0.a9());
             }
          }
       }
       return;
    }
}
