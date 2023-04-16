package com.yxcorp.gifshow.profile.presenter.profile.header.name.c;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.header.name.d;
import java.lang.Object;
import com.kwai.framework.model.user.UserProfile;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import z5c.d3;
import android.view.View;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import com.yxcorp.gifshow.model.response.UserProfileResponse;
import x3c.b;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import bt7.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.android.model.mix.ActivityUserIconModel;
import android.content.Context;
import com.yxcorp.gifshow.image.KwaiImageView;
import u3c.g;
import o56.a;
import com.yxcorp.gifshow.util.PermissionUtils;
import wwb.f;
import com.kwai.framework.model.user.UserFollowerRelation;
import com.kwai.framework.model.user.QUserContactName;
import z5c.k3;
import com.kwai.robust.PatchProxyResult;
import brd.a0;
import com.kwai.framework.model.user.UserExtraInfo;
import com.yxcorp.gifshow.b;
import t45.d;
import brd.z;
import z5c.j3;
import erd.o;
import r4c.z;
import z5c.l0;
import crd.b;

public final class c implements g	// class@0014f4
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d f;
       c tb = this.b;
       Objects.requireNonNull(tb);
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, uod, "5")) {
       }else if(d3.c(tb.v, p0)){
          tb.q.setVisibility(8);
       }else {
          tb.P8();
          p0 = tb.D;
          if (p0 != null) {
             p0.onNext(Boolean.valueOf(b.b(tb.u.mUserProfileResponse)));
          }
          p0 = tb.u.mUserProfileResponse;
          if (p0 != null) {
             f = tb.F;
             if (f == null) {
                tb.F = new a(tb.getActivity(), tb.E, b.a(tb.u.mUserProfileResponse));
             }else {
                f.b(b.a(p0));
             }
             tb.F.a();
          }
       }
       p0 = null;
       if (!PatchProxy.applyVoid(p0, tb, uod, "7")) {
          uod = tb.B;
          if (uod == null || !uod.a()) {
             uod = (PermissionUtils.a(a.B, "android.permission.READ_CONTACTS") && f.b())? 1: null;
             ProfileParam mUserProfile = tb.u.mUserProfile;
             if (!uod) {
                p0 = new g();
                tb.B = p0;
                if (mUserProfile != null) {
                   UserProfile mUserFollowe = mUserProfile.mUserFollowerRelation;
                   if (mUserFollowe != null) {
                      UserFollowerRelation mContactName = mUserFollowe.mContactName;
                      if (mContactName != null) {
                         p0.a = mContactName.mMobileHash;
                      }
                   }
                }
             }else {
                uod = tb.v;
                p0 = PatchProxy.applyTwoRefs(uod, mUserProfile, p0, k3.class, "1");
                if (p0 != PatchProxyResult.class) {
                }else {
                   p0 = b.b(uod.mExtraInfo).G(d.c).C(new j3(mUserProfile));
                }
                tb.X7(p0.G(d.a).R(new z(tb), l0.a));
             }
          }
       }
    label_00e3 :
       return;
    }
}
