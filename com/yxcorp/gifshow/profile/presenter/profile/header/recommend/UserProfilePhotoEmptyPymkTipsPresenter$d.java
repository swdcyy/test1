package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.UserProfilePhotoEmptyPymkTipsPresenter;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import kotlin.jvm.internal.a;
import s1c.j1;
import com.kwai.framework.model.user.User;
import java.util.Set;
import crd.b;
import com.yxcorp.gifshow.profile.util.o;

public final class UserProfilePhotoEmptyPymkTipsPresenter$d extends m	// class@001529
{
    public final UserProfilePhotoEmptyPymkTipsPresenter c;
    public final boolean d;

    public void UserProfilePhotoEmptyPymkTipsPresenter$d(UserProfilePhotoEmptyPymkTipsPresenter p0,boolean p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserProfilePhotoEmptyPymkTipsPresenter$d.class, "1")) {
          return;
       }
       Activity uActivity = this.c.getActivity();
       ProfileParam mUser = UserProfilePhotoEmptyPymkTipsPresenter.P8(this.c).mUser;
       ProfileParam profileParam = UserProfilePhotoEmptyPymkTipsPresenter.P8(this.c);
       UserProfilePhotoEmptyPymkTipsPresenter v = this.c.v;
       if (v == null) {
          a.S("mUserCallerContext");
       }
       j1 c = v.c;
       String str = (this.d != null)? "NO_PHOTO_1": "NO_PHOTO_0";
       String str1 = str;
       str = (this.c.H != null)? "TRUE": "FALSE";
       o.q(uActivity, mUser, profileParam, c, str1, str);
       return;
    }
}
