package com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement$f;
import erd.g;
import com.yxcorp.gifshow.detail.common.information.profilefollow.ProfileFollowElement;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import p1a.a$a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p1a.a;
import java.lang.Boolean;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import nsd.r0;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.util.Arrays;
import com.kwai.framework.model.user.User;
import jga.f$a;
import com.yxcorp.gifshow.entity.QPhoto;
import jga.f;
import sy9.a;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.yxcorp.gifshow.entity.helper.FollowHelper;
import com.kwai.framework.model.user.User$FollowStatus;
import lu7.f;

public final class ProfileFollowElement$f implements g	// class@001437
{
    public final ProfileFollowElement b;

    public void ProfileFollowElement$f(ProfileFollowElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str4;
       ProfileFollowElement profileFollo = ProfileFollowElement.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileFollowElement$f.class, "1")) {
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, p0, profileFollo, "12")) {
             p0 = p0.A;
             if (p0 == null) {
                a.S("mLogListener");
             }
             a$a uoa1 = a$a.s(31, "Profile 关注引导的【关注】按钮点击");
             uoa1.f("USER_FOLLOW_BTN");
             uoa1.r(1);
             p0.a(uoa1);
          }
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.isSupport(profileFollo) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, p0, profileFollo, "10")) {
             profileFollo = p0.y;
             String str = "mActivity";
             if (profileFollo == null) {
                a.S(str);
             }
             if (profileFollo instanceof GifshowActivity) {
                profileFollo = p0.y;
                if (profileFollo == null) {
                   a.S(str);
                }
                String str1 = j0.f(profileFollo.getIntent(), "arg_photo_exp_tag");
                int i = 2;
                Object[] objArray1 = new Object[i];
                int i1 = 0;
                ProfileFollowElement z = p0.z;
                String str2 = "mDetailParams";
                if (z == null) {
                   a.S(str2);
                }
                DetailCommonParam detailCommon = z.getDetailCommonParam();
                a.o(detailCommon, "mDetailParams.detailCommonParam");
                String str3 = "_";
                if (detailCommon.getPreUserId() == null) {
                   str4 = str3;
                }else {
                   z = p0.z;
                   if (z == null) {
                      a.S(str2);
                   }
                   detailCommon = z.getDetailCommonParam();
                   a.o(detailCommon, "mDetailParams.detailCommonParam");
                   str4 = detailCommon.getPreUserId();
                }
                objArray1[i1] = str4;
                ProfileFollowElement z1 = p0.z;
                if (z1 == null) {
                   a.S(str2);
                }
                DetailCommonParam detailCommon1 = z1.getDetailCommonParam();
                a.o(detailCommon1, "mDetailParams.detailCommonParam");
                if (detailCommon1.getPrePhotoId() != null) {
                   z1 = p0.z;
                   if (z1 == null) {
                      a.S(str2);
                   }
                   detailCommon1 = z1.getDetailCommonParam();
                   a.o(detailCommon1, "mDetailParams.detailCommonParam");
                   str3 = detailCommon1.getPrePhotoId();
                }
                objArray1[1] = str3;
                String str5 = String.format("%s/%s", Arrays.copyOf(objArray1, i));
                a.o(str5, "java.lang.String.format\(format, *args\)");
                ProfileFollowElement w = p0.w;
                if (w == null) {
                   a.S("mUser");
                }
                w.mPage = "photo";
                w = p0.y;
                if (w == null) {
                   a.S(str);
                }
                if (!w instanceof GifshowActivity) {
                   objArray1 = objArray;
                }
                String str6 = (objArray1 != null)? objArray1.Q2(): objArray;
                ProfileFollowElement w1 = p0.w;
                if (w1 == null) {
                   a.S("mUser");
                }
                f$a uoa = new f$a(w1, str6);
                w = p0.v;
                if (w == null) {
                   a.S("mPhoto");
                }
                uoa.c(w.getFullSource());
                w = p0.y;
                if (w == null) {
                   a.S(str);
                }
                if (!w instanceof GifshowActivity) {
                   objArray1 = objArray;
                }
                if (objArray1 != null) {
                   objArray = objArray1.getUrl();
                }
                uoa.o(a.C(objArray, "#follow"));
                uoa.g(str1);
                profileFollo = p0.v;
                if (profileFollo == null) {
                   a.S("mPhoto");
                }
                uoa.f(profileFollo.getExpTag());
                uoa.n(str5);
                profileFollo = p0.v;
                if (profileFollo == null) {
                   a.S("mPhoto");
                }
                uoa.m(profileFollo);
                uoa.q(1);
                FollowHelper.c(uoa.b(), new a(p0));
                p0 = p0.w;
                if (p0 == null) {
                   a.S("mUser");
                }
                f.m(p0, User$FollowStatus.FOLLOWING);
             }
          }
       }
       return;
    }
}
