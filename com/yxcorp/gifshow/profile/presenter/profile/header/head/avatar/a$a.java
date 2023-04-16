package com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.a$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.profile.presenter.profile.header.head.avatar.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.kwai.framework.model.user.UserProfile;
import k2b.e0;
import com.kwai.framework.model.user.User;
import z5c.y1;
import z5c.w1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z5c.d3;
import z5c.k0;
import com.yxcorp.gifshow.profile.common.model.ProfileStatusInfo;
import x2c.a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$c;
import o4c.d;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$b;
import tkd.b;
import tkd.d;
import gx5.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import o4c.c;
import com.kwai.framework.model.user.UserStatus;
import gx5.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import n3d.a;

public class a$a extends m	// class@0014e2
{
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a$a tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tc, a.class, "3")) {
          ProfileParam mUserProfile = tc.p.mUserProfile;
          d uod = 1;
          GifshowActivity gifshowActiv = null;
          boolean b = (mUserProfile != null && mUserProfile.mIsDefaultHead != null)? true: false;
          y1.l(tc.r, tc.q, b);
          if (w1.a(tc.q, tc.p.mUserProfile)) {
             y1.v(tc.r);
             w1.b(tc.getActivity(), tc.p.mUserProfile);
          }else {
             int i = 0x763547f8;
             if (b && (!d3.c(tc.q, tc.p.mUserProfile) && !k0.b())) {
                ProfileStatusInfo profileStatu = a.f(tc.p.mUserProfile);
                if (profileStatu != null) {
                   profileStatu = profileStatu.mUserStatus;
                   if (profileStatu != null) {
                      objArray = profileStatu;
                   }
                }
                ImageSelectSupplier$c uoc = ImageSelectSupplier$c.a();
                uoc.b(new d(tc));
                d.a(i).AJ(tc.getActivity(), objArray, new c(tc), uoc);
             }else if(!TextUtils.x(tc.p.mBanText)){
                tc.P8(gifshowActiv, uod);
                y1.l(tc.r, tc.q, b);
             }else {
                d.a(i).yR(tc.getActivity(), tc.q, tc.p.mUserProfile, false, true, null);
                y1.n(tc.r, tc.q.getId(), "avatar", uod, tc.p.mUserProfile);
             }
          }
       }
       return;
    }
}
